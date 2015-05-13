package engenharia.cine.festa.bo;

import engenharia.cine.festa.dao.FestaDAO;
import engenharia.cine.festa.dto.FestaDTO;
import engenharia.cine.festa.exception.NegocioException;
import engenharia.cine.festa.exception.ValidacaoException;
import java.util.Date;

/**
 *
 * @author Luis Calegari
 */
public class FestaBO {

    public boolean validaDtEvento(String dtEvento) throws ValidacaoException {
        boolean ehValido = true;
        if (dtEvento.equals("  /  /    ")) {
            ehValido = false;
            throw new ValidacaoException("Campo Data do Evento deve ser preenchido !!!");
        }
        return ehValido;
    }

    /**
     * 
     * @param dtEvento Data do Evento.
     * @param dtConcepcao Data da Concepção.
     * @return True se a data da concepção do evento estiver preenchido e for anterior a data do evento.
     * @throws ValidacaoException
     */
    public boolean validaDtEvento(String dtEvento, String dtConcepcao) throws ValidacaoException {
        boolean ehValido = true;
        if (!dtConcepcao.equals("  /  /    ") && (new Date(dtEvento).before(new Date(dtConcepcao)))) {
            ehValido = false;
            throw new ValidacaoException("Dt. Concepção deve ser anterior a Dt. Evento");
        }
        return ehValido;
    }

    public boolean validaAtracao(String atracao) throws ValidacaoException {
        boolean ehValido = true;
        if (atracao.isEmpty()) {
            ehValido = false;
            throw new ValidacaoException("Campo Atração deve ser preenchido !!!");
        }
        return ehValido;
    }

    public boolean validaDescricao(String descricao) throws ValidacaoException {
        boolean ehValido = true;
        if (descricao.isEmpty()) {
            ehValido = false;
            throw new ValidacaoException("Campo Descrição deve ser preenchido !!!");
        }
        return ehValido;
    }

    public boolean validaResponsaveisEvento(String resposaveis) throws ValidacaoException {
        boolean ehValido = true;
        if (resposaveis.isEmpty()) {
            ehValido = false;
            throw new ValidacaoException("Campo Responsáveis Evento deve ser preenchido !!!");
        }
        return ehValido;
    }

    public void cadastrar(FestaDTO festaDTO) throws NegocioException {
        try {
            FestaDAO festaDAO = new FestaDAO();
            festaDAO.inserir(festaDTO);
        } catch (Exception e) {
            throw new NegocioException(e.getMessage());
        }
    }
}
