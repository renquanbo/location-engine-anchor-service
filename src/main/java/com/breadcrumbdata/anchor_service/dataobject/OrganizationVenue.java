package com.breadcrumbdata.anchor_service.dataobject;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OrganizationVenue {
    @Id
    private Integer venueId;

    private Integer organizationId;

    public Integer getVenueId() {
        return venueId;
    }

    public void setVenueId(Integer venueId) {
        this.venueId = venueId;
    }

    public Integer getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    @Override
    public String toString() {
        return "OrganizationVenue{" +
                "venueId=" + venueId +
                ", organizationId=" + organizationId +
                '}';
    }
}
