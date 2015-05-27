package engenharia.cine.festa.dto;

/**
 *
 * @author Luis Calegari
 */
public class ComandaClienteDTO {
    private Integer _comanda;
    private Integer _cliente;
    private Integer _festa;
    private Float _total;
    private Float _valorPago;

    public ComandaClienteDTO() {
    }

    public Integer getComanda() {
        return _comanda;
    }

    public void setComanda(Integer _comanda) {
        this._comanda = _comanda;
    }

    public Integer getCliente() {
        return _cliente;
    }

    public void setCliente(Integer _cliente) {
        this._cliente = _cliente;
    }

    public Integer getFesta() {
        return _festa;
    }

    public void setFesta(Integer _festa) {
        this._festa = _festa;
    }

    public Float getTotal() {
        return _total;
    }

    public void setTotal(Float _total) {
        this._total = _total;
    }

    public Float getValorPago() {
        return _valorPago;
    }

    public void setValorPago(Float _valorPago) {
        this._valorPago = _valorPago;
    }
}