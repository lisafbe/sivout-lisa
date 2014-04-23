/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import java.util.Locale;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author yailebs
 */
public class Empleado2 extends javax.swing.JFrame implements Observador{

    /**
     * Creates new form Empleado2
     */
    Concesionario objC;
    public Empleado2(Concesionario subject) {
        objC=subject;
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        objC.register(this);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 295, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String [] args){
      Concesionario con = new Concesionario();
      Empleado2 obj = new Empleado2(con);
      con.notifyObservers();
      obj.setVisible(true);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void refreshData(Observable subject) {
         ChartPanel panel;
         JFreeChart chart= null;
         int[] cant= objC.obtenerDisponibilidadVehiculos();
        if (subject == objC){
        DefaultPieDataset data = new DefaultPieDataset();
        data.setValue("Bus", cant[0]);
        data.setValue("Camioneta", cant[1]);
        data.setValue("Campero", cant[2]);
        data.setValue("Deportivo", cant[3]);
        data.setValue("Familiar", cant[4]);
        data.setValue("Volqueta", cant[5]);
        chart = ChartFactory.createPieChart3D("Grafico Inventario", data, true, true,true);
        panel = new ChartPanel(chart);
        panel.setBounds(0, 0, 400, 300);
        
       
        jPanel1.add(panel);
        }
        
       
    }
}
