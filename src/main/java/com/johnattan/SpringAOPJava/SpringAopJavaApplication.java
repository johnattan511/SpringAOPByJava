package com.johnattan.SpringAOPJava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringAopJavaApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringAopJavaApplication.class, args);
		AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext();
		acac.register(ConfiguracionBeans.class);
		acac.refresh();

		
		ClasePrincipal clasePrincipal = acac.getBean(ClasePrincipal.class);
		clasePrincipal.metodoRetornarEquipo("Millonarios");
	}
}
