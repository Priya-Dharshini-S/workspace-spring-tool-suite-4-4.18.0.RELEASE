package com.educationloan.demo.Repository;

import org.springframework.stereotype.Repository;

import com.educationloan.demo.Model.UserModel;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface UserModelRepository extends JpaRepository<UserModel,Integer> {

}
