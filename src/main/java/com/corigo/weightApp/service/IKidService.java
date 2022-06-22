package com.corigo.weightApp.service;

import com.corigo.weightApp.model.Kid;

import java.util.List;

public interface IKidService {
    Kid saveKid(Kid kid);
    List<Kid> findAllKids();
}
