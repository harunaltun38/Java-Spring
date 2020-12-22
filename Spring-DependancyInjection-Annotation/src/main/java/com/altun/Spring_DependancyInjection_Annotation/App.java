package com.altun.Spring_DependancyInjection_Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
        Samsung s20 = factory.getBean(Samsung.class);
        s20.config();
    }
}
