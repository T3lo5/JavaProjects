package com.anderson.gameawards.service;

import java.util.List;
import java.util.Optional;

import com.anderson.gameawards.domain.Game;

public interface GameService {

    List<Game> findAll();
    Optional<Game> findById(Long id);

    void insert(Game game);
    void update(Long id, Game game);
    void delete(Long id);

}
