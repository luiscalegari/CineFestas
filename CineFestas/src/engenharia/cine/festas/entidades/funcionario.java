package engenharia.cine.festas.entidades;

/**
 *
 * @author Luis Fernando Calegari
 * @author Marcel Albertino
 */
public class funcionario extends Cliente {
    
    private String _funcao;
    private boolean _disponivel;
    private String _login;
    private String _senha;

    public funcionario() {
    }

    public String getFuncao() {
        return _funcao;
    }

    public void setFuncao(String _funcao) {
        this._funcao = _funcao;
    }

    public boolean isDisponivel() {
        return _disponivel;
    }

    public void setDisponivel(boolean _disponivel) {
        this._disponivel = _disponivel;
    }

    public String getLogin() {
        return _login;
    }

    public void setLogin(String _login) {
        this._login = _login;
    }

    public String getSenha() {
        return _senha;
    }

    public void setSenha(String _senha) {
        this._senha = _senha;
    }
}
