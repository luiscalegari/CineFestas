package engenharia.cine.festas.entidades;

import java.util.Date;

/**
 *
 * @author Luis Fernando Calegari
 * @author Marcel Albertino
 */
public class Festa {
    
    private int _codigo;
    private Date _dtevento;
    private Date _dtconcepcao;
    private Date _dtcadastro;
    private String _descricao;
    private String _atracao;
    private int _publicoEsperado;
    private String _responsaveisEvento;
    private float _investimentoInicial;

    public Festa() {
    }

    public int getCodigo() {
        return _codigo;
    }

    public void setCodigo(int _codigo) {
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

    public int getPublicoEsperado() {
        return _publicoEsperado;
    }

    public void setPublicoEsperado(int _publicoEsperado) {
        this._publicoEsperado = _publicoEsperado;
    }

    public String getResponsaveisEvento() {
        return _responsaveisEvento;
    }

    public void setResponsaveisEvento(String _responsaveisEvento) {
        this._responsaveisEvento = _responsaveisEvento;
    }

    public float getInvestimentoInicial() {
        return _investimentoInicial;
    }

    public void setInvestimentoInicial(float _investimentoInicial) {
        this._investimentoInicial = _investimentoInicial;
    }
}
