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
		//vale, en mi cabeza esto se resolvería así
		if (jugada.equals("piedra") || jugada.equals("papel") || jugada.equals("tijera")) {
		    this.jugada = jugada.toUpperCase();
		    
		} else if (jugada.equals("PIEDRA") || jugada.equals("PAPEL") || jugada.equals("TIJERA")) {
		    this.jugada = jugada;
		}else {
			System.out.println("Jugada no válida, debe ser: PIEDRA, PAPEL o TIJERA. ");
			}
		}

			
		

	//Nos falta aquí un método que se encargue comparar si una jugada gana a otra
	public boolean ganaContra(Mano mano){
		// a ver que sale aqui
		String mano1 = this.jugada;
		String mano2 = mano.getJugada();
		
	//comparaciones
		if(mano1.equals("PIEDRA") && mano2.equals("TIJERA") ||
	       mano1.equals("PAPEL") && mano2.equals("PIEDRA") ||
	       mano1.equals("TIJERA") && mano2.equals("PAPEL")) {
			
				return true;
				
	       }else {
	    	   return false;
	       }
		// pero en caso de empate? habr'a que cambiar el tipo de funcion?
		

	}
	}


