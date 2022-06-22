package com.corigo.kindergartenV.model.gen;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;


@Data//Getter & Setters
@NoArgsConstructor
@MappedSuperclass
public class Generic {
    @Id//annotation
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
}
