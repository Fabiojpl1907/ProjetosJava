package com.github.Fabiojpl1907.citiesapi.staties.resources;

import com.github.Fabiojpl1907.citiesapi.staties.entities.State;
import com.github.Fabiojpl1907.citiesapi.staties.repositories.StateRepository;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/staties")
public class StateResource {

    private final StateRepository repository;

    public StateResource(final StateRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<State> staties() {
        return repository.findAll();
    }
}