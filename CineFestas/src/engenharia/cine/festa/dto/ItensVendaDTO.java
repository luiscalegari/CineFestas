package engenharia.cine.festa.dto;

/**
 *
 * @author Luis Calegari
 */
public class ItensVendaDTO {
    private Integer _venda;
    private Integer _produto;
    private Integer _qtde;
    private Float _valor;

    public ItensVendaDTO() {
    }

    public Integer getVenda() {
        return _venda;
    }

    public void setVenda(Integer _venda) {
        this._venda = _venda;
    }

    public Integer getProduto() {
        return _produto;
    }

    public void setProduto(Integer _produto) {
        this._produto = _produto;
    }

    public Integer getQtde() {
        return _qtde;
    }

    public void setQtde(Integer _qtde) {
        this._qtde = _qtde;
    }

    public Float getValor() {
        return _valor;
    }

    public void setValor(Float _valor) {
        this._valor = _valor;
    }
}
