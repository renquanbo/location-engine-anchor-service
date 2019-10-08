package com.breadcrumbdata.anchor_service.service.impl;

import com.breadcrumbdata.anchor_service.dataobject.Organization;
import com.breadcrumbdata.anchor_service.dataobject.UserOrganization;
import com.breadcrumbdata.anchor_service.repository.OrganizationRepository;
import com.breadcrumbdata.anchor_service.repository.UserOrganizationRepository;
import com.breadcrumbdata.anchor_service.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OrganizationServiceImpl implements OrganizationService{

    @Autowired
    OrganizationRepository organizationRepository;

    @Autowired
    UserOrganizationRepository userOrganizationRepository;


    /**
     * It will create organization record in Organization table
     * and it will create organization user relation in user_organization table
     * @param name
     * @param userId
     * @return Organization
     */
    @Override
    public Organization create(String name, Integer userId) {
        Organization organization = new Organization();
        organization.setName(name);
        Organization savedOrganization = organizationRepository.save(organization);
        UserOrganization userOrganization = new UserOrganization();
        userOrganization.setUserId(userId);
        userOrganization.setOrganizationId(savedOrganization.getId());
        userOrganizationRepository.save(userOrganization);
        return savedOrganization;
    }

    @Override
    public Organization findById(Integer id) {
        Organization organization = organizationRepository.findOrganizationById(id);
        return organization;
    }

    @Override
    public Organization findByName(String name) {
        //Organization organization = repository.findByName(name);
        //return organization;
        return null;
    }

    @Override
    public List<Organization> findByUserId(Integer userId) {
        List<Organization> organizationList = new ArrayList<>();
        List<UserOrganization> userOrganizationList = userOrganizationRepository.findByUserId(userId);
        for (UserOrganization userOrganization : userOrganizationList) {
            Organization organization = organizationRepository.findOrganizationById(userOrganization.getOrganizationId());
            organizationList.add(organization);
        }
        return organizationList;
    }


}
