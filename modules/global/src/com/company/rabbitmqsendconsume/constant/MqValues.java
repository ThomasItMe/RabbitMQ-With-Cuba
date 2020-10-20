package com.company.rabbitmqsendconsume.constant;

import com.haulmont.chile.core.annotations.MetaClass;
import com.haulmont.cuba.core.entity.BaseUuidEntity;

@MetaClass(name = "rabbitmqsendconsume_NewEntity")
public class MqValues extends BaseUuidEntity {
    private static final long serialVersionUID = -4025724754485348767L;

    public static final String QUEUE = "queue";
    public static final String EXCHANGE = "exchange";
    public static final String ROUTINGKEY = "routingkey";
}