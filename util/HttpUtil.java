package com.dmos.dmos_common.util;

import com.dmos.dmos_common.data.DMOSResponse;
import com.dmos.dmos_common.config.DMOSConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import org.springframework.http.HttpHeaders;

public class HttpUtil {
    @Autowired
    private RestTemplate restTemplate;

    public DMOSResponse post(String base_url, String service, HttpHeaders headers, String json){
        HttpEntity<String> request = new HttpEntity<>(json, headers);
        if(!service.startsWith("/"))
            service = "/" + service;
        while(base_url.endsWith("/"))
            base_url = base_url.substring(0, base_url.length() - 1);
        String url = base_url + service;
        return restTemplate.postForObject(url, request, DMOSResponse.class);
    }
}
