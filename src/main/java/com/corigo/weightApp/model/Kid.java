package com.corigo.weightApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "kids")
@Data
@AllArgsConstructor
@NoArgsConstructor
//Class name always start with capital letter
public class Kid {
    @Id//annotation
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    @Column(length = 255)
    private String lastName ;
    @Column(length = 255)
    private String firstName;

}
