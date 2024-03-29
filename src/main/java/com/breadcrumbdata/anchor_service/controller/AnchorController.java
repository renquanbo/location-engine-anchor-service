package com.breadcrumbdata.anchor_service.controller;

import com.breadcrumbdata.anchor_service.dataobject.Anchor;
import com.breadcrumbdata.anchor_service.exception.ExistIdException;
import com.breadcrumbdata.anchor_service.service.AnchorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/anchors")
public class AnchorController {

    @Autowired
    AnchorService anchorService;

    @GetMapping
    public List<Anchor> getAnchors(){
        List<Anchor> anchorList = anchorService.findAll();
        return anchorList;
    }

    @PostMapping
    public Anchor addAnchor(@Valid @RequestBody Anchor anchor){
        return anchorService.create(anchor);
    }

    @PutMapping("/{id:\\d+}")
    public Anchor updateAnchor(@Valid @PathVariable String id, @RequestBody Anchor anchor) {
        return anchorService.modify(Integer.valueOf(id), anchor);
    }

    @DeleteMapping("/{id:\\d+}")
    public void deleteAnchor(@PathVariable String id) {
        anchorService.delete(Integer.valueOf(id));
    }
}
