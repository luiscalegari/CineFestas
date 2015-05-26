package engenharia.cine.festa.gui;

import engenharia.cine.festa.bo.RealizarVendaBO;
import engenharia.cine.festa.dto.ItensVendaDTO;
import engenharia.cine.festa.dto.ProdutoDTO;
import engenharia.cine.festa.dto.VendaDTO;
import engenharia.cine.festa.exception.NegocioException;
import engenharia.cine.festa.util.MensagensUtil;
import engenharia.cine.festa.util.Utilidades;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Luis Calegari
 */
public class RealizarVendaFrame extends javax.swing.JFrame {

    private TableModel modelProduto;
    private TableModel modelItensVenda;
    private List<Integer> listaCodigo;
    private int linha;
    private final String[][] matModel = new String[][]{};
    private final String[] vetModelProdutos = new String[]{"Código", "Descrição","Preço" ,""};
    private final String[] vetModelItensVenda = new String[]{"Código", "Descrição", "Preço", "Quantidade"};
    private static final DecimalFormat decimalFormat = new DecimalFormat("#.##");

    public RealizarVendaFrame() {
        initComponents();
        initConf();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTudo = new javax.swing.JPanel();
        jScrollPaneProdutos = new javax.swing.JScrollPane();
        tabProdutos = new javax.swing.JTable();
        jScrollPaneItensVenda = new javax.swing.JScrollPane();
        tabItensVenda = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDecricao = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtComanda = new engenharia.cine.festa.util.JtextFieldSomenteNumeros(10);
        btnOk = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Realizar Venda");
        setResizable(false);

        tabProdutos.setModel(new javax.swing.table.DefaultTableModel(matModel,vetModelProdutos));
        jScrollPaneProdutos.setViewportView(tabProdutos);

        tabItensVenda.setModel(new javax.swing.table.DefaultTableModel(matModel, vetModelItensVenda));
        jScrollPaneItensVenda.setViewportView(tabItensVenda);

        jLabel1.setText("Código:");

        jLabel2.setText("Descrição:");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Comanda:");

        txtComanda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtComandaKeyPressed(evt);
            }
        });

        btnOk.setText("Ok");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Total:");

        lblTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTotal.setText("jLabel5");

        javax.swing.GroupLayout pnlTudoLayout = new javax.swing.GroupLayout(pnlTudo);
        pnlTudo.setLayout(pnlTudoLayout);
        pnlTudoLayout.setHorizontalGroup(
            pnlTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTudoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlTudoLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDecricao, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlTudoLayout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPaneProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPaneItensVenda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTudoLayout.createSequentialGroup()
                            .addComponent(btnCancelar)
                            .addGap(18, 18, 18)
                            .addComponent(btnOk)))
                    .addGroup(pnlTudoLayout.createSequentialGroup()
                        .addGroup(pnlTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGroup(pnlTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlTudoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtComanda, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTudoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblTotal)))))
                .addContainerGap())
        );

        pnlTudoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCancelar, btnOk});

        pnlTudoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jScrollPaneItensVenda, jScrollPaneProdutos});

        pnlTudoLayout.setVerticalGroup(
            pnlTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTudoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pnlTudoLayout.createSequentialGroup()
                        .addGroup(pnlTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtDecricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPaneProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlTudoLayout.createSequentialGroup()
                        .addComponent(jScrollPaneItensVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(pnlTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(txtComanda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lblTotal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnOk)
                            .addComponent(btnCancelar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.modelProduto = new DefaultTableModel(
                new String[][]{}, vetModelProdutos);
        this.modelItensVenda = new DefaultTableModel(
                new String[][]{}, vetModelItensVenda);
        txtCodigo.setText("");
        txtDecricao.setText("");
        txtComanda.setText("");
        tabProdutos.setModel(modelProduto);
        tabItensVenda.setModel(modelItensVenda);
        lblTotal.setText("0.00");
        Utilidades.desabilitaComponentes(new Component[]{btnOk});
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String sCodigo = txtCodigo.getText();
        String sDescricao = txtDecricao.getText();

        RealizarVendaBO rvbo = new RealizarVendaBO();
        try {
            String[][] listaProdutos = rvbo.listaPesquisa(sCodigo, sDescricao, listaCodigo);
            TableModel model = new DefaultTableModel(listaProdutos, vetModelProdutos);
            tabProdutos.setModel(model);
            Action actionSelect = new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    ProdutoDTO pdto = new ProdutoDTO();
                    try {
                        pdto = selecionarProdutoClick(actionEvent);
                        String modelLinha[] = new String[]{String.valueOf(pdto.getCodigo()), pdto.getDescricao(), String.valueOf(pdto.getPrecoVenda()), "1"};
                        DefaultTableModel defaultTableModel = (DefaultTableModel) tabItensVenda.getModel();
                        int i = 0;
                        while (i < defaultTableModel.getRowCount() && Integer.parseInt((String) defaultTableModel.getValueAt(i, 0)) != pdto.getCodigo()) {
                            i++;
                        }
                        if (i >= defaultTableModel.getRowCount()) {
                            defaultTableModel.addRow(modelLinha);
                        } else {
                            String sQtde = String.valueOf(defaultTableModel.getValueAt(i, 3));
                            int iQtde = 1;
                            iQtde += Integer.valueOf(sQtde);
                            defaultTableModel.setValueAt(iQtde, i, 3);
                        }

                        tabItensVenda.setModel(defaultTableModel);
                        float tot = 0;
                        for (int j = 0; j < defaultTableModel.getRowCount(); j++) {
                            String sPreco = String.valueOf(defaultTableModel.getValueAt(j, 2));
                            String sQtde = String.valueOf(defaultTableModel.getValueAt(j, 3));
                            float preco = Float.parseFloat(sPreco);
                            float qtde = Float.parseFloat(sQtde);
                            tot += preco * qtde;
                        }
                        lblTotal.setText(decimalFormat.format(tot));
                    } catch (Exception e) {
                        e.printStackTrace();
                        MensagensUtil.addMsg(null, e.getMessage());
                    }
                }
            };
            ButtonColumn buttonColumn = new ButtonColumn(tabProdutos, actionSelect, 3);
        } catch (Exception e) {
            e.printStackTrace();
            MensagensUtil.addMsg(null, e.getMessage());
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        List<ItensVendaDTO> listaItensVenda = new ArrayList<ItensVendaDTO>();
        VendaDTO vdto = new VendaDTO();
        RealizarVendaBO rvbo = new RealizarVendaBO();

        // Campos tabela de Venda
        String sComanda = txtComanda.getText();
        String sTotal = lblTotal.getText();

        // Campos tablea de ItensVenda
        String sVenda;
        String sProduto = "";
        String sQtde = "";
        String sValor = "";

        try {
            rvbo.validarComanda(sComanda);
            rvbo.validarTotal(sTotal);

            vdto.setComanda(Integer.valueOf(sComanda));
            vdto.setTotal(Float.valueOf(sTotal.replace(",", ".")));

            DefaultTableModel defaultTableModel = (DefaultTableModel) tabItensVenda.getModel();
            for (int i = 0; i < defaultTableModel.getRowCount(); i++) {
                ItensVendaDTO ivdto = new ItensVendaDTO();
                sProduto = String.valueOf(defaultTableModel.getValueAt(i, 0));
                sQtde = String.valueOf(defaultTableModel.getValueAt(i, 3));
                sValor = String.valueOf(defaultTableModel.getValueAt(i, 2));

                rvbo.validarProduto(sProduto);
                rvbo.validarQtde(sQtde);
                rvbo.validarValor(sValor);

                ivdto.setProduto(Integer.valueOf(sProduto));
                ivdto.setQtde(Integer.valueOf(sQtde));
                ivdto.setValor(Float.valueOf(sValor));

                listaItensVenda.add(ivdto);
            }

            int iVenda = rvbo.cadastrarVenda(vdto);
            for (ItensVendaDTO intemVenda : listaItensVenda) {
                intemVenda.setVenda(iVenda);
                rvbo.cadastrarItenVenda(intemVenda);
            }
            btnCancelarActionPerformed(null);
        } catch (Exception e) {
            e.printStackTrace();
            MensagensUtil.addMsg(null, e.getLocalizedMessage());
        }
    }//GEN-LAST:event_btnOkActionPerformed

    private void txtComandaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtComandaKeyPressed
        if (txtComanda.getText().isEmpty()) {
            Utilidades.desabilitaComponentes(new Component[]{btnOk});
        } else {
            Utilidades.habilitaComponentes(new Component[]{btnOk});
        }
    }//GEN-LAST:event_txtComandaKeyPressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RealizarVendaFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPaneItensVenda;
    private javax.swing.JScrollPane jScrollPaneProdutos;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel pnlTudo;
    private javax.swing.JTable tabItensVenda;
    private javax.swing.JTable tabProdutos;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtComanda;
    private javax.swing.JTextField txtDecricao;
    // End of variables declaration//GEN-END:variables

    private void initConf() {
        this.setLocationRelativeTo(null);
        Utilidades.AlteraIconeFrame(this,
                new ImageIcon(this.getClass().getResource("/Imagens/icone64x64.png")));
        listaCodigo = new ArrayList<Integer>();
        linha = 0;
        btnCancelarActionPerformed(null);
    }

    public ProdutoDTO selecionarProdutoClick(ActionEvent actionEvent) throws NegocioException {
        JTable table = (JTable) actionEvent.getSource();
        linha = Integer.valueOf(actionEvent.getActionCommand());

        RealizarVendaBO rvbo = new RealizarVendaBO();
        try {
            ProdutoDTO pdto = RealizarVendaBO.selecionarProdutoPorCodigo(listaCodigo.get(linha));
            return pdto;
        } catch (Exception e) {
            e.printStackTrace();
            throw new NegocioException(e.getLocalizedMessage());
        }

    }
}
