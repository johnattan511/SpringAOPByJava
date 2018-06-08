package com.johnattan.SpringAOPJava;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import aop.ClaseAspecto;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class ConfiguracionBeans {
    
	@Bean
	public ClaseAspecto obtenerClaseAspecto(){
		return new ClaseAspecto();
	}
	
	@Bean
	public ClasePrincipal obtenerClasePrincipal(){
		return new ClasePrincipal();
	}
}
