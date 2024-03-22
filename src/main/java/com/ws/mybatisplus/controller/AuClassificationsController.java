package com.ws.mybatisplus.controller;

import cn.hutool.core.net.url.UrlBuilder;
import cn.hutool.core.util.CharsetUtil;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.ws.mybatisplus.entity.AuAwards;
import com.ws.mybatisplus.entity.AuClassifications;
import com.ws.mybatisplus.service.AuAwardsService;
import com.ws.mybatisplus.service.AuClassificationsService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author ws
 * @since 2021-04-07
 */
@RestController
@RequestMapping("/classifications")
public class AuClassificationsController {

    @Resource
    private AuClassificationsService auClassificationsService;

    @Resource
    private AuAwardsService auAwardsService;

    @RequestMapping("list")
    public Boolean list() {
        auAwardsService.list()
                .stream()
                .map(AuAwards::getCode)
                .forEach(this::saveAuClassifications);
        return Boolean.TRUE;
    }


    private void saveAuClassifications(String code) {
        JSONObject jsonObjectResult = pageRequest(code, 1);
        if (jsonObjectResult != null) {

            JSONObject meta = jsonObjectResult.getJSONObject("_meta");
            Integer pageCount = meta.getInt("page_count");
            JSONArray results = jsonObjectResult.getJSONArray("results");
            List<AuClassifications> auAwardsList = JSONUtil.toList(results, AuClassifications.class);
            List<AuClassifications> result = new ArrayList<>(auAwardsList);
            if (pageCount > 1) {
                for (int i = 1; i < pageCount; i++) {
                    JSONObject pageResultData = pageRequest(code, i + 1);
                    List<AuClassifications> pageAwardsList =
                            JSONUtil.toList(pageResultData.getJSONArray("results"), AuClassifications.class);
                    result.addAll(pageAwardsList);
                }
            }
            auClassificationsService.saveBatch(result);
            System.out.println(code);
        }
    }


    private JSONObject pageRequest(String code, Integer currentPage) {
        WebClient webClient = WebClient.create();
        // https://uatapi.fwc.gov.au/api/v1/awards/{id_or_code}/classifications
        String url = UrlBuilder.of("https://uatapi.fwc.gov.au/api/v1/awards", CharsetUtil.CHARSET_UTF_8)
                .addPath(code)
                .addPath("classifications")
                .addQuery("classification_level", null)
                .addQuery("classification_fixed_id", null)
                .addQuery("operative_from", null)
                .addQuery("operative_to", null)
                .addQuery("page", currentPage)
                .addQuery("limit", 100)
                .build();
        ResponseEntity<JSONObject> result =
                webClient
                        .get()
                        .uri(url)
                        .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                        .header("Ocp-Apim-Subscription-Key", "133557fa180743c8b57dd084fe010563")
                        .accept(MediaType.APPLICATION_JSON)
                        .retrieve()
                        .toEntity(JSONObject.class)
                        .block();
        return Optional.ofNullable(result).map(ResponseEntity::getBody).orElse(null);
    }
}

