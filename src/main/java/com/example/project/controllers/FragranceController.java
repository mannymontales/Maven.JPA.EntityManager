package com.example.project.controllers;

import com.example.project.models.Fragrance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.project.services.FragranceServiceImplementation;

import java.util.List;

//https://spring.io/guides/tutorials/rest/
@RestController
@RequestMapping("/fragrances")
public class FragranceController {
    // In Spring and Spring Boot applications, the @Autowired annotation is used for automatic dependency injection.
    // Dependency injection is a design pattern where the dependencies (objects or components that a class relies on)
    // are provided to a class from an external source, rather than the class creating its own dependencies.

    private final FragranceServiceImplementation fragranceServiceImplementation;

    //we are telling spring that this controller needs a fragranceRespository bean or dependency injection for it to function

    @Autowired
    FragranceController(FragranceServiceImplementation fragranceServiceImplementation) {
        this.fragranceServiceImplementation = fragranceServiceImplementation;
    }

    @GetMapping()
    public ResponseEntity<List<Fragrance>> getAllFragrances() {
        return new ResponseEntity<List<Fragrance>>(fragranceServiceImplementation.findAllFragrances(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Fragrance> getPerson(@PathVariable Integer id) {
        return new ResponseEntity<Fragrance>(fragranceServiceImplementation.findFragranceById(id), HttpStatus.CREATED);
    }
}
