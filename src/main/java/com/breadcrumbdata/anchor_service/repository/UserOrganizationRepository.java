package com.breadcrumbdata.anchor_service.repository;

import com.breadcrumbdata.anchor_service.dataobject.UserOrganization;
import com.breadcrumbdata.anchor_service.dataobject.UserOrganizationCompositeKey;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserOrganizationRepository extends JpaRepository<UserOrganization, UserOrganizationCompositeKey>{
    List<UserOrganization> findByUserId(Integer userId);
}
