package estructuras;

public class Nodo {
	private Carta carta;
	private Nodo sig;
	
	public Nodo() {
		
	}
	
	public Nodo(Carta carta) {
		this.carta=carta;
		sig=null;
	}

	public Carta getCarta() {
		return carta;
	}

	public void setCarta(Carta carta) {
		this.carta = carta;
	}

	public Nodo getSig() {
		return sig;
	}

	public void setSig(Nodo sig) {
		this.sig = sig;
	}
	
	
}
