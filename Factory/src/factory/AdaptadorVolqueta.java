/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;


public class AdaptadorVolqueta implements PruebaVehiculo{
    private Volqueta pruebaVolqueta;
  
    
    public AdaptadorVolqueta(){
    super();
    this.pruebaVolqueta= new Volqueta();
 
    
    }
    
    public void pruebaMotor() {
     pruebaVolqueta.ProbarMotor();
    }
 
    public void pruebaControles() {
        System.out.println("Probando controles");
        pruebaVolqueta.ProbarCajaContenedora();
    }
    
    
    
    
    
    
}
