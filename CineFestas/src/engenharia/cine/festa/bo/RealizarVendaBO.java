package engenharia.cine.festa.bo;

import engenharia.cine.festa.dao.ProdutoDAO;
import engenharia.cine.festa.dto.ProdutoDTO;
import engenharia.cine.festa.exception.NegocioException;
import java.util.List;

/**
 *
 * @author Luis Calegari
 */
public class RealizarVendaBO {

    public static ProdutoDTO selecionarProdutoPorCodigo(Integer codigo) throws NegocioException {
        try {
            ProdutoDTO pdto = null;
            ProdutoDAO pdao = new ProdutoDAO();
            pdto = pdao.buscarPorCodigo(codigo);
            return pdto;
        } catch (Exception e) {
            e.printStackTrace();
            throw new NegocioException(e.getLocalizedMessage());
        }
    }

    /**
     * Metodo que cria uma matriz de valores para ser exibida em JTable
     *
     * @param sCodigo Filtro para código;
     * @param sDescricao Filtro para Descricão.
     * @param listaCodigo Retorna todos ID´s referente a tabela do banco de
     * dados.
     * @return Retorna uma matriz com dados da tabela do banco de dados.
     * @throws NegocioException
     */
    public String[][] listaPesquisa(String sCodigo, String sDescricao, List<Integer> listaCodigo) throws NegocioException {
        int numCols = 3;
        String[][] listaRetorno = null;
        try {
            ProdutoDAO produtoDAO = new ProdutoDAO();
            List<ProdutoDTO> listaProduto = produtoDAO.filtrarProduto(sCodigo, sDescricao);
            listaRetorno = new String[listaProduto.size()][numCols];
            for (int i = 0; i < listaProduto.size(); i++) {
                ProdutoDTO pdto = listaProduto.get(i);
                listaCodigo.add(pdto.getCodigo());
                listaRetorno[i][0] = String.valueOf(pdto.getCodigo());
                listaRetorno[i][1] = pdto.getDescricao();
                listaRetorno[i][2] = "Selecionar";
            }
            return listaRetorno;
        } catch (Exception e) {
            e.printStackTrace();
            throw new NegocioException(e.getLocalizedMessage());
        }
    }

}
