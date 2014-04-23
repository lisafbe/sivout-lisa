/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

public class Camioneta extends Vehiculo {

	public Camioneta(String placa, String marca, double potencia, double peso) {
		super(placa, marca, potencia, peso);
		// TODO Auto-generated constructor stub
	}

	public Camioneta() {
		// TODO Auto-generated constructor stub
	}

	@Override
	double aceleracionMaxima() {
		// TODO Auto-generated method stub
		return 0;
	}
        
        
        public void probarBastidor(){
        System.out.println("Prueba de Bastidor Realizada");
        
        }

        public void probarMotor(){
        System.out.println("Prueba de Motor Realizada");
        }
}
