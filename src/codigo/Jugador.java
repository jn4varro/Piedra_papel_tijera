package codigo;

import java.util.Random;

public class Jugador {
	//voy a modificar esta declaración, me está dando error de sintaxis
	private Mano[] jugadas = new Mano [3];

  // crea un constructor que NO reciba ningun parametro y cree 3 manos aleatorias para el jugador

  public Jugador() {
	 //si he entendido bien, debería ser algo así
	  //invocar al Random
	  Random random = new Random();
	  
	  //un array con las 3 opciones
	  String[] opciones = {"PIEDRA", "PAPEL", "TIJERA"};
	  
	  //Un bucle para recorrer la matriz jugadas con las 3 manos
	   for(int i = 0; i < jugadas.length; i++) {
		  //generamos un numero aleatorio de 0 a 2
		 int num = random.nextInt(3);
		 //utilizamos el número aleatorio como índice en el array opciones
		  String opcion = opciones[num];
		  //actualizamos con el setter del atributo de la mano correspondiente en esta iteración
		  jugadas[i].setJugada(opcion);
	  }
	  
  }
  
  //me esta dando revolcones esto, necesito crear unos get/set por no cambiar los modificadores
  
  public Mano[] getJugadas() {
	  return jugadas;
  }
  
  public void setJugadas(Mano[] jugadas) {
	  this.jugadas = jugadas;
  }
  
  }
