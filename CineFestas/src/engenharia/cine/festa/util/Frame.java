/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engenharia.cine.festa.util;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Frame {
    
    public static void MensagemConfirmacao(String mensagem)
    {
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
    public static void MensagemAlerta(String mensagem)
    {
        JOptionPane.showMessageDialog(null, mensagem, "Alerta", JOptionPane.WARNING_MESSAGE);
    }
    
    public static void MensagemErro(String mensagem)
    {
        JOptionPane.showMessageDialog(null, mensagem, "Erro", JOptionPane.ERROR_MESSAGE);
    }
    
    public static boolean MensagemPergunta(String mensagem)
    {
        return JOptionPane.showConfirmDialog(null, mensagem, "Pergunta", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
    }
    
}
