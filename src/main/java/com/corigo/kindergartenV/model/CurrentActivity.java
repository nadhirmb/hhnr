package com.corigo.kindergartenV.model;

import com.corigo.kindergartenV.model.gen.Generic;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import java.time.LocalDateTime;
import java.util.List;

@Entity


@Data
@AllArgsConstructor
@NoArgsConstructor

public class CurrentActivity extends Generic {


    @OneToOne

    private Activity activity;

    @ManyToMany
    private List<Kid> kids;


    @OneToOne
    private User user;

    @Column(name = "current_name", nullable = false, length = 50)
    private String currentName;

    @Column(nullable = false)
    private LocalDateTime startActivity;

    @Column(nullable = false)
    private LocalDateTime endActivity;


}
