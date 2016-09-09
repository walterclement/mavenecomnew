package com.bakeecom.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bakeecom.model.Product;
import com.bakeecom.services.DataService;


@Controller
public class BakeryController {

	public BakeryController() {
		// super();
		// TODO Auto-generated constructor stub
		System.out.println("inside bakery controller");
	}
	
	@Autowired
	DataService dataService;

	@RequestMapping("/")
	public String homePage() {
		return "front";
	}
	@RequestMapping("/form")
	public ModelAndView gotoProduct(@ModelAttribute("prod")Product prod)
	{
	return new ModelAndView("form");
	}
	@RequestMapping(value="addProduct",method=RequestMethod.POST)
	public ModelAndView saveProduct(@ModelAttribute("prod")Product prod)
	{
	dataService.insertRow(prod);
	return new ModelAndView("form").addObject("command", new Product());
	}
	
	@RequestMapping("/gridlis")
	public ModelAndView listProduct(ModelMap m)
	{
	List<Product> productList=dataService.getList();
	m.addAttribute("chkMsg", "hello");
	return new ModelAndView("gridlis","productList", productList);
	}
	
	@RequestMapping("/aboutus")
	public String gotoindex() {
		return "aboutus";
	}
	@RequestMapping("/home1")
	public String gotohome1() {
		return "home1";
	}
	@RequestMapping("/login2")
	public String gotologin() {
		return "login2";
	}
	@RequestMapping("/regis2")
	public String gotoregis() {
		return "regis2";
	}
	
	@RequestMapping("/edit")
	public ModelAndView editProd(@ModelAttribute("prod")Product prod,@RequestParam int id)
	{
		prod=dataService.getRowById(id);
		ModelAndView mv=new ModelAndView("edit","prdList",prod);
		mv.setViewName("edit");
		
		return mv.addObject("command", prod);
	}
	
	@RequestMapping(value="updateProduct",method=RequestMethod.POST)
	public ModelAndView updateProd(@ModelAttribute("prod")Product prod)
	{
//	prod=dataService.getRowById(id);
	dataService.updateRow(prod);
	return new ModelAndView("redirect:gridlis");
//		return new ModelAndView("list","prod");
	}
	
@RequestMapping("/deleteProduct")
	public ModelAndView deleteProd(@RequestParam int id)
	{
	dataService.deleteRow(id);
		return new ModelAndView("redirect:gridlis");
	}
	
}
