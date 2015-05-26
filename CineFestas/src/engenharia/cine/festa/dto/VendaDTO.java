package engenharia.cine.festa.dto;

/**
 *
 * @author Luis Calegari
 */
public class VendaDTO {
    private Integer _numero;
    private Integer _comanda;
    private Float _total;

    public VendaDTO() {
    }

    public Integer getNumero() {
        return _numero;
    }

    public void setNumero(Integer _numero) {
        this._numero = _numero;
    }

    public Integer getComanda() {
        return _comanda;
    }

    public void setComanda(Integer _comanda) {
        this._comanda = _comanda;
    }

    public Float getTotal() {
        return _total;
    }

    public void setTotal(Float _total) {
        this._total = _total;
    }
}
