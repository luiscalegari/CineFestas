/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engenharia.cine.festa.util;

import java.awt.Color;
import javax.swing.JTextField;

/**
 *
 * @author Aluno
 */
public class Designer {
    
    public static void CampoValido(Object objeto)
    {
        if(objeto instanceof JTextField)
           ((JTextField)objeto).setBackground(Color.white);
    }
    
    public static void CampoInvalido(Object objeto)
    {
        if(objeto instanceof JTextField)
           ((JTextField)objeto).setBackground(Color.yellow);
    }
    
    
}
