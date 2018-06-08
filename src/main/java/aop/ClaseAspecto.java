package aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

//@Component
@Aspect
public class ClaseAspecto {

	@Pointcut("execution(* com.johnattan.SpringAOPJava.ClasePrincipal.*(..))")
	public void clasePointCut(){
		
	}
	
	@Before("clasePointCut()")
	public void metodoBefore(){
		System.out.println("Entrando al metodo Before...");
	}
	
	@After("clasePointCut()")
	public void metodoAfter(){
		System.out.println("Entrando al metodo After...");
	}
	
	@AfterReturning(pointcut="clasePointCut()", returning="palabra")
	public void metodoAfterReturning(String palabra){
		System.out.println("La palabra al final final es " + palabra);
		
	}
}
