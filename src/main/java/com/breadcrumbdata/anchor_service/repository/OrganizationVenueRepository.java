package com.breadcrumbdata.anchor_service.repository;

import com.breadcrumbdata.anchor_service.dataobject.OrganizationVenue;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrganizationVenueRepository extends JpaRepository<OrganizationVenue,Integer> {
    List<OrganizationVenue> findByOrganizationId(Integer organizationId);
}
