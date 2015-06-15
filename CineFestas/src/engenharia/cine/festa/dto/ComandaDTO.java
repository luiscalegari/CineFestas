package engenharia.cine.festa.dto;

/**
 *
 * @author Luis Calegari
 */
public class ComandaDTO {
    private Integer _numero;
    private boolean _status;

    public ComandaDTO() {
    }

    public Integer getNumero() {
        return _numero;
    }

    public void setNumero(Integer _numero) {
        this._numero = _numero;
    }

    public boolean isStatus() {
        return _status;
    }

    public void setStatus(boolean _status) {
        this._status = _status;
    }
}
