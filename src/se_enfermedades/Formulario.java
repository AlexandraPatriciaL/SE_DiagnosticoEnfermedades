/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se_enfermedades;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import javax.swing.JTextArea;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

/**
 *
 * @author Alexandra López
 */
public class Formulario extends javax.swing.JFrame {

    /**
     * Creates new form Formulario
     */
    public Formulario() {
        initComponents();
        setTitle("Sistema Experto de Diagnóstico de Enfermedades");
        setResizable(false);
        this.setLocationRelativeTo(null);
        txtresultado.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpinicio = new javax.swing.JPanel();
        lblfoto = new javax.swing.JLabel();
        jlbsaludo = new javax.swing.JLabel();
        jlbenfermedad = new javax.swing.JLabel();
        jpmensaje = new javax.swing.JPanel();
        lblmensaje = new javax.swing.JLabel();
        btniniciar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtresultado = new javax.swing.JTextPane();
        btnlimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpinicio.setBackground(new java.awt.Color(0, 204, 153));
        jpinicio.setForeground(new java.awt.Color(0, 153, 153));

        lblfoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/doct.png"))); // NOI18N

        jlbsaludo.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        jlbsaludo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbsaludo.setText("SISTEMA EXPERTO SOBRE EL DIAGNÓSTICO DE ENFERMEDADES ESTOMACALES");

        jlbenfermedad.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        jlbenfermedad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbenfermedad.setText("GASTRITIS - LA ENFERMEDAD DE CROHN - ENFERMEDAD CELÍACA");

        javax.swing.GroupLayout jpinicioLayout = new javax.swing.GroupLayout(jpinicio);
        jpinicio.setLayout(jpinicioLayout);
        jpinicioLayout.setHorizontalGroup(
            jpinicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpinicioLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jpinicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpinicioLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jlbenfermedad, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpinicioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlbsaludo, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpinicioLayout.setVerticalGroup(
            jpinicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpinicioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpinicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblfoto, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpinicioLayout.createSequentialGroup()
                        .addComponent(jlbsaludo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlbenfermedad)
                        .addGap(67, 67, 67)))
                .addGap(258, 258, 258))
        );

        jpmensaje.setBackground(new java.awt.Color(255, 255, 255));
        jpmensaje.setForeground(new java.awt.Color(255, 255, 255));

        lblmensaje.setBackground(new java.awt.Color(204, 204, 255));
        lblmensaje.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 11)); // NOI18N
        lblmensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblmensaje.setText("Para comenzar el diagnóstico dar clic en INICIAR, proceda a responder las preguntas para obtener el posible resultado.");

        btniniciar.setBackground(new java.awt.Color(102, 255, 102));
        btniniciar.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        btniniciar.setText("INICIAR");
        btniniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btniniciarActionPerformed(evt);
            }
        });

        btnsalir.setBackground(new java.awt.Color(102, 255, 102));
        btnsalir.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        btnsalir.setText("SALIR");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        txtresultado.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 11)); // NOI18N
        jScrollPane1.setViewportView(txtresultado);

        btnlimpiar.setBackground(new java.awt.Color(102, 255, 102));
        btnlimpiar.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        btnlimpiar.setText("LIMPIAR");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpmensajeLayout = new javax.swing.GroupLayout(jpmensaje);
        jpmensaje.setLayout(jpmensajeLayout);
        jpmensajeLayout.setHorizontalGroup(
            jpmensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpmensajeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblmensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 902, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(jpmensajeLayout.createSequentialGroup()
                .addGroup(jpmensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpmensajeLayout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(btniniciar)
                        .addGap(145, 145, 145)
                        .addComponent(btnlimpiar)
                        .addGap(151, 151, 151)
                        .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpmensajeLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpmensajeLayout.setVerticalGroup(
            jpmensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpmensajeLayout.createSequentialGroup()
                .addComponent(lblmensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jpmensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btniniciar)
                    .addComponent(btnsalir)
                    .addComponent(btnlimpiar))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jpinicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpmensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 888, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpmensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btniniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btniniciarActionPerformed
        StyledDocument doc = txtresultado.getStyledDocument(); 
        SimpleAttributeSet center = new SimpleAttributeSet(); 
        StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER); 
        doc.setParagraphAttributes(0, doc.getLength(), center, false);
        
        
        
        
        int u, d, t;
        u = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta cólicos abdominales constante?", null, YES_NO_OPTION);
        if (u == 0) {
            enfermedad_crohn();
        } else if (u == 1) {
            d = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta ardor en el estómago?", null, YES_NO_OPTION);
            if (d == 0) {
                gastritis();
            } else if (d == 1) {
                t = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta vómito excesivo durante el día?", null, YES_NO_OPTION);
                if (t == 0) {
                    celiaca();
                } else if (t == 1) {
                    JOptionPane.showMessageDialog(rootPane, "Usted no presenta ninguna de las 3 enfermedades", null, YES_NO_OPTION);
                }
            }
        }
    }//GEN-LAST:event_btniniciarActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        txtresultado.setText("");
    }//GEN-LAST:event_btnlimpiarActionPerformed
    private void enfermedad_crohn() {
        int u, d, t, c, ci, se;

        u = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta sangre en las heces?", null, YES_NO_OPTION);
        d = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta fatiga más de una vez?", null, YES_NO_OPTION);
        t = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta debilidad, sin ánimos de hacer nada?", null, YES_NO_OPTION);
        c = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta aparición de llagas en su boca?", null, YES_NO_OPTION);
        ci = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta pérdida de peso?", null, YES_NO_OPTION);
        se = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta diarrea constamente?", null, YES_NO_OPTION);

        if ((u == 0) && (d == 0) && (t == 0) && (c == 0) && (ci == 0) && (se == 0)) {
            String dg = "                        DIAGNÓSTICO                         \n"
                    + "Lo que usted presenta es ENFERMEDAD DE CROHN      \n"
                    + " \n"
                    + "     TRATAMIENTO     \n"
                    + "La enfermedad de Crohn no tiene cura, algunos medicamentos, como los esteroides y los inmunosupresores, se usan para lentificar el progreso de la enfermedad. "
                    + "Si no surten efecto, el paciente puede necesitar cirugía. "
                    + "Además, los pacientes con enfermedad de Crohn pueden necesitar hacerse chequeos regulares para detectar casos de cáncer colorrectal debido a un aumento del riesgo  \n";
            
            
            
                  

            txtresultado.setText(dg);

        } else {
            enfermedad_crohn();
        }
    }

    private void gastritis() {
        int u, d, t, c, ci, se, si, oc;

        u = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta naúseas?", null, YES_NO_OPTION);
        d = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta hipo constantemente?", null, YES_NO_OPTION);
        t = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta eructos más de una vez?", null, YES_NO_OPTION);
        c = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta gases?", null, YES_NO_OPTION);
        ci = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta mal sabor de boca?", null, YES_NO_OPTION);
        se = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta sensación de vacio gástrico?", null, YES_NO_OPTION);

        if ((u == 0) && (d == 0) && (t == 0) && (c == 0) && (ci == 0) && (se == 0)) {
            String dg = "                        DIAGNÓSTICO                         \n"
                    + "Lo que usted presenta es GASTRITIS     \n"
                    + " \n"
                    + "     TRATAMIENTO     \n"
                    + "El tratamiento depende de la causa ya que puede ser gastritis aguda o crónica. "
                    + "Los antibióticos y los antiácidos pueden resultar de ayuda.";
            txtresultado.setText(dg);
        } else {
            gastritis();
        }
    }

    private void celiaca() {
        int u, d, t, c, ci, se;

        u = JOptionPane.showConfirmDialog(rootPane, "¿Usted tiene estreñimiento constamente?", null, YES_NO_OPTION);
        d = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta naúseas y vómitos?", null, YES_NO_OPTION);
        t = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta dolor abdominal?", null, YES_NO_OPTION);
        c = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta gases excesivos?", null, YES_NO_OPTION);
        ci = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta la disminución del apetito?", null, YES_NO_OPTION);
        se = JOptionPane.showConfirmDialog(rootPane, "¿Usted presenta acidez estomacal?", null, YES_NO_OPTION);

        if ((u == 0) && (d == 0) && (t == 0) && (c == 0) && (ci == 0) && (se == 0)) {
            String dg = "                        DIAGNÓSTICO                         \n"
                    + "Lo que usted presenta es ENFERMEDAD CELÍACA      \n"
                    + " \n"
                    + "     TRATAMIENTO     \n"
                    + "El tratamiento principal consiste en una dieta estricta libre de gluten que pueda controlar los síntomas y promover la curación del intestino. ";
            txtresultado.setText(dg);
        } else {
            celiaca();
        }
    }

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Formulario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btniniciar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlbenfermedad;
    private javax.swing.JLabel jlbsaludo;
    private javax.swing.JPanel jpinicio;
    private javax.swing.JPanel jpmensaje;
    private javax.swing.JLabel lblfoto;
    private javax.swing.JLabel lblmensaje;
    private javax.swing.JTextPane txtresultado;
    // End of variables declaration//GEN-END:variables
}
