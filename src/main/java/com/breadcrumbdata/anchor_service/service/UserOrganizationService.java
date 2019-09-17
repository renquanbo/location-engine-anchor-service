package com.breadcrumbdata.anchor_service.service;

import com.breadcrumbdata.anchor_service.dataobject.UserOrganization;

public interface UserOrganizationService {
    UserOrganization create(Integer userId, Integer organizationId);

}
