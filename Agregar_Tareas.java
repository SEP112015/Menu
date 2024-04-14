package Menu;
import menú.ConexionBD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Agregar_Tareas extends javax.swing.JFrame {
    private ConexionBD conexionBD;

    
    public Agregar_Tareas() {
        initComponents();
        conexionBD = new ConexionBD();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        panel_fondo = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_tareas = new javax.swing.JTable();
        btn_Eliminar = new javax.swing.JButton();
        btn_Menu = new javax.swing.JButton();
        btn_MasTareas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Ins_FechaR = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        Ins_Descripcion = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Ins_Tarea = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        Ins_HoraR = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        Ins_Prioridad = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        btn_consultar = new javax.swing.JButton();
        btn_Editar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        Ins_EliminarTarea = new javax.swing.JTextPane();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        Ins_Nombre_A = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_fondo.setBackground(new java.awt.Color(102, 102, 102));
        panel_fondo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_fondo.setDoubleBuffered(false);
        panel_fondo.setEnabled(false);
        panel_fondo.setFocusable(false);
        panel_fondo.setPreferredSize(new java.awt.Dimension(1300, 720));
        panel_fondo.setLayout(null);

        tb_tareas.setBackground(new java.awt.Color(255, 255, 255));
        tb_tareas.setForeground(new java.awt.Color(0, 0, 0));
        tb_tareas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tb_tareas.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane2.setViewportView(tb_tareas);

        panel_fondo.add(jScrollPane2);
        jScrollPane2.setBounds(280, 20, 1050, 600);

        btn_Eliminar.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        btn_Eliminar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar_1.png"))); // NOI18N
        btn_Eliminar.setText("Eliminar Tarea");
        btn_Eliminar.setAutoscrolls(true);
        btn_Eliminar.setBorderPainted(false);
        btn_Eliminar.setContentAreaFilled(false);
        btn_Eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Eliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carpeta.png"))); // NOI18N
        btn_Eliminar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carpeta.png"))); // NOI18N
        btn_Eliminar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carpeta.png"))); // NOI18N
        btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActionPerformed(evt);
            }
        });
        panel_fondo.add(btn_Eliminar);
        btn_Eliminar.setBounds(1020, 640, 260, 80);

        btn_Menu.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        btn_Menu.setForeground(new java.awt.Color(255, 255, 255));
        btn_Menu.setIcon(new javax.swing.ImageIcon("C:\\Users\\domin\\Desktop\\Java Driver\\flecha-hacia-atras.png")); // NOI18N
        btn_Menu.setText("  Menú");
        btn_Menu.setBorder(null);
        btn_Menu.setBorderPainted(false);
        btn_Menu.setContentAreaFilled(false);
        btn_Menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Menu.setFocusPainted(false);
        btn_Menu.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\domin\\Desktop\\Java Driver\\flecha-hacia-atras.png")); // NOI18N
        btn_Menu.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\domin\\Desktop\\Java Driver\\flecha-hacia-atras.png")); // NOI18N
        btn_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MenuActionPerformed(evt);
            }
        });
        panel_fondo.add(btn_Menu);
        btn_Menu.setBounds(20, 10, 100, 40);

        btn_MasTareas.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        btn_MasTareas.setForeground(new java.awt.Color(255, 255, 255));
        btn_MasTareas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/marca-mas.png"))); // NOI18N
        btn_MasTareas.setText("  Tareas");
        btn_MasTareas.setAutoscrolls(true);
        btn_MasTareas.setBorder(null);
        btn_MasTareas.setBorderPainted(false);
        btn_MasTareas.setContentAreaFilled(false);
        btn_MasTareas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/marca-mas.png"))); // NOI18N
        btn_MasTareas.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/marca-mas.png"))); // NOI18N
        btn_MasTareas.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/marca-mas.png"))); // NOI18N
        btn_MasTareas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MasTareasActionPerformed(evt);
            }
        });
        panel_fondo.add(btn_MasTareas);
        btn_MasTareas.setBounds(350, 650, 140, 60);

        jLabel1.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TAREAS:");
        panel_fondo.add(jLabel1);
        jLabel1.setBounds(20, 70, 100, 17);

        Ins_FechaR.setBackground(new java.awt.Color(255, 255, 255));
        Ins_FechaR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Ins_FechaR.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Ins_FechaR.setForeground(new java.awt.Color(0, 0, 0));
        Ins_FechaR.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane3.setViewportView(Ins_FechaR);

        panel_fondo.add(jScrollPane3);
        jScrollPane3.setBounds(20, 300, 240, 30);

        jLabel2.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FECHA A REALIZAR:");
        panel_fondo.add(jLabel2);
        jLabel2.setBounds(20, 280, 170, 17);

        Ins_Descripcion.setBackground(new java.awt.Color(255, 255, 255));
        Ins_Descripcion.setColumns(20);
        Ins_Descripcion.setForeground(new java.awt.Color(0, 0, 0));
        Ins_Descripcion.setRows(5);
        jScrollPane5.setViewportView(Ins_Descripcion);

        panel_fondo.add(jScrollPane5);
        jScrollPane5.setBounds(20, 160, 240, 110);

        jLabel3.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DESCRIPCION:");
        panel_fondo.add(jLabel3);
        jLabel3.setBounds(20, 130, 110, 17);

        Ins_Tarea.setBackground(new java.awt.Color(255, 255, 255));
        Ins_Tarea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Ins_Tarea.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Ins_Tarea.setForeground(new java.awt.Color(0, 0, 0));
        Ins_Tarea.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane4.setViewportView(Ins_Tarea);

        panel_fondo.add(jScrollPane4);
        jScrollPane4.setBounds(20, 90, 240, 30);

        jLabel4.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("HORA A REALIZAR:");
        panel_fondo.add(jLabel4);
        jLabel4.setBounds(20, 340, 170, 17);

        Ins_HoraR.setBackground(new java.awt.Color(255, 255, 255));
        Ins_HoraR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Ins_HoraR.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Ins_HoraR.setForeground(new java.awt.Color(0, 0, 0));
        Ins_HoraR.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane6.setViewportView(Ins_HoraR);

        panel_fondo.add(jScrollPane6);
        jScrollPane6.setBounds(20, 360, 240, 30);

        Ins_Prioridad.setBackground(new java.awt.Color(255, 255, 255));
        Ins_Prioridad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Ins_Prioridad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Ins_Prioridad.setForeground(new java.awt.Color(0, 0, 0));
        Ins_Prioridad.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane7.setViewportView(Ins_Prioridad);

        panel_fondo.add(jScrollPane7);
        jScrollPane7.setBounds(20, 420, 80, 30);

        jLabel5.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PRIORIDAD:");
        panel_fondo.add(jLabel5);
        jLabel5.setBounds(20, 400, 170, 17);

        btn_consultar.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        btn_consultar.setForeground(new java.awt.Color(255, 255, 255));
        btn_consultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/busqueda-de-datos.png"))); // NOI18N
        btn_consultar.setText("Consultar Tareas");
        btn_consultar.setAutoscrolls(true);
        btn_consultar.setBorderPainted(false);
        btn_consultar.setContentAreaFilled(false);
        btn_consultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_consultar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/busqueda-de-datos.png"))); // NOI18N
        btn_consultar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/busqueda-de-datos.png"))); // NOI18N
        btn_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarActionPerformed(evt);
            }
        });
        panel_fondo.add(btn_consultar);
        btn_consultar.setBounds(560, 650, 220, 60);

        btn_Editar.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        btn_Editar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar (4).png"))); // NOI18N
        btn_Editar.setText("Editar Tarea");
        btn_Editar.setAutoscrolls(true);
        btn_Editar.setBorderPainted(false);
        btn_Editar.setContentAreaFilled(false);
        btn_Editar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Editar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar (4).png"))); // NOI18N
        btn_Editar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar (4).png"))); // NOI18N
        btn_Editar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar (4).png"))); // NOI18N
        btn_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditarActionPerformed(evt);
            }
        });
        panel_fondo.add(btn_Editar);
        btn_Editar.setBounds(780, 650, 260, 60);

        jLabel6.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TAREA(ELIMINAR)");
        panel_fondo.add(jLabel6);
        jLabel6.setBounds(20, 560, 250, 30);

        Ins_EliminarTarea.setBackground(new java.awt.Color(255, 255, 255));
        Ins_EliminarTarea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Ins_EliminarTarea.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Ins_EliminarTarea.setForeground(new java.awt.Color(0, 0, 0));
        Ins_EliminarTarea.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane8.setViewportView(Ins_EliminarTarea);

        panel_fondo.add(jScrollPane8);
        jScrollPane8.setBounds(20, 590, 240, 30);

        jLabel7.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("TAREA (ACTUALIZAR)");
        panel_fondo.add(jLabel7);
        jLabel7.setBounds(20, 490, 250, 30);

        Ins_Nombre_A.setBackground(new java.awt.Color(255, 255, 255));
        Ins_Nombre_A.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Ins_Nombre_A.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Ins_Nombre_A.setForeground(new java.awt.Color(0, 0, 0));
        Ins_Nombre_A.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane9.setViewportView(Ins_Nombre_A);

        panel_fondo.add(jScrollPane9);
        jScrollPane9.setBounds(20, 520, 240, 30);

        jScrollPane1.setViewportView(panel_fondo);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
                String Eliminartarea = Ins_Tarea.getText();  
                
       try {
        ConexionBD conectando = new ConexionBD();
        conectando.Eliminar(Eliminartarea);
        
        
        
        Ins_Tarea.setText("");
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "Error al eliminar la tarea: " + ex.getMessage());
    }         
        
    }//GEN-LAST:event_btn_EliminarActionPerformed

    private void btn_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MenuActionPerformed
                    Menu menu = new Menu(); 
    menu.setVisible(true); 
    this.dispose(); 
    }//GEN-LAST:event_btn_MenuActionPerformed

    private void btn_MasTareasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MasTareasActionPerformed
 
       String tarea = Ins_Tarea.getText();
    String descripcion = Ins_Descripcion.getText();
    String fechaRealizar = Ins_FechaR.getText();
    String horaRealizar = Ins_HoraR.getText();
    String prioridad = Ins_Prioridad.getText();
    
   try {
        ConexionBD conectando = new ConexionBD(); 
        conectando.Insertar(tarea, descripcion, fechaRealizar, horaRealizar, prioridad);
        
        
        
        JOptionPane.showMessageDialog(null, "Datos insertados correctamente.");
        
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "Error al insertar datos: " + ex.getMessage());
    }
    
    Ins_Tarea.setText("");
    Ins_Descripcion.setText("");
    Ins_FechaR.setText("");
    Ins_HoraR.setText("");
    Ins_Prioridad.setText("");
    
    
    }//GEN-LAST:event_btn_MasTareasActionPerformed

    private void btn_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarActionPerformed
             Connection conexion = conexionBD.obtenerConexion();
        if (conexion != null) {
            try {
                Statement stmt = conexion.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM gestor_tareas");
                
                DefaultTableModel modelo = new DefaultTableModel();
                tb_tareas.setModel(modelo);
                
                ResultSetMetaData meta = rs.getMetaData();
                int numColumnas = meta.getColumnCount();
                for (int i = 1; i <= numColumnas; i++) {
                    modelo.addColumn(meta.getColumnName(i));
                }
                
                while (rs.next()) {
                    Object[] fila = new Object[numColumnas];
                    for (int i = 1; i <= numColumnas; i++) {
                        fila[i - 1] = rs.getObject(i);
                    }
                    modelo.addRow(fila);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error al ejecutar la consulta: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            } finally {
              
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo establecer la conexión a la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_consultarActionPerformed


    
    private void btn_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditarActionPerformed
    String tareaSeleccionada = Ins_Nombre_A.getText();
    String nuevaTarea = Ins_Tarea.getText();
    String nuevaDescripcion = Ins_Descripcion.getText();
    String nuevaFecha = Ins_FechaR.getText();
    String nuevaHora = Ins_HoraR.getText();
    String nuevaPrioridad = Ins_Prioridad.getText();

    try {
        conexionBD.Actualizar(tareaSeleccionada, nuevaTarea, nuevaDescripcion, nuevaFecha, nuevaHora, nuevaPrioridad);
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "Error al editar la tarea: " + ex.getMessage());
    }
    }//GEN-LAST:event_btn_EditarActionPerformed

 
    public static void main(String args[]) {    
      
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
            java.util.logging.Logger.getLogger(Agregar_Tareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregar_Tareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregar_Tareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregar_Tareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agregar_Tareas().setVisible(true);
            }
        });
      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Ins_Descripcion;
    private javax.swing.JTextPane Ins_EliminarTarea;
    private javax.swing.JTextPane Ins_FechaR;
    private javax.swing.JTextPane Ins_HoraR;
    private javax.swing.JTextPane Ins_Nombre_A;
    private javax.swing.JTextPane Ins_Prioridad;
    private javax.swing.JTextPane Ins_Tarea;
    private javax.swing.JButton btn_Editar;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_MasTareas;
    private javax.swing.JButton btn_Menu;
    private javax.swing.JButton btn_consultar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JPanel panel_fondo;
    private javax.swing.JTable tb_tareas;
    // End of variables declaration//GEN-END:variables

   
}

