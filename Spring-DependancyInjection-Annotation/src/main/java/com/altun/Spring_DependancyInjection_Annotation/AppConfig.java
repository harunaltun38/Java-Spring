package com.altun.Spring_DependancyInjection_Annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= "com.altun.Spring_DependancyInjection_Annotation")
public class AppConfig {
	/*
	 * Statt der @Bean Annotation kann alternativ @Component Annoation in diesen Klassen verwendet werden. Die Klasse die die Konfig liefert zusätzöich @ComponentScan deklarieren
	 * 
	 * @Bean public Samsung getPhone() { return new Samsung(); }
	 * 
	 * @Bean public MobileProcessor getProcessor() { return new SnapDragon(); }
	 */
}
