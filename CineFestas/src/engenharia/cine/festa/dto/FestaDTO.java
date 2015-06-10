package engenharia.cine.festa.dto;

import java.util.Date;

/**
 *
 * @author LuisFernando
 */
public class FestaDTO {

    private Integer _codigo;
    private Date _dtevento;
    private Date _dtconcepcao;
    private Date _dtcadastro;
    private String _descricao;
    private String _atracao;
    private Integer _publicoEsperado;
    private String _responsaveisEvento;
    private Float _investimentoInicial;

    public FestaDTO() {
    }

    public Integer getCodigo() {
        return _codigo;
    }

    public void setCodigo(Integer _codigo) {
        this._codigo = _codigo;
    }

    public Date getDtevento() {
        return _dtevento;
    }

    public void setDtevento(Date _dtevento) {
        this._dtevento = _dtevento;
    }

    public Date getDtconcepcao() {
        return _dtconcepcao;
    }

    public void setDtconcepcao(Date _dtconcepcao) {
        this._dtconcepcao = _dtconcepcao;
    }

    public Date getDtcadastro() {
        return _dtcadastro;
    }

    public void setDtcadastro(Date _dtcadastro) {
        this._dtcadastro = _dtcadastro;
    }

    public String getDescricao() {
        return _descricao;
    }

    public void setDescricao(String _descricao) {
        this._descricao = _descricao;
    }

    public String getAtracao() {
        return _atracao;
    }

    public void setAtracao(String _atracao) {
        this._atracao = _atracao;
    }

    public Integer getPublicoEsperado() {
        return _publicoEsperado;
    }

    public void setPublicoEsperado(Integer _publicoEsperado) {
        this._publicoEsperado = _publicoEsperado;
    }

    public String getResponsaveisEvento() {
        return _responsaveisEvento;
    }

    public void setResponsaveisEvento(String _responsaveisEvento) {
        this._responsaveisEvento = _responsaveisEvento;
    }

    public Float getInvestimentoInicial() {
        return _investimentoInicial;
    }

    public void setInvestimentoInicial(Float _investimentoInicial) {
        this._investimentoInicial = _investimentoInicial;
    }

    public boolean isFestaVazia() {
        return getCodigo() == null || getCodigo() <= 0;
    }
}
