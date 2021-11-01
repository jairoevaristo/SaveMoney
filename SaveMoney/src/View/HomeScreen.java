/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JPanel;

/**
 *
 * @author Jocelio
 */
public class HomeScreen extends javax.swing.JFrame {

    /**
     * Creates new form HomeScreen
     */
    public HomeScreen() {
        initComponents();
         pegarResolucao(); 
         setLocationRelativeTo(null);  //Carrega o form no centro da tela
    }
    
     private void pegarResolucao() {         //Calcula a resoluçao para se adaptara diferentes telas
        Toolkit t = Toolkit.getDefaultToolkit();
        Dimension dimensao = t.getScreenSize();
        this.setSize((dimensao.width + 5), (dimensao.height - 38));

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
        PainelLateralTop = new javax.swing.JPanel();
        txtUser = new javax.swing.JLabel();
        btnReceitas = new javax.swing.JPanel();
        txtReceitas = new javax.swing.JLabel();
        btnDespesas = new javax.swing.JPanel();
        txtDespesas = new javax.swing.JLabel();
        btnCartoes = new javax.swing.JPanel();
        txtCartoes = new javax.swing.JLabel();
        btnCategorias = new javax.swing.JPanel();
        txtCategorias = new javax.swing.JLabel();
        PainelTopo = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JLabel();
        area1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Background.setBackground(new java.awt.Color(34, 36, 81));

        PainelLateral.setBackground(new java.awt.Color(51, 51, 76));

        PainelLateralTop.setBackground(new java.awt.Color(29, 31, 62));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 45, 31);
        flowLayout1.setAlignOnBaseline(true);
        PainelLateralTop.setLayout(flowLayout1);

        txtUser.setBackground(new java.awt.Color(255, 255, 255));
        txtUser.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        txtUser.setForeground(new java.awt.Color(255, 255, 255));
        txtUser.setText("USER");
        PainelLateralTop.add(txtUser);

        btnReceitas.setBackground(new java.awt.Color(51, 51, 76));
        btnReceitas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        txtReceitas.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        txtReceitas.setForeground(new java.awt.Color(255, 255, 255));
        txtReceitas.setText("Receitas");

        javax.swing.GroupLayout btnReceitasLayout = new javax.swing.GroupLayout(btnReceitas);
        btnReceitas.setLayout(btnReceitasLayout);
        btnReceitasLayout.setHorizontalGroup(
            btnReceitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(btnReceitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnReceitasLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(txtReceitas)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        btnReceitasLayout.setVerticalGroup(
            btnReceitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 68, Short.MAX_VALUE)
            .addGroup(btnReceitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnReceitasLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(txtReceitas)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        btnDespesas.setBackground(new java.awt.Color(51, 51, 76));
        btnDespesas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        txtDespesas.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        txtDespesas.setForeground(new java.awt.Color(255, 255, 255));
        txtDespesas.setText("Despesas");

        javax.swing.GroupLayout btnDespesasLayout = new javax.swing.GroupLayout(btnDespesas);
        btnDespesas.setLayout(btnDespesasLayout);
        btnDespesasLayout.setHorizontalGroup(
            btnDespesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(btnDespesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnDespesasLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(txtDespesas)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        btnDespesasLayout.setVerticalGroup(
            btnDespesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 68, Short.MAX_VALUE)
            .addGroup(btnDespesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnDespesasLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(txtDespesas)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        btnCartoes.setBackground(new java.awt.Color(51, 51, 76));
        btnCartoes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        txtCartoes.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        txtCartoes.setForeground(new java.awt.Color(255, 255, 255));
        txtCartoes.setText("Cartões");

        javax.swing.GroupLayout btnCartoesLayout = new javax.swing.GroupLayout(btnCartoes);
        btnCartoes.setLayout(btnCartoesLayout);
        btnCartoesLayout.setHorizontalGroup(
            btnCartoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(btnCartoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnCartoesLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(txtCartoes)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        btnCartoesLayout.setVerticalGroup(
            btnCartoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 68, Short.MAX_VALUE)
            .addGroup(btnCartoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnCartoesLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(txtCartoes)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        btnCategorias.setBackground(new java.awt.Color(51, 51, 76));
        btnCategorias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        txtCategorias.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        txtCategorias.setForeground(new java.awt.Color(255, 255, 255));
        txtCategorias.setText("Categorias");

        javax.swing.GroupLayout btnCategoriasLayout = new javax.swing.GroupLayout(btnCategorias);
        btnCategorias.setLayout(btnCategoriasLayout);
        btnCategoriasLayout.setHorizontalGroup(
            btnCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(btnCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnCategoriasLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(txtCategorias)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        btnCategoriasLayout.setVerticalGroup(
            btnCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 68, Short.MAX_VALUE)
            .addGroup(btnCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnCategoriasLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(txtCategorias)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout PainelLateralLayout = new javax.swing.GroupLayout(PainelLateral);
        PainelLateral.setLayout(PainelLateralLayout);
        PainelLateralLayout.setHorizontalGroup(
            PainelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelLateralTop, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
            .addGroup(PainelLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDespesas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCartoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReceitas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        PainelLateralLayout.setVerticalGroup(
            PainelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLateralLayout.createSequentialGroup()
                .addComponent(PainelLateralTop, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnReceitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDespesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCartoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        PainelTopo.setBackground(new java.awt.Color(34, 36, 81));
        PainelTopo.setPreferredSize(new java.awt.Dimension(1043, 115));

        txtTitulo.setBackground(new java.awt.Color(255, 255, 255));
        txtTitulo.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo.setText("PRINCIPAL");

        javax.swing.GroupLayout PainelTopoLayout = new javax.swing.GroupLayout(PainelTopo);
        PainelTopo.setLayout(PainelTopoLayout);
        PainelTopoLayout.setHorizontalGroup(
            PainelTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelTopoLayout.createSequentialGroup()
                .addGap(401, 401, 401)
                .addComponent(txtTitulo)
                .addContainerGap(578, Short.MAX_VALUE))
        );
        PainelTopoLayout.setVerticalGroup(
            PainelTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelTopoLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(txtTitulo)
                .addContainerGap())
        );

        javax.swing.GroupLayout area1Layout = new javax.swing.GroupLayout(area1);
        area1.setLayout(area1Layout);
        area1Layout.setHorizontalGroup(
            area1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1228, Short.MAX_VALUE)
        );
        area1Layout.setVerticalGroup(
            area1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 615, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(PainelLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PainelTopo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(area1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(PainelLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(PainelTopo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(area1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //CORES DO MENU RECEITAS//
     public void mudarBarra(JPanel p){
        p.setBackground(new Color(42,111,151));
    }
      public void mudarBtn1(JPanel p){
        p.setBackground(new Color(42,111,151));
    }
      public void mudarUser(JPanel p){
        p.setBackground(new Color(1, 58, 99));
    }
    
      //CORES DO MENU DESPESAS//
     public void mudarBarraDes(JPanel p){
        p.setBackground(new Color(154, 3, 30));
    }
      public void mudarBtn2(JPanel p){
        p.setBackground(new Color(154, 3, 30));
    }
      public void mudarUser2(JPanel p){
        p.setBackground(new Color(94, 11, 25));
    }
     
       //CORES DO MENU CARTÔES//
     public void mudarBarraCar(JPanel p){
        p.setBackground(new Color(227, 100, 20));
    }
      public void mudarBtn3(JPanel p){
        p.setBackground(new Color(227, 100, 20));
    }
      public void mudarUser3(JPanel p){
        p.setBackground(new Color(54, 60, 0));
    }
     
         //CORES DO MENU CATEGORIAS//
     public void mudarBarraCat(JPanel p){
        p.setBackground(new Color(134, 14, 87));
    }
      public void mudarBtn4(JPanel p){
        p.setBackground(new Color(134, 14, 87));
    }
      public void mudarUser4(JPanel p){
        p.setBackground(new Color(5, 15, 64));
    }
     
      
      
    //EFEITO HOVER//
    public void mudarCor(JPanel p){
        p.setBackground(new Color(29,31,62));
    }
     public void voltaCor(JPanel p){
        p.setBackground(new Color(51,51,76));
    }
    //FIM DO EFEITO//
    
    private void btnReceitasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReceitasMouseEntered
        mudarCor(btnReceitas);
    }//GEN-LAST:event_btnReceitasMouseEntered

    private void btnReceitasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReceitasMouseExited
      
    }//GEN-LAST:event_btnReceitasMouseExited

    private void btnDespesasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDespesasMouseEntered
         mudarCor(btnDespesas);
    }//GEN-LAST:event_btnDespesasMouseEntered

    private void btnDespesasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDespesasMouseExited
      
    }//GEN-LAST:event_btnDespesasMouseExited

    private void btnCartoesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCartoesMouseEntered
       mudarCor(btnCartoes);
    }//GEN-LAST:event_btnCartoesMouseEntered

    private void btnCartoesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCartoesMouseExited
        
    }//GEN-LAST:event_btnCartoesMouseExited

    private void btnCategoriasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCategoriasMouseEntered
         mudarCor(btnCategorias);
    }//GEN-LAST:event_btnCategoriasMouseEntered

    private void btnCategoriasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCategoriasMouseExited

    }//GEN-LAST:event_btnCategoriasMouseExited

    private void btnReceitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReceitasMouseClicked
        txtTitulo.setText("RECEITAS");
        mudarBarra(PainelTopo);
        mudarBarra(Background);
        mudarUser(PainelLateralTop);
        mudarBtn1(btnReceitas);
        voltaCor(btnDespesas);
        voltaCor(btnCartoes);
        voltaCor(btnCategorias);
    }//GEN-LAST:event_btnReceitasMouseClicked

    private void btnDespesasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDespesasMouseClicked
        txtTitulo.setText("DESPESAS");
        mudarBarraDes(PainelTopo);
        mudarBarraDes(Background);
        mudarUser2(PainelLateralTop);
        mudarBtn2(btnDespesas);
        voltaCor(btnReceitas);
        voltaCor(btnCartoes);
        voltaCor(btnCategorias);
    }//GEN-LAST:event_btnDespesasMouseClicked

    private void btnCartoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCartoesMouseClicked
       txtTitulo.setText("CARTÕES");
        mudarBarraCar(PainelTopo);
        mudarBarraCar(Background);
        mudarUser3(PainelLateralTop);
        mudarBtn3(btnCartoes);
        voltaCor(btnDespesas);
        voltaCor(btnReceitas);
        voltaCor(btnCategorias);
    }//GEN-LAST:event_btnCartoesMouseClicked

    private void btnCategoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCategoriasMouseClicked
      txtTitulo.setText("CATEGORIAS");
        mudarBarraCat(PainelTopo);
        mudarBarraCat(Background);
        mudarUser4(PainelLateralTop);
        mudarBtn4(btnCategorias);
        voltaCor(btnDespesas);
        voltaCor(btnCartoes);
        voltaCor(btnReceitas);
    }//GEN-LAST:event_btnCategoriasMouseClicked

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
                new HomeScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JPanel PainelLateral;
    private javax.swing.JPanel PainelLateralTop;
    private javax.swing.JPanel PainelTopo;
    private javax.swing.JDesktopPane area1;
    private javax.swing.JPanel btnCartoes;
    private javax.swing.JPanel btnCategorias;
    private javax.swing.JPanel btnDespesas;
    private javax.swing.JPanel btnReceitas;
    private javax.swing.JLabel txtCartoes;
    private javax.swing.JLabel txtCategorias;
    private javax.swing.JLabel txtDespesas;
    private javax.swing.JLabel txtReceitas;
    private javax.swing.JLabel txtTitulo;
    private javax.swing.JLabel txtUser;
    // End of variables declaration//GEN-END:variables
}
