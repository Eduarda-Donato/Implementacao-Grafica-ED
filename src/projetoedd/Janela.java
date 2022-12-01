 package projetoedd;

import java.awt.Color;
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
// package projeto.ed;

/**
 *
 * @author User
 */
public class Janela extends javax.swing.JFrame {
    
    /**
     * Creates new form Janela
     */
    private Pilha pilha;
    public Janela() {
        initComponents();
        meuInit();
        
        
    }
    
    public void meuInit(){
        bottomPanel.setVisible(false);
        jPanel4.setVisible(false);
        txtNElementos.setEditable(false);
        Color white = new Color(255,255,255);
        txtNElementos.setBackground(white);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setResizable(false);
        pilha = new Pilha();
        mainPanel.setBorder(null);
        labelPilha.setVisible(false);
        labelPilha.setBorder(null);

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
        jButton1 = new javax.swing.JButton();
        BTlse = new javax.swing.JButton();
        BTpilha = new javax.swing.JButton();
        BTfila = new javax.swing.JButton();
        BTarvore = new javax.swing.JButton();
        bottomPanel = new javax.swing.JPanel();
        BTinsere = new javax.swing.JButton();
        BTremove = new javax.swing.JButton();
        txtInsereValor = new javax.swing.JTextField();
        inserePosicao = new javax.swing.JTextField();
        inserePosicao1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        txtNElementos = new javax.swing.JTextField();
        lblNElementos = new javax.swing.JLabel();
        mainPanel = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        labelPilha = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jButton1.setText("LS");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1);

        BTlse.setText("LSE");
        BTlse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickLSE(evt);
            }
        });
        BTlse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTlseActionPerformed(evt);
            }
        });
        jPanel1.add(BTlse);

        BTpilha.setText("Pilha");
        BTpilha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickPilhaFila(evt);
            }
        });
        jPanel1.add(BTpilha);

        BTfila.setText("Fila");
        BTfila.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickPilhaFila(evt);
            }
        });
        jPanel1.add(BTfila);

        BTarvore.setText("Arvore");
        jPanel1.add(BTarvore);

        BTinsere.setBackground(new java.awt.Color(37, 149, 4));
        BTinsere.setForeground(new java.awt.Color(255, 255, 255));
        BTinsere.setText("Inserir");
        BTinsere.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickInserePilha(evt);
            }
        });

        BTremove.setBackground(new java.awt.Color(255, 0, 0));
        BTremove.setForeground(new java.awt.Color(255, 255, 255));
        BTremove.setText("Remover");
        BTremove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickRemovePilha(evt);
            }
        });
        BTremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTremoveActionPerformed(evt);
            }
        });

        txtInsereValor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtInsereValor.setText("Valor");
        txtInsereValor.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                teste(evt);
            }
        });

        inserePosicao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inserePosicao.setText("Posição");

        inserePosicao1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inserePosicao1.setText("Posição");

        javax.swing.GroupLayout bottomPanelLayout = new javax.swing.GroupLayout(bottomPanel);
        bottomPanel.setLayout(bottomPanelLayout);
        bottomPanelLayout.setHorizontalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(BTinsere, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtInsereValor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inserePosicao, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 390, Short.MAX_VALUE)
                .addComponent(BTremove, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inserePosicao1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        bottomPanelLayout.setVerticalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTremove, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inserePosicao1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTinsere, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInsereValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inserePosicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        jPanel4.setLayout(new java.awt.BorderLayout());

        txtNElementos.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtNElementos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNElementos.setText("Nº de Elementos");
        txtNElementos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNElementosActionPerformed(evt);
            }
        });
        jPanel4.add(txtNElementos, java.awt.BorderLayout.CENTER);

        lblNElementos.setBackground(new java.awt.Color(255, 204, 51));
        lblNElementos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNElementos.setText("0");
        jPanel4.add(lblNElementos, java.awt.BorderLayout.PAGE_END);

        jPanel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N

        labelPilha.setBorder(null);
        labelPilha.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelPilha.setToolTipText("");
        labelPilha.setAlignmentX(0.0F);
        labelPilha.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        labelPilha.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                inseriuNaPilha(evt);
            }
        });
        jScrollPane1.setViewportView(labelPilha);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(519, 519, 519)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(565, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(220, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(161, 161, 161))
        );

        mainPanel.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bottomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1262, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bottomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTlseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTlseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTlseActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        
    }//GEN-LAST:event_formMousePressed

    private void BTremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTremoveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTremoveActionPerformed

    private void txtNElementosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNElementosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNElementosActionPerformed

    private void teste(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_teste
        bottomPanel.setVisible(false);
    }//GEN-LAST:event_teste

    private void clickLSE(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickLSE
        // TODO add your handling code here:
        bottomPanel.setVisible(true);
        jPanel4.setVisible(true);
        inserePosicao.setVisible(true);
        inserePosicao1.setVisible(true);
        labelPilha.setVisible(false);
        //bottomPanel.toFront();
        bottomPanel.requestFocus();
    }//GEN-LAST:event_clickLSE

    private void clickPilhaFila(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickPilhaFila
        // TODO add your handling code here:
        
        
        bottomPanel.setVisible(true);
        jPanel4.setVisible(true);
        inserePosicao.setVisible(false);
        inserePosicao1.setVisible(false);
        labelPilha.setVisible(true);
    }//GEN-LAST:event_clickPilhaFila

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void inseriuNaPilha(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_inseriuNaPilha
        // TODO add your handling code here:
        
    }//GEN-LAST:event_inseriuNaPilha

    private void clickInserePilha(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickInserePilha
        // TODO add your handling code here:
        int valor;
        try{
          valor = Integer.parseInt(txtInsereValor.getText());
        }
        catch(NumberFormatException e){
            return;
        }

        pilha.push(Integer.valueOf(txtInsereValor.getText()));
        labelPilha.setModel(new DefaultComboBoxModel<>(pilha.array()));
        String text = "" + pilha.tamanho();
        lblNElementos.setText(text);
        //System.out.println(pilha.printStack());
    }//GEN-LAST:event_clickInserePilha

    private void clickRemovePilha(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickRemovePilha
        // TODO add your handling code here:
        pilha.pop();
        labelPilha.setModel(new DefaultComboBoxModel<>(pilha.array()));
        String text = "" + pilha.tamanho();
        lblNElementos.setText(text);
        
    }//GEN-LAST:event_clickRemovePilha



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTarvore;
    private javax.swing.JButton BTfila;
    private javax.swing.JButton BTinsere;
    private javax.swing.JButton BTlse;
    private javax.swing.JButton BTpilha;
    private javax.swing.JButton BTremove;
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JTextField inserePosicao;
    private javax.swing.JTextField inserePosicao1;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> labelPilha;
    private javax.swing.JLabel lblNElementos;
    private javax.swing.JScrollPane mainPanel;
    private javax.swing.JTextField txtInsereValor;
    private javax.swing.JTextField txtNElementos;
    // End of variables declaration//GEN-END:variables
}