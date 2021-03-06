package com.mhasan.springbasic.cqualifier.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 5/24/17.
 */
@Service
@Qualifier("property")
public class PropertyGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello - I was injected by the property!!!!";
    }
}
