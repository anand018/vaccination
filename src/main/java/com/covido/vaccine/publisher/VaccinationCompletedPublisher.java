package com.covido.vaccine.publisher;

import com.covido.vaccine.dto.Person;
import com.covido.vaccine.service.VaccinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class VaccinationCompletedPublisher {

    @Autowired
    private VaccinationService vaccinationService;

    @PostMapping("/publish")
    public void vaccinated(@RequestBody Person person) {
        vaccinationService.vaccinate(person);
    }
}
