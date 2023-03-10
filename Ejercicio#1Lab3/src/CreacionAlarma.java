import java.util.Timer;
import java.util.TimerTask;

public class CreacionAlarma extends javax.swing.JFrame {
    public CreacionAlarma() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    //Creación de la notificación alarma
   TimerTask timeTask = new TimerTask(){
        @Override
        public void run() {
            Alarma ventana2 = new Alarma();
            ventana2.setVisible(true);
        }
     };
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        HorasArea = new javax.swing.JTextField();
        MinutosArea = new javax.swing.JTextField();
        SegundosArea = new javax.swing.JTextField();
        FinalizarButtom = new javax.swing.JButton();
        CrearButtom = new javax.swing.JButton();
        NotificacionLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Horas:");

        jLabel2.setText("Minutos:");

        jLabel3.setText("Segundos:");

        FinalizarButtom.setText("Finalizar Alarma");
        FinalizarButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinalizarButtomActionPerformed(evt);
            }
        });

        CrearButtom.setText("Crear");
        CrearButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearButtomActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Alarma en...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(NotificacionLabel)
                .addGap(215, 215, 215))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(FinalizarButtom)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CrearButtom)
                                    .addComponent(HorasArea, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                    .addComponent(MinutosArea)
                                    .addComponent(SegundosArea)))
                            .addComponent(jLabel3))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(HorasArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(MinutosArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(SegundosArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(CrearButtom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FinalizarButtom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NotificacionLabel)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Timer timer = new Timer();
    private void CrearButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearButtomActionPerformed
        int tiempoT, horas,minutos,segundos; 
     NotificacionLabel.setText("Alarma creada correctamente");
     
    if(HorasArea.getText().isEmpty() || MinutosArea.getText().isEmpty()|| SegundosArea.getText().isEmpty())
    {
        if(HorasArea.getText().isEmpty())
            horas = 0;
        else
            horas = Integer.parseInt(HorasArea.getText())*3600;   
        if(MinutosArea.getText().isEmpty())
            minutos = 0;
        else
            minutos = Integer.parseInt(MinutosArea.getText()) * 60;
        if(SegundosArea.getText().isEmpty())
            segundos= 0;
        else
            segundos = Integer.parseInt(SegundosArea.getText());
        
     tiempoT = (horas + minutos + segundos)* 1000;    
    }
    else
        tiempoT = (Integer.parseInt(SegundosArea.getText()) * 1000) + (Integer.parseInt(MinutosArea.getText()) * 60) + (Integer.parseInt(HorasArea.getText())*3600) * 1000;
   
    System.out.println(tiempoT);
   
    timer.scheduleAtFixedRate(timeTask, tiempoT, 10000);
       
       
   
    }//GEN-LAST:event_CrearButtomActionPerformed

    private void FinalizarButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinalizarButtomActionPerformed
   timer.cancel();
   CreacionAlarma alarm  = new CreacionAlarma();
   alarm.setVisible(false);
   this.dispose();
    }//GEN-LAST:event_FinalizarButtomActionPerformed

    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreacionAlarma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CrearButtom;
    private javax.swing.JButton FinalizarButtom;
    private javax.swing.JTextField HorasArea;
    private javax.swing.JTextField MinutosArea;
    private javax.swing.JLabel NotificacionLabel;
    private javax.swing.JTextField SegundosArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
