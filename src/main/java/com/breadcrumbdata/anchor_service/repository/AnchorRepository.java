package com.breadcrumbdata.anchor_service.repository;

import com.breadcrumbdata.anchor_service.dataobject.Anchor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnchorRepository extends JpaRepository<Anchor, Integer>{
    Anchor findAnchorById(Integer id);
}
