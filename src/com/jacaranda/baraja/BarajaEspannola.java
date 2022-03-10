package com.jacaranda.baraja;

public class BarajaEspannola extends Baraja {
	
	private static final int CARTAS_BARAJA_ESPANNA=40;

	public BarajaEspannola() {
		super(CARTAS_BARAJA_ESPANNA);
	}

	protected String generaPalo() {
		int resultado=(int) ((Math.random()*4));
		
		return PalosBarajaEspannola.values()[resultado].toString();
	}

	@Override
	public String toString() {
		StringBuilder resultado=new StringBuilder();
		for (int i = 0; i < super.numCartas; i++) {
			if (super.baraja[i].getNumber()<=7) {
				resultado.append(super.baraja[i].getNumber()+ "\n");
			}
			else {
				if (super.baraja[i].getNumber()==8) {
					resultado.append("Sota");
				}
				else if (super.baraja[i].getNumber()==9) {
					resultado.append("Caballo");
				}
				else if (super.baraja[i].getNumber()==10) {
					resultado.append("Rey");
				}
				resultado.append(" "+super.baraja[i].getPalo()+"\n");
			}
		}
		return resultado.toString();
		
	}
}
