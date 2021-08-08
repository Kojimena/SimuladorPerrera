/******************************************************************
Persona.java
Autor: Jimena Hernández O
Última modificación: 07-08-2021

Clase persona
******************************************************************/
//Se importa random para poder tener numeros al azar 
import java.util.Random;

//Se inicia la clase persona
class Persona{
	Random rand = new Random();
	private float confiabilidad;
	private boolean galleta;
	
	//Se hace un constructor que se inicia siempre que se llame al mismo
		Persona(){
		System.out.println("Se ha creado una nueva persona");
	 	confiabilidad = rand.nextFloat()* 10 - 0 ;
		System.out.println("la confiabilidad es"+ confiabilidad);//mostramos la confiabilidad al inicio
		}
		
		//método getConfiabilidad para utilizarlo en la clase perro
		public float getConfiabilidad(){
			return confiabilidad;
		}
		//Se hace un método para obtener un random boolean
		public boolean tieneGalleta(){
			// Genera un boolean de forma aleatoria
			boolean galleta = rand.nextBoolean();
			// Si es verdadero galleta y sino nogalleta
			return (galleta);
		}
		//método para darle la galleta a la persona
		public void darGalleta(){
		// Si es verdadero galleta y sino nogalleta
			if (galleta == true){
				galleta= false;
			}		
		}
		//Método para asegurarnos que le de la galleta a la persona
		public void nuevaGalleta(){
			galleta = true;
		}
}