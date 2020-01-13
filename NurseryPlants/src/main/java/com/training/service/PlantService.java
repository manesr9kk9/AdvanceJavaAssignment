package com.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.beans.Login;
import com.training.beans.Plants;
import com.training.dao.PlantDao;


@Service
public class PlantService {
	@Autowired
	PlantDao plant=new PlantDao();
	 
	public Login getLogin(String uname,String upass,String utype)
	{
		return plant.getLogin(uname, upass, utype);
		
	}

	public int addPlants(Plants p)
	{
		return plant.addPlants(p);
		
	}

	public Plants getPlantById(int id)
	{
		return plant.getPlantById(id);
		
	}

	public List<Plants> getAllPlants()
	{
		return plant.getAllPlants();
		
	}

	public int deletePlant(int id)
	{
		return plant.deletePlant(id);
		
	}

	public int updatePlant(Plants p) 
	{
		return plant.updatePlant(p);
	}

	public void addedPlants(Plants p) {
		plant.addedPlants(p);
		
	}
	public List<Plants> getAddPlants()
	{
		return plant.getAddPlants();
		
	}
	
}
