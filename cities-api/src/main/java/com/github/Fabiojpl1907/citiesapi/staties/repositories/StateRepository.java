package com.github.Fabiojpl1907.citiesapi.staties.repositories;

import com.github.Fabiojpl1907.citiesapi.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

// class tipo interface
public interface StateRepository extends JpaRepository<State, Long> {
}
