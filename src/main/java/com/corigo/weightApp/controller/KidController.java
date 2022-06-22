package com.corigo.weightApp.controller;

import com.corigo.weightApp.model.Kid;
import com.corigo.weightApp.repository.KidRepository;
import com.corigo.weightApp.service.IKidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class KidController {
    @Autowired
    private IKidService iKidService;

    @PostMapping("/api/kid/save")
    public void createKid(@RequestBody Kid kid){
        iKidService.saveKid(kid);
    }

    @GetMapping("/api/kid/all")
    public List<Kid> findKids(){
        return iKidService.findAllKids();
    }
}
