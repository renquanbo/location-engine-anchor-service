package com.breadcrumbdata.anchor_service.service.impl;

import com.breadcrumbdata.anchor_service.dataobject.UserOrganization;
import com.breadcrumbdata.anchor_service.service.UserOrganizationService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserOrganizationServiceImplTest {

    @Autowired
    UserOrganizationService userOrganizationService;
//
//    @Test
//    public void create() throws Exception {
//        UserOrganization userOrganization =  userOrganizationService.create(2,1);
//        assertEquals(1, userOrganization.getOrganizationId().intValue());
//    }
    @Test
    public void findByUserId() throws Exception{
        List<UserOrganization> userOrganizationList = userOrganizationService.findOrganizationsByUserId(2);
        for (UserOrganization userOrganization : userOrganizationList) {
            System.out.println(userOrganization.toString());
        }
    }
}