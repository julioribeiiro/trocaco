/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trocaco.firebase.telas;

import classes.Botao;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import static com.trocaco.firebase.utils.Common.initFirebase;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.UUID;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author julioribeiro
 */
public class Tela_inicial extends javax.swing.JFrame {
    
        public Tela_inicial() {
        initComponents();
        
        defaultTableModel = (DefaultTableModel) tableBotoes.getModel();

        try {
            initFirebase();
        } catch (IOException ex) {
            Logger.getLogger(Tela_inicial.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        lbMessage.setVisible(false);
        jLabel3.setVisible(false);
        tfTeste.setVisible(false);
        btInserir.setVisible(false);
        btBuscar.setVisible(false);
        readData();
    }

    private DatabaseReference mDatabase;
    private DefaultTableModel defaultTableModel;
    
    	Object[] new_row = new Object[5];

	private void attTable(Botao botao){
            
            switch (botao.getNum()){
                case 1:
                    new_row[0] = "Acabador";
                    break;
                case 2:
                    new_row[0] = "Desbaste";
                    break;
                case 3:
                    new_row[0] = "Forno";
                    break;
            }
            
            switch (botao.getTag()){
                case 0:
                    new_row[1] = "Não";
                    break;
                case 1:
                    new_row[1] = "Sim";
                    break;
            }
            new_row[2] = botao.getData().substring(0, 10);
            new_row[3] = botao.getData().substring(10);
            new_row[4] = "10s";
            defaultTableModel.addRow(new_row);
	}
            


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lbMessage = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfTeste = new javax.swing.JTextField();
        btInserir = new javax.swing.JButton();
        btBuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableBotoes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Histórico");

        lbMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMessage.setText("Esperando conexão...");

        jLabel3.setText("Primeiro teste:");

        tfTeste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTesteActionPerformed(evt);
            }
        });

        btInserir.setText("Inserir");
        btInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirActionPerformed(evt);
            }
        });

        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        tableBotoes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Setor", "Relatório", "Data", "Hora Inicial", "Tempo Gasto"
            }
        ));
        tableBotoes.setShowGrid(true);
        jScrollPane2.setViewportView(tableBotoes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfTeste, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btInserir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btBuscar))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 31, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTeste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btInserir)
                    .addComponent(btBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfTesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTesteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTesteActionPerformed

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
       DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
       LocalDateTime now = LocalDateTime.now();
       addBotao(0, Integer.valueOf(tfTeste.getText()) , dtf.format(now));
       tfTeste.setText("");
    }//GEN-LAST:event_btInserirActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        readData();
    }//GEN-LAST:event_btBuscarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela_inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_inicial().setVisible(true);
            }
        });
    }
    
    private void addBotao(int tag, int num, String data){
        mDatabase = FirebaseDatabase.getInstance().getReference().child("botao");
        
        Botao botao = new Botao(tag, num, data);
        
        mDatabase.child(UUID.randomUUID().toString()).setValue(botao, new DatabaseReference.CompletionListener() {
            @Override
            public void onComplete(DatabaseError de, DatabaseReference dr) {
                lbMessage.setText("Completo");
            }
        });
    }
    
    private void clearTable(){
        int i;
        for(i = defaultTableModel.getRowCount() - 1; i >= 0 ; i--){
                defaultTableModel.removeRow(i);
            }
    }
    
    private void readData(){
        lbMessage.setVisible(true);
        mDatabase = FirebaseDatabase.getInstance().getReference().child("botao");
        mDatabase.addValueEventListener(new ValueEventListener(){
            @Override
            public void onDataChange(DataSnapshot ds) {
                lbMessage.setText("Aguardando resposta do servidor...");
                clearTable();
                for(DataSnapshot data : ds.getChildren()){
                    Botao botao = data.getValue(Botao.class);
                    attTable(botao);
                }
                lbMessage.setText("Concluido");
            }

            @Override
            public void onCancelled(DatabaseError de) {
                System.out.println(de.toException());
            }
        });
    }
    
    /*
    private void setFirstValue(String value){
        //write a massage to databse
        mDatabase = FirebaseDatabase.getInstance().getReference().child("message");
        
        //Database: gerdau-2df3f
        //Table: --
        //Column: message
        //Row: value
        
        
        mDatabase.setValue(value, new DatabaseReference.CompletionListener() {
            @Override
            public void onComplete(DatabaseError de, DatabaseReference dr) {
                lbMessage.setText("Finish");
            }
        });
    }
 
    
    
    private void readFirstValue(){
        mDatabase = FirebaseDatabase.getInstance().getReference().child("message");
        
        mDatabase.addValueEventListener(new ValueEventListener(){
            @Override
            public void onDataChange(DataSnapshot dataSnapshot){
                String value;
                value = dataSnapshot.getValue(String.class);
                tfTeste.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError de) {
                //Log.d(TAG, "Failed to read value. ", de.toException()); //To change body of generated methods, choose Tools | Templates.
            }
            
        });
        
        
    }
*/
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btInserir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbMessage;
    private javax.swing.JTable tableBotoes;
    private javax.swing.JTextField tfTeste;
    // End of variables declaration//GEN-END:variables
}

