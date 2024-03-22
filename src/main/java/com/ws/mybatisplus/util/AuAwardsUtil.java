package com.ws.mybatisplus.util;

import cn.hutool.core.net.url.UrlBuilder;
import cn.hutool.core.util.CharsetUtil;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import lombok.experimental.UtilityClass;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Optional;
@UtilityClass
public class AuAwardsUtil {
    public JSONArray getResult(String queryUrl) {
        JSONArray resultsArray;
        JSONObject firstResponseJson = getResponseByPage(queryUrl, 1);
        resultsArray = firstResponseJson.getJSONArray("results");
        if (!firstResponseJson.getJSONObject("_meta").containsKey("page_count")) {
            return resultsArray;
        }
        int pageCount = firstResponseJson.getJSONObject("_meta").getInt("page_count");
        if (pageCount > 1) {
            for (int pageIdx = 2; pageIdx <= pageCount; pageIdx++) {
                JSONObject pageResponseJson = getResponseByPage(queryUrl, pageIdx);
                resultsArray.addAll(pageResponseJson.getJSONArray("results"));
            }
        }
        return resultsArray;
    }

    private JSONObject getResponseByPage(String baseUrl, Integer currentPage) {
        WebClient webClient = WebClient.create();
        String url = UrlBuilder.of(baseUrl, CharsetUtil.CHARSET_UTF_8)
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
