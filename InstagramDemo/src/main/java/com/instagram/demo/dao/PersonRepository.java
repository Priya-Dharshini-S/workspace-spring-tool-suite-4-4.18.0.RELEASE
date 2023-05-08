package com.instagram.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.instagram.demo.model.Persons;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Persons,Long>{

@Query(value="select p from Persons p join p.address a")
List<Persons>getPersons();
}
