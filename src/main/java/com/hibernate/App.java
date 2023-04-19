package com.hibernate;

import java.util.List;

import com.hibernate.dao.CiudadDAO;
import com.hibernate.model.Ciudad;

public class App {

	public static void main(String[] args) {

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		CiudadDAO ciudadDAO=new CiudadDAO();
		
		Ciudad pers1=new Ciudad("Juan", 19);
		ciudadDAO.insertCiudad(pers1);
		
		Ciudad pers2=new Ciudad("Ana", 63);
		ciudadDAO.insertCiudad(pers2);
		
		Ciudad pers3=new Ciudad("Juana", 24);
		ciudadDAO.insertCiudad(pers3);

		
		pers1.setIdad(40);
		ciudadDAO.updateCiudad(pers1);

		Ciudad pers4=ciudadDAO.selectCiudadById(2);
		System.out.println(pers4.getNombre());
		
		List<Ciudad> personas = ciudadDAO.selectAllPerson();
		
		for (Ciudad c: ciudades) {
			System.out.println(p.getNombre() + " " + p.getIdad());
	
		}
		ciudadDAO.deleteCiudad(3);
	}
	

}
