package com.datingapi.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datingapi.entities.Interest;

public interface InterestRepository extends JpaRepository<Interest, Integer> {

}
