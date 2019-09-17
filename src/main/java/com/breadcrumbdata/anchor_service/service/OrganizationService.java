package com.breadcrumbdata.anchor_service.service;

import com.breadcrumbdata.anchor_service.dataobject.Organization;

import java.util.List;

public interface OrganizationService {
    Organization create(String name);
    Organization findById(Integer id);
    Organization findByName(String name);
    List<Organization> findByUserId(Integer userId);
}
