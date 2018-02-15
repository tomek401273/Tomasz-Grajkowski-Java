package com.kodilla.patterns2.facade.aop;

import com.kodilla.patterns2.facade.api.OrderDto;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CheckExecuteOrder {
    private final Logger LOGGER = LoggerFactory.getLogger(CheckExecuteOrder.class);


    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))" +
    "&& args(order, userId) && target(object)")
    private void logExecuteOrderProceding( OrderDto order, Long userId, Object object) {
        LOGGER.info("Method processOrder in class OrderFacade was executed");
        LOGGER.info("class: "+object.getClass().getName()+", args: { order:"+order.toString() +", userId: "+userId +"}");
    }

}
