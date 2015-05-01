
package engenharia.cine.festas.entidades;

import java.util.Date;

/**
 *
 * @author Luis Fernando Calegari
 * @author Marcel Albertino
 */
public class Cliente {
    private int _codigo;
    private String _nome;
    private String _cep;
    private String _endereco;
    private String _bairro;
    private String _cidade;
    private String _cpf;
    private String _rg;
    private char _sexo;
    private Date _dtnascimento;
    private Date _dtcadastro;
    private boolean _inadimplencia;

    public Cliente() {
    }

    public int getCodigo() {
        return _codigo;
    }

    public void setCodigo(int _codigo) {
        this._codigo = _codigo;
    }

    public String getNome() {
        return _nome;
    }

    public void setNome(String _nome) {
        this._nome = _nome;
    }

    public String getCep() {
        return _cep;
    }

    public void setCep(String _cep) {
        this._cep = _cep;
    }

    public String getEndereco() {
        return _endereco;
    }

    public void setEndereco(String _endereco) {
        this._endereco = _endereco;
    }

    public String getBairro() {
        return _bairro;
    }

    public void setBairro(String _bairro) {
        this._bairro = _bairro;
    }

    public String getCidade() {
        return _cidade;
    }

    public void setCidade(String _cidade) {
        this._cidade = _cidade;
    }

    public String getCpf() {
        return _cpf;
    }

    public void setCpf(String _cpf) {
        this._cpf = _cpf;
    }

    public String getRg() {
        return _rg;
    }

    public void setRg(String _rg) {
        this._rg = _rg;
    }

    public char getSexo() {
        return _sexo;
    }

    public void setSexo(char _sexo) {
        this._sexo = _sexo;
    }

    public Date getDtnascimento() {
        return _dtnascimento;
    }

    public void setDtnascimento(Date _dtnascimento) {
        this._dtnascimento = _dtnascimento;
    }

    public Date getDtcadastro() {
        return _dtcadastro;
    }

    public void setDtcadastro(Date _dtcadastro) {
        this._dtcadastro = _dtcadastro;
    }

    public boolean isInadimplencia() {
        return _inadimplencia;
    }

    public void setInadimplencia(boolean _inadimplencia) {
        this._inadimplencia = _inadimplencia;
    }
}
