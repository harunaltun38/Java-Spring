package com.altun;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlienResource {

	@RequestMapping("aliens")
	public List<Alien> getAliens() {

		List<Alien> aliens = new ArrayList<>();

		Alien a1 = new Alien();
		Alien a2 = new Alien();
		Alien a3 = new Alien();

		a1.setAid(100);
		a1.setAname("Harun");
		a1.setLang("turkish");

		a2.setAid(101);
		a2.setAname("Andreas");
		a2.setLang("german");

		a3.setAid(102);
		a3.setAname("Michael");
		a3.setLang("english");

		aliens.add(a1);
		aliens.add(a2);
		aliens.add(a3);

		return aliens;
	}

}
