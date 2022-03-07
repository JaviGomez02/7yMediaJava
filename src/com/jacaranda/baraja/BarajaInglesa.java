package com.jacaranda.baraja;

public class BarajaInglesa extends Baraja {

	
	public BarajaInglesa() {
		super.numCartas=52;
	}

	
	
	@Override
	protected String generaPalo() {
		int resultado=(int) ((Math.random()*4));
		
		return PalosBarajaInglesa.values()[resultado].toString();
	}



	@Override
	public String toString() {
		StringBuilder resultado=new StringBuilder();
		for (int i = 0; i < super.numCartas; i++) {
			if (super.baraja[i].getNumber()<=10) {
				resultado.append(super.baraja[i].getNumber());
			}
			else {
				if (super.baraja[i].getNumber()==11) {
					resultado.append("J");
				}
				else if (super.baraja[i].getNumber()==12) {
					resultado.append("Q");
				}
				else if (super.baraja[i].getNumber()==13) {
					resultado.append("K");
				}
			}
			resultado.append(" "+super.baraja[i].getPalo()+ "\n");
		}
		return resultado.toString();
	}

	
	
	
}
