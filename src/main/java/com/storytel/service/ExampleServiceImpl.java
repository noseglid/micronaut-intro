package com.storytel.service;

import com.storytel.model.HelloWorld;
import jakarta.inject.Singleton;

@Singleton
public class ExampleServiceImpl implements ExampleService {

    @Override
    public HelloWorld greetUser(String name) {
        return new HelloWorld(name);
    }

}
