package com.breadcrumbdata.anchor_service.dataobject;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(UserOrganizationCompositeKey.class)
public class UserOrganization {
    @Id
    private Integer userId;

    @Id
    private Integer organizationId;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    @Override
    public String toString() {
        return "UserOrganization{" +
                "userId=" + userId +
                ", organizationId=" + organizationId +
                '}';
    }
}
