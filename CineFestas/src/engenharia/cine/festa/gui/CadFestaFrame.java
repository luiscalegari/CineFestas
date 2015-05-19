package engenharia.cine.festa.gui;

import engenharia.cine.festa.bo.FestaBO;
import engenharia.cine.festa.dto.FestaDTO;
import engenharia.cine.festa.util.MensagensUtil;
import engenharia.cine.festa.util.Utilidades;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Luis Calegari
 */
public class CadFestaFrame extends javax.swing.JFrame {

    public final DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    private List<Integer> listaCodigo;
    private int linha;

    public CadFestaFrame() {
        initComponents();
        initConf();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTudo = new javax.swing.JPanel();
        tabPanel = new javax.swing.JTabbedPane();
        pnlCadastro = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtDtEvento = new javax.swing.JFormattedTextField();
        txtDtConcepcao = new javax.swing.JFormattedTextField();
        txtAtracao = new engenharia.cine.festa.util.JtextFieldSomenteLetras(200);
        jScrollPane = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        txtResposaveisEvento = new engenharia.cine.festa.util.JtextFieldSomenteLetras(140);
        jLabel8 = new javax.swing.JLabel();
        SpinnerNumberModel modelInvetimentoInicial = new SpinnerNumberModel();
        modelInvetimentoInicial.setMinimum(0);
        txtInvestimentoInicial = new javax.swing.JSpinner(modelInvetimentoInicial);
        SpinnerNumberModel modelPublicoEsperado = new SpinnerNumberModel();
        modelPublicoEsperado.setMinimum(0);
        txtPublicoEsperado = new javax.swing.JSpinner(modelPublicoEsperado);
        btnLimparCadastro = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        pnlConsulta = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtDtEventoConsulta = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        txtAtracaoConsulta = new engenharia.cine.festa.util.JtextFieldSomenteLetras(200);
        pnlListagem = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabListagem = new javax.swing.JTable();
        btnPesquisar = new javax.swing.JButton();
        btnLimparPesquisa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Festas");
        setResizable(false);

        pnlCadastro.setBorder(javax.swing.BorderFactory.createTitledBorder("Festa"));

        jLabel1.setText("Código:");

        jLabel2.setText("* Dt. Evento:");

        jLabel3.setText("Dt. Concepção:");

        jLabel4.setText("* Descrição:");

        jLabel5.setText("* Atração:");

        jLabel6.setText("Público esperado:");

        jLabel7.setText("* Resposáveis Evento:");

        txtCodigo.setEnabled(false);

        try {
            txtDtEvento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtDtConcepcao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtDescricao.setColumns(20);
        txtDescricao.setLineWrap(true);
        txtDescricao.setRows(5);
        jScrollPane.setViewportView(txtDescricao);

        jLabel8.setText("Investimento inicial:");

        btnLimparCadastro.setText("Limpar");
        btnLimparCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparPesquisaActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        jLabel17.setForeground(new java.awt.Color(153, 0, 0));
        jLabel17.setText("IMPORTANTE: Campos que estão marcados com o caracter * são de preenchimento obrigatório.");

        javax.swing.GroupLayout pnlCadastroLayout = new javax.swing.GroupLayout(pnlCadastro);
        pnlCadastro.setLayout(pnlCadastroLayout);
        pnlCadastroLayout.setHorizontalGroup(
            pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDtEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDtConcepcao, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(pnlCadastroLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAtracao)
                .addContainerGap())
            .addGroup(pnlCadastroLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane)
                .addGap(10, 10, 10))
            .addGroup(pnlCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtInvestimentoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPublicoEsperado, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtResposaveisEvento, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCadastroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimparCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(pnlCadastroLayout.createSequentialGroup()
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCadastroLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4))
                    .addGroup(pnlCadastroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel17)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlCadastroLayout.setVerticalGroup(
            pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(txtDtEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDtConcepcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtAtracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtInvestimentoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(txtResposaveisEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPublicoEsperado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionar)
                    .addComponent(btnSalvar)
                    .addComponent(btnLimparCadastro)
                    .addComponent(btnExcluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17))
        );

        tabPanel.addTab("Cadastro", pnlCadastro);

        pnlConsulta.setBorder(javax.swing.BorderFactory.createTitledBorder("Festa"));

        jLabel10.setText(" Dt. Evento:");

        try {
            txtDtEventoConsulta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel9.setText("Atração:");

        pnlListagem.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listagem", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(0, 0, 204))); // NOI18N

        tabListagem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {"Dt. Evento", "Atração", "Responsáveis", ""}));
    jScrollPane1.setViewportView(tabListagem);

    javax.swing.GroupLayout pnlListagemLayout = new javax.swing.GroupLayout(pnlListagem);
    pnlListagem.setLayout(pnlListagemLayout);
    pnlListagemLayout.setHorizontalGroup(
        pnlListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
    );
    pnlListagemLayout.setVerticalGroup(
        pnlListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
    );

    btnPesquisar.setText("Pesquisar");
    btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnPesquisarActionPerformed(evt);
        }
    });

    btnLimparPesquisa.setText("Limpar");
    btnLimparPesquisa.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnLimparPesquisaActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout pnlConsultaLayout = new javax.swing.GroupLayout(pnlConsulta);
    pnlConsulta.setLayout(pnlConsultaLayout);
    pnlConsultaLayout.setHorizontalGroup(
        pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(pnlConsultaLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlListagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlConsultaLayout.createSequentialGroup()
                    .addComponent(jLabel10)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtDtEventoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel9)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtAtracaoConsulta))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlConsultaLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(btnLimparPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap())
    );
    pnlConsultaLayout.setVerticalGroup(
        pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(pnlConsultaLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel10)
                .addComponent(txtDtEventoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel9)
                .addComponent(txtAtracaoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnPesquisar)
                .addComponent(btnLimparPesquisa))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(pnlListagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
    );

    tabPanel.addTab("Consulta", pnlConsulta);

    javax.swing.GroupLayout pnlTudoLayout = new javax.swing.GroupLayout(pnlTudo);
    pnlTudo.setLayout(pnlTudoLayout);
    pnlTudoLayout.setHorizontalGroup(
        pnlTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(pnlTudoLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(tabPanel)
            .addContainerGap())
    );
    pnlTudoLayout.setVerticalGroup(
        pnlTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(pnlTudoLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(tabPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnLimparPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparPesquisaActionPerformed
        txtCodigo.setText("");
        txtDtEvento.setText(dateFormat.format(new Date()));
        txtDtConcepcao.setText(dateFormat.format(new Date()));
        txtAtracao.setText("");
        txtDescricao.setText("");
        txtInvestimentoInicial.setValue(0);
        txtPublicoEsperado.setValue(0);
        txtResposaveisEvento.setText("");
        txtDtEventoConsulta.setText("");
        txtAtracaoConsulta.setText("");
        tabListagem.setModel(
                new DefaultTableModel(
                        new Object[][]{},
                        new String[]{"Dt. Evento", "Atração", "Responsáveis", ""}));
        Utilidades.habilitaComponentes(new Component[]{btnAdicionar});
        Utilidades.desabilitaComponentes(new Component[]{btnExcluir, btnSalvar});
        txtAtracao.grabFocus();
    }//GEN-LAST:event_btnLimparPesquisaActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        FestaBO festaBO = new FestaBO();
        FestaDTO festaDTO = new FestaDTO();
        try {
            String sCodigo = txtCodigo.getText().isEmpty() ? "0" : txtCodigo.getText();
            String sDtEvento = txtDtEvento.getText();
            String sDtConcepcao = txtDtConcepcao.getText();
            String sAtracao = txtAtracao.getText();
            String sDescricao = txtDescricao.getText();
            String sInvestimentoInicial = String.valueOf(txtInvestimentoInicial.getValue());
            String sPublicoEsperado = String.valueOf(txtPublicoEsperado.getValue());
            String sResponsaveisEvento = txtResposaveisEvento.getText();

            festaBO.validaDtEvento(sDtEvento);
            festaBO.validaDtEvento(sDtEvento, sDtConcepcao);
            festaBO.validaAtracao(sAtracao);
            festaBO.validaDescricao(sDescricao);
            festaBO.validaResponsaveisEvento(sResponsaveisEvento);

            festaDTO.setCodigo(Integer.parseInt(sCodigo));
            festaDTO.setDtevento(Utilidades.dateFormat.parse(sDtEvento));
            festaDTO.setDtconcepcao(Utilidades.dateFormat.parse(sDtConcepcao));
            festaDTO.setDtcadastro(new Date());
            festaDTO.setAtracao(sAtracao);
            festaDTO.setDescricao(sDescricao);
            festaDTO.setPublicoEsperado(Integer.parseInt(sPublicoEsperado));
            festaDTO.setInvestimentoInicial(Float.parseFloat(sInvestimentoInicial));
            festaDTO.setResponsaveisEvento(sResponsaveisEvento);

            festaBO.cadastrar(festaDTO);
            MensagensUtil.addMsg(null, "Festa cadastrada com sucesso !!!");
            btnLimparPesquisaActionPerformed(evt);
        } catch (Exception e) {
            e.printStackTrace();
            MensagensUtil.addMsg(null, e.getMessage());
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        getTableListPesquisa();
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        FestaBO festaBO = new FestaBO();
        try {
            String sCodigo = !txtCodigo.getText().isEmpty() ? txtCodigo.getText() : "0";
            festaBO.excluir(Integer.parseInt(sCodigo));
            MensagensUtil.addMsg(null, "Festa excluída com sucesso !!!");
            btnLimparPesquisaActionPerformed(evt);
            listaCodigo.remove(linha);
        } catch (Exception e) {
            e.printStackTrace();
            MensagensUtil.addMsg(null, e.getMessage());
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        FestaBO festaBO = new FestaBO();
        FestaDTO festaDTO = new FestaDTO();
        try {
            String sCodigo = txtCodigo.getText().isEmpty() ? "0" : txtCodigo.getText();
            String sDtEvento = txtDtEvento.getText();
            String sDtConcepcao = txtDtConcepcao.getText();
            String sAtracao = txtAtracao.getText();
            String sDescricao = txtDescricao.getText();
            String sInvestimentoInicial = String.valueOf(txtInvestimentoInicial.getValue());
            String sPublicoEsperado = String.valueOf(txtPublicoEsperado.getValue());
            String sResponsaveisEvento = txtResposaveisEvento.getText();

            festaBO.validaDtEvento(sDtEvento);
            festaBO.validaDtEvento(sDtEvento, sDtConcepcao);
            festaBO.validaAtracao(sAtracao);
            festaBO.validaDescricao(sDescricao);
            festaBO.validaResponsaveisEvento(sResponsaveisEvento);

            festaDTO.setCodigo(Integer.parseInt(sCodigo));
            festaDTO.setDtevento(Utilidades.dateFormat.parse(sDtEvento));
            festaDTO.setDtconcepcao(Utilidades.dateFormat.parse(sDtConcepcao));
            festaDTO.setDtcadastro(new Date());
            festaDTO.setAtracao(sAtracao);
            festaDTO.setDescricao(sDescricao);
            festaDTO.setPublicoEsperado(Integer.parseInt(sPublicoEsperado));
            festaDTO.setInvestimentoInicial(Float.parseFloat(sInvestimentoInicial));
            festaDTO.setResponsaveisEvento(sResponsaveisEvento);
            
            festaBO.salvar(festaDTO);
            MensagensUtil.addMsg(null, "Festa Alterada com sucesso !!!");
            btnLimparPesquisaActionPerformed(null);
        } catch (Exception e) {
            e.printStackTrace();
            MensagensUtil.addMsg(null, e.getMessage());
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadFestaFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimparCadastro;
    private javax.swing.JButton btnLimparPesquisa;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlCadastro;
    private javax.swing.JPanel pnlConsulta;
    private javax.swing.JPanel pnlListagem;
    private javax.swing.JPanel pnlTudo;
    private javax.swing.JTable tabListagem;
    private javax.swing.JTabbedPane tabPanel;
    private javax.swing.JTextField txtAtracao;
    private javax.swing.JTextField txtAtracaoConsulta;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JFormattedTextField txtDtConcepcao;
    private javax.swing.JFormattedTextField txtDtEvento;
    private javax.swing.JFormattedTextField txtDtEventoConsulta;
    private javax.swing.JSpinner txtInvestimentoInicial;
    private javax.swing.JSpinner txtPublicoEsperado;
    private javax.swing.JTextField txtResposaveisEvento;
    // End of variables declaration//GEN-END:variables

    private void initConf() {
        this.setLocationRelativeTo(null);
        Utilidades.AlteraIconeFrame(this,
                new ImageIcon(this.getClass().getResource("/Imagens/icone64x64.png")));
        listaCodigo = new ArrayList<Integer>();
        linha = 0;
        btnLimparPesquisaActionPerformed(null);
    }

    private void getTableListPesquisa() {
        String sDtEvento = txtDtEventoConsulta.getText();
        String sAtracao = txtAtracaoConsulta.getText();

        final FestaBO festaBO = new FestaBO();
        try {
            String[][] listaFesta = festaBO.listaPesquisa(sDtEvento, sAtracao, listaCodigo);
            TableModel model = new DefaultTableModel(listaFesta,
                    new String[]{"Dt. Evento", "Atração", "Responsáveis", ""});
            tabListagem.setModel(model);
            Action actionSelecionar = new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    try {
                        JTable table = (JTable) actionEvent.getSource();
                        linha = Integer.parseInt(actionEvent.getActionCommand());
                        if ((JOptionPane.showConfirmDialog(null, "Deseja alterar os dados desse evento ?")) == JOptionPane.OK_OPTION) {
                            FestaDTO festaDTO = festaBO.selecionarPorCodigo(listaCodigo.get(linha));
                            btnLimparPesquisaActionPerformed(actionEvent);
                            tabPanel.setSelectedIndex(0);
                            txtAtracao.setText(festaDTO.getAtracao());
                            txtCodigo.setText(String.valueOf(festaDTO.getCodigo()));
                            txtDescricao.setText(festaDTO.getDescricao());
                            txtDtConcepcao.setText(Utilidades.dateFormat.format(festaDTO.getDtconcepcao()));
                            txtDtEvento.setText(Utilidades.dateFormat.format(festaDTO.getDtevento()));
                            txtInvestimentoInicial.setValue(festaDTO.getInvestimentoInicial());
                            txtPublicoEsperado.setValue(festaDTO.getPublicoEsperado());
                            txtResposaveisEvento.setText(festaDTO.getResponsaveisEvento());
                            Utilidades.desabilitaComponentes(new Component[]{btnAdicionar});
                            Utilidades.habilitaComponentes(new Component[]{btnExcluir, btnSalvar});
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        MensagensUtil.addMsg(null, e.getMessage());
                    }
                }
            };
            ButtonColumn buttonColumn = new ButtonColumn(tabListagem, actionSelecionar, 3);
        } catch (Exception e) {
            e.printStackTrace();
            MensagensUtil.addMsg(null, e.getMessage());
        }
    }
}
