/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instituto;

import java.util.TreeSet;

/**
 * Representa un curso con un nombre y una lista de alumnos.
 * 
 * @author Pablo López
 * @version 1.0
 */
public class Curso {

	private String nombre;
	private TreeSet<Persona> listaAlumnos;

	// Get de nombre
	protected String getNombre() {
		return nombre;
	}

	// Constructor
	public Curso(String nombre) {
		this.nombre = nombre;
		listaAlumnos = new TreeSet<>();
	}

	// Override de toString
	@Override
	public String toString() {
		String s = "--------------------" + nombre + "-----------------\n";
		s += "NumExp\tNIF\t\tNombre\t\tApellidos\n";
		s += "-------------------------------------------------\n";
		for (Persona listaAlumno : listaAlumnos) {
			s += listaAlumno + "\n";
		}
		return s;
	}

	// Método que añade alumno a la lista
	public void aniadirAlumno(Persona p) {
		listaAlumnos.add(p);
	}
}
