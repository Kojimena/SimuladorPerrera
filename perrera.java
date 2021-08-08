/******************************************************************
Perreramain.java
Autor: Jimena Hernández O
Última modificación: 07-08-2021

Driver program que implementa el menú de opciones
******************************************************************/
import java.util.Scanner;
//Se inicia la clase Perrera que es nuestro main
class Perrera{
	public static void main(String[] args){
		Persona nuevaPersona; 
		nuevaPersona = new Persona(); //Se crea la nueva persona
		Perro  nuevoPerro;
		nuevoPerro = new Perro(); //Se crea el nuevo perro
		//Crear perro y persona
		Scanner scan = new Scanner(System.in);
		int opcion = 0; //la opción al iniciar es 0
		
		while (opcion != 5){
			//Se muestra el menú de opciones
			System.out.println("\n\nBienvenido al programa de entrenamiento de voluntari@s. ¿Qué hará?");
			System.out.println("1. Nueva persona");
			System.out.println("2. Nuevo perro");
			System.out.println("3. Sacar galleta");
			System.out.println("4. Interactuar");
			System.out.println("5. Salir\n\n");
			
			opcion = scan.nextInt();// el scan nos permite tomar el valor entero ingresado y ponerlo en la variable opción
			
			if (opcion == 1){
				//Nueva persona
				nuevaPersona = new Persona();
				
			} else if (opcion == 2){
				//Nuevo perro
				nuevoPerro = new Perro();
				
			} else if (opcion == 3){
				nuevaPersona.nuevaGalleta();
				System.out.println("ya tiene una galleta");
				//Se le da la galleta a la persona	
			} else if (opcion == 4){
				nuevoPerro.psican(nuevaPersona);
				//Interactuar
			} else if (opcion == 5){
				//Salir
			}
		}
	}
}