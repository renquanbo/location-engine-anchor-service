package com.breadcrumbdata.anchor_service.service;

import com.breadcrumbdata.anchor_service.dataobject.UserOrganization;

import java.util.List;

public interface UserOrganizationService {
    UserOrganization create(Integer userId, Integer organizationId);
    List<UserOrganization> findOrganizationsByUserId(Integer userId);
}
