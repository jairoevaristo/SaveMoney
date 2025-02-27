/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Internal;

import Controller.*;
import Model.Entity.Account;
import Model.Enums;
import Model.Home.*;
import static View.HomeScreen.desktop;
import static View.LoginScreen.email1;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Renan
 */
public final class ExpenseFullScreen extends javax.swing.JInternalFrame {

    ExpenseController exp = new ExpenseController();
    AccountController ac = new AccountController();
    CardController c = new CardController();
    CategoryController cat = new CategoryController();
    DisplayManager d = new DisplayManager();

    String email = email1;
    Account account = ac.getAccountByEmail(email);

    public ExpenseFullScreen() throws SQLException {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) jTExpense.getModel();
        jTExpense.setRowSorter(new TableRowSorter(modelo));
        readTable();
    }

    /**
     * This method is called from within the constructor to initialize the
     * form.WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     *
     * @throws java.sql.SQLException
     */
    public void readTable() throws SQLException {
        DefaultTableModel modelo = (DefaultTableModel) jTExpense.getModel();
        List<Expense> expenses = exp.getExpenseListByAccountId(account.getId());
        modelo.setNumRows(0);

        if (expenses != null) {
            for (Expense e : expenses) {

                Integer cardNum = null;
                if (e.getCardId() != null && !e.getFormOfPayment().equals(Enums.FormOfPayment.DINHEIRO)) {
                    Card card = c.getCardByAccountId(e.getAccountId());
                    cardNum = card.getNumber();
                }

                String catName = null;
                if (e.getCategoryId() != null) {
                    Category category = cat.getCategoryById(e.getCategoryId());
                    catName = category.getName();
                }

                modelo.addRow(new Object[]{
                    e.getId(),
                    account.getFullName(),
                    cardNum,
                    catName,
                    e.getValue(),
                    e.getDate(),
                    e.getDescription(),
                    e.getNumberOfInstallments(),
                    e.getFormOfPayment(),
                    e.getStatus()
                });
            }
        }
    }

    public void readTableForDesc(String busca, Integer id) throws SQLException {
        DefaultTableModel modelo = (DefaultTableModel) jTExpense.getModel();
        List<Expense> expenses = exp.getExpenseListByDescription(busca, account.getId());
        modelo.setNumRows(0);

        if (expenses != null) {
            for (Expense e : expenses) {

                Integer cardNum = null;
                if (e.getCardId() != null && !e.getFormOfPayment().equals(Enums.FormOfPayment.DINHEIRO)) {
                    Card card = c.getCardByAccountId(e.getAccountId());
                    cardNum = card.getNumber();
                }

                String catName = null;
                if (e.getCategoryId() != null) {
                    Category category = cat.getCategoryById(e.getCategoryId());
                    catName = category.getName();
                }

                modelo.addRow(new Object[]{
                    e.getId(),
                    account.getFullName(),
                    cardNum,
                    catName,
                    e.getValue(),
                    e.getDate(),
                    e.getDescription(),
                    e.getNumberOfInstallments(),
                    e.getFormOfPayment(),
                    e.getStatus()
                });
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnClose = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTExpense = new javax.swing.JTable();
        txtBusca = new javax.swing.JTextField();
        btnSearch = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JLabel();
        btnCreate = new javax.swing.JLabel();
        btnDelete = new javax.swing.JLabel();

        setBackground(new java.awt.Color(30, 30, 60));
        setBorder(null);

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Close_32px.png"))); // NOI18N
        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
        });

        jTExpense.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTExpense.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Conta", "Cartão", "Categoria", "Valor", "Data", "Descrição", "Num. Parcelas ", "Forma de Pag.", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTExpense);

        btnSearch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CRUD/icons8_search_32px_1.png"))); // NOI18N
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchMouseClicked(evt);
            }
        });

        btnUpdate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CRUD/icons8_edit_32px.png"))); // NOI18N
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateMouseClicked(evt);
            }
        });

        btnCreate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CRUD/icons8_add_32px.png"))); // NOI18N
        btnCreate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCreate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCreateMouseClicked(evt);
            }
        });

        btnDelete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CRUD/icons8_waste_32px.png"))); // NOI18N
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClose)
                .addGap(39, 39, 39))
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(295, 295, 295)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBusca))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 848, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(btnCreate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(txtBusca)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnClose)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnCloseMouseClicked

    private void btnCreateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreateMouseClicked
        try {
            d.openInternalFrame(desktop, new ExpenseScreen(false)); //true = Update / false = Create
        } catch (SQLException ex) {
            Logger.getLogger(ExpenseFullScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCreateMouseClicked

    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked
        try {
            if (jTExpense.getSelectedRow() != -1) {
                d.openInternalFrame(desktop, new ExpenseScreen(true)); // true = Update / false = Create
            } else {
                JOptionPane.showMessageDialog(null, "Selecione uma despesa!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ExpenseFullScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUpdateMouseClicked

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        if (jTExpense.getSelectedRow() != -1) {

            Integer id = (Integer) jTExpense.getValueAt(jTExpense.getSelectedRow(), 0);

            try {
                int delete = JOptionPane.showConfirmDialog(this, "Você irá apagar a despesa, quer continuar?", "Excluir", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                if (delete == JOptionPane.YES_OPTION) {
                    boolean sucesso = exp.deleteExpense(id);

                    if (sucesso) {
                        JOptionPane.showMessageDialog(null, "Despesa excluida com sucesso!");
                        readTable();
                    } else {
                        JOptionPane.showMessageDialog(null, "Não foi possível excluir a despesa!");
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(ExpenseFullScreen.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma despesa!");
        }
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked
        String busca = txtBusca.getText();

        try {
            readTableForDesc(busca, account.getId());
        } catch (SQLException ex) {
            Logger.getLogger(ExpenseFullScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnSearchMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnClose;
    private javax.swing.JLabel btnCreate;
    private javax.swing.JLabel btnDelete;
    private javax.swing.JLabel btnSearch;
    private javax.swing.JLabel btnUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTExpense;
    private javax.swing.JTextField txtBusca;
    // End of variables declaration//GEN-END:variables

}
