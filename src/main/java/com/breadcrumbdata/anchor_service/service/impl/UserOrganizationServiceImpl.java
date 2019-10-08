package com.breadcrumbdata.anchor_service.service.impl;

import com.breadcrumbdata.anchor_service.dataobject.UserOrganization;
import com.breadcrumbdata.anchor_service.repository.UserOrganizationRepository;
import com.breadcrumbdata.anchor_service.service.UserOrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserOrganizationServiceImpl implements UserOrganizationService{

    @Autowired
    UserOrganizationRepository userOrganizationRepository;

    @Override
    public UserOrganization create(Integer userId, Integer organizationId) {
        UserOrganization userOrganization = new UserOrganization();
        userOrganization.setUserId(userId);
        userOrganization.setOrganizationId(organizationId);
        return userOrganizationRepository.save(userOrganization);
    }

    @Override
    public List<UserOrganization> findOrganizationsByUserId(Integer userId) {
        List<UserOrganization> userOrganizationList = userOrganizationRepository.findByUserId(userId);
        return userOrganizationList;
    }
}
