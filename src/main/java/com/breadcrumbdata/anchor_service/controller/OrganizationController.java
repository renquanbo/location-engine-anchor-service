package com.breadcrumbdata.anchor_service.controller;

import com.breadcrumbdata.anchor_service.client.UserClient;
import com.breadcrumbdata.anchor_service.dataobject.Organization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/organizations")
public class OrganizationController {

    @Autowired
    private UserClient userClient;

    @GetMapping
    public List<Organization> getOrganizations(OAuth2Authentication oAuth2Authentication) {
//        String username = oAuth2Authentication.getName();
//        String userId = userClient.getUserId(username);
//        System.out.println("userID " + userId);
        return null;
    }

}
