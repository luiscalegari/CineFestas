/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engenharia.cine.festa.util;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class Erro {
    
    List<String> erros;
    
    public Erro(){erros = new ArrayList<>();}
    
    public void addErro(String mensagem)
    {
        erros.add(mensagem);
    }
    
    public String exibirErros()
    {
        String aux = "";
        for(String s: erros)
            aux += s + "\n";
        return aux;
    }
    
}
