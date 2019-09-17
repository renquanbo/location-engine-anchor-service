package com.breadcrumbdata.anchor_service.dataobject;

import org.springframework.format.annotation.NumberFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Entity
public class Anchor {

    @Id
    @Positive
    @Digits(integer = 4, fraction = 0)
    @NotNull
    private Integer id;

    @NotBlank
    private String name;

    @NotNull
    @Digits(integer = 4, fraction = 2)
    private double x;

    @NotNull
    @Digits(integer = 4, fraction = 2)
    private double y;

    @NotNull
    @Digits(integer = 4, fraction = 2)
    private double height;

    @NotNull
    @Positive
    @Digits(integer = 4, fraction = 0)
    private Integer levelId;

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

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Integer getLevelId() {
        return levelId;
    }

    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    @Override
    public String toString() {
        return "Anchor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", height=" + height +
                ", levelId=" + levelId +
                '}';
    }
}
