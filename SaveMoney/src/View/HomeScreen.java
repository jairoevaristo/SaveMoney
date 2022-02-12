/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.*;
import Model.Entity.*;
import Model.Enums;
import Model.Home.*;
import View.Internal.*;
import static View.LoginScreen.avatar;
import static View.LoginScreen.email1;
import static View.LoginScreen.name1;
import java.awt.*;
import java.net.URL;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.logging.*;
import javax.swing.*;

/**
 *
 * @author Jocelio
 */
public class HomeScreen extends javax.swing.JFrame {

    DisplayManager d = new DisplayManager();
     AccountController ac = new AccountController();
     String email = ac.getAccountByEmail(email1).getEmail();
    
     public HomeScreen() throws Exception {
        initComponents();
        setIcon();
        pegarResolucao();
        setLocationRelativeTo(null);  
        txtUser.setText(name1);
        
        blobToImage(avatar, labelAvatar);
    }

    private void pegarResolucao() {         //Calcula a resoluçao para se adaptara diferentes telas
        Toolkit t = Toolkit.getDefaultToolkit();
        Dimension dimensao = t.getScreenSize();
        this.setSize((dimensao.width + 5), (dimensao.height - 38));
    }

    private void setIcon() {
        URL url = this.getClass().getResource("/Images/icon.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
    }
    
    public void blobToImage(Blob blobBD, JLabel label) throws Exception {
        //Converte blob em Image
        byte[] image = blobBD.getBytes(1, (int) blobBD.length());
        Image img = Toolkit.getDefaultToolkit().createImage(image);

        //Escala imagen dentro do JLabel (no meu caso o JLabel possui: 272 por 192)
        Image newimg = img.getScaledInstance(labelAvatar.getWidth(), labelAvatar.getHeight(), java.awt.Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(newimg);

        //Apresenta a imagem no componente JLabel
        label.setIcon(imageIcon);
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        PainelLateral = new javax.swing.JPanel();
        btnReceitas = new javax.swing.JPanel();
        txtReceitas = new javax.swing.JLabel();
        btnDespesas = new javax.swing.JPanel();
        txtDespesas = new javax.swing.JLabel();
        btnCartoes = new javax.swing.JPanel();
        txtCartoes = new javax.swing.JLabel();
        btnCategorias = new javax.swing.JPanel();
        txtCategorias = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtUser = new javax.swing.JLabel();
        labelAvatar = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        desktop = new javax.swing.JDesktopPane();
        PainelTopo = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SaveMoney");
        setResizable(false);

        Background.setBackground(new java.awt.Color(34, 36, 81));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PainelLateral.setBackground(new java.awt.Color(51, 51, 76));
        PainelLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnReceitas.setBackground(new java.awt.Color(51, 51, 76));
        btnReceitas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnReceitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReceitasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReceitasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReceitasMouseExited(evt);
            }
        });

        txtReceitas.setBackground(new java.awt.Color(255, 255, 255));
        txtReceitas.setFont(new java.awt.Font("Ruda", 0, 36)); // NOI18N
        txtReceitas.setForeground(new java.awt.Color(255, 255, 255));
        txtReceitas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtReceitas.setText("Receitas");

        javax.swing.GroupLayout btnReceitasLayout = new javax.swing.GroupLayout(btnReceitas);
        btnReceitas.setLayout(btnReceitasLayout);
        btnReceitasLayout.setHorizontalGroup(
            btnReceitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
            .addGroup(btnReceitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(txtReceitas, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE))
        );
        btnReceitasLayout.setVerticalGroup(
            btnReceitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 68, Short.MAX_VALUE)
            .addGroup(btnReceitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnReceitasLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtReceitas)
                    .addContainerGap(12, Short.MAX_VALUE)))
        );

        PainelLateral.add(btnReceitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 91, 310, -1));

        btnDespesas.setBackground(new java.awt.Color(51, 51, 76));
        btnDespesas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDespesas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDespesasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDespesasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDespesasMouseExited(evt);
            }
        });

        txtDespesas.setBackground(new java.awt.Color(255, 255, 255));
        txtDespesas.setFont(new java.awt.Font("Ruda", 0, 36)); // NOI18N
        txtDespesas.setForeground(new java.awt.Color(255, 255, 255));
        txtDespesas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDespesas.setText("Despesas");

        javax.swing.GroupLayout btnDespesasLayout = new javax.swing.GroupLayout(btnDespesas);
        btnDespesas.setLayout(btnDespesasLayout);
        btnDespesasLayout.setHorizontalGroup(
            btnDespesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
            .addGroup(btnDespesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(txtDespesas, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE))
        );
        btnDespesasLayout.setVerticalGroup(
            btnDespesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 68, Short.MAX_VALUE)
            .addGroup(btnDespesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnDespesasLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDespesas)
                    .addContainerGap(12, Short.MAX_VALUE)))
        );

        PainelLateral.add(btnDespesas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 310, -1));

        btnCartoes.setBackground(new java.awt.Color(51, 51, 76));
        btnCartoes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCartoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCartoesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCartoesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCartoesMouseExited(evt);
            }
        });

        txtCartoes.setBackground(new java.awt.Color(255, 255, 255));
        txtCartoes.setFont(new java.awt.Font("Ruda", 0, 36)); // NOI18N
        txtCartoes.setForeground(new java.awt.Color(255, 255, 255));
        txtCartoes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCartoes.setText("Cartões");

        javax.swing.GroupLayout btnCartoesLayout = new javax.swing.GroupLayout(btnCartoes);
        btnCartoes.setLayout(btnCartoesLayout);
        btnCartoesLayout.setHorizontalGroup(
            btnCartoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
            .addGroup(btnCartoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(txtCartoes, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE))
        );
        btnCartoesLayout.setVerticalGroup(
            btnCartoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 68, Short.MAX_VALUE)
            .addGroup(btnCartoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCartoesLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCartoes)
                    .addContainerGap(12, Short.MAX_VALUE)))
        );

        PainelLateral.add(btnCartoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 249, 310, -1));

        btnCategorias.setBackground(new java.awt.Color(51, 51, 76));
        btnCategorias.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCategoriasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCategoriasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCategoriasMouseExited(evt);
            }
        });

        txtCategorias.setBackground(new java.awt.Color(255, 255, 255));
        txtCategorias.setFont(new java.awt.Font("Ruda", 0, 36)); // NOI18N
        txtCategorias.setForeground(new java.awt.Color(255, 255, 255));
        txtCategorias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCategorias.setText("Categorias");

        javax.swing.GroupLayout btnCategoriasLayout = new javax.swing.GroupLayout(btnCategorias);
        btnCategorias.setLayout(btnCategoriasLayout);
        btnCategoriasLayout.setHorizontalGroup(
            btnCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
            .addGroup(btnCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(txtCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE))
        );
        btnCategoriasLayout.setVerticalGroup(
            btnCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(btnCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCategoriasLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCategorias)
                    .addContainerGap(12, Short.MAX_VALUE)))
        );

        PainelLateral.add(btnCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 323, 310, -1));

        jPanel1.setBackground(new java.awt.Color(29, 31, 62));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtUser.setBackground(new java.awt.Color(255, 255, 255));
        txtUser.setFont(new java.awt.Font("Ruda", 0, 36)); // NOI18N
        txtUser.setForeground(new java.awt.Color(255, 255, 255));
        txtUser.setText("USER");

        labelAvatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user.png"))); // NOI18N
        labelAvatar.setMinimumSize(new java.awt.Dimension(30, 20));

        jButton2.setText("Sair");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(labelAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(txtUser)
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelAvatar, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(79, 79, 79)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        PainelLateral.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 310, 200));

        jPanel2.setBackground(new java.awt.Color(34, 36, 80));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Viner Hand ITC", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SAVE MONEY");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        PainelLateral.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 80));

        Background.add(PainelLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 720));

        desktop.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        desktop.setMaximumSize(new java.awt.Dimension(1170, 640));

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1168, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 638, Short.MAX_VALUE)
        );

        Background.add(desktop, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 1170, 640));

        PainelTopo.setBackground(new java.awt.Color(34, 36, 81));
        PainelTopo.setPreferredSize(new java.awt.Dimension(1043, 115));

        txtTitulo.setBackground(new java.awt.Color(255, 255, 255));
        txtTitulo.setFont(new java.awt.Font("Ruda", 0, 36)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTitulo.setText("PRINCIPAL");

        javax.swing.GroupLayout PainelTopoLayout = new javax.swing.GroupLayout(PainelTopo);
        PainelTopo.setLayout(PainelTopoLayout);
        PainelTopoLayout.setHorizontalGroup(
            PainelTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelTopoLayout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 1170, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PainelTopoLayout.setVerticalGroup(
            PainelTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelTopoLayout.createSequentialGroup()
                .addComponent(txtTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                .addContainerGap())
        );

        Background.add(PainelTopo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 1171, 86));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 1481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 718, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //EFEITO HOVER//
    public void mouseEnteredButton(JPanel p, JLabel l) {
        p.setBackground(new Color(29, 31, 62));
        //l.setFont(font);
    }

    public void mouseExitedButton(JPanel p, JLabel l) {
        p.setBackground(new Color(51, 51, 76));
    }
    //FIM DO EFEITO//    

    private void btnReceitasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReceitasMouseEntered
        mouseEnteredButton(btnReceitas, txtReceitas);
    }//GEN-LAST:event_btnReceitasMouseEntered

    private void btnReceitasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReceitasMouseExited
        mouseExitedButton(btnReceitas, txtReceitas);
    }//GEN-LAST:event_btnReceitasMouseExited

    private void btnDespesasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDespesasMouseEntered
        mouseEnteredButton(btnDespesas, txtDespesas);
    }//GEN-LAST:event_btnDespesasMouseEntered

    private void btnDespesasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDespesasMouseExited
        mouseExitedButton(btnDespesas, txtDespesas);
    }//GEN-LAST:event_btnDespesasMouseExited

    private void btnCartoesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCartoesMouseEntered
        mouseEnteredButton(btnCartoes, txtCartoes);
    }//GEN-LAST:event_btnCartoesMouseEntered

    private void btnCartoesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCartoesMouseExited
        mouseExitedButton(btnCartoes, txtCartoes);
    }//GEN-LAST:event_btnCartoesMouseExited

    private void btnCategoriasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCategoriasMouseEntered
        mouseEnteredButton(btnCategorias, txtCategorias);
    }//GEN-LAST:event_btnCategoriasMouseEntered

    private void btnCategoriasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCategoriasMouseExited
        mouseExitedButton(btnCategorias, txtCategorias);
    }//GEN-LAST:event_btnCategoriasMouseExited

    private void btnReceitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReceitasMouseClicked
        txtTitulo.setText("RECEITAS");
    }//GEN-LAST:event_btnReceitasMouseClicked

    private void btnDespesasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDespesasMouseClicked
        txtTitulo.setText("DESPESAS");

        try {
            d.openExpense(desktop);
        } catch (SQLException ex) {
            Logger.getLogger(HomeScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDespesasMouseClicked

    private void btnCartoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCartoesMouseClicked
        txtTitulo.setText("CARTÕES");

        AccountController ac = new AccountController();
        CardController c = new CardController();

          String email = this.email;

        try {
            Account account = ac.getAccountByEmail(email);
            Card card = c.getCardByAccountId(account.getId());

            if (card.getId() != null) {
                CardViewScreenn screen = new CardViewScreenn();
                d.openInternalFrame(desktop, screen);
            } else { // Se o usuário não tiver cartão
                CardsScreen screen = new CardsScreen();
                d.openInternalFrame(desktop, screen);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HomeScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCartoesMouseClicked

    private void btnCategoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCategoriasMouseClicked
        txtTitulo.setText("CATEGORIAS");

        d.openCategory(desktop);
    }//GEN-LAST:event_btnCategoriasMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       LoginScreen frame = new LoginScreen();
       d.openFrame(frame);
       this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new HomeScreen().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(HomeScreen.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JPanel PainelLateral;
    private javax.swing.JPanel PainelTopo;
    private javax.swing.JPanel btnCartoes;
    private javax.swing.JPanel btnCategorias;
    private javax.swing.JPanel btnDespesas;
    private javax.swing.JPanel btnReceitas;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JLabel labelAvatar;
    private javax.swing.JLabel txtCartoes;
    private javax.swing.JLabel txtCategorias;
    private javax.swing.JLabel txtDespesas;
    private javax.swing.JLabel txtReceitas;
    private javax.swing.JLabel txtTitulo;
    public static javax.swing.JLabel txtUser;
    // End of variables declaration//GEN-END:variables
}
