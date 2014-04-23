/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author lisafbe
 */
public class AdaptadorBus implements PruebaVehiculo{

     private Bus pruebaBus;
  
    
    public AdaptadorBus(){
    super();
    this.pruebaBus= new Bus();
 
    
    }
    

    
    public void pruebaMotor() {
       pruebaBus.probarMotor();
    }

    
    public void pruebaControles() {
      System.out.println("Realizando prueba de controles:");
      pruebaBus.probarTimbre();
      pruebaBus.probarPuertas();
    }
    
}
