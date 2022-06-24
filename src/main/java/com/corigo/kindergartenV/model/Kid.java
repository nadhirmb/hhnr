package com.corigo.kindergartenV.model;

import com.corigo.kindergartenV.model.gen.Generic;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "kids")
@Data
@AllArgsConstructor
@NoArgsConstructor
//Class name always start with capital letter
public class Kid extends Generic {

    @Column(length = 255)
    private String lastName ;

    @Column(length = 255)
    private String firstName;

    @Column(length = 255)
    private String photo_url ;

    @Column
    private LocalDateTime birthday ;

    @ManyToOne
    private User user;

    @ManyToMany
    private List<CurrentActivity> currentActivityList;
}
