package com.company.rabbitmqsendconsume.service;

import com.company.rabbitmqsendconsume.constant.MqValues;
import com.company.rabbitmqsendconsume.entity.Company;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service(RabbitmqService.NAME)
public class RabbitmqServiceBean implements RabbitmqService {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Value(MqValues.EXCHANGE)
    private String exchange;

    @Value(MqValues.ROUTINGKEY)
    private String routingkey;

    @Override
    public String send(Company company) {
        amqpTemplate.convertAndSend(exchange, null, company);
        System.out.println("Send object = " + company);
        return company.toString();
    }
}