import java.awt.Image;
import javax.swing.ImageIcon;
import java.util.Timer;
import java.util.TimerTask;

public class Interfaz extends javax.swing.JFrame {
    
  String[] imagenes = {"Image1.jpg", "Image2.jpg", "Image3.jpg", "Image4.jpg"}; //Guardado de imágenes en el array
    Timer timer = new Timer();
    TimerTask task;
    int c = 0;
    
    public Interfaz() {
        initComponents();
    }
     
       @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        fps = new javax.swing.JLabel();
        ImagenesLabel = new javax.swing.JLabel();
        Slider = new javax.swing.JSlider();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fps.setText("FPS:");

        ImagenesLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image1.jpg"))); // NOI18N
        ImagenesLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ImagenesLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Slider.setMajorTickSpacing(10);
        Slider.setMaximum(30);
        Slider.setMinorTickSpacing(1);
        Slider.setPaintLabels(true);
        Slider.setValue(1);
        Slider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SliderStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(fps))
                    .addComponent(Slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(ImagenesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(ImagenesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(fps)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void SliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SliderStateChanged
       int a = (int)Slider.getValue();
       fps.setText("FPS: " + Slider.getValue()); //Label para mostrar No. de imagenes por segundo
       timer.cancel();                          //Se debe usar un cancel para evitar la acumulación de tareas. Necesariamente se debe crear un objeto tipo Timer con anterioridad
       timer = new Timer();
       task  = new TimerTask(){ //Creación de la tarea para mostrar imagenes en Label
        @Override
        public void run()
        {
            c = (c == 3 ? 0 : c+1);
            ImagenesLabel.setIcon(new ImageIcon("Imagen/" + imagenes[c]));
        }
    };
       
       if (a == 0) //Se detiene la animación en dado caso en que el slider tenga un valor de  0, si no, continúa con el ciclo.
       { 
       timer.cancel();
       ImagenesLabel.setIcon(new ImageIcon("Imagen/" + imagenes[0]));
       }
       else
       timer.scheduleAtFixedRate(task, 0, 1000/a);
     
    }//GEN-LAST:event_SliderStateChanged

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImagenesLabel;
    private javax.swing.JSlider Slider;
    private javax.swing.JLabel fps;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}

/*CODIGOS SOBTRANTE



 /*    
        imagenes[0] = new ImageIcon("Image1.jpg").getImage();
        imagenes[1] = new ImageIcon("Image2.jpg").getImage();
        imagenes[2] = new ImageIcon("Image3.jpg").getImage();
        imagenes[3] = new ImageIcon("Image4.jpg").getImage(); 
 

if (c >= imagen.length)
                c = 0;
            ImagenesLabel.setIcon(new ImageIcon("imagen/" + imagen[c]));
            c++;
        ImagenesLabel.setIcon(new ImageIcon("imagen/" + imagen[c]));
        }



*/




