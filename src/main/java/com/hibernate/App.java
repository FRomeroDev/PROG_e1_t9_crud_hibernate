package com.hibernate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.hibernate.dao.CiudadDAO;
import com.hibernate.model.Ciudad;

public class App {

	/*
	 * 
	 * CiudadDAO ciudadDAO=new CiudadDAO();
	 * 
	 * Ciudad pers1=new Ciudad("Juan", 19); ciudadDAO.insertCiudad(pers1);
	 * 
	 * Ciudad pers2=new Ciudad("Ana", 63); ciudadDAO.insertCiudad(pers2);
	 * 
	 * Ciudad pers3=new Ciudad("Juana", 24); ciudadDAO.insertCiudad(pers3);
	 * 
	 * 
	 * pers1.setIdad(40); ciudadDAO.updateCiudad(pers1);
	 * 
	 * Ciudad pers4=ciudadDAO.selectCiudadById(2);
	 * System.out.println(pers4.getNombre());
	 * 
	 * List<Ciudad> personas = ciudadDAO.selectAllPerson();
	 * 
	 * for (Ciudad c: ciudades) { System.out.println(p.getNombre() + " " +
	 * p.getIdad());
	 * 
	 * } ciudadDAO.deleteCiudad(3); }
	 */

	static void mostrarMenu() {

		System.out.println();
		System.out.println("-------MENÚ--------");
		System.out.println("Seleccione una opción");
		System.out.println("1. Insertar nueva ciudad");
		System.out.println("2. Borrar ciudad por código");
		System.out.println("3. Ver todas las ciudades");
		System.out.println("4. Ver los datos de una ciudad por código");
		System.out.println("0. Salir");

	}

	public static void main(String[] args) {

		int opcion;
		Scanner s = new Scanner(System.in);

		do {
			mostrarMenu();
			opcion = s.nextInt();

			String nomCiudad;
			int nHab;

			switch (opcion) {
			case 1:
				System.out.println("Inserta nombre");
				nomCiudad = s.next();
				System.out.println("Inserta nº habitantes");
				nHab = s.nextInt();

				CiudadDAO ciudadDAO = new CiudadDAO();

				Ciudad ciudad1 = new Ciudad(nomCiudad, nHab);
				ciudadDAO.insertCiudad(ciudad1);

				break;
			case 2:

				break;
			case 3:

				break;
			case 4:

				break;
			case 5:

				break;
			case 6:

				break;
			case 0:
				System.out.println("Fin del programa");
				break;
			default:
				System.out.println("Opción no válida");
			}

		} while (opcion != 0);

	}

}
