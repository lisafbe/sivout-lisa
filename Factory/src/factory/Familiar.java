 
package factory;

public class Familiar extends Vehiculo implements PruebaVehiculo{

	public Familiar(String placa, String marca, double potencia, double peso) {
		super(placa, marca, potencia, peso);
		// TODO Auto-generated constructor stub
	}

	public Familiar() {
		// TODO Auto-generated constructor stub
	}

	@Override
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