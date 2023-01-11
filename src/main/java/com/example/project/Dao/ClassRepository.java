package com.example.project.Dao;

import com.example.project.Objects.Classe;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClassRepository extends MongoRepository<Classe,String> {
   @Query
    Optional<Classe> findByName(String name);
}
