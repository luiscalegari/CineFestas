package engenharia.cine.festa.dto;

import java.util.Date;

/**
 *
 * @author LuisFernando
 */
public class ClienteDTO {

    private Integer _codigo;
    private String _nome;
    private String _cep;
    private String _endereco;
    private String _bairro;
    private String _cidade;
    private String _cpf;
    private String _rg;
    private Character _sexo;
    private Date _dtNascimento;
    private Date _dtCadastro;
    private boolean _inadimplencia;
    private String _estado;

    public ClienteDTO() {
    }

    public Integer getCodigo() {
        return _codigo;
    }

    public void setCodigo(Integer _codigo) {
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

    public Character getSexo() {
        return _sexo;
    }

    public void setSexo(Character _sexo) {
        this._sexo = _sexo;
    }

    public Date getDtNascimento() {
        return _dtNascimento;
    }

    public void setDtNascimento(Date _dtNascimento) {
        this._dtNascimento = _dtNascimento;
    }

    public Date getDtCadastro() {
        return _dtCadastro;
    }

    public void setDtCadastro(Date _dtCadastro) {
        this._dtCadastro = _dtCadastro;
    }

    public boolean isInadimplencia() {
        return _inadimplencia;
    }

    public void setInadimplencia(boolean _inadimplencia) {
        this._inadimplencia = _inadimplencia;
    }

    public String getEstado() {
        return _estado;
    }

    public void setEstado(String _estado) {
        this._estado = _estado;
    }
}
