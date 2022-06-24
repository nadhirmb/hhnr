package com.corigo.kindergartenV.model;

import com.corigo.kindergartenV.model.gen.Generic;

import javax.persistence.Column;

public class Activity
        extends Generic {

    @Column(nullable = false, length =50)
    private String name ;


    @Column(nullable = false, length = 50)
    private String description ;


    @Column
    private boolean activated ;




}
