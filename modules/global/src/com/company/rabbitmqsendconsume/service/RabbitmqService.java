package com.company.rabbitmqsendconsume.service;

import com.company.rabbitmqsendconsume.entity.Company;

public interface RabbitmqService {
    String NAME = "rabbitmqsendconsume_RabbitmqService";

    String send(Company company);
}