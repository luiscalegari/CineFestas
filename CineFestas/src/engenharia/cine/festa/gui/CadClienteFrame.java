package engenharia.cine.festa.gui;

import engenharia.cine.festa.bo.ClienteBO;
import engenharia.cine.festa.dto.ClienteDTO;
import engenharia.cine.festa.util.MensagensUtil;
import engenharia.cine.festa.util.Utilidades;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author LuisFernando
 */
public class CadClienteFrame extends javax.swing.JFrame {

    private final SimpleDateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy");

    public CadClienteFrame() {
        initComponents();
        initConf();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgSexo = new javax.swing.ButtonGroup();
        pnlTudo = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
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
        txtNome = new javax.swing.JTextField();
        txtRua = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        cmbEstado = new javax.swing.JComboBox();
        pnlSexo = new javax.swing.JPanel();
        rbMasculino = new javax.swing.JRadioButton();
        rbFeminino = new javax.swing.JRadioButton();
        txtDtNascimento = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        jSeparator = new javax.swing.JSeparator();
        txtCpf = new javax.swing.JFormattedTextField();
        txtRg = new javax.swing.JFormattedTextField();
        txtCep = new javax.swing.JFormattedTextField();
        pnlListagem = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cliente");

        pnlCadastro.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Cliente")));

        jLabel1.setText("Código:");

        jLabel2.setText("Nome:");

        jLabel3.setText("CPF:");

        jLabel4.setText("RG:");

        jLabel5.setText("Cep");

        jLabel6.setText("Rua:");

        jLabel7.setText("Número:");

        jLabel8.setText("Bairro:");

        jLabel9.setText("Cidade:");

        jLabel10.setText("Estado:");

        jLabel11.setText("Data de Nascimento:");

        txtCodigo.setEditable(false);

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins" }));
        cmbEstado.setSelectedIndex(22);
        cmbEstado.setToolTipText("");

        pnlSexo.setBorder(javax.swing.BorderFactory.createTitledBorder("Sexo"));

        bgSexo.add(rbMasculino);
        rbMasculino.setSelected(true);
        rbMasculino.setText("Masculino");

        bgSexo.add(rbFeminino);
        rbFeminino.setText("Feminino");

        javax.swing.GroupLayout pnlSexoLayout = new javax.swing.GroupLayout(pnlSexo);
        pnlSexo.setLayout(pnlSexoLayout);
        pnlSexoLayout.setHorizontalGroup(
            pnlSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSexoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbFeminino)
                    .addComponent(rbMasculino))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlSexoLayout.setVerticalGroup(
            pnlSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSexoLayout.createSequentialGroup()
                .addComponent(rbMasculino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbFeminino))
        );

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");

        btnSalvar.setText("Salvar");

        btnPesquisar.setText("Pesquisar");

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout pnlCadastroLayout = new javax.swing.GroupLayout(pnlCadastro);
        pnlCadastro.setLayout(pnlCadastroLayout);
        pnlCadastroLayout.setHorizontalGroup(
            pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroLayout.createSequentialGroup()
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCadastroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCadastroLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNome))
                            .addGroup(pnlCadastroLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRg))
                            .addGroup(pnlCadastroLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumero))
                            .addGroup(pnlCadastroLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBairro))
                            .addGroup(pnlCadastroLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(pnlCadastroLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDtNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel11)
                            .addComponent(txtCep))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCadastroLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnPesquisar)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCadastrar)))
                .addContainerGap())
            .addComponent(jSeparator, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pnlCadastroLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCadastrar, btnExcluir, btnLimpar, btnPesquisar, btnSalvar});

        pnlCadastroLayout.setVerticalGroup(
            pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlCadastroLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(1, 1, 1)
                        .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Cadastro", pnlCadastro);

        javax.swing.GroupLayout pnlListagemLayout = new javax.swing.GroupLayout(pnlListagem);
        pnlListagem.setLayout(pnlListagemLayout);
        pnlListagemLayout.setHorizontalGroup(
            pnlListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 499, Short.MAX_VALUE)
        );
        pnlListagemLayout.setVerticalGroup(
            pnlListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 336, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Listagem", pnlListagem);

        javax.swing.GroupLayout pnlTudoLayout = new javax.swing.GroupLayout(pnlTudo);
        pnlTudo.setLayout(pnlTudoLayout);
        pnlTudoLayout.setHorizontalGroup(
            pnlTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTudoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        pnlTudoLayout.setVerticalGroup(
            pnlTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTudoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtBairro.setText("");
        txtCep.setText("");
        txtCidade.setText("");
        txtCodigo.setText("");
        txtCpf.setText("");
        txtDtNascimento.setText("");
        txtNome.setText("");
        txtNumero.setText("");
        txtRg.setText("");
        txtRua.setText("");
        rbMasculino.setSelected(true);
        cmbEstado.setSelectedIndex(22);
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        ClienteDTO clienteDTO = new ClienteDTO();
        try {
            clienteDTO.setBairro(txtBairro.getText());
            clienteDTO.setCep(txtCep.getText());
            clienteDTO.setCidade(txtCidade.getText());
            clienteDTO.setCodigo(!txtCodigo.getText().isEmpty() ? Integer.parseInt(txtCodigo.getText()) : 0);
            clienteDTO.setCpf(txtCpf.getText());
            clienteDTO.setDtNascimento(!txtDtNascimento.getText().isEmpty() ? dataFormat.parse(txtDtNascimento.getText()) : dataFormat.parse(new Date().toString()));
            clienteDTO.setEndereco(!txtRua.getText().isEmpty() && !txtNumero.getText().isEmpty() ? txtRua.getText() + ", " + txtNumero.getText() : "");
            clienteDTO.setNome(txtNome.getText());
            clienteDTO.setRg(txtRg.getText());
            clienteDTO.setSexo(rbMasculino.isSelected() ? 'M' : 'F');
            clienteDTO.setEstado(cmbEstado.getSelectedItem().toString());

            ClienteBO clienteBO = new ClienteBO();
            clienteBO.cadastrar(clienteDTO);
            MensagensUtil.addMsg(this, "Cadastro efetuado com sucesso!!!");
        } catch (Exception e) {
            e.printStackTrace();
            MensagensUtil.addMsg(this, e.getMessage());
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadClienteFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgSexo;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox cmbEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel pnlCadastro;
    private javax.swing.JPanel pnlListagem;
    private javax.swing.JPanel pnlSexo;
    private javax.swing.JPanel pnlTudo;
    private javax.swing.JRadioButton rbFeminino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtDtNascimento;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JFormattedTextField txtRg;
    private javax.swing.JTextField txtRua;
    // End of variables declaration//GEN-END:variables

    private void initConf() {
        this.setLocationRelativeTo(null);
        Utilidades.AlteraIconeFrame(this, new ImageIcon(this.getClass().getResource("/Imagens/icone64x64.png")));
        MaskFormatter mask = null;
        try {
            mask = new MaskFormatter("##/##/####");
            mask.setValueContainsLiteralCharacters(false);
        } catch (Exception e) {
        }
        
    }
}
