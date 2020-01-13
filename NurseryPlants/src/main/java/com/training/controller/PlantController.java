package com.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.training.beans.Plants;
import com.training.beans.Login;
import com.training.service.PlantService;



@Controller
public class PlantController {
	@Autowired
	PlantService plantService = new PlantService();

	@RequestMapping(value = "/")
	public String show() {

		return "login";
	}

	

	@RequestMapping(value = "/login")
	public ModelAndView Loginuser(@RequestParam("uname") String uname, @RequestParam("upass") String upass,
			@RequestParam("utype") String utype) {
		
		Login q = null;
		q = plantService.getLogin(uname, upass, utype);
		
		try {

			if(q!=null) {
				if (q.getUname().equals(uname) && q.getUpass().equals(upass) && q.getUtype().equals(utype) && q != null) {
					if (q.getUtype().equals("admin")) {
						
						return new ModelAndView("redirect:/Plants");
					} else if (q.getUtype().equals("user")) {
					
						return new ModelAndView("redirect:/UPlants");

					} else {
						return new ModelAndView("redirect:/");
					}
				}

				else {
					return new ModelAndView("redirect:/");
				}

			}
			
		}catch (Exception e) {
			return new ModelAndView("redirect:/");
			// TODO: handle exception
		}
		return new ModelAndView("redirect:/");
		
		
	}

	@RequestMapping(value = "/Display")
	public ModelAndView displayPlants() {
		List<Plants> plist = plantService.getAllPlants();
		return new ModelAndView("Display", "plist", plist);
	}

	@RequestMapping(value = "/Plants")
	public ModelAndView showPlants() {
		List<Plants> plist = plantService.getAllPlants();
		return new ModelAndView("Plants", "plist", plist);
	}
	
	@RequestMapping(value = "/UPlants")
	public ModelAndView showUPlants() {
		List<Plants> plist = plantService.getAllPlants();
		return new ModelAndView("UPlants", "plist", plist);
	}

	@RequestMapping(value = "/addPlants")
	public ModelAndView addPlants() {
		return new ModelAndView("addPlants", "command", new Plants());
	}

	@RequestMapping(value = "/addPlant")
	public ModelAndView addPlants(@RequestParam("id") int id, @RequestParam("nm") String name,
			@RequestParam("price") double price) {
		Plants p = new Plants(id, name, price);
		plantService.addPlants(p);
		return new ModelAndView("redirect:/Plants");
	}

	@RequestMapping(value = "/edit/{id}")
	public ModelAndView editPlants(@PathVariable("id") int id) {
		Plants p = (Plants) plantService.getPlantById(id);

		return new ModelAndView("editPlants", "p", p);
	}

	@RequestMapping(value = "/delete/{id}")
	public ModelAndView deletePlants(@PathVariable("id") int id) {
		plantService.deletePlant(id);

		return new ModelAndView("redirect:/Plants");
	}

	@RequestMapping(value = "/updatePlants")
	public ModelAndView updatePlants(@RequestParam("id") int id, @RequestParam("nm") String name,
			@RequestParam("price") double price) {
		System.out.println("Update Plants");
		Plants p = new Plants(id, name, price);
		plantService.updatePlant(p);
		return new ModelAndView("redirect:/Plants");
	}

	@RequestMapping(value = "/add/{id}")
	public ModelAndView addedPlants(@PathVariable("id") int id) {
		Plants p = (Plants) plantService.getPlantById(id);
		plantService.addedPlants(p);
		return new ModelAndView("redirect:/Display");
	}

	@RequestMapping(value = "/history")
	public ModelAndView showAddedPlants() {
		List<Plants> plist = plantService.getAddPlants();
		return new ModelAndView("add", "plist", plist);
	}
}
