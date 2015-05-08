package engenharia.cine.festa.bo;

import engenharia.cine.festa.dto.FuncionarioDTO;
import engenharia.cine.festa.util.Designer;
import engenharia.cine.festa.util.Erro;
import engenharia.cine.festa.util.Frame;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.RadioButton;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTextField;

public class ControladoraFuncionario {

    private Frame form;
    private RadioButton rbDisponivel, rbOcupado;
    private boolean opt;
    private JTextField txtBairro, txtCEP, txtCidade, txtCodigo, txtCpf, txtData, txtFuncao, txtLogin, txtNome, txtNumero, txtRg, txtRua, txtSenha;
    private JButton btnAdicionar, btnPesquisar, btnSalvar, btnAlterar, btnExcluir;

    private FuncionarioDTO objeto;
    private Erro erro;

    public ControladoraFuncionario(Frame form, RadioButton rbDisponivel, RadioButton rbOcupado, JTextField txtBairro, JTextField txtCEP, JTextField txtCidade, JTextField txtCodigo, JTextField txtCpf, JTextField txtData, JTextField txtFuncao, JTextField txtLogin, JTextField txtNome, JTextField txtNumero, JTextField txtRg, JTextField txtRua, JTextField txtSenha, JButton btnAdicionar, JButton btnPesquisar, JButton btnSalvar, JButton btnAlterar, JButton btnExcluir) {
        this.form = form;
        this.rbDisponivel = rbDisponivel;
        this.rbOcupado = rbOcupado;
        this.txtBairro = txtBairro;
        this.txtCEP = txtCEP;
        this.txtCidade = txtCidade;
        this.txtCodigo = txtCodigo;
        this.txtCpf = txtCpf;
        this.txtData = txtData;
        this.txtFuncao = txtFuncao;
        this.txtLogin = txtLogin;
        this.txtNome = txtNome;
        this.txtNumero = txtNumero;
        this.txtRg = txtRg;
        this.txtRua = txtRua;
        this.txtSenha = txtSenha;
        this.btnAdicionar = btnAdicionar;
        this.btnPesquisar = btnPesquisar;
        this.btnSalvar = btnSalvar;
        this.btnAlterar = btnAlterar;
        this.btnExcluir = btnExcluir;
    }

    private void iniciar() {
        objeto = null;
        txtBairro.setText("");
        txtCEP.setText("");
        txtCidade.setText("");
        txtCodigo.setText("");
        txtCpf.setText("");
        txtData.setText("");
        txtFuncao.setText("");
        txtLogin.setText("");
        txtNome.setText("");
        txtNumero.setText("");
        txtRg.setText("");
        txtRua.setText("");
        txtSenha.setText("");

        habilitarCampos(true);
        ocultarErros();

        btnAdicionar.setEnabled(true);
        btnPesquisar.setEnabled(true);
        btnSalvar.setEnabled(true);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
    }

    private void habilitarCampos(boolean ok) {

        txtBairro.setEnabled(ok);
        txtCEP.setEnabled(ok);
        txtCidade.setEnabled(ok);
        txtCodigo.setEnabled(false);
        txtCpf.setEnabled(ok);
        txtData.setEnabled(ok);
        txtFuncao.setEnabled(ok);
        txtLogin.setEnabled(ok);
        txtNome.setEnabled(ok);
        txtNumero.setEnabled(ok);
        txtRg.setEnabled(ok);
        txtRua.setEnabled(ok);
        txtSenha.setEnabled(ok);
    }

    private void ocultarErros() {
        Designer.CampoValido(txtBairro);
        Designer.CampoValido(txtCEP);
        Designer.CampoValido(txtCidade);
        Designer.CampoValido(txtCodigo);
        Designer.CampoValido(txtCpf);
        Designer.CampoValido(txtData);
        Designer.CampoValido(txtFuncao);
        Designer.CampoValido(txtLogin);
        Designer.CampoValido(txtNome);
        Designer.CampoValido(txtNumero);
        Designer.CampoValido(txtRg);
        Designer.CampoValido(txtRua);
        Designer.CampoValido(txtSenha);
    }

    private boolean valido() {
        erro = new Erro();
        boolean ok = true;

        if (rbDisponivel.isSelected()) {
            opt = true;
        } else if (rbOcupado.isSelected()) {
            opt = false;
        } else {
            ok = false;
            erro.addErro("Disponibilidade não selecionada!");
        }

        if (txtBairro.getText().trim().isEmpty()) {
            ok = false;
            Designer.CampoInvalido(txtBairro);
            erro.addErro("Bairro inválido!");
        }

        if (txtCEP.getText().trim().isEmpty()) {
            ok = false;
            Designer.CampoInvalido(txtCEP);
            erro.addErro("CEP inválido!");
        }
        if (txtCidade.getText().trim().isEmpty()) {
            ok = false;
            Designer.CampoInvalido(txtCidade);
            erro.addErro("Cidade inválido!");
        }

        if (txtCpf.getText().trim().isEmpty()) {
            ok = false;
            Designer.CampoInvalido(txtCpf);
            erro.addErro("Cpf inválido!");
        }
        if (txtData.getText().trim().isEmpty()) {
            ok = false;
            Designer.CampoInvalido(txtData);
            erro.addErro("Data inválido!");
        }
        if (txtFuncao.getText().trim().isEmpty()) {
            ok = false;
            Designer.CampoInvalido(txtFuncao);
            erro.addErro("Funcao inválido!");
        }
        if (txtLogin.getText().trim().isEmpty()) {
            ok = false;
            Designer.CampoInvalido(txtLogin);
            erro.addErro("Login inválido!");
        }
        if (txtNome.getText().trim().isEmpty()) {
            ok = false;
            Designer.CampoInvalido(txtNome);
            erro.addErro("Nome inválido!");
        }
        if (txtNumero.getText().trim().isEmpty()) {
            ok = false;
            Designer.CampoInvalido(txtNumero);
            erro.addErro("Numero inválido!");
        }
        if (txtRg.getText().trim().isEmpty()) {
            ok = false;
            Designer.CampoInvalido(txtRg);
            erro.addErro("Rg inválido!");
        }
        if (txtRua.getText().trim().isEmpty()) {
            ok = false;
            Designer.CampoInvalido(txtRua);
            erro.addErro("Rua inválido!");
        }
        if (txtSenha.getText().trim().isEmpty()) {
            ok = false;
            Designer.CampoInvalido(txtSenha);
            erro.addErro("Senha inválido!");
        }
        return ok;
    }

    private void carregarObjeto() {

        int codigo = 0;
        if (!txtCodigo.getText().trim().isEmpty()) {
            codigo = Integer.parseInt(txtCodigo.getText());
        }
        objeto = new FuncionarioDTO(
                txtFuncao.getText(),
                opt,
                txtLogin.getText(),
                txtSenha.getText());
    }

    private void carregarFormulario() {
        if (objeto != null) {
            txtCodigo.setText(objeto.getCodigo() + "");
            txtBairro.setText(objeto.getBairro());
            txtCEP.setText(objeto.getCep());
            txtCidade.setText(objeto.getCidade());
            txtCpf.setText(objeto.getCpf());
            txtData.setText(objeto.getDtNascimento().toString());
            txtFuncao.setText(objeto.getFuncao());
            txtLogin.setText(objeto.getLogin());
            txtNome.setText(objeto.getNome());
            txtNumero.setText(objeto.getNumero());
            txtRg.setText(objeto.getRg());
            txtRua.setText(objeto.getEndereco());
            txtSenha.setText(objeto.getSenha());

            habilitarCampos(false);
            btnAdicionar.setEnabled(true);
            btnPesquisar.setEnabled(true);
            btnSalvar.setEnabled(false);
            btnAlterar.setEnabled(true);
            btnExcluir.setEnabled(true);
        }
    }

    public void Novo() {
        iniciar();
    }

    public void Pesquisar() {
    }

    public void Salvar() {
        ocultarErros();
        if (valido()) {
            try {
                if (txtCodigo.getText().trim().isEmpty())//insere
                {
                    carregarObjeto();
                    if (FuncionarioDTO.InserirBanco(objeto)) {
                        Frame.MensagemConfirmacao("Registro inserido com sucesso!");
                        iniciar();
                    } else {
                        Frame.MensagemErro("Registro não inserido!");
                    }
                } else {
                    if (FuncionarioDTO.AlterarBanco(objeto)) {
                        Frame.MensagemConfirmacao("Registro alterado com sucesso!");
                        iniciar();
                    } else {
                        Frame.MensagemErro("Registro não alterado!");
                    }
                }
            } catch (SQLException ex) {
                Frame.MensagemErro("Erro de SQL: " + ex.getMessage());
            }
        } else {
            Frame.MensagemAlerta(erro.exibirErros());
        }
    }

    public void Alterar() {
        habilitarCampos(true);

        btnAdicionar.setEnabled(true);
        btnPesquisar.setEnabled(true);
        btnSalvar.setEnabled(true);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
    }

    public void Excluir() {
        if (Frame.MensagemPergunta("Deseja excluir?")) {
            try {
                carregarObjeto();
                if (FuncionarioDTO.ExcluirBanco(objeto)) {
                    Frame.MensagemConfirmacao("Registro excluído com sucesso!");
                    iniciar();
                }
            } catch (SQLException ex) {
                Frame.MensagemErro("Erro de SQL: " + ex.getMessage());
            }
        }
    }
}
