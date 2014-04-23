/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author lisafbe
 */
public class Bus extends Vehiculo{
    
 

	public Bus(String placa, String marca, double potencia, double peso) {
		super(placa, marca, potencia, peso);
		// TODO Auto-generated constructor stub
	}

	public Bus() {
		// TODO Auto-generated constructor stub
	}

        
        
	 
	double aceleracionMaxima() {
		// TODO Auto-generated method stub
		return 0;
	}
        
        
        
        public void probarTimbre(){
        System.out.println("Prueba de Timbre Realizada");
        
        }
        
        public void probarPuertas(){
        
        System.out.println("Prueba de Puertas Realizada");
        }
        
        public void probarMotor(){
        System.out.println("Prueba de Motor Realizada");
        }

}