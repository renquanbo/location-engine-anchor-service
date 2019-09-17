package com.breadcrumbdata.anchor_service.dataobject;

import java.io.Serializable;

public class UserOrganizationCompositeKey implements Serializable{

    private Integer userId;
    private Integer organizationId;

    public UserOrganizationCompositeKey() {}

    public UserOrganizationCompositeKey(Integer userId, Integer organizationId) {
        this.userId = userId;
        this.organizationId = organizationId;
    }

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
    public int hashCode() {
        final int PRIME = 31;
        int result = 1;
        result = PRIME * result + ((userId == null) ? 0 : userId.hashCode());
        result = PRIME * result + ((organizationId == null) ? 0 : organizationId.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        final UserOrganizationCompositeKey other = (UserOrganizationCompositeKey)obj;
        if(userId == null){
            if(other.userId != null){
                return false;
            }
        }else if(!userId.equals(other.userId)){
            return false;
        }
        if(organizationId == null){
            if(other.organizationId != null){
                return false;
            }
        }else if(!organizationId.equals(other.organizationId)){
            return false;
        }

        return true;
    }

}
