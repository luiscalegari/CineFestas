package engenharia.cine.festa.dto;

/**
 *
 * @author Luis Calegari
 */
public class ProdutoDTO {
    
    private Integer _codigo;
    private String _descricao;
    private Integer _estoque;
    private Float _precoVenda;
    private Float _precoCompra;
    private Integer _tipo;
    private Integer _classificacao;

    public ProdutoDTO() {
    }

    public Integer getCodigo() {
        return _codigo;
    }

    public void setCodigo(Integer _codigo) {
        this._codigo = _codigo;
    }

    public String getDescricao() {
        return _descricao;
    }

    public void setDescricao(String _descricao) {
        this._descricao = _descricao;
    }

    public Integer getEstoque() {
        return _estoque;
    }

    public void setEstoque(Integer _estoque) {
        this._estoque = _estoque;
    }

    public Float getPrecoVenda() {
        return _precoVenda;
    }

    public void setPrecoVenda(Float _precoVenda) {
        this._precoVenda = _precoVenda;
    }

    public Float getPrecoCompra() {
        return _precoCompra;
    }

    public void setPrecoCompra(Float _precoCompra) {
        this._precoCompra = _precoCompra;
    }

    public Integer getTipo() {
        return _tipo;
    }

    public void setTipo(Integer _tipo) {
        this._tipo = _tipo;
    }

    public Integer getClassificacao() {
        return _classificacao;
    }

    public void setClassificacao(Integer _classificacao) {
        this._classificacao = _classificacao;
    }
}
