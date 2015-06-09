package engenharia.cine.festa.bo;

import engenharia.cine.festa.dao.FestaDAO;
import engenharia.cine.festa.dto.FestaDTO;
import engenharia.cine.festa.exception.NegocioException;
import engenharia.cine.festa.exception.ValidacaoException;
import engenharia.cine.festa.util.Utilidades;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

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
        } else {
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            dateFormat.setLenient(false);
            try {
                Date d = dateFormat.parse(dtEvento);
            } catch (Exception e) {
                throw new ValidacaoException("Campo Data do Evento deve conter uma data válida !!!");
            }
        }
        return ehValido;
    }

    /**
     *
     * @param dtEvento Data do Evento.
     * @param dtConcepcao Data da Concepção.
     * @return True se a data da concepção do evento estiver preenchido e for
     * anterior a data do evento.
     * @throws ValidacaoException
     */
    public boolean validaDtEvento(String dtEvento, String dtConcepcao) throws ValidacaoException, ParseException {
        boolean ehValido = true;
        if (!dtConcepcao.equals("  /  /    ") && (new Date(dtEvento).before(new Date(dtConcepcao)))) {
            ehValido = false;
            throw new ValidacaoException("Dt. Concepção deve ser anterior a Dt. Evento");
        } else {
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            dateFormat.setLenient(false);
            Date concepcao = null;
            try {
                concepcao = dateFormat.parse(dtConcepcao);
            } catch (Exception e) {
                throw new ValidacaoException("Dt. Concepção não deve conter uma data válida.");
            }
            Date atual = dateFormat.parse(dateFormat.format(new Date()));
            if (concepcao.compareTo(atual) > 0) {
                ehValido = false;
                throw new ValidacaoException("Dt. Concepção não deve ser igual ou anterior a data atual");
            }
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

    /**
     * Metodo que cria uma matriz de valores para ser exibida em JTable
     *
     * @param sDtEvento Filtro por data do evento.
     * @param sAtracao Filtro por atração do evento.
     * @param listaCodigo Retorna todos ID´s referente a tabela do banco de
     * @return Retorna uma matriz com dados da tabela do banco de dados.
     */
    public String[][] listaPesquisa(String sDtEvento, String sAtracao, List<Integer> listaCodigo) throws NegocioException {
        int numCols = 4;
        String[][] listaRetorno = null;
        try {
            FestaDAO festaDAO = new FestaDAO();
            List<FestaDTO> listaFesta = festaDAO.filtraFesta(sDtEvento, sAtracao);
            listaRetorno = new String[listaFesta.size()][numCols];
            for (int i = 0; i < listaFesta.size(); i++) {
                listaCodigo.add(listaFesta.get(i).getCodigo());
                FestaDTO festaDTO = listaFesta.get(i);
                listaRetorno[i][0] = Utilidades.dateFormat.format(festaDTO.getDtevento());
                listaRetorno[i][1] = festaDTO.getAtracao();
                listaRetorno[i][2] = festaDTO.getResponsaveisEvento();
                listaRetorno[i][3] = "Selecionar";
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new NegocioException(e.getMessage());
        }
        return listaRetorno;
    }

    public FestaDTO selecionarPorCodigo(Integer codigo) throws NegocioException {
        FestaDTO festaDTO = new FestaDTO();
        try {
            FestaDAO festaDAO = new FestaDAO();
            festaDTO = festaDAO.buscarPorCodigo(codigo);
        } catch (Exception e) {
            e.printStackTrace();
            throw new NegocioException(e.getMessage());
        }
        return festaDTO;
    }

    public void excluir(int codigo) throws NegocioException {
        try {
            FestaDAO festaDAO = new FestaDAO();
            festaDAO.excluir(codigo);
        } catch (Exception e) {
            e.printStackTrace();
            throw new NegocioException(e.getMessage());
        }
    }

    public void salvar(FestaDTO festaDTO) throws NegocioException {
        try {
            FestaDAO festaDAO = new FestaDAO();
            festaDAO.atualizar(festaDTO);
        } catch (Exception e) {
            e.printStackTrace();
            throw new NegocioException(e.getMessage());
        }
    }
}
