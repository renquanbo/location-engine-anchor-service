package com.breadcrumbdata.anchor_service.repository;

import com.breadcrumbdata.anchor_service.dataobject.Organization;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrganizationRepositoryTest {

    @Autowired
    OrganizationRepository repository;

//    @Test
//    public void create() throws Exception{
//        Organization organization = new Organization();
//        organization.setName("East Zone");
//        repository.save(organization);
//    }

    @Test
    public void findOrganizationByName() throws Exception {
        Organization organization = repository.findByName("East Zone");
        System.out.println(organization.toString());
    }

    @Test
    public void findOrganizationById() throws Exception {
    }

}