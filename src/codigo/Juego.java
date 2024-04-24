package codigo;

//La clase enfrentara dos jugadores guardando el resultado de cada "mano"
// gana el jugador que mas manos gane
// Al final se tiene que poder imprimir por pantalla el ganador
// Añade los atributos que consideres necesarios
public class Juego {


  private Jugador jugador1;
  private Jugador jugador2;
  

//Crear constructor que inicialice los dos jugadores
  // 
  public Juego (Jugador jugador1, Jugador jugador2){
	  //recibimos por parametro 2 objetos de la clase Jugador
	  this.jugador1 =  jugador1;
	  this.jugador2 = jugador2;
 }

  //Metodo que se llama jugarPartida()
  // declaaralo como consideres
   public void jugarPartida() {
	   Mano[] jugadasJ1 = jugador1.getJugadas();
	   Mano[] jugadasJ2 = jugador2.getJugadas();
	  for (int i = 0; i < 3; i ++) {
		 boolean result = jugadasJ1[i].ganaContra(jugadasJ2[i]);  
		 if(result) {
			 mostrarResultado(result);
		 }else {
			 mostrarResultado(result);
		 }
	  }
   }
  //Imprimir resultado partida junto con los datos del juego
  public String mostrarResultado(boolean result){
    if(result) {
    	System.out.println( jugador1 + "Gana la partida");
    }else {
    	System.out.println( jugador2 + "Gana la partida");
    }
  }
  
}
