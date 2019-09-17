package com.breadcrumbdata.anchor_service.controller;


import com.breadcrumbdata.anchor_service.client.UserClient;
import feign.FeignException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.authentication.OAuth2AuthenticationDetails;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserClientController {
    @Autowired
    private UserClient userClient;

    @GetMapping
    public String getUserId(OAuth2Authentication oAuth2Authentication){
        String username = oAuth2Authentication.getName();
        final OAuth2AuthenticationDetails details = (OAuth2AuthenticationDetails) oAuth2Authentication.getDetails();
        String accessToken = details.getTokenValue();
        String userId = userClient.getUserId("bearer " + accessToken, "robert");
        return userId;
    }
}
