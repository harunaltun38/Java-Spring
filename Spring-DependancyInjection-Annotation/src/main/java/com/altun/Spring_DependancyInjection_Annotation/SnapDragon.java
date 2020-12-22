package com.altun.Spring_DependancyInjection_Annotation;

import org.springframework.stereotype.Component;

@Component
public class SnapDragon implements MobileProcessor {

	public void process() {

		System.out.println("Worlds best CPU");
	}

}
