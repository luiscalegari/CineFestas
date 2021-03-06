package engenharia.cine.festa.bo;

import engenharia.cine.festa.dao.ComandaClienteDAO;
import engenharia.cine.festa.dao.ComandaDAO;
import engenharia.cine.festa.dao.ItensVendaDAO;
import engenharia.cine.festa.dao.ProdutoDAO;
import engenharia.cine.festa.dto.ComandaClienteDTO;
import engenharia.cine.festa.dto.ComandaDTO;
import engenharia.cine.festa.dto.ItensVendaDTO;
import engenharia.cine.festa.dto.ProdutoDTO;
import engenharia.cine.festa.exception.NegocioException;
import engenharia.cine.festa.exception.PersistenciaException;
import engenharia.cine.festa.exception.ValidacaoException;
import java.text.DecimalFormat;
import java.util.List;

/**
 *
 * @author Luis Calegari
 */
public class FecharContaBO {

    private static final DecimalFormat decimalFormat = new DecimalFormat("#.##");

    public boolean validarComanda(String comanda) throws ValidacaoException, PersistenciaException {
        boolean ehValido = true;
        if (comanda.isEmpty()) {
            ehValido = false;
            throw new ValidacaoException("Campo comanda deve ser preenchido!");
        } else {
            ComandaDAO cdao = new ComandaDAO();
            ComandaDTO cdto = cdao.buscarPorCodigo(Integer.valueOf(comanda));
            if (!cdto.isStatus()) {
                throw new ValidacaoException("Comanda fechada!");
            }
        }
        return ehValido;
    }

    public String[][] listaPesquisa(String comanda) throws NegocioException {
        int numCols = 4;
        String[][] matRetorno = null;
        try {
            ProdutoDAO pdao = new ProdutoDAO();
            ItensVendaDAO ivdao = new ItensVendaDAO();
            List<ItensVendaDTO> listIntesVenda = ivdao.filtrarComanda(Integer.parseInt(comanda));
            matRetorno = new String[listIntesVenda.size()][numCols];
            for (int i = 0; i < listIntesVenda.size(); i++) {
                ItensVendaDTO ivdto = listIntesVenda.get(i);
                ProdutoDTO pdto = pdao.buscarPorCodigo(ivdto.getProduto());
                matRetorno[i][0] = String.valueOf(ivdto.getProduto());
                matRetorno[i][1] = pdto.getDescricao();
                matRetorno[i][2] = String.valueOf(decimalFormat.format(pdto.getPrecoVenda()));
                matRetorno[i][3] = String.valueOf(ivdto.getQtde());
            }
            return matRetorno;
        } catch (Exception e) {
            e.printStackTrace();
            throw new NegocioException(e.getLocalizedMessage());
        }
    }

    public ComandaClienteDTO buscaPorComanda(String comanda) throws NegocioException {
        try {
            ComandaClienteDAO ccdao = new ComandaClienteDAO();
            ComandaClienteDTO ccdto = ccdao.buscaPorComanda(Integer.valueOf(comanda));
            return ccdto;
        } catch (Exception e) {
            e.printStackTrace();
            throw new NegocioException(e.getLocalizedMessage());
        }
    }

    public void gravarFechamento(ComandaClienteDTO ccdto) throws NegocioException {
        try {
            ComandaClienteDAO ccdao = new ComandaClienteDAO();
            ccdao.atualizar(ccdto);
            ComandaDAO cdao = new ComandaDAO();
            ComandaDTO cdto = cdao.buscarPorCodigo(ccdto.getComanda());
            cdto.setStatus(false);
            cdao.atualizar(cdto);
        } catch (Exception e) {
            throw new NegocioException(e.getLocalizedMessage());
        }
    }
}
