package com.breadcrumbdata.anchor_service.dataobject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Level {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private Double width;

    private Double height;

    private Double xOffset;

    private Double yOffset;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getxOffset() {
        return xOffset;
    }

    public void setxOffset(Double xOffset) {
        this.xOffset = xOffset;
    }

    public Double getyOffset() {
        return yOffset;
    }

    public void setyOffset(Double yOffset) {
        this.yOffset = yOffset;
    }

    @Override
    public String toString() {
        return "Level{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
