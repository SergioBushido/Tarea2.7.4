package com.ejemplo;

import org.springframework.stereotype.Repository;

// @Repository anota la clase como un repositorio de Spring, lo que es útil para la persistencia de datos y la traducción de excepciones de base de datos.
@Repository
public class MyRepository {

    public void doRepositoryWork() {
        System.out.println("Trabajo de repositorio en progreso...");
    }
}
