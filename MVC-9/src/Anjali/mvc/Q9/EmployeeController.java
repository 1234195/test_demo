package Anjali.mvc.Q9;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class EmployeeController {
    static List<Employee> EmployeeList=new ArrayList<>(Arrays.asList(
            new Employee("1","Anjali","10000"),
            new Employee("2","puja","10000"),
            new Employee("3","priya","10050"),
            new Employee("4","rutu","10000"),
            new Employee("5","akshy","20000"),
            new Employee("6","piya","30000"),
            new Employee("7","Gauri","100060"),
            new Employee("8","Hina","100007"),
            new Employee("9","suraj","100006"),
            new Employee("10","mayuri","10080"),
            new Employee("11","Kiran","100010"),
            new Employee("12","vaishu","100020"),
            new Employee("13","Manjiri","100080"),
            new Employee("14","sunanda","200040"),
            new Employee("15","nandini","100040")));

    @RequestMapping(value="/hello.html",method=RequestMethod.GET)
	public ModelAndView goesToHyperlinkPage()
    {
		ModelAndView m= new ModelAndView("index");
        return m;
    }
    
	@RequestMapping(value="f5",method=RequestMethod.GET)
    public ModelAndView view1()
    {
        
        ModelAndView mv=new ModelAndView("showAllEmployee");
        mv.addObject("list",EmployeeList.subList(0, 5));
        return mv;
    }
	@RequestMapping(value="s5",method=RequestMethod.GET)
    public ModelAndView view2()
    {
        
        ModelAndView mv=new ModelAndView("showAllEmployee");
        mv.addObject("list",EmployeeList.subList(5, 10));
        return mv;
    }
	@RequestMapping(value="t5",method=RequestMethod.GET)
    public ModelAndView view3()
    {
        
        ModelAndView mv=new ModelAndView("showAllEmployee");
        mv.addObject("list",EmployeeList.subList(10, 15));
        return mv;
    }
}