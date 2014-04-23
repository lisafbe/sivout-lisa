/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

public class Volqueta extends Vehiculo {

	public Volqueta(String placa, String marca, double potencia, double peso) {
		super(placa, marca, potencia, peso);
		// TODO Auto-generated constructor stub
	}

	public Volqueta() {
		// TODO Auto-generated constructor stub
	}

	@Override
	double aceleracionMaxima() {
		// TODO Auto-generated method stub
		return 0;
	}
        
        public void ProbarCajaContenedora(){
        System.out.println("Prueba de Caja Contenedora Realizada");
        }
        
        public void ProbarMotor(){
        System.out.println("Prueba de Motor Realizada");
        }
}

