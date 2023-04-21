package com.hibernate;

import java.util.List;
import java.util.Scanner;

import com.hibernate.dao.CiudadDAO;
import com.hibernate.model.Ciudad;

public class App {


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
		CiudadDAO ciudadDAO = new CiudadDAO();
		List<Ciudad> ciudades = null;

		do {
			mostrarMenu();
			opcion = s.nextInt();

			String nomCiudad;
			int nHab;
			int codCiud;

			switch (opcion) {
			case 1:
				System.out.println("Inserta nombre");
				nomCiudad = s.next();
				System.out.println("Inserta nº habitantes");
				nHab = s.nextInt();

				Ciudad ciudad = new Ciudad(nomCiudad, nHab);
				ciudadDAO.insertCiudad(ciudad);
				break;
			case 2:
				System.out.println("Inserta código");
				codCiud = s.nextInt();
				ciudadDAO.deleteCiudad(codCiud);
			
				break;
			case 3:
				ciudades = ciudadDAO.selectAllCiudads();
				ciudades.forEach(c -> System.out.println(c.getCodigo() + " " + c.getNombre() + " " + c.getNumHabi()));
				break;
			case 4:
				System.out.println("Inserta código");
				codCiud = s.nextInt();
				ciudadDAO.selectCiudadById(codCiud);
				for (Ciudad c : ciudades) {

					if (c.getCodigo() == codCiud) {
						System.out.println(c.getCodigo() + " " + c.getNombre() + " " + c.getNumHabi());
					}
				}
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
