package com.breadcrumbdata.anchor_service.service.impl;

import com.breadcrumbdata.anchor_service.dataobject.Anchor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AnchorServiceImplTest {

    @Autowired
    AnchorServiceImpl anchorService;

//    @Test
//    public void create() throws Exception {
//        anchorService.create(1,"anchor1",1.0,1.1,1.7,1);
//    }

    @Test
    public void findOneById() throws Exception {
        Anchor anchor = anchorService.findOneById(1);
        System.out.println(anchor.toString());
    }

}