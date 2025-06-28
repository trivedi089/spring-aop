package org.example;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* org.example.ShoppingCart.checkout())")
    public void logger(){
        System.out.println("Loggers");
    }

    @After("execution(* *.*.*.checkout())")
    public void afterLogger(){
        System.out.println("After Loggers");
    }
}
