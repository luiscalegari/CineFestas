package engenharia.cine.festa.gui;

import engenharia.cine.festa.bo.FecharContaBO;
import engenharia.cine.festa.dto.ComandaClienteDTO;
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
        jLabel4 = new javax.swing.JLabel();
        txtComanda = new engenharia.cine.festa.util.JtextFieldSomenteNumeros(10);
        txtCpf = new javax.swing.JFormattedTextField();
        txtRg = new engenharia.cine.festa.util.JtextFieldSomenteNumeros(9);
        pnlListagem = new javax.swing.JPanel();
        jScrollPaneListagem = new javax.swing.JScrollPane();
        tabListagem = new javax.swing.JTable();
        txtValorPago = new javax.swing.JTextField();
        btnIr = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fechar Conta");
        setResizable(false);

        jLabel1.setText("Comanda:");

        jLabel2.setText("Cpf:");

        jLabel3.setText("Rg:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Total:");

        lblTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTotal.setText("jLabel5");

        jLabel4.setText("Valor pago:");

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
        .addGroup(pnlListagemLayout.createSequentialGroup()
            .addComponent(jScrollPaneListagem, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
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
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTudoLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(pnlTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTudoLayout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtValorPago, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlTudoLayout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(123, 123, 123)
                            .addComponent(lblTotal)))))
            .addContainerGap())
    );

    pnlTudoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtComanda, txtCpf, txtRg});

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
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(pnlTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel4)
                .addComponent(txtValorPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(135, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(pnlTudo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addComponent(pnlTudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrActionPerformed
        FecharContaBO fcbo = new FecharContaBO();
        try {
            String sComanda = txtComanda.getText();
            fcbo.validarComanda(sComanda);
            
            String[][] lista = fcbo.listaPesquisa(sComanda);
            TableModel model = new DefaultTableModel(lista, vetModelItensVenda);
            tabListagem.setModel(model);
            
            ComandaClienteDTO ccdto = fcbo.buscaPorComanda(sComanda);
            lblTotal.setText(decimalFormat.format(ccdto.getTotal()));
        } catch (Exception e) {
            e.printStackTrace();
            MensagensUtil.addMsg(this, e.getLocalizedMessage());
        }
    }//GEN-LAST:event_btnIrActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FecharContaFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIr;
    private javax.swing.JLabel jLabel1;
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
        this.setLocationRelativeTo(null);
        Utilidades.AlteraIconeFrame(this,
                new ImageIcon(this.getClass().getResource("/Imagens/icone64x64.png")));

    }
}
