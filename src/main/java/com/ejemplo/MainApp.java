package com.ejemplo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        // Inicializa el contexto de Spring con AppConfig que activa el escaneo de componentes.
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
            // Obtiene el bean MyComponent y ejecuta su método.
            // Como MyComponent tiene una dependencia de MyService, Spring se asegura de inyectarla.
            MyComponent myComponent = context.getBean(MyComponent.class);
            myComponent.doSomething();
        }
    }
}
