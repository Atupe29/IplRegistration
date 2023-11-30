package com.jdc04.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jdc04.entity.Cricket;

@Repository
public interface CricketRepository extends JpaRepository<Cricket, Integer>{

}
