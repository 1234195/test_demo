package Anjali.mvc.Q2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SimpleIntrestController {
	@RequestMapping(value="/hello.html",method=RequestMethod.GET)
	public ModelAndView goesToHyperlinkPage(){
		ModelAndView a= new ModelAndView("SimpleIntrest");
      return a;
   }
	@RequestMapping(value="MVC-assignment-2/submit.html",method=RequestMethod.POST)
	public ModelAndView pringTheMessage(@ModelAttribute("I") SimpleIntrest I)
	{
		double Interest = I.Pamount*I.NoY*I.getrate();
		ModelAndView a1= new ModelAndView("Display");
		a1.addObject("msg",Interest);
      return a1;
   }
}

