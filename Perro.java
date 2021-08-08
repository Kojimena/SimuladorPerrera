/******************************************************************
Perro.java
Autor: Jimena Hernández O
Última modificación: 07-08-2021

Clase Perro
******************************************************************/

import java.util.Random;

class Perro{
	
	private float animo;
	private float umbral;
	private Random rand;
	
		Perro(){
		rand = new Random();
		System.out.println("Se ha creado un perro");
	    animo = rand.nextFloat()* 10 -5;
		umbral = rand.nextFloat()* 20 - 20;
	}
	
	public void psican(Persona p){
		System.out.println("Mi confiabilidad antes: "+p.getConfiabilidad());	
		System.out.println("Mi animo anterior era: "+this.animo);
		this.animo= (1.0f/ p.getConfiabilidad()) * (rand.nextFloat()-0.5f) * 10 + this.animo;
		if (p.tieneGalleta()){
			p.darGalleta();
			this.animo += (1.0f/ p.getConfiabilidad()* rand.nextInt(2));
			System.out.println("Mi nuevo animo es: "+ animo);	
		}
		if (animo < umbral){
			System.out.println("El perro muerde y La persona se asusta");
		}else if ( animo > umbral && 0 > animo){
			System.out.println("El perro ladra y La persona se pone triste");
		}else if (animo >= 0){
			System.out.println("El perro mueve la cola y La persona sonrie");
		}
	}
		
}