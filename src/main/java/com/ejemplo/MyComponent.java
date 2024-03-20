package com.ejemplo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    private MyService myService; // Agregamos una dependencia de MyService

    // Utilizamos @Autowired en el constructor para la inyección de dependencias.
    // Spring creará automáticamente una instancia de MyService y la inyectará aquí.
    @Autowired
    public MyComponent(MyService myService) {
        this.myService = myService;
    }

    public void doSomething() {
        // Ahora MyComponent puede usar MyService para realizar alguna operación.
        myService.performService();
        System.out.println("Haciendo algo en MyComponent...");
    }
}
