package com.wzzy.base.basespringboot.service;

import com.wzzy.base.basespringboot.model.GreetingEntity;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String mensagemCumprimentos(GreetingEntity greetingEntity) {
        return greetingEntity.getMessage();
    }
}
