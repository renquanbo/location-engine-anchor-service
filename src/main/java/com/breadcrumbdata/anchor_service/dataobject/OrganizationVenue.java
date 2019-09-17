package com.breadcrumbdata.anchor_service.dataobject;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OrganizationVenue {
    @Id
    private Integer venueId;

    private Integer OrganizationId;

    public Integer getVenueId() {
        return venueId;
    }

    public void setVenueId(Integer venueId) {
        this.venueId = venueId;
    }

    public Integer getOrganizationId() {
        return OrganizationId;
    }

    public void setOrganizationId(Integer organizationId) {
        OrganizationId = organizationId;
    }
}
