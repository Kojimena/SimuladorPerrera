/******************************************************************
Persona.java
Autor: Jimena Hernández O
Última modificación: 07-08-2021

Clase persona
******************************************************************/
import java.util.Random;

class Persona{
	Random rand = new Random();
	private float confiabilidad;
	private boolean galleta;
	
	
		Persona(){
		System.out.println("Se ha creado una nueva persona");
	 	confiabilidad = rand.nextFloat()* 10 - 0 ;
		System.out.println("la confiabilidad es"+ confiabilidad);
		}
		
	
		public float getConfiabilidad(){
			return confiabilidad;
		}
		
		public boolean tieneGalleta(){
			// Genera un boolean de forma aleatoria
			boolean galleta = rand.nextBoolean();
			// Si es verdadero galleta y sino nogalleta
			return (galleta);
		}

		public void darGalleta(){
		// Si es verdadero galleta y sino nogalleta
			if (galleta == true){
				galleta= false;
			}		
		}
		public void nuevaGalleta(){
			galleta = true;
		}
}