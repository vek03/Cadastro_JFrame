package form;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Victor Cardoso
 * Vek Histories
 */
public class JFrame1 extends javax.swing.JFrame {

    /**
     * Creates new form JFrame1
     */
    public JFrame1() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        buttonGroup11 = new javax.swing.ButtonGroup();
        buttonGroup12 = new javax.swing.ButtonGroup();
        buttonGroup13 = new javax.swing.ButtonGroup();
        buttonGroup14 = new javax.swing.ButtonGroup();
        buttonGroup15 = new javax.swing.ButtonGroup();
        buttonGroup16 = new javax.swing.ButtonGroup();
        buttonGroup17 = new javax.swing.ButtonGroup();
        buttonGroup18 = new javax.swing.ButtonGroup();
        buttonGroup19 = new javax.swing.ButtonGroup();
        buttonGroup20 = new javax.swing.ButtonGroup();
        rotAniv = new javax.swing.JLabel();
        rotCadas = new javax.swing.JLabel();
        txtCodCli = new javax.swing.JTextField();
        radiFem = new javax.swing.JRadioButton();
        radiMasc = new javax.swing.JRadioButton();
        txtNome = new javax.swing.JTextField();
        txtEnder = new javax.swing.JTextField();
        txtBair = new javax.swing.JTextField();
        rotCodCli = new javax.swing.JLabel();
        rotNome = new javax.swing.JLabel();
        boxEstad = new javax.swing.JComboBox<>();
        txtCel = new javax.swing.JFormattedTextField();
        txtTel = new javax.swing.JFormattedTextField();
        txtAni = new javax.swing.JFormattedTextField();
        txtCadas = new javax.swing.JFormattedTextField();
        btnCad = new javax.swing.JButton();
        btnLimp = new javax.swing.JButton();
        btnClos = new javax.swing.JButton();
        rotCell = new javax.swing.JLabel();
        rotTel = new javax.swing.JLabel();
        rotEnder = new javax.swing.JLabel();
        rotBair = new javax.swing.JLabel();
        rotCid = new javax.swing.JLabel();
        rotEstad = new javax.swing.JLabel();
        rotCEP = new javax.swing.JLabel();
        rotSex = new javax.swing.JLabel();
        txtCid = new javax.swing.JTextField();
        txtCEP = new javax.swing.JFormattedTextField();
        alert = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Cliente");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        rotAniv.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rotAniv.setText("Data de Anivers??rio");

        rotCadas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rotCadas.setText("Data de Cadastro");

        buttonGroup1.add(radiFem);
        radiFem.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        radiFem.setText("Feminino");
        radiFem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiFemActionPerformed(evt);
            }
        });

        buttonGroup1.add(radiMasc);
        radiMasc.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        radiMasc.setText("Masculino");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtBair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBairActionPerformed(evt);
            }
        });

        rotCodCli.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rotCodCli.setText("C??digo do Cliente");

        rotNome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rotNome.setText("Nome Completo");

        boxEstad.setMaximumRowCount(26);
        boxEstad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "AC", "AL", "AP", "AM", "BA", "CE", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO", "DF" }));
        boxEstad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxEstadActionPerformed(evt);
            }
        });

        txtCel.setColumns(9);
        try {
            txtCel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtAni.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtAni.setText(".");

        txtCadas.setEditable(false);
        txtCadas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCadasMouseClicked(evt);
            }
        });
        txtCadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCadasActionPerformed(evt);
            }
        });

        btnCad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/form/enviar.jpeg"))); // NOI18N
        btnCad.setText("Cadastrar");
        btnCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadActionPerformed(evt);
            }
        });

        btnLimp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLimp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/form/limpar.jpeg"))); // NOI18N
        btnLimp.setText("Limpar");
        btnLimp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpActionPerformed(evt);
            }
        });

        btnClos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnClos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/form/desligar.jpeg"))); // NOI18N
        btnClos.setText("Fechar");
        btnClos.setActionCommand("close");
        btnClos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClosActionPerformed(evt);
            }
        });

        rotCell.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rotCell.setText("Celular");

        rotTel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rotTel.setText("Telefone");

        rotEnder.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rotEnder.setText("Endere??o");

        rotBair.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rotBair.setText("Bairro");

        rotCid.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rotCid.setText("Cidade");

        rotEstad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rotEstad.setText("Estado");

        rotCEP.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rotCEP.setText("C.E.P");

        rotSex.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rotSex.setText("Sexo");

        txtCid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCidActionPerformed(evt);
            }
        });

        try {
            txtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCEP.setToolTipText("text");
        txtCEP.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCEP.setName(""); // NOI18N

        alert.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        alert.setForeground(new java.awt.Color(204, 0, 0));
        alert.setText("Complete");
        alert.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                alertAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(alert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rotCodCli)
                                .addComponent(rotNome)
                                .addComponent(rotEnder)
                                .addComponent(rotBair)
                                .addComponent(rotCid)
                                .addComponent(rotEstad)
                                .addComponent(rotCEP)
                                .addComponent(rotSex))
                            .addGap(99, 99, 99)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(radiFem)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(radiMasc))
                                .addComponent(boxEstad, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCodCli)
                                .addComponent(txtNome)
                                .addComponent(txtEnder)
                                .addComponent(txtBair)
                                .addComponent(txtCid, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rotCell)
                                .addComponent(rotTel)
                                .addComponent(rotAniv)
                                .addComponent(rotCadas))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCel)
                                .addComponent(txtTel)
                                .addComponent(txtAni)
                                .addComponent(txtCadas, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btnCad)
                            .addGap(30, 30, 30)
                            .addComponent(btnLimp)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnClos))))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotCodCli)
                    .addComponent(txtCodCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEnder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotEnder))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotBair))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotCid))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxEstad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotEstad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotCEP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotSex)
                    .addComponent(radiFem, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radiMasc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotCell)
                    .addComponent(txtCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotTel)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotAniv)
                    .addComponent(txtAni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotCadas)
                    .addComponent(txtCadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alert, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimp)
                    .addComponent(btnClos))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void radiFemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiFemActionPerformed

    }//GEN-LAST:event_radiFemActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtBairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBairActionPerformed

    private void boxEstadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxEstadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxEstadActionPerformed

    private void txtCadasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCadasMouseClicked
        
    }//GEN-LAST:event_txtCadasMouseClicked

    private void txtCadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCadasActionPerformed

    }//GEN-LAST:event_txtCadasActionPerformed

    private void btnCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadActionPerformed
      boolean a;
      if(radiFem.isSelected() == false && radiMasc.isSelected() == false){
          a = false;
      }else{
          a = true;
      }
      
      if(txtNome.getText().length() > 0 && txtCEP.getText().length() > 0 &&
         txtCid.getText().length() > 0 && txtCodCli.getText().length() > 0 &&
         txtBair.getText().length() > 0 && txtAni.getText().length() > 0 &&
         txtEnder.getText().length() > 0 && txtCel.getText().length() > 0 &&
         txtTel.getText().length() > 0 && boxEstad.getSelectedItem() != "-"
         && a == true)
      {  
        HomeFrame form2 = new HomeFrame();
        dispose();
        form2.setVisible(true);
        
        form2.getNomeR().setText(txtNome.getText());
        form2.getCEPr().setText(txtCEP.getText());
        form2.getCidadeR().setText(txtCid.getText());
        form2.getCodCli().setText(txtCodCli.getText());
        form2.getBairroR().setText(txtBair.getText());
        form2.getEstadoR().setText(boxEstad.getSelectedItem().toString());
        form2.getAniversarioR().setText(txtAni.getText());
        form2.getCadastroR().setText(txtCadas.getText());
        form2.getEnderR().setText(txtEnder.getText());
        form2.getCelularR().setText(txtCel.getText());
        form2.getTelefoneR().setText(txtTel.getText());
        
        if(radiFem.isSelected() == true){
        form2.getSexoR().setText("Feminino");
        }else if(radiMasc.isSelected() == true){
            form2.getSexoR().setText("Masculino");
        }else{
            form2.getSexoR().setText("sexo");
        }
      }else
       {
           alert.setText("Ops! Parece que voc?? esqueceu de digitar algumas informa????es!");
       }  
    }//GEN-LAST:event_btnCadActionPerformed

    private void btnLimpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpActionPerformed
        txtCodCli.setText(null);
        txtNome.setText(null);
        txtEnder.setText(null);
        txtBair.setText(null);
        txtCid.setText(null);
        boxEstad.setSelectedItem("-");
        txtCEP.setText(null);
        txtCel.setText(null);
        txtTel.setText(null);
        txtAni.setText(null);
        buttonGroup1.clearSelection();
        txtCodCli.requestFocus();
    }//GEN-LAST:event_btnLimpActionPerformed

    private void btnClosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClosActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnClosActionPerformed

    private void txtCidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCidActionPerformed

    }//GEN-LAST:event_txtCidActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String data = formatter.format(date);
        txtCadas.setText("" + data);
    }//GEN-LAST:event_formWindowActivated

    private void alertAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_alertAncestorAdded
        alert.setText("");
        txtCodCli.requestFocus();
    }//GEN-LAST:event_alertAncestorAdded

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
            java.util.logging.Logger.getLogger(JFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alert;
    private javax.swing.JComboBox<String> boxEstad;
    private javax.swing.JButton btnCad;
    private javax.swing.JButton btnClos;
    private javax.swing.JButton btnLimp;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup11;
    private javax.swing.ButtonGroup buttonGroup12;
    private javax.swing.ButtonGroup buttonGroup13;
    private javax.swing.ButtonGroup buttonGroup14;
    private javax.swing.ButtonGroup buttonGroup15;
    private javax.swing.ButtonGroup buttonGroup16;
    private javax.swing.ButtonGroup buttonGroup17;
    private javax.swing.ButtonGroup buttonGroup18;
    private javax.swing.ButtonGroup buttonGroup19;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup20;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JRadioButton radiFem;
    private javax.swing.JRadioButton radiMasc;
    private javax.swing.JLabel rotAniv;
    private javax.swing.JLabel rotBair;
    private javax.swing.JLabel rotCEP;
    private javax.swing.JLabel rotCadas;
    private javax.swing.JLabel rotCell;
    private javax.swing.JLabel rotCid;
    private javax.swing.JLabel rotCodCli;
    private javax.swing.JLabel rotEnder;
    private javax.swing.JLabel rotEstad;
    private javax.swing.JLabel rotNome;
    private javax.swing.JLabel rotSex;
    private javax.swing.JLabel rotTel;
    private javax.swing.JFormattedTextField txtAni;
    private javax.swing.JTextField txtBair;
    private javax.swing.JFormattedTextField txtCEP;
    private javax.swing.JFormattedTextField txtCadas;
    private javax.swing.JFormattedTextField txtCel;
    private javax.swing.JTextField txtCid;
    private javax.swing.JTextField txtCodCli;
    private javax.swing.JTextField txtEnder;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtTel;
    // End of variables declaration//GEN-END:variables
}