package com.altun.harun;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

//Diese Klasse wird alternativ verwendet um die XML File  (harun-servlet) zu ersetzen.
//Diese sind nun nicht mehr noetig --> kann entfernt werden
@Configuration
@ComponentScan({"com.altun.harun"})
public class HarunConfig {

	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		// wenn ausserhalb der webapps directory waere, dann hier angeben fuer prefix ("/.../")
		//vr.setPrefix()
		
		//In den Controllern  kann nun auf die Angabe des Sufixes ".jsp" verzichtet werden
		vr.setSuffix(".jsp");
		return vr;
	}
}
