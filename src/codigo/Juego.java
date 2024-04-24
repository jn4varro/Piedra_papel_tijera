package codigo;

//La clase enfrentara dos jugadores guardando el resultado de cada "mano"
// gana el jugador que mas manos gane
// Al final se tiene que poder imprimir por pantalla el ganador
// Añade los atributos que consideres necesarios
public class Juego {

  private int contador1;
  private int contador2;
  private Jugador jugador1;
  private Jugador jugador2;
  

//Crear constructor que inicialice los dos jugadores
  // 
  public Juego (){
	  this.jugador1 =  new Jugador();
	  this.jugador2 =  new Jugador();
	  this.contador1 = 0;
	  this.contador2 = 0;
 }

  //Metodo que se llama jugarPartida()
  // declaaralo como consideres
   public void jugarPartida() {
	   Mano[] jugadasJ1 = jugador1.getJugadas();
	   Mano[] jugadasJ2 = jugador2.getJugadas();
	  for (int i = 0; i < 3; i ++) {
		 
		  if(jugadasJ1[i].ganaContra(jugadasJ2[i]) == true) {
			contador1 ++;
		 }else {
			contador2 ++;
		 }
	  }
   }
  //Imprimir resultado partida junto con los datos del juego
  public void mostrarResultado(){
	  //aqui podria tambien meter un for y recorrer cada jugada y compararla (jugador 1 ha sacado piedra...)
	if(contador1 > contador2) {
		 System.out.println(jugador1 + "Ha Ganado la partida, con un total de: " + contador1 + "rondas ganadas" );
	}else {
		System.out.println(jugador2 + "Ha Ganado la partida, con un total de: " + contador1 + "rondas ganadas" );
	}
}
  
}
