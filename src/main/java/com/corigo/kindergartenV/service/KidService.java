package com.corigo.kindergartenV.service;

import com.corigo.kindergartenV.model.Kid;
import com.corigo.kindergartenV.repository.KidRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KidService implements IKidService{


    @Autowired
    private KidRepository kidRepository;

    public Iterable<Kid> loadAllKids(){

        return kidRepository.findAll();

    }

    public Optional<Kid> loadKidById(int id ){

        return kidRepository.findById(id);

    }

    public Kid createKid(Kid kid){
        return kidRepository.save(kid);
    }


    public void deleteKidById(int id){

        kidRepository.deleteById(id);
    }


}
