package com.kalleH.exGamne.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository {
    /*JpaRepository<Game, Long> {
        List<Game> findByName (String name);
    }*/
}
