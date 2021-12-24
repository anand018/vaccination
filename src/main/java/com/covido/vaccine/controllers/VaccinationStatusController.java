package com.covido.vaccine.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/status")
public class VaccinationStatusController {

    @GetMapping("/{mobile}/{aadhar}")
    public boolean isVaccinated(@PathVariable String mobile, @PathVariable String aadhar) {
        return false;
    }
}
