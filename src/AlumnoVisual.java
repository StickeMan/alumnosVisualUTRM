import javax.swing.JOptionPane;

/**
 * @author Francisco
 */
public class AlumnoVisual extends javax.swing.JFrame {
    Grupo objGrupo;
    /**
     * Creates new form AlumnoVisual
     */
    public AlumnoVisual() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NoAlumnosTxt = new javax.swing.JTextField();
        NoCalfTxt = new javax.swing.JTextField();
        GuardarBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        PromediosTxt = new javax.swing.JTextArea();
        NombreTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CalfBtn = new javax.swing.JButton();
        Guardar2Btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Número de alumnos");

        jLabel2.setText("Número de calificaciones");

        GuardarBtn.setText("Guardar");
        GuardarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarBtnActionPerformed(evt);
            }
        });

        PromediosTxt.setColumns(20);
        PromediosTxt.setRows(5);
        PromediosTxt.setEnabled(false);
        jScrollPane1.setViewportView(PromediosTxt);

        NombreTxt.setEnabled(false);

        jLabel3.setText("Nombre del alumno");

        CalfBtn.setText("Insertar Calf");
        CalfBtn.setEnabled(false);
        CalfBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalfBtnActionPerformed(evt);
            }
        });

        Guardar2Btn.setText("Guardar Datos");
        Guardar2Btn.setEnabled(false);
        Guardar2Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Guardar2BtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GuardarBtn)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NoAlumnosTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NoCalfTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Guardar2Btn)
                                .addGap(0, 129, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(NombreTxt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CalfBtn)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(NoAlumnosTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NoCalfTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(GuardarBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(CalfBtn))
                .addGap(18, 18, 18)
                .addComponent(Guardar2Btn)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarBtnActionPerformed
        // TODO add your handling code here:
        int NumAlumnos;
        int NumCalificaciones;
        
        NumAlumnos = Integer.parseInt(this.NoAlumnosTxt.getText());
        NumCalificaciones= Integer.parseInt(this.NoCalfTxt.getText());
        
        objGrupo = new Grupo(NumAlumnos, NumCalificaciones);
        
        this.NoAlumnosTxt.setEnabled(false);
        this.NoCalfTxt.setEnabled(false);
        this.GuardarBtn.setEnabled(false);
        
        this.NombreTxt.setEnabled(true);
        this.CalfBtn.setEnabled(true);
        this.PromediosTxt.setEnabled(true);
        
    }//GEN-LAST:event_GuardarBtnActionPerformed

    int posicion=0;
    private void CalfBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalfBtnActionPerformed
        // TODO add your handling code here:
        double[] arregloCalf = new double[objGrupo.getNoCalificaciones()];
        for(int i=0; i<arregloCalf.length; i++)
            arregloCalf[i] = Double.parseDouble(JOptionPane.showInputDialog("Insetar la calf num "+(i+1)));
        
        Alumno objAlumno = new Alumno(this.NombreTxt.getText(),arregloCalf);
        
        objGrupo.ArregloAlumnos[posicion]=objAlumno;        
                
        this.CalfBtn.setEnabled(false);
        this.NombreTxt.setEnabled(false);
        this.Guardar2Btn.setEnabled(true);
    }//GEN-LAST:event_CalfBtnActionPerformed

    private void Guardar2BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Guardar2BtnActionPerformed
        // TODO add your handling code here:
        double promedio;
        
        this.NombreTxt.setText("");
        this.CalfBtn.setEnabled(true);
        this.NombreTxt.setEnabled(true);
        this.Guardar2Btn.setEnabled(false);
        
        promedio = objGrupo.ArregloAlumnos[posicion].CalcularPromedio();
        
        this.PromediosTxt.setText(this.PromediosTxt.getText()+objGrupo.ArregloAlumnos[posicion].getNombre());
        this.PromediosTxt.setText(this.PromediosTxt.getText()+"\n"+promedio+"\n");
               
        posicion++;
    }//GEN-LAST:event_Guardar2BtnActionPerformed

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
            java.util.logging.Logger.getLogger(AlumnoVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlumnoVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlumnoVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlumnoVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlumnoVisual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CalfBtn;
    private javax.swing.JButton Guardar2Btn;
    private javax.swing.JButton GuardarBtn;
    private javax.swing.JTextField NoAlumnosTxt;
    private javax.swing.JTextField NoCalfTxt;
    private javax.swing.JTextField NombreTxt;
    private javax.swing.JTextArea PromediosTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}