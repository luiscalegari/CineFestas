package engenharia.cine.festa.gui;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import engenharia.cine.festa.bo.ClienteBO;
import engenharia.cine.festa.bo.FecharContaBO;
import engenharia.cine.festa.dao.ComandaDAO;
import engenharia.cine.festa.dto.ComandaClienteDTO;
import engenharia.cine.festa.dto.ComandaDTO;
import engenharia.cine.festa.dto.FestaDTO;
import engenharia.cine.festa.util.MensagensUtil;
import engenharia.cine.festa.util.Utilidades;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Luis Calegari
 */
public class FecharContaFrame extends javax.swing.JFrame {

    private final String[] vetModelItensVenda = new String[]{"Código", "Descrição", "Preço", "Quantidade"};
    private static final DecimalFormat decimalFormat = new DecimalFormat("#.##");

    public FecharContaFrame() {
        initComponents();
        initConf();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTudo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        txtComanda = new engenharia.cine.festa.util.JtextFieldSomenteNumeros(10);
        txtCpf = new javax.swing.JFormattedTextField();
        txtRg = new engenharia.cine.festa.util.JtextFieldSomenteNumeros(9);
        pnlListagem = new javax.swing.JPanel();
        jScrollPaneListagem = new javax.swing.JScrollPane();
        tabListagem = new javax.swing.JTable();
        btnIr = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtValorPago = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnOk = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fechar Conta");
        setResizable(false);

        jLabel1.setText("*Comanda:");

        jLabel2.setText("Cpf:");

        jLabel3.setText("Rg:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Total:");

        lblTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTotal.setText("jLabel5");

        txtCpf.setEnabled(false);

        txtRg.setEnabled(false);

        pnlListagem.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listagem", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(0, 0, 204))); // NOI18N

        tabListagem.setModel(new javax.swing.table.DefaultTableModel(
            new String [][] {}, vetModelItensVenda));
    jScrollPaneListagem.setViewportView(tabListagem);

    javax.swing.GroupLayout pnlListagemLayout = new javax.swing.GroupLayout(pnlListagem);
    pnlListagem.setLayout(pnlListagemLayout);
    pnlListagemLayout.setHorizontalGroup(
        pnlListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jScrollPaneListagem, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
    );
    pnlListagemLayout.setVerticalGroup(
        pnlListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(pnlListagemLayout.createSequentialGroup()
            .addComponent(jScrollPaneListagem, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
    );

    btnIr.setText("Ir");
    btnIr.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnIrActionPerformed(evt);
        }
    });

    jLabel4.setText("*Valor pago:");

    btnCancelar.setText("Cancelar");
    btnCancelar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnCancelarActionPerformed(evt);
        }
    });

    btnOk.setText("Ok");
    btnOk.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnOkActionPerformed(evt);
        }
    });

    jLabel17.setForeground(new java.awt.Color(153, 0, 0));
    jLabel17.setText("IMPORTANTE: Campos que estão marcados com o caracter * são de preenchimento obrigatório.");

    javax.swing.GroupLayout pnlTudoLayout = new javax.swing.GroupLayout(pnlTudo);
    pnlTudo.setLayout(pnlTudoLayout);
    pnlTudoLayout.setHorizontalGroup(
        pnlTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(pnlTudoLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(pnlTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlListagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlTudoLayout.createSequentialGroup()
                    .addGroup(pnlTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtComanda, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addGap(18, 18, 18)
                    .addGroup(pnlTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(pnlTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlTudoLayout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(pnlTudoLayout.createSequentialGroup()
                            .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnIr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(pnlTudoLayout.createSequentialGroup()
                    .addGroup(pnlTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTudoLayout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtValorPago, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTudoLayout.createSequentialGroup()
                            .addComponent(btnCancelar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnOk))
                        .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTudoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addGap(123, 123, 123)
                    .addComponent(lblTotal)))
            .addContainerGap())
    );

    pnlTudoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtComanda, txtCpf, txtRg});

    pnlTudoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCancelar, btnOk});

    pnlTudoLayout.setVerticalGroup(
        pnlTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(pnlTudoLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(pnlTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1)
                .addComponent(jLabel2)
                .addComponent(jLabel3))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(pnlTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(txtComanda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnIr))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(pnlListagem, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(pnlTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel5)
                .addComponent(lblTotal))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(txtValorPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel4))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(pnlTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnOk)
                .addComponent(btnCancelar))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel17)
            .addContainerGap())
    );

    pnlTudoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCancelar, btnOk});

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

    private void btnIrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrActionPerformed
        FecharContaBO fcbo = new FecharContaBO();
        try {
            this.setCursor(WAIT_CURSOR);

            String sComanda = txtComanda.getText();
            fcbo.validarComanda(sComanda);

            ComandaDAO cdao = new ComandaDAO();
            ComandaDTO cdto = cdao.buscarPorCodigo(Integer.valueOf(sComanda));
            if (cdto.isStatus()) {
                String[][] lista = fcbo.listaPesquisa(sComanda);
                TableModel model = new DefaultTableModel(lista, vetModelItensVenda);
                tabListagem.setModel(model);

                ComandaClienteDTO ccdto = fcbo.buscaPorComanda(sComanda);
                lblTotal.setText(decimalFormat.format(ccdto.getTotal()));
            } else {
                MensagensUtil.addMsg(null, "Comanda fechada!!!");
            }
            this.setCursor(DEFAULT_CURSOR);
        } catch (Exception e) {
            e.printStackTrace();
            MensagensUtil.addMsg(this, e.getLocalizedMessage());
        }
    }//GEN-LAST:event_btnIrActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setCursor(WAIT_CURSOR);
        TableModel model = new ModeloTabela(new String[][]{}, vetModelItensVenda);
        tabListagem.setModel(model);
        txtComanda.setText("");
        txtCpf.setValue("");
        txtCpf.setText("");
        txtRg.setText("");
        lblTotal.setText("0.00");
        this.setCursor(DEFAULT_CURSOR);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        try {

            this.setCursor(WAIT_CURSOR);
            FecharContaBO fcbo = new FecharContaBO();
            String sComanda = txtComanda.getText();
            String sTroco = "";
            fcbo.validarComanda(sComanda);

            this.setCursor(DEFAULT_CURSOR);

            this.setCursor(WAIT_CURSOR);
            String[][] lista = fcbo.listaPesquisa(sComanda);
            TableModel model = new ModeloTabela(lista, vetModelItensVenda);
            ComandaClienteDTO ccdto = fcbo.buscaPorComanda(sComanda);
            ccdto.setValorPago(Float.valueOf(txtValorPago.getText().replace(",", ".")));
            Float fTroco = ccdto.getValorPago() - ccdto.getTotal();
            ccdto.setValorPago(fTroco > 0 ? ccdto.getTotal() : ccdto.getValorPago());
            fcbo.gravarFechamento(ccdto);
            MensagensUtil.addMsg(null, "Comanda fechada com sucesso!!!" + System.getProperty("line.separator") + "Troco: " + decimalFormat.format(fTroco));
            this.setCursor(DEFAULT_CURSOR);

        } catch (Exception e) {
            e.printStackTrace();
            MensagensUtil.addMsg(null, e.getLocalizedMessage());
        }
    }//GEN-LAST:event_btnOkActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FecharContaFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnIr;
    private javax.swing.JButton btnOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPaneListagem;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel pnlListagem;
    private javax.swing.JPanel pnlTudo;
    private javax.swing.JTable tabListagem;
    private javax.swing.JTextField txtComanda;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtRg;
    private javax.swing.JTextField txtValorPago;
    // End of variables declaration//GEN-END:variables
    private void initConf() {
        try {
            this.setLocationRelativeTo(null);
            Utilidades.AlteraIconeFrame(this,
                    new ImageIcon(this.getClass().getResource("/Imagens/icone64x64.png")));
            ClienteBO cbo = new ClienteBO();
            FestaDTO festa = cbo.buscarFesta();
            this.setTitle(this.getTitle() + " - " + festa.getAtracao());
            lblTotal.setText("0.00");
            txtValorPago.setText("0.00");
        } catch (Exception e) {
            MensagensUtil.addMsg(null, e.getLocalizedMessage());
        }
    }
}
