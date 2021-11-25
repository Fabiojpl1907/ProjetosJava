package com.github.Fabiojpl1907.citiesapi.countries.resources;

import com.github.Fabiojpl1907.citiesapi.countries.entities.Country;
import com.github.Fabiojpl1907.citiesapi.countries.repository.CountryRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
// @RequestMapping("countries")

// recursos rest serão todos no pural

public class countryResource {

    private final CountryRepository repository;

    public countryResource(CountryRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/countries")
    public List<Country> cities() {
        return repository.findAll();
    }

}
