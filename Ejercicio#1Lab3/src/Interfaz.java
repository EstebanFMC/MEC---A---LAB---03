import java.util.Timer;
import java.util.TimerTask;
import java.time.LocalTime;

public class Interfaz extends javax.swing.JFrame {
    LocalTime tiempo = LocalTime.now();
  
    public Interfaz() {
     initComponents();
     HoraMostrar.setVisible(false);
     this.setLocationRelativeTo(null);
     HoraMostrar2.setText(this.tiempo.toString());        
    }

   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        HoraLabel = new javax.swing.JLabel();
        HoraMostar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        HoraMostrar = new javax.swing.JLabel();
        CrearAlarmaButtom = new javax.swing.JButton();
        NotificacionLabel = new javax.swing.JLabel();
        HoraMostrar2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel2.setText("Reloj");

        HoraLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        HoraLabel.setText("Hora:");

        HoraMostrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        CrearAlarmaButtom.setText("Crear Alarma");
        CrearAlarmaButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearAlarmaButtomActionPerformed(evt);
            }
        });

        HoraMostrar2.setFont(new java.awt.Font("Dubai Medium", 0, 18)); // NOI18N
        HoraMostrar2.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel2))
                    .addComponent(NotificacionLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(HoraLabel))
                            .addComponent(HoraMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(HoraMostar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(HoraMostrar2)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(CrearAlarmaButtom)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(HoraMostrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(HoraMostar)
                            .addComponent(jLabel1))
                        .addGap(0, 69, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(HoraLabel)
                            .addComponent(HoraMostrar2))
                        .addGap(23, 23, 23)))
                .addComponent(NotificacionLabel)
                .addGap(18, 18, 18)
                .addComponent(CrearAlarmaButtom)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
     
    private void CrearAlarmaButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearAlarmaButtomActionPerformed
  CreacionAlarma alarma = new CreacionAlarma();
  alarma.setVisible(true); 
    }//GEN-LAST:event_CrearAlarmaButtomActionPerformed
 
    
    public static void main(String args[]) {
       
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CrearAlarmaButtom;
    private javax.swing.JLabel HoraLabel;
    private javax.swing.JLabel HoraMostar;
    private javax.swing.JLabel HoraMostrar;
    private javax.swing.JLabel HoraMostrar2;
    private javax.swing.JLabel NotificacionLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
