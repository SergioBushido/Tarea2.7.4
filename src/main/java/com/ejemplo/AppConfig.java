package com.ejemplo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// @Configuration indica que esta clase es parte de la configuración de Spring.
// @ComponentScan con esto lo que hacemos es decirle a Spring que escanee el paquete 'com.ejemplo' en busca de componentes anotados.
@Configuration
@ComponentScan("com.ejemplo")
public class AppConfig {
    //  @ComponentScan como hemos metido esta notación no hay que meter nada aquí.
}
