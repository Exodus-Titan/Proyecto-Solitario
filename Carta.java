package estructuras;

public class Carta {
	
	public static enum Pinta{corazon, trebol, picas, diamante};
	
	private boolean color; //Es boolean porque solo hay 2 colores posibles true para negro y false para rojo
	private int numero; //Solo van del 1 al 13 si es 0 la carta es vacia
	private Pinta pinta;
	
	public Carta(Pinta pinta,boolean color,int numero) {
		this.color=color;
		this.numero=numero;
		this.pinta=pinta;
	}

	public boolean getColor() {
		return color;
	}

	public void setColor(boolean color) {
		this.color = color;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Pinta getPinta() {
		return pinta;
	}

	public void setPinta(Pinta pinta) {
		this.pinta = pinta;
	}
	
	
}
