package com.covido.vaccine.service.impl;

import com.covido.vaccine.constants.GlobalConstants;
import com.covido.vaccine.dto.Person;
import com.covido.vaccine.service.VaccinationService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VaccinationServiceImpl implements VaccinationService {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Override
    public void vaccinate(Person person) {
        rabbitTemplate.convertAndSend(GlobalConstants.VACCINE_EXCHANGE, GlobalConstants.VACCINE_ROUTING_KEY, person);
    }
}
