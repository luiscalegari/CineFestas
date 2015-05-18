package engenharia.cine.festa.gui;

import engenharia.cine.festa.bo.ClienteBO;
import engenharia.cine.festa.dto.ClienteDTO;
import engenharia.cine.festa.util.MensagensUtil;
import engenharia.cine.festa.util.Utilidades;
import static engenharia.cine.festa.util.Utilidades.dateFormat;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Luis Calegari
 */
public class CadClienteFrame extends javax.swing.JFrame {

    private List<Integer> listaCodigo;
    private int linha;

    public CadClienteFrame() {
        initComponents();
        initConf();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grbSexo = new javax.swing.ButtonGroup();
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
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNome = new engenharia.cine.festa.util.JtextFieldSomenteLetras(70);
        txtCpf = new javax.swing.JFormattedTextField();
        txtRG = new javax.swing.JFormattedTextField();
        txtRua = new engenharia.cine.festa.util.JtextFieldSomenteLetras(65);
        txtNumero = new engenharia.cine.festa.util.JtextFieldSomenteNumeros(5);
        txtBairro = new engenharia.cine.festa.util.JtextFieldSomenteLetras(70);
        txtCidade = new engenharia.cine.festa.util.JtextFieldSomenteLetras(45);
        txtCep = new javax.swing.JFormattedTextField();
        cmbEstado = new javax.swing.JComboBox();
        pnlSexo = new javax.swing.JPanel();
        rbFeminino = new javax.swing.JRadioButton();
        rbMasculino = new javax.swing.JRadioButton();
        txtDtNascimento = new javax.swing.JFormattedTextField();
        btnAdicionar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        jLabel16 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JFormattedTextField();
        btnLimparCadastro = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        pnlConsulta = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtNomeConsulta = new engenharia.cine.festa.util.JtextFieldSomenteLetras(70);
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        pnlListagem = new javax.swing.JPanel();
        ScrollListagem = new javax.swing.JScrollPane();
        tabListagem = new javax.swing.JTable();
        txtCpfConsulta = new javax.swing.JFormattedTextField();
        txtRgConsulta = new javax.swing.JFormattedTextField();
        btnPesquisar = new javax.swing.JButton();
        btnLimparPesquisa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Cliente");
        setResizable(false);

        pnlCadastro.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));

        jLabel1.setText("Código:");

        jLabel2.setText("* Nome:");

        jLabel3.setText("* CPF:");

        jLabel4.setText("* RG:");

        jLabel5.setText("Rua:");

        jLabel6.setText("Número:");

        jLabel7.setText("Bairro:");

        jLabel8.setText("* CEP:");

        jLabel9.setText("* Cidade:");

        jLabel10.setText("Estado:");

        jLabel11.setText("* Dt. Nascimento:");

        txtCodigo.setEnabled(false);

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins" }));
        cmbEstado.setSelectedIndex(22);
        cmbEstado.setToolTipText("");

        pnlSexo.setBorder(javax.swing.BorderFactory.createTitledBorder("Sexo"));

        grbSexo.add(rbFeminino);
        rbFeminino.setSelected(true);
        rbFeminino.setText("Feminino");

        grbSexo.add(rbMasculino);
        rbMasculino.setText("Masculino");

        javax.swing.GroupLayout pnlSexoLayout = new javax.swing.GroupLayout(pnlSexo);
        pnlSexo.setLayout(pnlSexoLayout);
        pnlSexoLayout.setHorizontalGroup(
            pnlSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSexoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbFeminino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(rbMasculino)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlSexoLayout.setVerticalGroup(
            pnlSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSexoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbFeminino)
                    .addComponent(rbMasculino))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        try {
            txtDtNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jLabel15.setText("* Telefone");

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) - ########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel16.setText("Celular:");

        try {
            txtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) - #########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

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

        javax.swing.GroupLayout pnlCadastroLayout = new javax.swing.GroupLayout(pnlCadastro);
        pnlCadastro.setLayout(pnlCadastroLayout);
        pnlCadastroLayout.setHorizontalGroup(
            pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCadastroLayout.createSequentialGroup()
                        .addComponent(pnlSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCadastroLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDtNascimento))
                            .addGroup(pnlCadastroLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCelular)))
                        .addGap(6, 6, 6))
                    .addGroup(pnlCadastroLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCadastroLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlCadastroLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome))
                    .addGroup(pnlCadastroLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumero)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCadastroLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRua))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCadastroLayout.createSequentialGroup()
                        .addComponent(btnLimparCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlCadastroLayout.setVerticalGroup(
            pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlCadastroLayout.createSequentialGroup()
                        .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(txtDtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionar)
                    .addComponent(btnSalvar)
                    .addComponent(btnLimparCadastro)
                    .addComponent(btnExcluir)))
        );

        tabPanel.addTab("Cadastro", pnlCadastro);

        pnlConsulta.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));

        jLabel12.setText("Nome:");

        jLabel13.setText("CPF:");

        jLabel14.setText("RG:");

        pnlListagem.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listagem", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(0, 0, 204))); // NOI18N

        ScrollListagem.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tabListagem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {"Nome", "CPF", "RG", "Sexo", "Dt. Nasc.", ""}
        ));
        tabListagem.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ScrollListagem.setViewportView(tabListagem);

        javax.swing.GroupLayout pnlListagemLayout = new javax.swing.GroupLayout(pnlListagem);
        pnlListagem.setLayout(pnlListagemLayout);
        pnlListagemLayout.setHorizontalGroup(
            pnlListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ScrollListagem)
        );
        pnlListagemLayout.setVerticalGroup(
            pnlListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ScrollListagem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
        );

        try {
            txtCpfConsulta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtRgConsulta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

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
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeConsulta))
                    .addGroup(pnlConsultaLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCpfConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addGap(6, 6, 6)
                        .addComponent(txtRgConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(btnLimparPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pnlConsultaLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtCpfConsulta, txtRgConsulta});

        pnlConsultaLayout.setVerticalGroup(
            pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtNomeConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(txtCpfConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRgConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar)
                    .addComponent(btnLimparPesquisa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlListagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlConsultaLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtCpfConsulta, txtRgConsulta});

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
                .addComponent(tabPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTudo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        ClienteDTO clienteDTO = new ClienteDTO();
        ClienteBO clienteBO = new ClienteBO();
        try {
            String sCodigo = !txtCodigo.getText().isEmpty() ? txtCodigo.getText() : "0";
            String sNome = txtNome.getText();
            String sCpf = txtCpf.getText();
            String sRg = txtRG.getText();
            String sRua = txtRua.getText();
            String sNumero = txtNumero.getText();
            String sBairro = txtBairro.getText();
            String sCidade = txtCidade.getText();
            String sSexo = rbFeminino.isSelected() ? "F" : "M";
            String sCep = txtCep.getText();
            String sDtNascimento = txtDtNascimento.getText();
            String sFone = txtTelefone.getText() + txtCelular.getText();
            String sEstado = cmbEstado.getSelectedItem().toString();
            String sTelefone = txtTelefone.getText();
            String sCelular = txtCelular.getText();

            clienteBO.validaNome(sNome);
            clienteBO.validaCpf(sCpf);
            clienteBO.validaRg(sRg);
            clienteBO.validaCidade(sCidade);
            clienteBO.validaCep(sCep);
            clienteBO.validaDtNasc(sDtNascimento);
            clienteBO.validaFone(sFone);

            clienteDTO.setBairro(sBairro);
            clienteDTO.setCep(sCep);
            clienteDTO.setCidade(sCidade);
            clienteDTO.setCodigo(Integer.parseInt(sCodigo));
            clienteDTO.setCpf(sCpf);
            clienteDTO.setDtCadastro(new Date());
            clienteDTO.setDtNascimento(dateFormat.parse(sDtNascimento));
            clienteDTO.setEndereco(!sRua.isEmpty() ? sRua
                    + (!sNumero.isEmpty() ? ", " + sNumero : "") : "");
            clienteDTO.setEstado(sEstado);
            clienteDTO.setInadimplencia(false);
            clienteDTO.setNome(sNome);
            clienteDTO.setRg(sRg);
            clienteDTO.setSexo(sSexo.charAt(0));
            clienteDTO.setTelefone(sTelefone);
            clienteDTO.setCelular(sCelular);

            clienteBO.cadastrar(clienteDTO);
            MensagensUtil.addMsg(this, "Cadastro efetuado com sucesso !!!");
            btnLimparPesquisaActionPerformed(evt);
        } catch (Exception e) {
            e.printStackTrace();
            MensagensUtil.addMsg(this, e.getMessage());
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        getTableListPesquisa();
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnLimparPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparPesquisaActionPerformed
        txtCodigo.setText("");
        txtNome.setText("");
        txtCpf.setText("");
        txtRG.setText("");
        txtRua.setText("");
        txtNumero.setText("");
        txtBairro.setText("");
        txtCidade.setText("");
        cmbEstado.setSelectedIndex(22);
        rbFeminino.setSelected(true);
        txtCep.setText("");
        txtDtNascimento.setText("");
        txtNomeConsulta.setText("");
        txtCpfConsulta.setText("");
        txtRgConsulta.setText("");
        txtCelular.setText("");
        txtTelefone.setText("");
        tabListagem.setModel(
                new DefaultTableModel(
                        new Object[][]{},
                        new String[]{"Nome", "CPF", "RG", "Sexo", "Dt. Nasc.", ""}));
        Utilidades.habilitaComponentes(new Component[]{btnAdicionar});
        Utilidades.desabilitaComponentes(new Component[]{btnExcluir, btnSalvar});
    }//GEN-LAST:event_btnLimparPesquisaActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        ClienteBO clienteBO = new ClienteBO();
        ClienteDTO clienteDTO = new ClienteDTO();
        try {
            String sCodigo = !txtCodigo.getText().isEmpty() ? txtCodigo.getText() : "0";
            String sNome = txtNome.getText();
            String sCpf = txtCpf.getText();
            String sRg = txtRG.getText();
            String sRua = txtRua.getText();
            String sNumero = txtNumero.getText();
            String sBairro = txtBairro.getText();
            String sCidade = txtCidade.getText();
            String sSexo = rbFeminino.isSelected() ? "F" : "M";
            String sCep = txtCep.getText();
            String sDtNascimento = txtDtNascimento.getText();
            String sFone = txtTelefone.getText() + txtCelular.getText();
            String sEstado = cmbEstado.getSelectedItem().toString();
            String sTelefone = txtTelefone.getText();
            String sCelular = txtCelular.getText();

            clienteBO.validaNome(sNome);
            clienteBO.validaCpf(sCpf);
            clienteBO.validaRg(sRg);
            clienteBO.validaCidade(sCidade);
            clienteBO.validaCep(sCep);
            clienteBO.validaDtNasc(sDtNascimento);
            clienteBO.validaFone(sFone);

            clienteDTO.setBairro(sBairro);
            clienteDTO.setCep(sCep);
            clienteDTO.setCidade(sCidade);
            clienteDTO.setCodigo(Integer.parseInt(sCodigo));
            clienteDTO.setCpf(sCpf);
            clienteDTO.setDtCadastro(new Date());
            clienteDTO.setDtNascimento(dateFormat.parse(sDtNascimento));
            clienteDTO.setEndereco(!sRua.isEmpty() ? sRua
                    + (!sNumero.isEmpty() ? ", " + sNumero : "") : "");
            clienteDTO.setEstado(sEstado);
            clienteDTO.setInadimplencia(false);
            clienteDTO.setNome(sNome);
            clienteDTO.setRg(sRg);
            clienteDTO.setSexo(sSexo.charAt(0));
            clienteDTO.setTelefone(sTelefone);
            clienteDTO.setCelular(sCelular);

            clienteBO.salvar(clienteDTO);
            MensagensUtil.addMsg(null, "Cliente alterado com sucesso !!!");
        } catch (Exception e) {
            e.printStackTrace();
            MensagensUtil.addMsg(null, e.getMessage());
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        ClienteBO clienteBO = new ClienteBO();
        try {
            String sCodigo = !txtCodigo.getText().isEmpty() ? txtCodigo.getText() : "0";
            clienteBO.excluir(Integer.parseInt(sCodigo));
            MensagensUtil.addMsg(null, "Cliente excluído com sucesso !!!");
            btnLimparPesquisaActionPerformed(evt);
            listaCodigo.remove(linha);
        } catch (Exception e) {
            e.printStackTrace();
            MensagensUtil.addMsg(null, e.getMessage());
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadClienteFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollListagem;
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimparCadastro;
    private javax.swing.JButton btnLimparPesquisa;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox cmbEstado;
    private javax.swing.ButtonGroup grbSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel pnlCadastro;
    private javax.swing.JPanel pnlConsulta;
    private javax.swing.JPanel pnlListagem;
    private javax.swing.JPanel pnlSexo;
    private javax.swing.JPanel pnlTudo;
    private javax.swing.JRadioButton rbFeminino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JTable tabListagem;
    private javax.swing.JTabbedPane tabPanel;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCelular;
    private javax.swing.JFormattedTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JFormattedTextField txtCpfConsulta;
    private javax.swing.JFormattedTextField txtDtNascimento;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeConsulta;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JFormattedTextField txtRG;
    private javax.swing.JFormattedTextField txtRgConsulta;
    private javax.swing.JTextField txtRua;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    private void initConf() {
        this.setLocationRelativeTo(null);
        Utilidades.AlteraIconeFrame(this,
                new ImageIcon(this.getClass().getResource("/Imagens/icone64x64.png")));
        listaCodigo = new ArrayList<>();
        linha = 0;
        Utilidades.desabilitaComponentes(new Component[]{btnSalvar, btnExcluir});
    }

    private JTable getTableListPesquisa() {
        String sNome = txtNomeConsulta.getText();
        String sCpf = txtCpfConsulta.getText();
        String sRg = txtRgConsulta.getText();

        final ClienteBO clienteBO = new ClienteBO();
        try {
            String[][] listaCliente = clienteBO.listaPesquisa(sNome, sCpf, sRg, listaCodigo);
            TableModel model = new DefaultTableModel(listaCliente,
                    new String[]{"Nome", "CPF", "RG", "Sexo", "Dt. Nasc.", ""});
            tabListagem.setModel(model);
            Action actionSelect = new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    try {
                        JTable table = (JTable) actionEvent.getSource();
                        linha = Integer.parseInt(actionEvent.getActionCommand());
                        if ((JOptionPane.showConfirmDialog(null, "Deseja alterar esse cliente?")) == JOptionPane.OK_OPTION) {
                            ClienteDTO clienteDTO = clienteBO.selecionaPorCodigo(listaCodigo.get(linha));
                            btnLimparPesquisaActionPerformed(actionEvent);
                            tabPanel.setSelectedIndex(0);
                            txtBairro.setText(clienteDTO.getBairro());
                            txtCelular.setText(clienteDTO.getCelular());
                            txtCep.setText(clienteDTO.getCep());
                            txtCidade.setText(clienteDTO.getCidade());
                            txtCodigo.setText(String.valueOf(clienteDTO.getCodigo()));
                            txtCpf.setText(clienteDTO.getCpf());
                            txtDtNascimento.setText(dateFormat.format(clienteDTO.getDtNascimento()));
                            txtNome.setText(clienteDTO.getNome());
                            txtNumero.setText(clienteDTO.getEndereco().split(",")[1]);
                            txtRG.setText(clienteDTO.getRg());
                            txtRua.setText(clienteDTO.getEndereco().split(",")[0]);
                            txtTelefone.setText(clienteDTO.getTelefone());
                            Utilidades.desabilitaComponentes(new Component[]{btnAdicionar});
                            Utilidades.habilitaComponentes(new Component[]{btnExcluir, btnSalvar});
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        MensagensUtil.addMsg(null, e.getMessage());
                    }
                }
            };
            ButtonColumn buttonColumn = new ButtonColumn(tabListagem, actionSelect, 5);
        } catch (Exception e) {
            e.printStackTrace();
            MensagensUtil.addMsg(null, e.getMessage());
        }
        return tabListagem;
    }
}
