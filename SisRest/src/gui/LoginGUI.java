/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controller.Principal;
import dao.UsuarioDAO;
import java.awt.Window;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Usuario;

/**
 *
 * @author Daniel Lima
 */
public class LoginGUI extends javax.swing.JFrame {
    UsuarioDAO  usuarioDAO;
    AdmGUI admGUI;
   
    /**
     * Creates new form loguinGUI
     */
    public LoginGUI() {
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

        jPanel1 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtLoguin = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        btEntrar = new javax.swing.JButton();
        pswSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Usuarios");

        lblNome.setText("Login");

        txtLoguin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoguinActionPerformed(evt);
            }
        });

        lblSenha.setText("Senha");

        btEntrar.setText("Entrar");
        btEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntrarActionPerformed(evt);
            }
        });

        pswSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pswSenhaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("SISREST - Sistema de Restaurante");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Autor: Daniel Lima");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(lblNome))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(lblSenha))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pswSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLoguin, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(btEntrar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel2)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addComponent(lblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLoguin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSenha)
                .addGap(1, 1, 1)
                .addComponent(pswSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btEntrar)
                .addGap(45, 45, 45)
                .addComponent(jLabel2)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtLoguinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoguinActionPerformed
            String loguin = txtLoguin.getText();
    }//GEN-LAST:event_txtLoguinActionPerformed

    private void btEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntrarActionPerformed
       
        Usuario usu = new Usuario();
        usu.setLoginUsuario(txtLoguin.getText());
        usu.setSenhaUsuario(pswSenha.getText());
        
        try {
            usuarioDAO = new UsuarioDAO();
        } catch (Exception ex) {
            Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
//        System.out.println("" + txtLoguin.getText() + txtSenha.getText());
        boolean resposta = usuarioDAO.consultar(usu);//Pego usuario e senha digitados o nivel e jogo no metodo consultar para validar
      
        if (resposta == true) {//Se Usuario e senha estiverem corretos
            JOptionPane.showMessageDialog(null, "Bem vindo " + txtLoguin.getText() + " Nivel de Usuario " + usu.getNivelUsuario() );
            switch(usu.getNivelUsuario()){
        
            case "A":
                  System.gc();
                  for(Window window: Window.getWindows()){
                  window.setVisible(false);
                  }
                 
                  admGUI = new AdmGUI();
                  admGUI.setVisible(true);
                  
                 
            break;
            
            case "G":
                System.gc();
                  for(Window window: Window.getWindows()){
                  window.setVisible(false);
                  }
                 
                 admGUI = new AdmGUI();
                 admGUI.setVisible(true);
                 admGUI.desabilitaGerente();
                 
            break;
            
            case "C":
                  System.gc();
                  for(Window window: Window.getWindows()){
                  window.setVisible(false);
                  }
                
                 admGUI = new AdmGUI();
                 admGUI.setVisible(true); 
                 admGUI.desabilitaCaixa();
            break;
            
            case "Z":
                 System.gc();
                  for(Window window: Window.getWindows()){
                  window.setVisible(false);
                  }
                  
                 admGUI = new AdmGUI();
                 admGUI.setVisible(true);
                 admGUI.desabilitaCozinha();
            break;
        }
        } else {
            JOptionPane.showMessageDialog(null, " Usuário e(ou) senha incorretos!\nEntre em contato com setor de Inventário");
        }
        
//        switch(usu.getNivelUsuario()){
//        
//            case "A":
//                  System.gc();
//                  for(Window window: Window.getWindows()){
//                  window.setVisible(false);
//                  }
//                 
//                  admGUI = new AdmGUI();
//                  admGUI.setVisible(true);
//                  
//                 
//            break;
//            
//            case "G":
//                System.gc();
//                  for(Window window: Window.getWindows()){
//                  window.setVisible(false);
//                  }
//                 
//                 admGUI = new AdmGUI();
//                 admGUI.setVisible(true);
//                 admGUI.desabilitaGerente();
//                 
//            break;
//            
//            case "C":
//                  System.gc();
//                  for(Window window: Window.getWindows()){
//                  window.setVisible(false);
//                  }
//                
//                 admGUI = new AdmGUI();
//                 admGUI.setVisible(true); 
//                 admGUI.desabilitaCaixa();
//            break;
//            
//            case "Z":
//                 System.gc();
//                  for(Window window: Window.getWindows()){
//                  window.setVisible(false);
//                  }
//                  
//                 admGUI = new AdmGUI();
//                 admGUI.setVisible(true);
//                 admGUI.desabilitaCozinha();
//            break;
//        }
      
    }//GEN-LAST:event_btEntrarActionPerformed

    private void pswSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pswSenhaActionPerformed
        String senha = pswSenha.getText();
    }//GEN-LAST:event_pswSenhaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
        

        /* Create and display the form */
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JPasswordField pswSenha;
    private javax.swing.JTextField txtLoguin;
    // End of variables declaration//GEN-END:variables
}
