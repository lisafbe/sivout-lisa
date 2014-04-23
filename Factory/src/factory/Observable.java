/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import java.util.Observer;

/**
 *
 * @author lisafbe
 */
public interface Observable {
    
  public void notifyObservers();
  public void register(Observador obs);
  
  public void unRegister(Observador obs);
    
}
