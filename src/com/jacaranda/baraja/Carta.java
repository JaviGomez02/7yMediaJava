package com.jacaranda.baraja;

import java.util.Objects;

public class Carta implements Comparable<Carta>{
	
	private int number;
	private String palo;
	public Carta(int number, String palo) {
		super();
		this.number = number;
		this.palo = palo;
	}
	@Override
	public int hashCode() {
		return Objects.hash(number, palo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carta other = (Carta) obj;
		return number == other.number && Objects.equals(palo, other.palo);
	}
	public int getNumber() {
		return number;
	}
	public String getPalo() {
		return palo;
	}
	
	public double getValor() {
		double resultado;
		if (this.number<=7) {
			resultado=this.number;
		}
		else {
			resultado=0.5;
		}
		return resultado;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Carta [number=" + number + ", palo=" + palo + "]";
	}
	public int compareTo(Carta o) {
		int resultado;
		resultado=this.getPalo().compareTo(o.getPalo());
		if (resultado==0) {
			resultado=this.getNumber()-o.getNumber();
		}
			
		return resultado;
	}
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	

}
