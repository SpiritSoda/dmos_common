package com.dmos.dmos_common.util;

import com.dmos.dmos_common.data.DMOSRequest;
import com.dmos.dmos_common.data.DMOSResponse;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.h2.util.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.web.client.RestTemplate;

import org.springframework.http.HttpHeaders;


@Slf4j
public class HttpUtil {
    public DMOSResponse post(String base_url, String service, HttpHeaders headers, DMOSRequest o, RestTemplate restTemplate){
        HttpEntity<DMOSRequest> request = new HttpEntity<>(o, headers);
        if(!service.startsWith("/"))
            service = "/" + service;
        while(base_url.endsWith("/"))
            base_url = base_url.substring(0, base_url.length() - 1);
        String url = "http://" + base_url + service;
        DMOSResponse response = restTemplate.postForObject(url, request, DMOSResponse.class);
        log.info(response.toString());
        return response;
    }
}
