package com.ws.mybatisplus.controller;

import cn.hutool.core.date.DatePattern;
import cn.hutool.core.net.url.UrlBuilder;
import cn.hutool.core.util.ArrayUtil;
import cn.hutool.core.util.CharsetUtil;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONConfig;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.ws.mybatisplus.entity.AuAwards;
import com.ws.mybatisplus.service.AuAwardsService;
import com.ws.mybatisplus.util.AuAwardsUtil;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import javax.annotation.Resource;
import java.util.*;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author ws
 * @since 2021-04-07
 */
@RestController
@RequestMapping("/awards")
public class AuAwardsController {

    @Resource
    private AuAwardsService auAwardsService;

    @RequestMapping("list")
    public Boolean list() {
        JSONArray result = AuAwardsUtil.getResult("https://uatapi.fwc.gov.au/api/v1/awards");
        List<AuAwards> auAwardsList = JSONUtil.toList(result, AuAwards.class);
        return auAwardsService.saveBatch(auAwardsList);
    }


    private JSONObject pageRequest(Integer currentPage) {
        WebClient webClient = WebClient.create();
        String url = UrlBuilder.of("https://uatapi.fwc.gov.au/api/v1/awards", CharsetUtil.CHARSET_UTF_8)
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

