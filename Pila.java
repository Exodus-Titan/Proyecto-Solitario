package estructuras;

public class Pila {
	private Nodo tope;
	private int tamano;
	
	public Pila() {
		tope=null;
		tamano=0;
	}
	
	public Pila(Nodo carta) {
		tope=carta;
		tamano=1;
	}
	
	public boolean esVacia() {
		if (tamano==0)
			return true;
		else
			return false;
	}
	
	public void apilar(Carta carta) {
		Nodo aux=new Nodo(carta);
		if (tamano==0) {
			tope=aux;
			tamano++;
		}
		else {
			aux.setSig(tope);
			tope=aux;
			tamano++;
		}
	}

	public void desapilar() {
		if (tamano==1) {
			tope=null;
			tamano=0;
		}
		else {
			Nodo aux=new Nodo();
			aux=tope.getSig();
			tope.setSig(null);
			tope=aux;
			tamano--;
		}
	}
	
	public Carta getTope() {
		return tope.getCarta();
	}
	
	public int tamano() {
		return tamano;
	}
	
	
	
	
	
	
	
}
