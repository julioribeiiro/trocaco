/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trocaco.firebase.telas;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Aluno
 */
public class Tela_home extends javax.swing.JFrame {

    /**
     * Creates new form Tela_home
     */
    public Tela_home() {
        initComponents();
        setLayoutSideBar();
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
        jPanel2 = new RoundedPanel(25, java.awt.Color.white);
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel3 = new RoundedPanel(25, new java.awt.Color(196,196,196));
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new RoundedPanel(25, new java.awt.Color(196,196,196));
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new RoundedPanel(25, new java.awt.Color(196,196,196));
        jPanel6 = new RoundedPanel(25, new java.awt.Color(7,147,4));
        jLabel8 = new javax.swing.JLabel();
        sideImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1528, 1047));
        setSize(new java.awt.Dimension(1528, 1047));

        jPanel1.setBackground(new java.awt.Color(229, 229, 229));
        jPanel1.setPreferredSize(new java.awt.Dimension(1530, 1024));

        jPanel2.setOpaque(false);
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(5, 64, 97));
        jLabel1.setText("CÂMBIO ATUAL");

        jLabel2.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(5, 64, 97));
        jLabel2.setText("PRÉ-CÂMBIO");

        jLabel3.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(5, 64, 97));
        jLabel3.setText("ATIVIDADES");

        jLabel4.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(5, 64, 97));
        jLabel4.setText("ERROS");

        jLabel5.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(120, 177, 201));
        jLabel5.setText("EM ANDAMENTO");

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 15)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(120, 177, 201));
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi augue libero, congue at congue  sed, eleifend eget ex. In vel velit dignissim, porttitor libero sed, hendrerit tortor.  Nulla facilisi. Proin porta nisl quis enim condimentum, ac commodo lacus pulvinar.  Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos.  Integer iaculis iaculis sapien, eget lacinia justo euismod ac. Nulla facilisi.  Sed vel bibendum lectus. Duis tincidunt at nulla in molestie. Vivamus faucibus purus  vel vestibulum venenatis. Donec facilisis facilisis dui, et aliquam felis viverra eu.  Fusce enim urna, malesuada eu eros non, tristique porttitor purus. Nunc consectetur id massa et placerat. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Morbi elementum nunc sed neque eleifend, ut sollicitudin lorem pharetra. Pellentesque semper elit sed sapien congue facilisis.");
        jTextArea2.setBorder(null);
        jTextArea2.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextArea2.setHighlighter(null);
        jScrollPane2.setViewportView(jTextArea2);

        jPanel3.setOpaque(false);
        jPanel3.setBackground(new java.awt.Color(196, 196, 196));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1035, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );

        jLabel6.setBackground(new java.awt.Color(5, 64, 97));
        jLabel6.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 19)); // NOI18N
        jLabel6.setText("o%");

        jPanel4.setOpaque(false);
        jPanel4.setBackground(new java.awt.Color(196, 196, 196));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(624, 18));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );

        jLabel7.setBackground(new java.awt.Color(5, 64, 97));
        jLabel7.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 19)); // NOI18N
        jLabel7.setText("o%");

        jPanel5.setOpaque(false);
        jPanel5.setBackground(new java.awt.Color(196, 196, 196));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(624, 18));

        jPanel6.setOpaque(false);
        jPanel6.setBackground(new java.awt.Color(7, 147, 4));
        jPanel6.setForeground(new java.awt.Color(7, 147, 4));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 283, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 496, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel8.setBackground(new java.awt.Color(5, 64, 97));
        jLabel8.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 19)); // NOI18N
        jLabel8.setText("30%");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(17, 17, 17)
                                            .addComponent(jLabel8))
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(737, 737, 737)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(jLabel7)))))))
                        .addContainerGap(55, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jLabel6)
                .addGap(27, 27, 27)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(132, 132, 132)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(121, 121, 121)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)))
                .addGap(78, 78, 78)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(268, Short.MAX_VALUE))
        );

        sideImg.setIcon(new javax.swing.ImageIcon("/Users/julioribeiro/git/projetos/trocaco/Trocaco/src/main/java/com/trocaco/firebase/resources/BG.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(sideImg)
                .addGap(62, 62, 62)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(sideImg)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Tela_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_home().setVisible(true);
            }
        });
    }
    
        private void setLayoutSideBar(){
        sideImg.setLayout(new FlowLayout(FlowLayout.LEFT, 17, 35));
        
        JLabel logoImg = new JLabel( new ImageIcon("/Users/julioribeiro/git/projetos/trocaco/Trocaco/src/main/java/com/trocaco/firebase/resources/Frame.png"));
        JLabel addCambioIC = new JLabel( new ImageIcon("/Users/julioribeiro/git/projetos/trocaco/Trocaco/src/main/java/com/trocaco/firebase/resources/addCambioIC.png"));
        JLabel addCambioLB = new JLabel("Adicionar câmbio");
        addCambioLB.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        addCambioLB.setFont(new Font("Poppins", Font.BOLD, 15));
        addCambioLB.setForeground(java.awt.Color.white);
        addCambioLB.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e)  
            {  
               new Criar_cambio().setVisible(true);
            } 
        });
        
        JLabel relatoriosIC = new JLabel( new ImageIcon("/Users/julioribeiro/git/projetos/trocaco/Trocaco/src/main/java/com/trocaco/firebase/resources/relatoriosIC.png"));
        JLabel relatoriosLB = new JLabel("Relatórios");
        relatoriosLB.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        relatoriosLB.setFont(new Font("Poppins", Font.BOLD, 15));
        relatoriosLB.setForeground(java.awt.Color.white);

        
        JLabel historicoIC = new JLabel( new ImageIcon("/Users/julioribeiro/git/projetos/trocaco/Trocaco/src/main/java/com/trocaco/firebase/resources/historicoIC.png"));
        JLabel historicoLB = new JLabel("Histórico");
        historicoLB.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        historicoLB.setFont(new Font("Poppins", Font.BOLD, 15));
        historicoLB.setForeground(java.awt.Color.white);
        historicoLB.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e)  
            {  
               new Tela_inicial().setVisible(true);
            } 
        });
        
        
        JLabel buscaIC = new JLabel( new ImageIcon("/Users/julioribeiro/git/projetos/trocaco/Trocaco/src/main/java/com/trocaco/firebase/resources/buscaIC.png"));
        JLabel buscaLB = new JLabel("Busca");
        buscaLB.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        buscaLB.setFont(new Font("Poppins", Font.BOLD, 15));
        buscaLB.setForeground(java.awt.Color.white);
        
        JLabel space = new JLabel("     ");
        JLabel space2 = new JLabel("           ");
        JLabel space3 = new JLabel("           ");
        sideImg.add(logoImg);
        sideImg.add(space);
        
        sideImg.add(addCambioIC);
        sideImg.add(addCambioLB);
        
        sideImg.add(relatoriosIC);
        sideImg.add(relatoriosLB);
        sideImg.add(space2);
        
        sideImg.add(historicoIC);
        sideImg.add(historicoLB);
        sideImg.add(space3);
        
        sideImg.add(buscaIC);
        sideImg.add(buscaLB);
    }
        
class RoundedPanel extends JPanel
{
    private java.awt.Color backgroundColor;
    private int cornerRadius = 15;

    public RoundedPanel(LayoutManager layout, int radius) {
        super(layout);
        cornerRadius = radius;
    }

    public RoundedPanel(LayoutManager layout, int radius, java.awt.Color bgColor) {
        super(layout);
        cornerRadius = radius;
        backgroundColor = bgColor;
    }

    public RoundedPanel(int radius) {
        super();
        cornerRadius = radius;
    }

    public RoundedPanel(int radius, java.awt.Color bgColor) {
        super();
        cornerRadius = radius;
        backgroundColor = bgColor;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Dimension arcs = new Dimension(cornerRadius, cornerRadius);
        int width = getWidth();
        int height = getHeight();
        Graphics2D graphics = (Graphics2D) g;
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        //Draws the rounded panel with borders.
        if (backgroundColor != null) {
            graphics.setColor(backgroundColor);
        } else {
            graphics.setColor(getBackground());
        }
        graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint background
        graphics.setColor(getForeground());
        graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint border
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel sideImg;
    // End of variables declaration//GEN-END:variables
}
