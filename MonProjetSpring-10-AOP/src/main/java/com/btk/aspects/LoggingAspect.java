package com.btk.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	
	private Logger logger = LoggerFactory.getLogger(LoggingAspect.class);
	
	
	
	@Before(value = "execution(* com.btk.service.Calcul.*(..))")
	public void logBefore(JoinPoint point) {
		logger.info(">>>> LOG : A l'entrée de la methode " + point.getSignature().getName());

	}

//	@After(value = "execution(* com.btk.service.Calcul.*(..))")
//	public void logAfter(JoinPoint point) {
//		System.out.println("<<<< LOG : A la sortie de la methode "+ point.getSignature().getName());
//
//	}

	@AfterReturning(value = "execution(* com.btk.service.Calcul.*(..))", returning = "resultat")
	public void logAfter(JoinPoint point, int resultat) {
		logger.info("<<<< LOG : A la sortie de la methode " + point.getSignature().getName() + "le resultat est "
				+ resultat);

	}

}
