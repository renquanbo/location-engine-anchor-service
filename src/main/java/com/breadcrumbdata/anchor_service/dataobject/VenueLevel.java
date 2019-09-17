package com.breadcrumbdata.anchor_service.dataobject;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VenueLevel {
    @Id
    private Integer levelId;
    private Integer venueId;

    public Integer getLevelId() {
        return levelId;
    }

    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    public Integer getVenueId() {
        return venueId;
    }

    public void setVenueId(Integer venueId) {
        this.venueId = venueId;
    }
}
