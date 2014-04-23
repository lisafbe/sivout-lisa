/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

public abstract class Vehiculo {
	private String placa;
	private String marca;
	private double potencia;
	private double peso;
	
	public Vehiculo() {
}
	
	public Vehiculo(String placa, String marca, double potencia, double peso) {
		        this.potencia = potencia;
		        this.marca = marca;
		        this.peso = peso;
		        this.placa = placa;
	}
	
	abstract double aceleracionMaxima();

	/**
	 * @return the placa
	 */
	public String getPlaca() {
		return placa;
	}

	/**
	 * @param placa the placa to set
	 */
	public void setPlaca(String placa) {
		this.placa = placa;
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return the potencia
	 */
	public double getPotencia() {
		return potencia;
	}

	/**
	 * @param potencia the potencia to set
	 */
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}
}