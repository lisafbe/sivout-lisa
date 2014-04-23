/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author lisafbe
 */
public interface FabricaDeAutomoviles {
	public Vehiculo crearVehiculo(String tipo,String placa, String marca, double potencia, double peso);
        
}