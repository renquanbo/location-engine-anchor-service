package com.breadcrumbdata.anchor_service.service.impl;

import com.breadcrumbdata.anchor_service.dataobject.Anchor;
import com.breadcrumbdata.anchor_service.exception.ExistIdException;
import com.breadcrumbdata.anchor_service.repository.AnchorRepository;
import com.breadcrumbdata.anchor_service.service.AnchorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnchorServiceImpl implements AnchorService{

    @Autowired
    AnchorRepository anchorRepository;

    @Override
    public Anchor create(Integer id, String name, double x, double y, double height, Integer levelId) {
        Anchor anchor = new Anchor();
        anchor.setId(id);
        anchor.setName(name);
        anchor.setX(x);
        anchor.setY(y);
        anchor.setHeight(height);
        anchor.setLevelId(levelId);
        return anchorRepository.save(anchor);
    }

    @Override
    public Anchor create(Anchor anchor) throws ExistIdException{
        if(anchorRepository.findAnchorById(anchor.getId()) != null){
            throw new ExistIdException(anchor.getId());
        }
        return anchorRepository.save(anchor);
    }

    @Override
    public Anchor modify(Integer id, Anchor anchor) throws ExistIdException{
        if(id != anchor.getId() && anchorRepository.findAnchorById(anchor.getId()) != null){
            throw new ExistIdException(anchor.getId());
        }
        return anchorRepository.save(anchor);
    }

    @Override
    public void delete(Integer id) {
        Anchor anchor = this.findOneById(id);
        anchorRepository.delete(anchor);
    }

    @Override
    public Anchor findOneById(Integer id) {
        Anchor anchor = anchorRepository.findAnchorById(id);
        return anchor;
    }

    @Override
    public List<Anchor> findAll(){
        List<Anchor> anchorList = anchorRepository.findAll();
        return anchorList;
    }
}
