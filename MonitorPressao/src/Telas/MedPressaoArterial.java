package Telas;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyEvent;
import javax.swing.ButtonGroup;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class MedPressaoArterial extends javax.swing.JFrame {
    
          
        private final String[] tableColumns = {"Data", "Hora", "Pressão Sistólica", "Pressão Distólica", "Nivel de Stress"};
        DefaultTableModel tableModel = new DefaultTableModel(tableColumns, 0);
        private ArrayList<Registro> registroList = new ArrayList<>(); 

   
    public MedPressaoArterial() {
        initComponents();
        setTitle("Registro de Pressão Arterial"); 
        geraAcessbilidade();
    }

    public void geraAcessbilidade(){
        
        btnSalvar.setMnemonic(KeyEvent.VK_S);
        btnLimpar.setMnemonic(KeyEvent.VK_L);
        btnExcluir.setMnemonic(KeyEvent.VK_E);
        btnSair.setMnemonic(KeyEvent.VK_A);
            
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lypPane01 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        txtHora = new javax.swing.JTextField();
        txtPressaoSistolica = new javax.swing.JTextField();
        txtPressaoDistolica = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnBaixo = new javax.swing.JCheckBox();
        btnMedio = new javax.swing.JCheckBox();
        btnAlto = new javax.swing.JCheckBox();
        btnSalvar = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        scrpResgistro = new javax.swing.JScrollPane();
        tblRegistro = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lypPane01.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de Pressão", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(255, 0, 51))); // NOI18N
        lypPane01.setToolTipText("Registro de Presão Arterial");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Data :");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Hora :");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Pressão Sistólica :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Pressão Diastólica :");

        txtData.setToolTipText("Digite a Data  XX/XX/XXXX");
        txtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataActionPerformed(evt);
            }
        });

        txtHora.setToolTipText("Digite a Hora 00:00");
        txtHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraActionPerformed(evt);
            }
        });

        txtPressaoSistolica.setToolTipText("Digite a Pressão Sistólica");
        txtPressaoSistolica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPressaoSistolicaActionPerformed(evt);
            }
        });

        txtPressaoDistolica.setToolTipText("Digite a Pressão Diastólica");
        txtPressaoDistolica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPressaoDistolicaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("NIvel de Stress :");

        btnBaixo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnBaixo.setText("Baixo");
        btnBaixo.setToolTipText("Baixo");
        btnBaixo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBaixoActionPerformed(evt);
            }
        });

        btnMedio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnMedio.setText("Médio");
        btnMedio.setToolTipText("Médio");

        btnAlto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAlto.setText("Alto");
        btnAlto.setToolTipText("Alto");

        btnSalvar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setToolTipText("Salvar Formulario");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        tblRegistro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tblRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Data", "Hora", "Pressão Sistólica", "Pressão Diastólica", "NIvel de Stress"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblRegistro.setToolTipText(" Registros de Medição");
        scrpResgistro.setViewportView(tblRegistro);

        jTabbedPane1.addTab("tab1", scrpResgistro);

        btnExcluir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setToolTipText("Exclui o Registro");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnLimpar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.setToolTipText("Limpa os Campos do Registro");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSair.setText("Sair");
        btnSair.setToolTipText("Finaliza o Aplicativo");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        lypPane01.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lypPane01.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lypPane01.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lypPane01.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lypPane01.setLayer(txtData, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lypPane01.setLayer(txtHora, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lypPane01.setLayer(txtPressaoSistolica, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lypPane01.setLayer(txtPressaoDistolica, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lypPane01.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lypPane01.setLayer(btnBaixo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lypPane01.setLayer(btnMedio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lypPane01.setLayer(btnAlto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lypPane01.setLayer(btnSalvar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lypPane01.setLayer(jTabbedPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lypPane01.setLayer(btnExcluir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lypPane01.setLayer(btnLimpar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lypPane01.setLayer(btnSair, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout lypPane01Layout = new javax.swing.GroupLayout(lypPane01);
        lypPane01.setLayout(lypPane01Layout);
        lypPane01Layout.setHorizontalGroup(
            lypPane01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lypPane01Layout.createSequentialGroup()
                .addGroup(lypPane01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lypPane01Layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(btnBaixo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMedio, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(btnAlto, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lypPane01Layout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(lypPane01Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(lypPane01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(lypPane01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lypPane01Layout.createSequentialGroup()
                                    .addGroup(lypPane01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                    .addGap(58, 58, 58)
                                    .addGroup(lypPane01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtPressaoDistolica, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                                        .addComponent(txtHora)
                                        .addComponent(txtPressaoSistolica)))
                                .addGroup(lypPane01Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(144, 144, 144)
                                    .addComponent(txtData)))
                            .addGroup(lypPane01Layout.createSequentialGroup()
                                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        lypPane01Layout.setVerticalGroup(
            lypPane01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lypPane01Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lypPane01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(lypPane01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(lypPane01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPressaoSistolica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(lypPane01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPressaoDistolica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(lypPane01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(btnBaixo)
                    .addComponent(btnMedio)
                    .addComponent(btnAlto))
                .addGap(37, 37, 37)
                .addGroup(lypPane01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnExcluir)
                    .addComponent(btnLimpar)
                    .addComponent(btnSair))
                .addGap(37, 37, 37)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lypPane01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(lypPane01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPressaoDistolicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPressaoDistolicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPressaoDistolicaActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
       if (!emptyFields()) {
        Registro registro = getRegistro();
        if (registro != null) {
            inserirRegistro(registro);
            salvarRegistrosEmArquivo("registros.csv"); // Nome do arquivo onde os registros serão salvos
        }
    ButtonGroup grupoNivelStress = new ButtonGroup();
        grupoNivelStress.add(btnBaixo);
        grupoNivelStress.add(btnMedio);
        grupoNivelStress.add(btnAlto);
        
          txtData.setText("");
          txtHora.setText("");
          txtPressaoSistolica.setText("");
          txtPressaoDistolica.setText("");
          grupoNivelStress.clearSelection();

          
          txtData.requestFocus();
          
         
      }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataActionPerformed

    private void txtHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraActionPerformed

    private void txtPressaoSistolicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPressaoSistolicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPressaoSistolicaActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        excluirRegistro(getPosicaoRegistro());
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnBaixoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBaixoActionPerformed
       
    }//GEN-LAST:event_btnBaixoActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
          
        ButtonGroup grupoNivelStress = new ButtonGroup();
        grupoNivelStress.add(btnBaixo);
        grupoNivelStress.add(btnMedio);
        grupoNivelStress.add(btnAlto);
        
          txtData.setText("");
          txtHora.setText("");
          txtPressaoSistolica.setText("");
          txtPressaoDistolica.setText("");
          grupoNivelStress.clearSelection();

          
          txtData.requestFocus();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

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
            java.util.logging.Logger.getLogger(MedPressaoArterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MedPressaoArterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MedPressaoArterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MedPressaoArterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MedPressaoArterial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox btnAlto;
    private javax.swing.JCheckBox btnBaixo;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JCheckBox btnMedio;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLayeredPane lypPane01;
    private javax.swing.JScrollPane scrpResgistro;
    private javax.swing.JTable tblRegistro;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtPressaoDistolica;
    private javax.swing.JTextField txtPressaoSistolica;
    // End of variables declaration//GEN-END:variables

private boolean emptyFields(){
     /*
      * Variável empty assume “true” por padrão e só vai mudar o seu estado
      * após verificarmos se todos os campos estão preenchidos. É ela que
      * retornamos ao final do método.
     */
     boolean empty = true; 
     
     if(txtData.getText().trim().isEmpty()){
         
         JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Data não pode ser vazio.");
     } else if(txtHora.getText().trim().isEmpty()){
         
          JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Hora não pode ser vazio.");
     } else if(txtPressaoSistolica.getText().trim().isEmpty()){
         
          JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Pressão Sistólica não pode ser vazio.");
     }   else if(txtPressaoDistolica.getText().trim().isEmpty()){
         
          JOptionPane.showMessageDialog(rootPane, "ATENÇÃO! Pressão Distólica não pode ser vazio.");
     }else{
         
         empty = false;
     }
     
     return empty;
  }
  
  //zero
   
  private Registro getRegistro(){
     if (!emptyFields() && validarData(txtData.getText()) && validarHora(txtHora.getText()) ) {
   
     Registro registro = new Registro();
     
     registro.setData(txtData.getText());
     registro.setHora(txtHora.getText());
     registro.setPressaoSistolica(Integer.parseInt(txtPressaoSistolica.getText()));
     registro.setPressaoDistolica(Integer.parseInt(txtPressaoDistolica.getText()));
     obterNivelStress();
       
       JOptionPane.showMessageDialog(null, "Os seguintes dados foram cadastrados com sucesso: \n"
            + "\nData: " + txtData.getText()
            + "\nHora: " + txtHora.getText()
            + "\nPressão Sistólica: " + txtPressaoSistolica.getText()
            + "\nPressão Distólica: " + txtPressaoDistolica.getText()
            + "\nNivel de Stress: "   + obterNivelStress()
          
    );
     
     return registro;
     } else {
    JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos corretamente.");
     }
            return null;
  }
  
     private void inserirRegistro(Registro registro){
     
     registroList.add(registro);
     
     atualizarTabela();
     
  }
   
  private void atualizarTabela(){
     
         
     if(!registroList.isEmpty()){
         
         Registro registro;
         tableModel = new DefaultTableModel(tableColumns, 0);
         for (int i = 0; i < registroList.size(); i++) {
             
             registro = registroList.get(i);
             String[] rowData = {registro.getData(), registro.getHora(), String.valueOf(registro.getPressaoSistolica()), String.valueOf(registro.getPressaoDistolica()), obterNivelStress() };
             tableModel.addRow(rowData);
         }
         
         tblRegistro.setModel(tableModel);
     }else{
         
         tableModel = new DefaultTableModel(tableColumns, 0);
         tblRegistro.setModel(tableModel);
     }     
  }
    private int getPosicaoRegistro(){
     
     int posRegistro = tblRegistro.getSelectedRow();
     
   
     if(posRegistro == -1){
         JOptionPane.showMessageDialog(rootPane, "Selecione um Registro");
     }
     
     
     return posRegistro;
  }
       private void excluirRegistro(int posRegistro){
     
            if(posRegistro >= 0){
        
         
         
         String[] options = { "Sim", "Não" };
         
         int deletar = JOptionPane.showOptionDialog(
                 rootPane,
                 "Tem certeza que deseja excluir o Registro ?", 
                 "Exclusão de Registro", 
                 JOptionPane.DEFAULT_OPTION, 
                 JOptionPane.QUESTION_MESSAGE, 
                 null, 
                 options, 
                 options[0]
         );
         
         
         if(deletar == 0){
                
                 registroList.remove(posRegistro);

                 
                 atualizarTabela();
         }else{
             /*
             * Limpar a seleção pois o usuário cancelou a exclusão.
             */
            tblRegistro.clearSelection();             
         }
     }  
  }

    private boolean validarData(String date) {
    
    if (!date.matches("\\d{2}/\\d{2}/\\d{4}")) {
       
    JOptionPane.showMessageDialog(null, "Formato da DATA inválido. Use o formato XX/XX/XXXX.");
        return false;
    }
    return true;
}

        private boolean validarHora(String hora) {
    if (!hora.matches("^([01]?[0-9]|2[0-3]):[0-5][0-9]$")) {
        JOptionPane.showMessageDialog(null, "Formato da HORA inválido. Use o formato HH:mm.");
        return false; // Hora no formato incorreto
    }
    
    String[] partes = hora.split(":");
    int horas = Integer.parseInt(partes[0]);
    int minutos = Integer.parseInt(partes[1]);
    
    if (horas < 0 || horas > 23 || minutos < 0 || minutos > 59) {
        JOptionPane.showMessageDialog(null, "Hora fora do intervalo válido (00:00 - 23:59).");
        return false; // Hora fora do intervalo válido
    }
    
    return true;
}
private String obterNivelStress() {
    if (btnBaixo.isSelected()) {
        return "Baixo";
    } else if (btnMedio.isSelected()) {
        return "Médio";
    } else if (btnAlto.isSelected()) {
        return "Alto";
    } else {
        return "Nenhum selecionado";
    }
}

 private void salvarRegistrosEmArquivo(String nomeArquivo) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
        
        writer.write("Data,Hora,Pressão Sistólica,Pressão Diastólica,Nível de Stress");
        writer.newLine();
         for (Registro registro : registroList) {
            writer.write(registro.getData() + "," + registro.getHora() + ","
                    + registro.getPressaoSistolica() + "," + registro.getPressaoDistolica() + ","
                    + obterNivelStress());
            writer.newLine();
        }
        JOptionPane.showMessageDialog(null, "Registros salvos com sucesso em " + nomeArquivo);
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Erro ao salvar registros em arquivo: " + e.getMessage());
    }
}

                                          
    
}

