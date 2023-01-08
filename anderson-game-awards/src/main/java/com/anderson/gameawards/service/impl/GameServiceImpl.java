package com.anderson.gameawards.service.impl;

import com.anderson.gameawards.domain.Game;
import com.anderson.gameawards.domain.GameRepository;
import com.anderson.gameawards.service.GameService;
import com.anderson.gameawards.service.exception.BusinessException;
import com.anderson.gameawards.service.exception.NoContentException;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GameServiceImpl implements GameService {

    @Autowired
    private GameRepository repository;

    @Override
    public List<Game> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Game> findById(Long id) {
        Optional<Game> game = repository.findById(id);
        if (game.isEmpty()) {
            throw new NoContentException("No game founded");
        }
        return game;
    }

    @Override
    public void insert(Game game) {
        if (game.getName() == null || game.getName().isEmpty()) {
            throw new BusinessException("Game name is required");
        }
    }

    @Override
    public void update(Long id, @NotNull Game game) {
        Optional<Game> gameToUpdate = repository.findById(id);
        if (gameToUpdate.equals(game.getId())) {
            repository.save(game);
        } else {
            throw new NoContentException("No game founded");
        }
    }

    @Override
    public void delete(Long id) {
        Optional<Game> game = repository.findById(id);
        if (game.isEmpty()) {
            throw new NoContentException("No game founded");
        } else {
            repository.deleteById(id);
        }
    }
}
