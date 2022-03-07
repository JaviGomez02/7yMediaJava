package com.jacaranda.baraja;

public class BarajaEspannola extends Baraja {
	
	

	public BarajaEspannola() {
	super.numCartas=40;
	// TODO Auto-generated constructor stub
}



	protected String generaPalo() {
		int resultado=(int) ((Math.random()*4));
		
		return PalosBarajaEspannola.values()[resultado].toString();
	}



	@Override
	public String toString() {
		StringBuilder resultado=new StringBuilder();
		for (int i = 0; i < super.numCartas; i++) {
			resultado.append(super.baraja[i].toString()+ "\n");
		}
		return resultado.toString();
		
	}
}
