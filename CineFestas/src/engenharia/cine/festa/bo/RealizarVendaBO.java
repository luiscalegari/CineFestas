package engenharia.cine.festa.bo;

import engenharia.cine.festa.dao.ItensVendaDAO;
import engenharia.cine.festa.dao.ProdutoDAO;
import engenharia.cine.festa.dao.VendaDAO;
import engenharia.cine.festa.dto.ItensVendaDTO;
import engenharia.cine.festa.dto.ProdutoDTO;
import engenharia.cine.festa.dto.VendaDTO;
import engenharia.cine.festa.exception.NegocioException;
import engenharia.cine.festa.exception.ValidacaoException;
import java.util.List;

/**
 *
 * @author Luis Calegari
 */
public class RealizarVendaBO {

    public ProdutoDTO selecionarProdutoPorCodigo(Integer codigo) throws NegocioException {
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
                listaRetorno[i][2] = String.valueOf(pdto.getPrecoVenda());
            }
            return listaRetorno;
        } catch (Exception e) {
            e.printStackTrace();
            throw new NegocioException(e.getLocalizedMessage());
        }
    }

    public boolean validarComanda(String comanda) throws ValidacaoException {
        boolean ehValido = true;
        if (comanda.isEmpty()) {
            ehValido = false;
            throw new ValidacaoException("Campo comanda deve ser preenchido!");
        } 
        return ehValido;
    }

    public boolean validarTotal(String total) throws ValidacaoException {
        boolean ehValido = true;
        if (total.isEmpty()) {
            ehValido = false;
            throw new ValidacaoException("Impossível calcular total da venda!");
        }
        return ehValido;
    }

    public boolean validarProduto(String produto) throws ValidacaoException {
        boolean ehValido = true;
        if (produto.isEmpty()) {
            ehValido = false;
            throw new ValidacaoException("Produto não encontrado!");
        }
        return ehValido;
    }

    public boolean validarQtde(String qtde) throws ValidacaoException {
        boolean ehValido = true;
        if (qtde.isEmpty()) {
            ehValido = false;
            throw new ValidacaoException("Qtde inválida!");
        } else {
            int iQtde = Integer.valueOf(qtde);
            if (iQtde <= 0) {
                ehValido = false;
                throw new ValidacaoException("Qtde deve ser maior do que 0!");
            }
        }
        return ehValido;
    }

    public boolean validarValor(String valor) throws ValidacaoException {
        boolean ehValido = true;
        if (valor.isEmpty()) {
            ehValido = false;
            throw new ValidacaoException("Preço inválido!");
        } else {
            float fValor = Float.valueOf(valor);
            if (fValor <= 0) {
                ehValido = false;
                throw new ValidacaoException("Preço informado deve ser maior do que 0!");
            }
        }
        return ehValido;
    }

    public int cadastrarVenda(VendaDTO vdto) throws NegocioException {
        try {
            VendaDAO vdao = new VendaDAO();
            return vdao.inserirEPegaCodigo(vdto);
        } catch (Exception e) {
            e.printStackTrace();
            throw new NegocioException(e.getLocalizedMessage());
        }
    }

    public void cadastrarItenVenda(ItensVendaDTO intemVenda) throws NegocioException {
        try {
            ItensVendaDAO ivdao = new ItensVendaDAO();
            ivdao.inserir(intemVenda);
        } catch (Exception e) {
            e.printStackTrace();
            throw new NegocioException(e.getLocalizedMessage());
        }
    }
}
