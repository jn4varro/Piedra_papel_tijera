package codigo;

public class Mano {
	private String jugada;
	
	//constructor
	public Mano(String jugada) {
		this.setJugada(jugada);
	}
	//getters y setters
	public String getJugada() {
		return jugada;
	}
	
// Seria bueno que el setter se encargara de pasar todo a mayuscula y que comprobara que
	// fuera una de las opciones posibles: PIEDRA PAPEL TIJERA
	public void setJugada(String jugada) {
		this.jugada = jugada;
	}

	//Nos falta aquí un método que se encargue comparar si una jugada gana a otra
	public boolean compararJugadas(Mano mano){
		//Te toca hacerlo
	}
}

// voy a probar con esto a ver que tal
