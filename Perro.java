/******************************************************************
Perro.java
Autor: Jimena Hernández O
Última modificación: 07-08-2021

Clase Perro
******************************************************************/

import java.util.Random;
//Se inicia la clase Perro
class Perro{
	//Se declaran las variables privadas
	private float animo;
	private float umbral;
	private Random rand;
	//Constructor que incia al llamarlo
		Perro(){
		rand = new Random();//llamamos a random
		System.out.println("Se ha creado un perro");
	    animo = rand.nextFloat()* 10 -5;//Utilizando random obtenemos un número Float al azar
		umbral = rand.nextFloat()* 20 - 20;//Utilizando random obtenemos un número Float al azar
	}
	//Método psican de psicología canina
	public void psican(Persona p){
		//Se imprime la confiabilidad y el animo anterior
		System.out.println("Mi confiabilidad antes: "+p.getConfiabilidad());	
		System.out.println("Mi animo anterior era: "+this.animo);
		this.animo= (1.0f/ p.getConfiabilidad()) * (rand.nextFloat()-0.5f) * 10 + this.animo;// se altera el ánimo dependiendo de la confiabilidad y la galleta
		if (p.tieneGalleta()){
			p.darGalleta();//Se hace uso de la galleta al tener una
			this.animo += (1.0f/ p.getConfiabilidad()* rand.nextInt(2));
			System.out.println("Mi nuevo animo es: "+ animo);	//se muestra el nuevo animo
		}
		if (animo < umbral){
			System.out.println("El perro muerde y La persona se asusta");//Reaccion si el ánimo es menor al umbral
		}else if ( animo > umbral && 0 > animo){
			System.out.println("El perro ladra y La persona se pone triste");//Reaccion si el ánimo es mayor al umbral pero un numero negativo
		}else if (animo >= 0){
			System.out.println("El perro mueve la cola y La persona sonrie");//Reaccion si el ánimo es positivo
		}
	}
		
}