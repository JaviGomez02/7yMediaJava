package com.jacaranda.baraja;

import java.util.Arrays;

public abstract class Baraja implements Repartible{

	protected int numCartas;
	protected Carta[] baraja;
	private int siguiente;
	
	public Baraja(int numCartas) {
		super();
		this.numCartas=numCartas;
		this.siguiente=0;
		this.baraja=new Carta[numCartas];
		barajar();
		}

	protected abstract String generaPalo();
	
	private int generaNumero() {
		int num=(int) ((Math.random()*(this.numCartas/4))+1);
		return num;
	}
	
	public void barajar() {
		int numCartasGeneradas=0;
		while (numCartasGeneradas<this.numCartas) {
			int numero=generaNumero();
			String palo=generaPalo();
			Carta c1=new Carta(numero,palo);
			boolean encontrado=false;
			for (int i = 0; i < numCartasGeneradas && encontrado==false; i++) {
				if (c1.equals(baraja [i])) {
					encontrado=true;
				}
			}
			if (encontrado==false) {
				baraja[numCartasGeneradas]=c1;
				numCartasGeneradas++;
			}
		}
	}

	@Override
	public String toString() {
		return "Baraja [numCartas=" + numCartas + ", baraja=" + Arrays.toString(baraja) + ", siguiente=" + siguiente
				+ "]";
	}
	@Override
	public Carta getSiguiente() {
		if (siguiente==this.numCartas) {
			siguiente=0;
		}
		Carta resultado=new Carta(baraja[siguiente].getNumber(),baraja[siguiente].getPalo());
		siguiente++;
		return resultado;
	}
	
	
	
}
