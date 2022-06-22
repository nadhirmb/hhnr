package com.corigo.weightApp.service;

import com.corigo.weightApp.model.Kid;
import com.corigo.weightApp.repository.KidRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KidService implements IKidService{

    @Autowired
    private KidRepository kidRepository ;

    //Methods
    public Kid saveKid(Kid kid){
        //Code . . .

        return kidRepository.save(new Kid(kid.getId() , kid.getLastName(),kid.getFirstName()));
    }
    public List<Kid> findAllKids(){
        return kidRepository.findAll();
    }
}
