package com.ejemplo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// @Service marca la clase como un servicio de Spring, que es un tipo especializado de @Component.
@Service
public class MyService {

    // @Autowired inyecta automáticamente la instancia de MyRepository cuando MyService es creado.
    private final MyRepository myRepository;

    @Autowired
    public MyService(MyRepository myRepository) {
        this.myRepository = myRepository;
    }

    public void performService() {
        myRepository.doRepositoryWork();
        System.out.println("Servicio ejecutado.");
    }
}
