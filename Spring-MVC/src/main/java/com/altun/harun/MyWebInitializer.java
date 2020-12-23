package com.altun.harun;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//Diese Klasse wird alternativ verwendet um die XML File  (web) zu ersetzen.
//Diese sind nun nicht mehr noetig --> kann entfernt werden
public class MyWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}
//Connected hier meine neu erstellte Klasse HarunConfig, welche die harun-servlet XML File erstetzt hat
	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		return new Class[] {HarunConfig.class};
	}

	@Override
	protected String[] getServletMappings() {

		return new String[] { "/" };
	}

}
