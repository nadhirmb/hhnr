package com.corigo.weightApp.repository;

import com.corigo.weightApp.model.Kid;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KidRepository extends CrudRepository <Kid , Integer> {
List<Kid> findAll();
}
