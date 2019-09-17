package com.breadcrumbdata.anchor_service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "auth-server")
public interface UserClient {

    @GetMapping("/user")
    String getUserId(@RequestHeader("Authorization") String bearerToken, @RequestParam(value = "username") String username);
}
