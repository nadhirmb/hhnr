package com.corigo.kindergartenV.controller;

import com.corigo.kindergartenV.model.Kid;
import com.corigo.kindergartenV.service.IKidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class KidController {

public IKidService iKidService;

@GetMapping("/api/kids")
    public Iterable<Kid> loadAllKids(){
    return iKidService.loadAllKids();
    }

    public Optional<Kid> loadKidById(@PathVariable (name ="id") int id){
    return iKidService.loadKidById(id);

    }

}
