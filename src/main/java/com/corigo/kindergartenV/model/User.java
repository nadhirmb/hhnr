package com.corigo.kindergartenV.model;

import com.corigo.kindergartenV.ennumeration.Role;
import com.corigo.kindergartenV.model.gen.Generic;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.LocalDateTime;

//Class always always started with UPPERCASE
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User  extends Generic {

    private String userName ;

    private String passWord ;

    @Column(name = "create_time",nullable = false )
    private LocalDateTime createdTime ;

    @Column(name="asset"  , nullable = false,length = 100)
    private boolean asset ;


}
