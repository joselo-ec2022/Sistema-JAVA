
package Vista;

import Modelo.Conexion;
import Modelo.Juntas_DAO;
import static Vista.Login.panel_principal;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * Desarrollado Por ClickeArte
 */
public class Panel_Autenticacion_1 extends javax.swing.JPanel {
    
    public static String usuario = "";
    public static String contrasena = "";
    public static String junta = "";
    public static Integer id_junta;

    public static String idjuntas_string = "";
    public static String nombre_junta_string = "";
   
    int cont;

    Panel_Autenticacion_2 restablecer_contrasena;
    
    Juntas_DAO modelo_cargar_selector = new Juntas_DAO();

    public Panel_Autenticacion_1() 
    {
        initComponents();

        view.setVisible(false);
        lbl_usuario.setVisible(false);
        lbl_contrasenia.setVisible(false);

        modelo_cargar_selector.leer_juntas(Selector_Juntas);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JLabel();
        txt_usuario1 = new javax.swing.JLabel();
        txt_contrasenia = new javax.swing.JLabel();
        Selector_Juntas = new javax.swing.JComboBox<>();
        lbl_usuario = new javax.swing.JLabel();
        Edt_Usuario = new javax.swing.JTextField();
        lbl_contrasenia = new javax.swing.JLabel();
        Edt_Contrasena = new javax.swing.JPasswordField();
        view = new javax.swing.JButton();
        hidden = new javax.swing.JButton();
        btn_contrasenia = new javax.swing.JButton();
        Btn_Ingresar_Sesion = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setPreferredSize(new java.awt.Dimension(700, 400));

        jPanel1.setPreferredSize(new java.awt.Dimension(700, 400));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 21)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(45, 45, 45));
        jLabel1.setText("Inicio de Sesión");

        txt_usuario.setBackground(new java.awt.Color(45, 45, 45));
        txt_usuario.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        txt_usuario.setText("Junta de Agua:");

        txt_usuario1.setBackground(new java.awt.Color(45, 45, 45));
        txt_usuario1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        txt_usuario1.setText("Usuario:");

        txt_contrasenia.setBackground(new java.awt.Color(45, 45, 45));
        txt_contrasenia.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        txt_contrasenia.setText("Contraseña:");

        Selector_Juntas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Selector_Juntas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(146, 146, 146), 2, true));

        lbl_usuario.setBackground(new java.awt.Color(0, 0, 0));
        lbl_usuario.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        lbl_usuario.setForeground(new java.awt.Color(255, 0, 0));
        lbl_usuario.setText("* Ingrese su usuario");

        Edt_Usuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Edt_Usuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(146, 146, 146), 2, true));
        Edt_Usuario.setMargin(new java.awt.Insets(5, 2, 5, 3));
        Edt_Usuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Edt_UsuarioFocusLost(evt);
            }
        });

        lbl_contrasenia.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        lbl_contrasenia.setForeground(new java.awt.Color(255, 0, 0));
        lbl_contrasenia.setText("* Ingrese su contraseña");

        Edt_Contrasena.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Edt_Contrasena.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(146, 146, 146), 2, true));
        Edt_Contrasena.setMargin(new java.awt.Insets(5, 2, 5, 3));
        Edt_Contrasena.setMinimumSize(new java.awt.Dimension(10, 28));
        Edt_Contrasena.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Edt_ContrasenaFocusLost(evt);
            }
        });

        view.setIcon(new javax.swing.ImageIcon("C:\\Users\\crist\\OneDrive\\Documentos\\NetBeansProjects\\Sistema-hidrico\\src\\img\\visto.png")); // NOI18N
        view.setAlignmentX(1.0F);
        view.setBorder(null);
        view.setBorderPainted(false);
        view.setContentAreaFilled(false);
        view.setFocusPainted(false);
        view.setInheritsPopupMenu(true);
        view.setMargin(new java.awt.Insets(10, 0, 0, 0));
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });

        hidden.setIcon(new javax.swing.ImageIcon("C:\\Users\\crist\\OneDrive\\Documentos\\NetBeansProjects\\Sistema-hidrico\\src\\img\\oculto.png")); // NOI18N
        hidden.setBorder(null);
        hidden.setBorderPainted(false);
        hidden.setContentAreaFilled(false);
        hidden.setFocusPainted(false);
        hidden.setFocusable(false);
        hidden.setInheritsPopupMenu(true);
        hidden.setMargin(new java.awt.Insets(0, 0, 0, 0));
        hidden.setOpaque(false);
        hidden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hiddenActionPerformed(evt);
            }
        });

        btn_contrasenia.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_contrasenia.setText("Olvide mi contraseña");
        btn_contrasenia.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_contrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_contraseniaActionPerformed(evt);
            }
        });

        Btn_Ingresar_Sesion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Btn_Ingresar_Sesion.setText("Acceder");
        Btn_Ingresar_Sesion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Btn_Ingresar_Sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Ingresar_SesionActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel2.setText("Desarrollado por: ClickeArte");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_usuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_usuario))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Edt_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Selector_Juntas, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_contrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_contrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Btn_Ingresar_Sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_contrasenia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(Edt_Contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hidden, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(view, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(163, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Selector_Juntas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_usuario))
                .addGap(5, 5, 5)
                .addComponent(lbl_usuario)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_usuario1)
                    .addComponent(Edt_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_contrasenia)
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_contrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Edt_Contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(view, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hidden, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Ingresar_Sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_contrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void hiddenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hiddenActionPerformed

        hidden.setVisible(false);
        view.setVisible(true);
        Edt_Contrasena.setEchoChar((char)0);
    }//GEN-LAST:event_hiddenActionPerformed

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
        hidden.setVisible(true);
        view.setVisible(false);
        Edt_Contrasena.setEchoChar('●');
    }//GEN-LAST:event_viewActionPerformed

    private void btn_contraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_contraseniaActionPerformed
        Panel_Autenticacion_2 p2 = new Panel_Autenticacion_2();
        p2.setSize(700,400);
        p2.setLocation(0,0);

        panel_principal.removeAll();
        panel_principal.add(p2, BorderLayout.CENTER);
        panel_principal.revalidate();
        panel_principal.repaint();
    }//GEN-LAST:event_btn_contraseniaActionPerformed

    private void Btn_Ingresar_SesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Ingresar_SesionActionPerformed
        //--- Validaciones ---
        if(Edt_Usuario.getText().trim().isEmpty()){
            lbl_usuario.setVisible(true);
        }

        if (Edt_Contrasena.getText().trim().isEmpty()){
            lbl_contrasenia.setVisible(true);
        }
        //---------------------

        usuario = Edt_Usuario.getText().trim();
        contrasena = Edt_Contrasena.getText().trim();
        junta = Selector_Juntas.getSelectedItem().toString();
        id_junta = Selector_Juntas.getSelectedIndex();

        if(Selector_Juntas.getSelectedItem().equals("Seleccione una Junta de Agua"))
        {
            javax.swing.JOptionPane.showMessageDialog(this, "Seleccione una junta de agua \n", " ", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
        else if (Edt_Usuario.getText().equals(""))
        {
        }
        else if  (Edt_Contrasena.getText().equals(""))
        {
        }

        else
        {
            login(usuario, contrasena, junta, id_junta);
        }
    }//GEN-LAST:event_Btn_Ingresar_SesionActionPerformed

    private void Edt_ContrasenaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Edt_ContrasenaFocusLost
        // --- validacion cuando se salte de campo Contrasenia ---

        if(Edt_Contrasena.getText().trim().isEmpty()){
            lbl_contrasenia.setVisible(true);
        }else{
            lbl_contrasenia.setVisible(false);
        }
    }//GEN-LAST:event_Edt_ContrasenaFocusLost

    private void Edt_UsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Edt_UsuarioFocusLost
        // --- validacion cuando se salte de campo ---
        if(Edt_Usuario.getText().trim().isEmpty()){
            lbl_usuario.setVisible(true);
        }else{
            lbl_usuario.setVisible(false);
        }
        // -------------------------------------------        // TODO add your handling code here:
    }//GEN-LAST:event_Edt_UsuarioFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Ingresar_Sesion;
    private javax.swing.JPasswordField Edt_Contrasena;
    private javax.swing.JTextField Edt_Usuario;
    private javax.swing.JComboBox<String> Selector_Juntas;
    private javax.swing.JButton btn_contrasenia;
    private javax.swing.JButton hidden;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    javax.swing.JLabel lbl_contrasenia;
    private javax.swing.JLabel lbl_usuario;
    private javax.swing.JLabel txt_contrasenia;
    private javax.swing.JLabel txt_usuario;
    private javax.swing.JLabel txt_usuario1;
    private javax.swing.JButton view;
    // End of variables declaration//GEN-END:variables

    private void login(String usuario, String contrasena, String junta, Integer id_junta) 
    {
        String user = usuario;
        String password = contrasena;
        Integer idjuntas = id_junta;

        idjuntas_string = String.valueOf(idjuntas);;
        nombre_junta_string = junta;

        Conexion conexion = new Conexion();
        try(Connection cnx = conexion.get_connection())
        {
            PreparedStatement pst = cnx.prepareStatement(
            "select Estado, Junta_Agua from recaudadores where Email = '" + user 
            + "' and  Contraseña = '" + password + "' and Junta_Agua = '" + id_junta +"'" 
            );
        ResultSet rs = pst.executeQuery();

        // verifico la consulta
        if (rs.next())
        {
            
        String estado = rs.getString("Estado");

        // verifico estado del recaudador
        if (estado.equalsIgnoreCase("1"))
        {
              Login frame = (Login) SwingUtilities.getWindowAncestor(this);
              frame.dispose();
              Dashboard ingreso = new Dashboard();
              ingreso.setVisible(true);
              ingreso.pack();
              Dashboard.Txt_Dashboard_Junta.setText(idjuntas_string.trim());

        } else
        {  
           JOptionPane.showMessageDialog(null, "Usuario inactivo");
        }
 
        }else{ 
           JOptionPane.showMessageDialog(null, "Datos incorrectos");
        }

        }catch(SQLException e)
        {
            System.out.println(e);
        }  
    }
}
