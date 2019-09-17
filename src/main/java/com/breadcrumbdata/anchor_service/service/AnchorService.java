package com.breadcrumbdata.anchor_service.service;

import com.breadcrumbdata.anchor_service.dataobject.Anchor;

import java.util.List;

public interface AnchorService {
    Anchor create(Integer id,String name, double x, double y, double height, Integer levelId);
    Anchor create(Anchor anchor);
    Anchor modify(Integer id, Anchor anchor);
    void delete(Integer id);
    Anchor findOneById(Integer id);
    List<Anchor> findAll();
}
