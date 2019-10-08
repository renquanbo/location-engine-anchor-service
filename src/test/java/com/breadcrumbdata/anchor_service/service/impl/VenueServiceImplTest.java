package com.breadcrumbdata.anchor_service.service.impl;

import com.breadcrumbdata.anchor_service.service.VenueService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class VenueServiceImplTest {

    @Autowired
    private VenueService venueService;

    @Test
    public void findVenuesByOrganizationId() throws Exception {

    }

    @Test
    public void create() throws Exception {
        venueService.create("grove",1);
    }

}