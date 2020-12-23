package com.altun.harun;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.altun.harun.service.*;

@Controller
public class AddController {

	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("t1")int i, @RequestParam("t2") int j, HttpServletRequest request, HttpServletRequest response) {

	// Kann mithilfe der @RequestParam Annotation, in der Parameterliste der Methode, ersetzt werden --> direkt in die i und Variablen uebergeben
	//	int i = Integer.parseInt(request.getParameter("t1"));
	//	int j = Integer.parseInt(request.getParameter("t2"));

		// int k = i + j; Programmierlogik in Services auslagern. Siehe unten

		AddService as = new AddService();

		int k = as.add(i, j);

		ModelAndView mv = new ModelAndView();
		mv.setViewName("display");
		mv.addObject("result", k);

		return mv;
	}
}
