package com.corigo.kindergartenV.model;

import com.corigo.kindergartenV.model.gen.Generic;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Roles")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role extends Generic {

    @Column(length = 50,nullable = false)
    private String role_name ;


    @OneToMany(fetch = FetchType.LAZY)
    private List<User> users;
}
