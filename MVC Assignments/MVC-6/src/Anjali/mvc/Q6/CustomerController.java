package Anjali.mvc.Q6;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {
	
	@RequestMapping(value="/customerRegister")
	public ModelAndView register() {
		return new ModelAndView("Que6/Registration");
	}
	
	@RequestMapping(value="/submitRegistration", method=RequestMethod.POST)
	public ModelAndView validate(@ModelAttribute("c1") @Valid Customer c2, BindingResult result) {
		System.out.println(c2);
		if(result.hasErrors()) {
			ModelAndView mav=new ModelAndView("Que6/Registration");
			return mav;
		}
		else
			return new ModelAndView("Que6/Success");
	}
}
