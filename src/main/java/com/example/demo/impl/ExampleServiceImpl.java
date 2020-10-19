package com.example.demo.impl;

import com.example.demo.components.requestTimeIntesrceptor;
import com.example.demo.model.person;
import com.example.demo.service.exampleService;
import org.apache.juli.logging.LogFactory;
import org.springframework.stereotype.Service;
import sun.rmi.runtime.Log;

import java.util.ArrayList;
import java.util.List;

@Service("exampleService")
public class ExampleServiceImpl implements exampleService {
    private static final org.apache.juli.logging.Log LOG = LogFactory.getLog(requestTimeIntesrceptor.class);

    @Override
    public List<person> getListPeople() {
        List<person> person = new ArrayList<>();
        person.add(new person("Abe",23));
        person.add(new person("Liam",3));
        person.add(new person("Mia",2));
        person.add(new person("Aldo",20));
        LOG.info("Hello from service");
        return person;
    }
}
