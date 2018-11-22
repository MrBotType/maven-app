package com.bottype.mavenapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bottype.mavenapp.bean.Game;



@Repository
public interface GameRepository extends JpaRepository<Game, Integer> {

}
