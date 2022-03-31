
package Vista;

import Modelo.Conexion;
import Modelo.Multas_DAO;
import static Vista.Dashboard.Txt_Dashboard_Junta;
import static Vista.Dashboard.da_principal;
import static Vista.PD_Usuario_1.usuario;
import java.awt.BorderLayout;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class PD_Multas_2 extends javax.swing.JPanel {
    
    Multas_DAO lista_multas = new Multas_DAO();
    
    public static String multas = "";
    public static String fecha = "";
    
    public static String id_usuario = "";
    public static String nombre_multa = "";
    public static Integer id_multas;
    public static String  Id_multas_cobrar = "";
    public static String fecha_multa = "";
      
      
    public PD_Multas_2() {
        initComponents();

        Id_Usuario.setVisible(false);

        Edt_Abonado.setEnabled(false);
        Btn_crear.setEnabled(false);

        String id_junta = Txt_Dashboard_Junta.getText();

        Mostrar_Multas(id_junta);

        lista_multas.leer_multas(ComboBox_multa);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_mcobrar = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txt_usuario7 = new javax.swing.JLabel();
        txt_usuario9 = new javax.swing.JLabel();
        txt_usuario10 = new javax.swing.JLabel();
        Fecha_multa = new com.toedter.calendar.JDateChooser();
        ComboBox_multa = new javax.swing.JComboBox<>();
        Edt_Abonado = new javax.swing.JTextField();
        Edt_Usuario = new javax.swing.JTextField();
        Btn_Buscador = new javax.swing.JButton();
        Btn_crear = new javax.swing.JButton();
        Id_Usuario = new javax.swing.JLabel();
        Btn_Actualizar1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla_Multas_Cobrar = new javax.swing.JTable();
        Edt_Buscador_Usuario = new javax.swing.JTextField();
        txt_usuario19 = new javax.swing.JLabel();
        Btn_Buscar = new javax.swing.JButton();
        Btn_Actualizar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        lbl_mcobrar.setText("jLabel3");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 226, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(204, 204, 255));

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(145, 145, 145), 2, true));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(45, 45, 45));
        jLabel1.setText("Agregar Multa:");

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(145, 145, 145), 2));

        txt_usuario7.setBackground(new java.awt.Color(45, 45, 45));
        txt_usuario7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_usuario7.setText("Abonado");

        txt_usuario9.setBackground(new java.awt.Color(45, 45, 45));
        txt_usuario9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_usuario9.setText("Multa:");

        txt_usuario10.setBackground(new java.awt.Color(45, 45, 45));
        txt_usuario10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_usuario10.setText("Fecha:");

        Fecha_multa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(145, 145, 145), 2, true));

        ComboBox_multa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(146, 146, 146), 2, true));

        Edt_Abonado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(146, 146, 146), 2, true));
        Edt_Abonado.setDisabledTextColor(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_usuario9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_usuario7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txt_usuario10, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Fecha_multa, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                    .addComponent(ComboBox_multa, 0, 245, Short.MAX_VALUE)
                    .addComponent(Edt_Abonado))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Edt_Abonado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_usuario7))
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_usuario9)
                    .addComponent(ComboBox_multa, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_usuario10)
                    .addComponent(Fecha_multa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        Edt_Usuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(146, 146, 146), 2, true));
        Edt_Usuario.setMargin(new java.awt.Insets(5, 2, 5, 3));

        Btn_Buscador.setIcon(new javax.swing.ImageIcon("C:\\Users\\crist\\OneDrive\\Documentos\\NetBeansProjects\\Sistema-hidrico\\src\\img\\lupa_16.png")); // NOI18N
        Btn_Buscador.setToolTipText("");
        Btn_Buscador.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(86, 78, 135), 2, true));
        Btn_Buscador.setPreferredSize(new java.awt.Dimension(24, 24));
        Btn_Buscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_BuscadorActionPerformed(evt);
            }
        });

        Btn_crear.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Btn_crear.setForeground(new java.awt.Color(45, 45, 45));
        Btn_crear.setText("CREAR");
        Btn_crear.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(86, 78, 135), 2, true));
        Btn_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_crearActionPerformed(evt);
            }
        });

        Id_Usuario.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N

        Btn_Actualizar1.setIcon(new javax.swing.ImageIcon("C:\\Users\\crist\\OneDrive\\Documentos\\NetBeansProjects\\Sistema-hidrico\\src\\img\\refresh.png")); // NOI18N
        Btn_Actualizar1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(86, 78, 135), 2, true));
        Btn_Actualizar1.setPreferredSize(new java.awt.Dimension(24, 24));
        Btn_Actualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Actualizar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Id_Usuario)
                        .addGap(110, 110, 110))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Btn_crear, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Edt_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(Btn_Buscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Btn_Actualizar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 45, Short.MAX_VALUE)))
                        .addGap(15, 15, 15))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Id_Usuario))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Btn_Buscador, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Edt_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_Actualizar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(Btn_crear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(145, 145, 145), 2, true));

        Tabla_Multas_Cobrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "Cedula", "Abonado", "Multa", "Estado", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla_Multas_Cobrar.setAutoscrolls(false);
        jScrollPane2.setViewportView(Tabla_Multas_Cobrar);
        if (Tabla_Multas_Cobrar.getColumnModel().getColumnCount() > 0) {
            Tabla_Multas_Cobrar.getColumnModel().getColumn(0).setResizable(false);
            Tabla_Multas_Cobrar.getColumnModel().getColumn(0).setPreferredWidth(50);
            Tabla_Multas_Cobrar.getColumnModel().getColumn(1).setResizable(false);
            Tabla_Multas_Cobrar.getColumnModel().getColumn(1).setPreferredWidth(100);
            Tabla_Multas_Cobrar.getColumnModel().getColumn(2).setResizable(false);
            Tabla_Multas_Cobrar.getColumnModel().getColumn(2).setPreferredWidth(250);
            Tabla_Multas_Cobrar.getColumnModel().getColumn(3).setResizable(false);
            Tabla_Multas_Cobrar.getColumnModel().getColumn(3).setPreferredWidth(200);
            Tabla_Multas_Cobrar.getColumnModel().getColumn(4).setResizable(false);
            Tabla_Multas_Cobrar.getColumnModel().getColumn(4).setPreferredWidth(100);
            Tabla_Multas_Cobrar.getColumnModel().getColumn(5).setResizable(false);
            Tabla_Multas_Cobrar.getColumnModel().getColumn(5).setPreferredWidth(150);
        }

        Edt_Buscador_Usuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(146, 146, 146), 2, true));

        txt_usuario19.setBackground(new java.awt.Color(45, 45, 45));
        txt_usuario19.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_usuario19.setText("Id/RUC:");

        Btn_Buscar.setIcon(new javax.swing.ImageIcon("C:\\Users\\crist\\OneDrive\\Documentos\\NetBeansProjects\\Sistema-hidrico\\src\\img\\lupa_16.png")); // NOI18N
        Btn_Buscar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(86, 78, 135), 2, true));
        Btn_Buscar.setPreferredSize(new java.awt.Dimension(24, 24));
        Btn_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_BuscarActionPerformed(evt);
            }
        });

        Btn_Actualizar.setIcon(new javax.swing.ImageIcon("C:\\Users\\crist\\OneDrive\\Documentos\\NetBeansProjects\\Sistema-hidrico\\src\\img\\refresh.png")); // NOI18N
        Btn_Actualizar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(86, 78, 135), 2, true));
        Btn_Actualizar.setPreferredSize(new java.awt.Dimension(24, 24));
        Btn_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ActualizarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(45, 45, 45));
        jLabel2.setText("Listado de Multas:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txt_usuario19)
                                .addGap(15, 15, 15)
                                .addComponent(Edt_Buscador_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(Btn_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(Btn_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(15, 15, 15))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Btn_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Edt_Buscador_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_usuario19)))
                    .addComponent(Btn_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(15, 15, 15))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_crearActionPerformed

        id_usuario = Id_Usuario.getText();
        nombre_multa = ComboBox_multa.getSelectedItem().toString();
        id_multas = ComboBox_multa.getSelectedIndex();

        Date date = Fecha_multa.getDate();

        if(id_usuario.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Por favor cargar un usuario para asignar una multa");
        }
        else if(nombre_multa.equals("Seleccione una multa"))
        {
            JOptionPane.showMessageDialog(null, "Por favor seleccione una multa");
        }
        else if (date.equals("null"))
        {
            JOptionPane.showMessageDialog(null, "Por favor seleccione la fecha de la multa");
        }

        else
        {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            fecha_multa = sdf.format(date);
            crear_multa(id_usuario, id_multas, fecha_multa);
        }
    }//GEN-LAST:event_Btn_crearActionPerformed

    private void Btn_BuscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BuscadorActionPerformed
        
        String id_junta = Txt_Dashboard_Junta.getText();
        int junta = Integer.parseInt(id_junta);
        id_usuario = Edt_Usuario.getText().toString();

        if(id_usuario.equals(""))
        {
            javax.swing.JOptionPane.showMessageDialog(this, "Cargar un usuario \n", " ", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            buscar_usuario(id_usuario, junta);
        }
    }//GEN-LAST:event_Btn_BuscadorActionPerformed

    private void Btn_Actualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Actualizar1ActionPerformed
        PD_Multas_2 m2 = new PD_Multas_2();
        m2.setSize(1200,765);
        m2.setLocation(0,0);

        da_principal.removeAll();
        da_principal.add(m2, BorderLayout.CENTER);
        da_principal.revalidate();
        da_principal.repaint();

    }//GEN-LAST:event_Btn_Actualizar1ActionPerformed

    private void Btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BuscarActionPerformed
        
        usuario = Edt_Buscador_Usuario.getText().trim();

        if(usuario.equals(""))
        {
            javax.swing.JOptionPane.showMessageDialog(this, "Ingrese la cédula del usuario para asignar la multa \n", " ", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            mostrar_usuario_Seleccionado(usuario, Tabla_Multas_Cobrar);
        }
    }//GEN-LAST:event_Btn_BuscarActionPerformed

    private void Btn_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ActualizarActionPerformed
        PD_Multas_2 m2 = new PD_Multas_2();
        m2.setSize(1200,765);
        m2.setLocation(0,0);

        da_principal.removeAll();
        da_principal.add(m2, BorderLayout.CENTER);
        da_principal.revalidate();
        da_principal.repaint();
    }//GEN-LAST:event_Btn_ActualizarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Actualizar;
    private javax.swing.JButton Btn_Actualizar1;
    private javax.swing.JButton Btn_Buscador;
    private javax.swing.JButton Btn_Buscar;
    private javax.swing.JButton Btn_crear;
    private javax.swing.JComboBox<String> ComboBox_multa;
    private javax.swing.JTextField Edt_Abonado;
    private javax.swing.JTextField Edt_Buscador_Usuario;
    private javax.swing.JTextField Edt_Usuario;
    private com.toedter.calendar.JDateChooser Fecha_multa;
    private javax.swing.JLabel Id_Usuario;
    private javax.swing.JTable Tabla_Multas_Cobrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_mcobrar;
    private javax.swing.JLabel txt_usuario10;
    private javax.swing.JLabel txt_usuario19;
    private javax.swing.JLabel txt_usuario7;
    private javax.swing.JLabel txt_usuario9;
    // End of variables declaration//GEN-END:variables

    private void eliminar_elementos(String value) {
        
        Conexion conexion = new Conexion();
        try(Connection cnx = conexion.get_connection())
        {
            String Query = "delete from multas_cobradas where Id_multa_cobrada = '"+value+"'";
            Statement st = cnx.createStatement();
            st.executeUpdate(Query);

            javax.swing.JOptionPane.showMessageDialog(this, "Se ha eliminado con exito la multa  \n", " ", javax.swing.JOptionPane.INFORMATION_MESSAGE);

            PD_Multas_2 mult2 = new PD_Multas_2();
            mult2.setSize(1200,765);
            mult2.setLocation(0,0);

            da_principal.removeAll();
            da_principal.add(mult2, BorderLayout.CENTER);
            da_principal.revalidate();
            da_principal.repaint();  

        }catch(SQLException e)
        {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error en la conexión a la base de datos");
        }
    }

    private void buscar_usuario(String id_usuario, Integer junta) {
        
        Conexion conexion = new Conexion();
        try(Connection cnx = conexion.get_connection())
        {
            PreparedStatement pst = cnx.prepareStatement(
            "select Cedula, Id_usuario, Apellidos, Nombres  from usuarios where Cedula = '" + id_usuario +"' and Junta_id = '"+junta+"'");
            ResultSet rs = pst.executeQuery();

            if (rs.next())
            {
               String apellido = rs.getString("Apellidos");
               String nombre = rs.getString("Nombres");
               String id = rs.getString("Id_usuario");

               Edt_Abonado.setText(apellido + " " + nombre);
               Id_Usuario.setText(id);

               Btn_crear.setEnabled(true);
            }
            else
            { 
               JOptionPane.showMessageDialog(null, "Este usuario no existe en base de datos");
            }

        }catch(SQLException e)
        {
      
        } 
    }

    private void crear_multa(String id_usuario, Integer id_multas, String fecha_multa) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDate fecha_final = LocalDate.parse(fecha_multa, dtf);
   
        Conexion conexion = new Conexion();
        try(Connection cnx = conexion.get_connection())
        {
            String Query = "INSERT INTO multas_usuarios (Id_usuario, Id_multas, Fecha_asignada, Estado) "
            + "VALUES('"+id_usuario+"', '"+id_multas+"', '"+fecha_final+"','"+0+"')";

            Statement st = cnx.createStatement();
            st.executeUpdate(Query);

            javax.swing.JOptionPane.showMessageDialog(this, "Se ha creado con éxito la multa  \n", " ", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            
            PD_Multas_2 mult2 = new PD_Multas_2();
            mult2.setSize(1200,765);
            mult2.setLocation(0,0);

            da_principal.removeAll();
            da_principal.add(mult2, BorderLayout.CENTER);
            da_principal.revalidate();
            da_principal.repaint();         

        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error al añadir una multa a este usuario");
        }
    }

    private void mostrar_usuario_Seleccionado(String usuario, JTable Tabla_Multas_Cobrar) {
       
        DefaultTableModel busqueda_tabla = (DefaultTableModel) Tabla_Multas_Cobrar.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(busqueda_tabla);
        Tabla_Multas_Cobrar.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(usuario));
    }

    private void Mostrar_Multas(String id_junta) {
        
        Tabla_Multas_Cobrar.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);             
        Tabla_Multas_Cobrar.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD,12));

        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        int colum[]= {0,1,2,3,4,5};
        
        for (int i = 0; i < colum.length; i++) 
        {
            Tabla_Multas_Cobrar.getColumnModel().getColumn(colum[i]).setCellRenderer(tcr);
        }

        DefaultTableModel model = (DefaultTableModel) Tabla_Multas_Cobrar.getModel();
       
        Tabla_Multas_Cobrar.setModel(model);
        
        String registros[] = new String[6];

        Conexion conexion = new Conexion();   
        try (Connection cnx = conexion.get_connection())
        {
           Statement leer = cnx.createStatement();

            ResultSet rs = leer.executeQuery("select MU.Id_multas_usuario, U.Cedula, concat (Apellidos, ' ', Nombres) U, M.Nombre_multa, if (Estado = '0', 'Pendiente', 'Pagado') MU , "
                                                 + "MU.Fecha_asignada from multas_usuarios MU, usuarios U, multas M where MU.Id_usuario = U.Id_usuario and "
                                                    + "MU.Id_multas = M.Id_multa");
  
            while(rs.next())
            {
                registros[0] = rs.getString(1);
                registros[1] = rs.getString(2);
                registros[2] = rs.getString(3);
                registros[3] = rs.getString(4);
                registros[4] = rs.getString(5);
                registros[5] = rs.getString(6);
                
                model.addRow(registros);
            }

        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error al cargar las multas");
        } 
    }

}
