package Anjali.mvc.Q4;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class UserController {
	@RequestMapping(value="/welcome.html",method=RequestMethod.GET)
	public ModelAndView goesToHyperlinkPage(){
		ModelAndView m= new ModelAndView("Registration");
      return m;
   }
	@RequestMapping(value="MVC-assignment-4/submit.html",method=RequestMethod.POST)
	public ModelAndView pringTheMessage(@ModelAttribute("u") UserModel u)
	{
		if((u.getUserName().equals("Anjali"))&&(u.getPassword().equals("Anjali"))&& (u.getEmail().equals("Alr@gmail.com"))) {
			List<String> list=new ArrayList<String>();
			list.add(u.getUserName());
			list.add(u.getPassword());
			list.add(u.getPassword());
			ModelAndView m1= new ModelAndView("Login");
			m1.addObject("val",u.getUserName()+"Data is Stored in the database.");
			return m1;
		}
		else
		{
			ModelAndView m2= new ModelAndView("Error");
			m2.addObject("error","Registration Failed Try Again ");
			return m2;
		}
   }
	@RequestMapping(value="MVC-assignment-4/MVC-assignment-4-Login/submit.html",method=RequestMethod.POST)
	public ModelAndView pringTheMessage1(@ModelAttribute("u") UserModel u)
	{
		if((u.getUserName().equals("Anjali"))&&(u.getPassword().equals("Anjali"))) {
			ModelAndView m1= new ModelAndView("Success");
			m1.addObject("success","Login Successfully!");
			return m1;
		}
		else
		{
			ModelAndView m2= new ModelAndView("Error");
			m2.addObject("error","Login Failed Enter valid values");
			return m2;
		}
   }
}
