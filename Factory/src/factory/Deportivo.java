/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

public class Deportivo extends Vehiculo implements PruebaVehiculo{

	public Deportivo(String placa, String marca, double potencia, double peso) {
		super(placa, marca, potencia, peso);
		// TODO Auto-generated constructor stub
	}

	public Deportivo() {
		// TODO Auto-generated constructor stub
	}

	 
	double aceleracionMaxima() {
		// TODO Auto-generated method stub
		return 0;
	}

   
    public void pruebaMotor() {
        System.out.println("Prueba de Motor Realizada");
    }

    
    public void pruebaControles() {
        System.out.println("Prueba de Controles Realizada");
    }

    
}