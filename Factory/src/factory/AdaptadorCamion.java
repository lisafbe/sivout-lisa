/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

 
public class AdaptadorCamion implements PruebaVehiculo{

     private Camioneta pruebaCamioneta;
  
    
    public AdaptadorCamion(){
    super();
    this.pruebaCamioneta= new Camioneta();
 
    
    }
    
    

    public void pruebaMotor() {
       pruebaCamioneta.probarMotor();
    }

  
    public void pruebaControles() {
        System.out.println("Probando controles");
        pruebaCamioneta.probarBastidor();
    }
    
}
