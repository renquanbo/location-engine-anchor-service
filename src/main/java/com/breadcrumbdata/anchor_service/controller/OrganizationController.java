package com.breadcrumbdata.anchor_service.controller;

import com.breadcrumbdata.anchor_service.client.UserClient;
import com.breadcrumbdata.anchor_service.dataobject.Organization;
import com.breadcrumbdata.anchor_service.dataobject.UserOrganization;
import com.breadcrumbdata.anchor_service.service.OrganizationService;
import com.breadcrumbdata.anchor_service.service.UserOrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.authentication.OAuth2AuthenticationDetails;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/organizations")
public class OrganizationController {

    @Autowired
    private UserClient userClient;

    @Autowired
    private OrganizationService organizationService;

    @GetMapping
    public List<Organization> getOrganizations(OAuth2Authentication oAuth2Authentication) {
        final OAuth2AuthenticationDetails details = (OAuth2AuthenticationDetails) oAuth2Authentication.getDetails();
        String accessToken = details.getTokenValue();
        String userId = userClient.getUserId("bearer " + accessToken, oAuth2Authentication.getName());
        List<Organization> organizationList = organizationService.findByUserId(Integer.valueOf(userId));
        return organizationList;
    }

}
