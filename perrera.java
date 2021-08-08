/******************************************************************
Perreramain.java
Autor: Jimena Hernández O
Última modificación: 07-08-2021

Driver program que implementa el menú de opciones
******************************************************************/
import java.util.Scanner;

class Perrera{
	public static void main(String[] args){
		Persona nuevaPersona;
		nuevaPersona = new Persona();
		Perro  nuevoPerro;
		nuevoPerro = new Perro();
		
		Scanner scan = new Scanner(System.in);
		//Crear perro y persona
		int opcion = 0;
		
		while (opcion != 5){
		
			System.out.println("\n\nBienvenido al programa de entrenamiento de voluntari@s. ¿Qué hará?");
			System.out.println("1. Nueva persona");
			System.out.println("2. Nuevo perro");
			System.out.println("3. Sacar galleta");
			System.out.println("4. Interactuar");
			System.out.println("5. Salir\n\n");
			
			opcion = scan.nextInt();
			
			if (opcion == 1){
				//Nueva persona
				nuevaPersona = new Persona();
				
			} else if (opcion == 2){
				//Nuevo perro
				nuevoPerro = new Perro();
				
			} else if (opcion == 3){
				nuevaPersona.nuevaGalleta();
				System.out.println("ya tiene una galleta");
					
			} else if (opcion == 4){
				nuevoPerro.psican(nuevaPersona);
				//Interactuar
			} else if (opcion == 5){
				//Salir
			}
		}
	}
}