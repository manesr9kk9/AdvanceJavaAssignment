package com.training.dao;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.training.beans.Login;
import com.training.beans.Plants;



@Repository
public class PlantDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public Login getLogin(String uname,String upass,String utype ) {
		String sql="select * from Login where uname=? && upass=? && utype=?";
		try {
		Login log=(Login)jdbcTemplate.queryForObject(sql,new Object[] {uname,upass,utype},new BeanPropertyRowMapper<Login>(Login.class));
		if(log!=null)
		{
			return log;
		}
		}catch(Exception ex) {
		return null;
		}
		return null;
	}
	
	
	public int addPlants(Plants p) {
		String sql="insert into Plantslist values(?,?,?)";
		return jdbcTemplate.update(sql,new Object[] {p.getId(),p.getName(),p.getPrice()});
	}

	public Plants getPlantById(int id) {
		System.out.println(id);
		String sql="select * from Plantslist where id=?";
		
		return (Plants)jdbcTemplate.queryForObject(sql,new Object[] {id},new BeanPropertyRowMapper<Plants>(Plants.class));
		
		
	}


	public List<Plants> getAllPlants() {
		String sql="select * from Plantslist";
		List<Plants> plist=jdbcTemplate.query(sql,new BeanPropertyRowMapper<Plants>(Plants.class));
		//plist[0].getId();
		for(Plants p : plist) {
			System.out.println(p);
		}
		return plist;
		
	}

	public int deletePlant(int id) {
		String sql="delete from Plantslist where id=?";
		return jdbcTemplate.update(sql,new Object[] {id});
	}

	
	public int updatePlant(Plants p) {
		
		String sql="update Plantslist set name=?,price=? where id=?";
		return jdbcTemplate.update(sql,new Object[] {p.getName(),p.getPrice(),p.getId()});
	}
	public void addedPlants(Plants p) {
		String sql="insert into plants_history values(?,?,?)";
		jdbcTemplate.update(sql,new Object[] {p.getId(),p.getName(),p.getPrice()});
		
	}
	public List<Plants> getAddPlants() {
		String sql="select * from plants_history";
		List<Plants> plist=jdbcTemplate.query(sql,new BeanPropertyRowMapper<Plants>(Plants.class));
		return plist;
		}
}
