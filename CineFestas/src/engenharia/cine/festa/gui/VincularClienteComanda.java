package engenharia.cine.festa.gui;

import engenharia.cine.festa.bo.ClienteBO;
import engenharia.cine.festa.bo.VincularClienteComandaBO;
import engenharia.cine.festa.dto.ClienteDTO;
import engenharia.cine.festa.util.MensagensUtil;
import engenharia.cine.festa.util.Utilidades;
import java.awt.Component;
import javax.swing.ImageIcon;

/**
 *
 * @author Luis Calegari
 */
public class VincularClienteComanda extends javax.swing.JFrame {

    public VincularClienteComanda() {
        initComponents();
        initConf();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTudo = new javax.swing.JPanel();
        pnlComanda = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        txtRg = new engenharia.cine.festa.util.JtextFieldSomenteNumeros(9);
        btnPesquisar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtComanda = new engenharia.cine.festa.util.JtextFieldSomenteNumeros();
        jLabel5 = new javax.swing.JLabel();
        txtCodigo = new engenharia.cine.festa.util.JtextFieldSomenteNumeros(9);
        pnlBotoes = new javax.swing.JPanel();
        btnLimparCampos = new javax.swing.JButton();
        btnCadastrarCliente = new javax.swing.JButton();
        btnVincular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Comanda");
        setResizable(false);

        pnlComanda.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Comanda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(0, 0, 204))); // NOI18N

        jLabel1.setText("CPF:");

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel2.setText("RG:");

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        jLabel3.setText("Nome:");

        txtNome.setEnabled(false);

        jLabel4.setText("Comanda:");

        jLabel5.setText("Codigo:");

        txtCodigo.setEnabled(false);

        javax.swing.GroupLayout pnlComandaLayout = new javax.swing.GroupLayout(pnlComanda);
        pnlComanda.setLayout(pnlComandaLayout);
        pnlComandaLayout.setHorizontalGroup(
            pnlComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlComandaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlComandaLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtComanda, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlComandaLayout.createSequentialGroup()
                        .addGroup(pnlComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlComandaLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlComandaLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNome)))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(pnlComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnlComandaLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodigo)))))
                .addContainerGap())
        );
        pnlComandaLayout.setVerticalGroup(
            pnlComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlComandaLayout.createSequentialGroup()
                .addGroup(pnlComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtComanda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlBotoes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opções", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(0, 0, 204))); // NOI18N

        btnLimparCampos.setText("Limpar Campos");
        btnLimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCamposActionPerformed(evt);
            }
        });

        btnCadastrarCliente.setText("Cadastar Cliente");
        btnCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarClienteActionPerformed(evt);
            }
        });

        btnVincular.setText("Vincular");
        btnVincular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVincularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBotoesLayout = new javax.swing.GroupLayout(pnlBotoes);
        pnlBotoes.setLayout(pnlBotoesLayout);
        pnlBotoesLayout.setHorizontalGroup(
            pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimparCampos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCadastrarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVincular, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlBotoesLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCadastrarCliente, btnLimparCampos, btnVincular});

        pnlBotoesLayout.setVerticalGroup(
            pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimparCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrarCliente)
                    .addComponent(btnVincular))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlBotoesLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCadastrarCliente, btnLimparCampos, btnVincular});

        javax.swing.GroupLayout pnlTudoLayout = new javax.swing.GroupLayout(pnlTudo);
        pnlTudo.setLayout(pnlTudoLayout);
        pnlTudoLayout.setHorizontalGroup(
            pnlTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTudoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlComanda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlTudoLayout.setVerticalGroup(
            pnlTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTudoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlComanda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTudo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTudo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCamposActionPerformed
        txtComanda.setText("");
        txtCpf.setText("");
        txtNome.setText("");
        txtRg.setText("");
        txtCodigo.setText("");
        Utilidades.desabilitaComponentes(new Component[]{btnVincular});
        txtCpf.grabFocus();
    }//GEN-LAST:event_btnLimparCamposActionPerformed

    private void btnCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarClienteActionPerformed
        this.dispose();
        new CadClienteFrame().setVisible(true);
    }//GEN-LAST:event_btnCadastrarClienteActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        String sCpf = txtCpf.getText();
        String sRg = txtRg.getText();

        VincularClienteComandaBO vincularComandaClienteBO = new VincularClienteComandaBO();
        ClienteDTO clienteDTO = null;
        try {
            if (vincularComandaClienteBO.validaRg(sRg) || vincularComandaClienteBO.validaCpf(sCpf)) {
                clienteDTO = vincularComandaClienteBO.buscarCpfRg(sCpf, sRg);
            }
            if (clienteDTO == null) {
                MensagensUtil.addMsg(null, "Cliente não encontrado !!!");
            } else {
                txtCpf.setText(clienteDTO.getCpf());
                txtRg.setText(clienteDTO.getRg());
                txtNome.setText(clienteDTO.getNome());
                txtCodigo.setText(String.valueOf(clienteDTO.getCodigo()));
                txtComanda.grabFocus();
                Utilidades.habilitaComponentes(new Component[]{btnVincular});
            }
        } catch (Exception e) {
            e.printStackTrace();
            MensagensUtil.addMsg(null, e.getMessage());
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnVincularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVincularActionPerformed
        String sCpf = txtCpf.getText();
        String sRg = txtRg.getText();
        String sNome = txtNome.getText();
        String sComanda = txtComanda.getText();
        String sCodigo = txtCodigo.getText();

        VincularClienteComandaBO vccbo = new VincularClienteComandaBO();
        try {
            vccbo.validaComanda(sComanda);
            vccbo.vincularComanda(sComanda, sCodigo);
            MensagensUtil.addMsg(null, "Concluído!!!");
            btnLimparCamposActionPerformed(null);
        } catch (Exception e) {
            e.printStackTrace();
            MensagensUtil.addMsg(null, e.getMessage());
        }
    }//GEN-LAST:event_btnVincularActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VincularClienteComanda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarCliente;
    private javax.swing.JButton btnLimparCampos;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnVincular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel pnlBotoes;
    private javax.swing.JPanel pnlComanda;
    private javax.swing.JPanel pnlTudo;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtComanda;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRg;
    // End of variables declaration//GEN-END:variables

    private void initConf() {
        this.setLocationRelativeTo(null);
        Utilidades.AlteraIconeFrame(this,
                new ImageIcon(this.getClass().getResource("/Imagens/icone64x64.png")));
        btnLimparCamposActionPerformed(null);
    }
}
