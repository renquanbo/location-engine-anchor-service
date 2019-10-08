package com.breadcrumbdata.anchor_service.service;

import com.breadcrumbdata.anchor_service.dataobject.Venue;
import java.util.List;

public interface VenueService {
    List<Venue> findVenuesByOrganizationId(Integer organizationId);
    Venue create(String name, Integer organizationId);
}
