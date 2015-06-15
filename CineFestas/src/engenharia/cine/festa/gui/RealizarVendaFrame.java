package engenharia.cine.festa.gui;

import engenharia.cine.festa.bo.ClienteBO;
import engenharia.cine.festa.bo.RealizarVendaBO;
import engenharia.cine.festa.dto.FestaDTO;
import engenharia.cine.festa.dto.ItensVendaDTO;
import engenharia.cine.festa.dto.ProdutoDTO;
import engenharia.cine.festa.dto.VendaDTO;
import engenharia.cine.festa.util.MensagensUtil;
import engenharia.cine.festa.util.Utilidades;
import java.awt.Component;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
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
    private final String[] vetModelProdutos = new String[]{"Código", "Descrição", "Preço"};
    private final String[] vetModelItensVenda = new String[]{"Código", "Descrição", "Preço", "Qtde."};
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
        btnAdicionar = new javax.swing.JButton();
        btnRetirar = new javax.swing.JButton();
        javax.swing.SpinnerNumberModel modelQtde = new javax.swing.SpinnerNumberModel();
        modelQtde.setMinimum(1);
        txtQuantidade = new javax.swing.JSpinner(modelQtde);
        jLabel5 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

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
        jLabel3.setText("*Comanda:");

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

        btnAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/setadireita.png"))); // NOI18N
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnRetirar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/setaesquerda.png"))); // NOI18N
        btnRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarActionPerformed(evt);
            }
        });

        jLabel5.setText("QTDE");

        jLabel17.setForeground(new java.awt.Color(153, 0, 0));
        jLabel17.setText("IMPORTANTE: Campos que estão marcados com o caracter * são de preenchimento obrigatório.");

        javax.swing.GroupLayout pnlTudoLayout = new javax.swing.GroupLayout(pnlTudo);
        pnlTudo.setLayout(pnlTudoLayout);
        pnlTudoLayout.setHorizontalGroup(
            pnlTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTudoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTudoLayout.createSequentialGroup()
                        .addGroup(pnlTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlTudoLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlTudoLayout.createSequentialGroup()
                                .addGroup(pnlTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPaneProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addGroup(pnlTudoLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDecricao, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(pnlTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnAdicionar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnRetirar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtQuantidade, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTudoLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(19, 19, 19)))))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(pnlTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPaneItensVenda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTudoLayout.createSequentialGroup()
                                    .addComponent(btnCancelar)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnOk)))
                            .addGroup(pnlTudoLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(pnlTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlTudoLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtComanda, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlTudoLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblTotal))))))
                    .addGroup(pnlTudoLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pnlTudoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCancelar, btnOk});

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
                        .addGroup(pnlTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPaneProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlTudoLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAdicionar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRetirar))))
                    .addGroup(pnlTudoLayout.createSequentialGroup()
                        .addComponent(jScrollPaneItensVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(pnlTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(txtComanda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lblTotal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnOk)
                            .addComponent(btnCancelar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlTudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setCursor(WAIT_CURSOR);
        this.modelProduto = new DefaultTableModel(
                new String[][]{}, vetModelProdutos);
        this.modelItensVenda = new DefaultTableModel(
                new String[][]{}, vetModelItensVenda);
        txtCodigo.setText("");
        txtDecricao.setText("");
        txtComanda.setText("");
        txtQuantidade.setValue(1);
        tabProdutos.setModel(modelProduto);
        tabItensVenda.setModel(modelItensVenda);
        lblTotal.setText("0.00");
        Utilidades.desabilitaComponentes(new Component[]{btnOk});
        this.setCursor(DEFAULT_CURSOR);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        this.setCursor(WAIT_CURSOR);
        String sCodigo = txtCodigo.getText();
        String sDescricao = txtDecricao.getText();

        RealizarVendaBO rvbo = new RealizarVendaBO();
        try {
            String[][] listaProdutos = rvbo.listaPesquisa(sCodigo, sDescricao, listaCodigo);
            TableModel model = new DefaultTableModel(listaProdutos, vetModelProdutos) {
                @Override
                public boolean isCellEditable(final int row, final int column) {
                    return false;
                }
            };
            tabProdutos.setModel(model);
        } catch (Exception e) {
            e.printStackTrace();
            MensagensUtil.addMsg(null, e.getMessage());
        }
        this.setCursor(DEFAULT_CURSOR);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        this.setCursor(WAIT_CURSOR);
        List<ItensVendaDTO> listaItensVenda = new ArrayList<ItensVendaDTO>();
        VendaDTO vdto = new VendaDTO();
        RealizarVendaBO rvbo = new RealizarVendaBO();

        // Campos tabela de Venda
        String sComanda = txtComanda.getText();
        String sTotal = lblTotal.getText();

        // Campos tablea de ItensVenda
        String sVenda = "";
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
            
//            Verifica se as qunatidades estão disponíveis no estoque;
            for (ItensVendaDTO itemVenda : listaItensVenda) {
                rvbo.verificaQtdeEstoque(itemVenda);
            }
            
//            Grava intens da venda no banco.
            int iVenda = rvbo.cadastrarVenda(vdto);
            for (ItensVendaDTO itemVenda : listaItensVenda) {
                itemVenda.setVenda(iVenda);
                rvbo.cadastrarItenVenda(itemVenda);
            }
            btnCancelarActionPerformed(null);
        } catch (Exception e) {
            e.printStackTrace();
            MensagensUtil.addMsg(null, e.getLocalizedMessage());
        }
        this.setCursor(DEFAULT_CURSOR);
    }//GEN-LAST:event_btnOkActionPerformed

    private void txtComandaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtComandaKeyPressed
        if (txtComanda.getText().isEmpty()) {
            Utilidades.desabilitaComponentes(new Component[]{btnOk});
        } else {
            Utilidades.habilitaComponentes(new Component[]{btnOk});
        }
    }//GEN-LAST:event_txtComandaKeyPressed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        if (tabProdutos.getSelectedRow() >= 0) {
            this.setCursor(WAIT_CURSOR);
            ProdutoDTO pdto = new ProdutoDTO();
            try {
                // Buscar Produto Selecionado no JTable tabProdutos
                RealizarVendaBO rvbo = new RealizarVendaBO();
                pdto = rvbo.selecionarProdutoPorCodigo(listaCodigo.get(tabProdutos.getSelectedRow()));

                // Prepara dados para inserir na tabela de itens da venda
                String sCodigo = String.valueOf(pdto.getCodigo());
                String sDescricao = pdto.getDescricao();
                String sPreco = String.valueOf(pdto.getPrecoVenda());
                String sQtde = String.valueOf(txtQuantidade.getValue());
                rvbo.validarQtde(sQtde);

                String modelLinha[];
                modelLinha = new String[]{sCodigo, sDescricao, sPreco, sQtde};

                // Verrendo JTable tabItensVenda para verificar se o produto ja foi adicionado anteriormente nesta mesma venda
                DefaultTableModel defaultTableModel = (DefaultTableModel) tabItensVenda.getModel();
                int i = 0;
                while (i < defaultTableModel.getRowCount() && Integer.parseInt((String) defaultTableModel.getValueAt(i, 0)) != pdto.getCodigo()) {
                    i++;
                }
                // Se não encontrar o produto apenas adicionar o produto na TableModel
                if (i >= defaultTableModel.getRowCount()) {
                    defaultTableModel.addRow(modelLinha);
                } else { // Caso o produto já exista na tabela apenas adicionar a quantidade na coluna de quantidade.
                    String sQtdeExistente = String.valueOf(defaultTableModel.getValueAt(i, 3));
                    int iQtdeExistente = Integer.parseInt(sQtdeExistente);
                    int iQtdeAdicionada = Integer.parseInt(sQtde);
                    int iQtdeTotal = iQtdeExistente + iQtdeAdicionada;
                    defaultTableModel.setValueAt(iQtdeTotal, i, 3);
                }
                tabItensVenda.setModel(defaultTableModel);

                // Calcular valor total da Venda
                float fTot = 0;
                for (int j = 0; j < defaultTableModel.getRowCount(); j++) {
                    sPreco = String.valueOf(defaultTableModel.getValueAt(j, 2));
                    sQtde = String.valueOf(defaultTableModel.getValueAt(j, 3));
                    float fPreco = Float.parseFloat(sPreco);
                    float fQtde = Float.parseFloat(sQtde);
                    fTot += fPreco * fQtde;
                }
                lblTotal.setText(decimalFormat.format(fTot));
            } catch (Exception e) {
                e.printStackTrace();
                MensagensUtil.addMsg(null, e.getMessage());
            }
            txtQuantidade.setValue(1);
            this.setCursor(DEFAULT_CURSOR);
        } else {
            MensagensUtil.addMsg(null, "Selecione um produto!!!");
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarActionPerformed
        if (tabItensVenda.getSelectedRow() >= 0) {
            this.setCursor(WAIT_CURSOR);
//            Pegando e retirando os valores da JTable.
            DefaultTableModel defaultTableModel = (DefaultTableModel) tabItensVenda.getModel();
            String sQtdeAtual = String.valueOf(defaultTableModel.getValueAt(tabItensVenda.getSelectedRow(), 3));
            String sQtdeNova = String.valueOf(txtQuantidade.getValue());
            int iQtdeAtual = Integer.parseInt(sQtdeAtual);
            int iQtdeNova = Integer.parseInt(sQtdeNova);
            int iQtde = iQtdeAtual - iQtdeNova > 0 ? iQtdeAtual - iQtdeNova : 0;
            if (iQtde > 0) {
                defaultTableModel.setValueAt(iQtde, tabItensVenda.getSelectedRow(), 3);
            } else {
                defaultTableModel.removeRow(tabItensVenda.getSelectedRow());
            }
            tabItensVenda.setModel(defaultTableModel);
            txtQuantidade.setValue(1);

//            Atualizando total da venda.
            defaultTableModel = (DefaultTableModel) tabItensVenda.getModel();
            float fTot = 0;
            for (int j = 0; j < defaultTableModel.getRowCount(); j++) {
                String sPreco = String.valueOf(defaultTableModel.getValueAt(j, 2));
                String sQtde = String.valueOf(defaultTableModel.getValueAt(j, 3));
                float fPreco = Float.parseFloat(sPreco);
                float fQtde = Float.parseFloat(sQtde);
                fTot += fPreco * fQtde;
            }
            lblTotal.setText(decimalFormat.format(fTot));
            this.setCursor(DEFAULT_CURSOR);
        } else {
            MensagensUtil.addMsg(null, "Selecione um item da venda para ser retirado!");
        }
    }//GEN-LAST:event_btnRetirarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RealizarVendaFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnRetirar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPaneItensVenda;
    private javax.swing.JScrollPane jScrollPaneProdutos;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel pnlTudo;
    private javax.swing.JTable tabItensVenda;
    private javax.swing.JTable tabProdutos;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtComanda;
    private javax.swing.JTextField txtDecricao;
    private javax.swing.JSpinner txtQuantidade;
    // End of variables declaration//GEN-END:variables

    private void initConf() {
        this.setLocationRelativeTo(null);
        Utilidades.AlteraIconeFrame(this,
                new ImageIcon(this.getClass().getResource("/Imagens/icone64x64.png")));

        try {
            ClienteBO cbo = new ClienteBO();
            FestaDTO festa = cbo.buscarFesta();
            this.setTitle(this.getTitle() + " - " + festa.getAtracao());
        } catch (Exception e) {
            e.printStackTrace();
            MensagensUtil.addMsg(null, e.getLocalizedMessage());
        }

        listaCodigo = new ArrayList<Integer>();
        linha = 0;
        btnCancelarActionPerformed(null);
    }
}
