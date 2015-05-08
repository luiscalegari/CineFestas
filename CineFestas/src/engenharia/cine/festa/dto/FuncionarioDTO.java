package engenharia.cine.festa.dto;

/**
 *
 * @author LuisFernando
 */
public class FuncionarioDTO extends ClienteDTO {

    private String _funcao;
    private boolean _disponivel;
    private String _login;
    private String _senha;

    public FuncionarioDTO(String _funcao, boolean _disponivel, String _login, String _senha) {
        super();
        this._funcao = _funcao;
        this._disponivel = _disponivel;
        this._login = _login;
        this._senha = _senha;
    }

    public FuncionarioDTO() {
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
