package com.breadcrumbdata.anchor_service.exception;

public class ExistIdException extends RuntimeException{

    private static final long serialVersionUID = -6379871530161803459L;

    private Integer id;

    public ExistIdException(Integer id){
        super("Id is already exist");
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
