package com.jc.oop;

public class kalkulator extends Field {
	
	public int tambah() {
		return this.number1 + this.number2;
	}
	
	public int kurang() {
		return Math.abs(this.number1 - this.number2);
	}
	
	public double bagi() {
		double converter = this.number1;
		return converter / this.number2;
	}
	
	public int kali() {
		return this.number1 * this.number2;
	}

	
}
