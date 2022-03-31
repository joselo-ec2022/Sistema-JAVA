
package Vista;

import Modelo.Conexion;
import static Vista.Dashboard.Txt_Dashboard_Junta;
import static Vista.Dashboard.da_principal;
import static Vista.Panel_Autenticacion_1.nombre_junta_string;
import java.awt.BorderLayout;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class PD_Multas_1 extends javax.swing.JPanel {
    
 public static String nombre = "";
    public static String valor = "";
    
    public static String nombre_multa = "";
    public static String valor_multa = "";
    public static String junta = "";
    public static String id_multa = ""; 
    public static String buscador_nombre = "";

    public PD_Multas_1() {
        initComponents();
        
        Btn_Seleccionar_Mul.setEnabled(false);
        Btn_Borrar_Mul.setEnabled(false);
        id_mul.setEnabled(false);
        btn_editar.setEnabled(false);
        
        String id_juntas = Txt_Dashboard_Junta.getText();
        mostrar_DatosTabla(id_juntas);
        
        id_mul.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_usuario19 = new javax.swing.JLabel();
        Btn_Buscar_Cat = new javax.swing.JButton();
        Btn_Actualizar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla_Multas = new javax.swing.JTable();
        Btn_Seleccionar_Mul = new javax.swing.JButton();
        Btn_Borrar_Mul = new javax.swing.JButton();
        Edt_buscar = new javax.swing.JTextField();
        id_mul = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txt_usuario15 = new javax.swing.JLabel();
        Edt_Nombre = new javax.swing.JTextField();
        txt_usuario16 = new javax.swing.JLabel();
        Edt_Valor = new javax.swing.JTextField();
        btn_editar = new javax.swing.JButton();
        btn_registro = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1200, 675));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 675));

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(145, 145, 145), 2, true));

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(45, 45, 45));
        jLabel5.setText("Listado de Multas:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel5)
                .addGap(5, 5, 5))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel5)
                .addGap(5, 5, 5))
        );

        txt_usuario19.setBackground(new java.awt.Color(45, 45, 45));
        txt_usuario19.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_usuario19.setText("Buscar Multa:");

        Btn_Buscar_Cat.setIcon(new javax.swing.ImageIcon("C:\\Users\\crist\\OneDrive\\Documentos\\NetBeansProjects\\Sistema-hidrico\\src\\img\\lupa_16.png")); // NOI18N
        Btn_Buscar_Cat.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(86, 78, 135), 2, true));
        Btn_Buscar_Cat.setPreferredSize(new java.awt.Dimension(24, 24));
        Btn_Buscar_Cat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Buscar_CatActionPerformed(evt);
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

        Tabla_Multas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Multa", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla_Multas.setAutoscrolls(false);
        Tabla_Multas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla_MultasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Tabla_Multas);

        Btn_Seleccionar_Mul.setIcon(new javax.swing.ImageIcon("C:\\Users\\crist\\OneDrive\\Documentos\\NetBeansProjects\\Sistema-hidrico\\src\\img\\seleccionar.png")); // NOI18N
        Btn_Seleccionar_Mul.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(86, 78, 135), 2, true));
        Btn_Seleccionar_Mul.setPreferredSize(new java.awt.Dimension(25, 25));
        Btn_Seleccionar_Mul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Seleccionar_MulActionPerformed(evt);
            }
        });

        Btn_Borrar_Mul.setIcon(new javax.swing.ImageIcon("C:\\Users\\crist\\OneDrive\\Documentos\\NetBeansProjects\\Sistema-hidrico\\src\\img\\delete.png")); // NOI18N
        Btn_Borrar_Mul.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(86, 78, 135), 2, true));
        Btn_Borrar_Mul.setPreferredSize(new java.awt.Dimension(25, 25));
        Btn_Borrar_Mul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Borrar_MulActionPerformed(evt);
            }
        });

        Edt_buscar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(145, 145, 145), 2, true));
        Edt_buscar.setMargin(new java.awt.Insets(5, 2, 5, 3));
        Edt_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Edt_buscarActionPerformed(evt);
            }
        });

        id_mul.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        id_mul.setText("jLabel1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1101, Short.MAX_VALUE)
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Btn_Seleccionar_Mul, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_Borrar_Mul, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txt_usuario19, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(Edt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(15, 15, 15)
                        .addComponent(Btn_Buscar_Cat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(Btn_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(id_mul)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Btn_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Btn_Buscar_Cat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(15, 15, 15)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txt_usuario19)
                                        .addComponent(Edt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(id_mul)
                        .addGap(36, 36, 36)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Btn_Seleccionar_Mul, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(Btn_Borrar_Mul, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(145, 145, 145), 2, true));

        jPanel9.setBackground(new java.awt.Color(204, 204, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(45, 45, 45));
        jLabel9.setText("Agregar una Multa:");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel9)
                .addGap(5, 5, 5))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel9)
                .addGap(5, 5, 5))
        );

        txt_usuario15.setBackground(new java.awt.Color(45, 45, 45));
        txt_usuario15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_usuario15.setText("Multa:");

        Edt_Nombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(145, 145, 145), 2, true));
        Edt_Nombre.setMargin(new java.awt.Insets(5, 2, 5, 3));

        txt_usuario16.setBackground(new java.awt.Color(45, 45, 45));
        txt_usuario16.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_usuario16.setText("Valor:");

        Edt_Valor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(145, 145, 145), 2, true));
        Edt_Valor.setMargin(new java.awt.Insets(5, 2, 5, 3));

        btn_editar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_editar.setText("Editar");
        btn_editar.setActionCommand("");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        btn_registro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_registro.setText("Registrar");
        btn_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txt_usuario15)
                        .addGap(15, 15, 15)
                        .addComponent(Edt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_usuario16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Edt_Valor, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_registro)
                        .addGap(18, 18, 18)
                        .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_usuario15)
                    .addComponent(Edt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Edt_Valor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_usuario16)
                    .addComponent(btn_editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Tabla_MultasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_MultasMouseClicked
        Btn_Seleccionar_Mul.setEnabled(true);
        Btn_Borrar_Mul.setEnabled(true);
    }//GEN-LAST:event_Tabla_MultasMouseClicked

    private void Edt_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Edt_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Edt_buscarActionPerformed

    private void btn_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registroActionPerformed
        // TODO add your handling code here:
        nombre_multa =  Edt_Nombre.getText().trim();
        valor_multa =   Edt_Valor.getText().trim();
        
        if((Edt_Nombre.equals("")))
        {
            javax.swing.JOptionPane.showMessageDialog(this, "Ingrese el nombre \n", " ", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
        else if  (Edt_Valor.equals(""))
        {
            javax.swing.JOptionPane.showMessageDialog(this, "Ingrese el valor \n", " ", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            crear_multa(nombre_multa, valor_multa);
        }
        
    }//GEN-LAST:event_btn_registroActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        // TODO add your handling code here:
        String junta = nombre_junta_string.toString();
        nombre = Edt_Nombre.getText();
        valor = Edt_Valor.getText();
        id_multa = id_mul.getText();
        
        
         if(nombre.equals(""))
        {
            javax.swing.JOptionPane.showMessageDialog(this, "Ingrese un nombre de la multa \n", " ", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
        else if(valor.equals(""))
        {
            javax.swing.JOptionPane.showMessageDialog(this, "Ingrese el valor de la multa \n", " ", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            editar_multas(nombre, valor, junta, id_multa);
        }
        
    }//GEN-LAST:event_btn_editarActionPerformed

    private void Btn_Seleccionar_MulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Seleccionar_MulActionPerformed
        // TODO add your handling code here:
        int column = 0;
        int row = Tabla_Multas.getSelectedRow();
        String value = Tabla_Multas.getModel().getValueAt(row, column).toString();

        seleccionar_elemento (value);
    }//GEN-LAST:event_Btn_Seleccionar_MulActionPerformed

    private void Btn_Borrar_MulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Borrar_MulActionPerformed
        // TODO add your handling code here:
        String[] arreglo = {"Si", "No"};
        int opcion = JOptionPane.showOptionDialog(null, "Está seguro de eliminar el registro ? ", "Lista de usuarios SAPRA", 0, JOptionPane.QUESTION_MESSAGE, null, arreglo, "si");
        System.out.println("Tu respuesta fue: "+arreglo[opcion]);
        int column = 0;
        int row = Tabla_Multas.getSelectedRow();
        String value = Tabla_Multas.getModel().getValueAt(row, column).toString();

        if (arreglo[opcion].equals("Si"))
        {
            eliminar_elementos(value);
        }
        else
        {
                PD_Multas_1 i1 = new PD_Multas_1();
                i1.setSize(1200,765);
                i1.setLocation(0,0);

                da_principal.removeAll();
                da_principal.add(i1, BorderLayout.CENTER);
                da_principal.revalidate();
                da_principal.repaint();
        }
    }//GEN-LAST:event_Btn_Borrar_MulActionPerformed

    private void Btn_Buscar_CatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Buscar_CatActionPerformed
        // TODO add your handling code here:
        buscador_nombre = Edt_buscar.getText().toString();

        if(buscador_nombre.equals(""))
        {
            javax.swing.JOptionPane.showMessageDialog(this, "Ingresar nombre de la multa para la busquedad  \n", " ", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            mostrar_multas_1(buscador_nombre, Tabla_Multas);
        }
    }//GEN-LAST:event_Btn_Buscar_CatActionPerformed

    private void Btn_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ActualizarActionPerformed
        // TODO add your handling code here:
        PD_Multas_1 mult1 = new PD_Multas_1();
        mult1.setSize(1200,765);
        mult1.setLocation(0,0);

        da_principal.removeAll();
        da_principal.add(mult1, BorderLayout.CENTER);
        da_principal.revalidate();
        da_principal.repaint(); 
    }//GEN-LAST:event_Btn_ActualizarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Actualizar;
    private javax.swing.JButton Btn_Borrar_Mul;
    private javax.swing.JButton Btn_Buscar_Cat;
    private javax.swing.JButton Btn_Seleccionar_Mul;
    private javax.swing.JTextField Edt_Nombre;
    private javax.swing.JTextField Edt_Valor;
    private javax.swing.JTextField Edt_buscar;
    private javax.swing.JTable Tabla_Multas;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_registro;
    private javax.swing.JLabel id_mul;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel txt_usuario15;
    private javax.swing.JLabel txt_usuario16;
    private javax.swing.JLabel txt_usuario19;
    // End of variables declaration//GEN-END:variables

     private void mostrar_DatosTabla(String id_juntas ) 
    {
        Tabla_Multas.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD,12));

        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        int colum[]= {0,1,2};
        for (int i = 0; i < colum.length; i++) 
        {
            Tabla_Multas.getColumnModel().getColumn(colum[i]).setCellRenderer(tcr);
        }

        int juntas = Integer.parseInt(id_juntas);

        DefaultTableModel model = (DefaultTableModel) Tabla_Multas.getModel();
        
        Tabla_Multas.setModel(model);
       
        String registros[] = new String[3];

        Conexion conexion = new Conexion();   
        try (Connection cnx = conexion.get_connection())
        {
           Statement leer = cnx.createStatement();

            ResultSet rs = leer.executeQuery("select M.Id_multa, M.Nombre_multa, concat('"+"$"+"','"+" "+"', M.Valor_multa) "
                    + "from multas M where M.Junta_id = '"+juntas+"'");

            while(rs.next())
            {
                registros[0] = rs.getString(1);
                registros[1] = rs.getString(2);
                registros[2] = rs.getString(3);

                model.addRow(registros);
            }
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error al cargar las multas");
            System.out.println(e);
        } 
    }
     
    private void crear_multa(String nombre_multa, String valor_multa) {

    String id_junta = Txt_Dashboard_Junta.getText();

    Conexion conexion = new Conexion();
        try(Connection cnx = conexion.get_connection())
        {
            String Query = "INSERT INTO multas(Nombre_multa, Valor_multa, Junta_id)"
            + "VALUES('"+nombre_multa+"', '"+valor_multa+"', '"+id_junta+"')";

            Statement st = cnx.createStatement();
            st.executeUpdate(Query);

            javax.swing.JOptionPane.showMessageDialog(this, "Se ha creado con éxito la multa  \n", " ", javax.swing.JOptionPane.INFORMATION_MESSAGE);

            PD_Multas_1 mult1 = new PD_Multas_1();
            mult1.setSize(1200,765);
            mult1.setLocation(0,0);

            da_principal.removeAll();
            da_principal.add(mult1, BorderLayout.CENTER);
            da_principal.revalidate();
            da_principal.repaint();            

        }catch(SQLException e)
        {
           System.out.println(e);
           JOptionPane.showMessageDialog(null, "Error al añadir una multa");
        }
    }
        
    private void editar_multas(String nombre_multa, String valor_multa, String junta, String id_multa) {

    nombre_multa = Edt_Nombre.getText().trim();
    valor_multa = Edt_Valor.getText().trim();
    id_multa = id_mul.getText();

    Conexion conexion = new Conexion();
        try(Connection cnx = conexion.get_connection())
        {
            String Query = "update multas set Nombre_multa = '" + nombre_multa + "', Valor_multa = '" + valor_multa + "', Junta_id = '" + junta + "'"
                    + " where Id_multa = '" + id_multa + "' ";

            Statement st = cnx.createStatement();
            st.executeUpdate(Query);

            PD_Multas_1 mult1 = new PD_Multas_1();
            mult1.setSize(1200,765);
            mult1.setLocation(0,0);

            da_principal.removeAll();
            da_principal.add(mult1, BorderLayout.CENTER);
            da_principal.revalidate();
            da_principal.repaint();     

        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error al editar la multa");
        }
    }
            
    private void eliminar_elementos(String value) {
    Conexion conexion = new Conexion();
        try(Connection cnx = conexion.get_connection())
        {
            String Query = "delete from multas where Id_multa = '"+value+"'";
            Statement st = cnx.createStatement();
            st.executeUpdate(Query);

            javax.swing.JOptionPane.showMessageDialog(this, "Se ha eliminado con exito la multa  \n", " ", javax.swing.JOptionPane.INFORMATION_MESSAGE);

            PD_Multas_1 mult1 = new PD_Multas_1();
            mult1.setSize(1200,765);
            mult1.setLocation(0,0);

            da_principal.removeAll();
            da_principal.add(mult1, BorderLayout.CENTER);
            da_principal.revalidate();
            da_principal.repaint();  

        }catch(SQLException e)
        {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error en la conexión a la base de datos");
        }
    }
             
    private void seleccionar_elemento(String value) {
        Conexion conexion = new Conexion();
        try(Connection cnx = conexion.get_connection())
        {
            PreparedStatement pst = cnx.prepareStatement(
            "Select Nombre_multa, Valor_multa, Junta_id from multas where Id_multa = '"+value+"'");
            ResultSet rs = pst.executeQuery();
            System.out.println("");

            if (rs.next())
            {

            btn_editar.setEnabled(true);
            btn_registro.setEnabled(false);

            String nombre = rs.getString("Nombre_multa");
            String valor = rs.getString("Valor_multa");

            id_mul.setText(value);

            Edt_Nombre.setText(nombre);
            Edt_Valor.setText(valor);

            btn_editar.setEnabled(true);

            }
            else
            { 
                JOptionPane.showMessageDialog(null, "Datos incorrectos");
            }

        }catch(SQLException e)
        {
            System.out.println(e);
        } 
    }

    private void mostrar_multas_1(String buscador_nombre, JTable Tabla_Multas) {
        
        DefaultTableModel busqueda_tabla = (DefaultTableModel) Tabla_Multas.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(busqueda_tabla);
        Tabla_Multas.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(buscador_nombre));
    }

}
