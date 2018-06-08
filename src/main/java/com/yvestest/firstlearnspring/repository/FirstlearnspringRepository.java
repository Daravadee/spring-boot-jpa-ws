package com.yvestest.firstlearnspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yvestest.firstlearnspring.model.firstlearnspringModel;

public interface FirstlearnspringRepository extends JpaRepository<firstlearnspringModel, Long>  {

}
