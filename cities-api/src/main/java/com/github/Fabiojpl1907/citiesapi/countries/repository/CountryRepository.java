package com.github.Fabiojpl1907.citiesapi.countries.repository;

import com.github.Fabiojpl1907.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
