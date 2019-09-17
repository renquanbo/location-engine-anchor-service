package com.breadcrumbdata.anchor_service.repository;

import com.breadcrumbdata.anchor_service.dataobject.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrganizationRepository extends JpaRepository<Organization,Integer>{
    Organization findByName(String name);
    Organization findOrganizationById(Integer id);
}
