package engenharia.cine.festa.util;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Luis Calegari
 */
public class Utilidades {

    public static final String os = System.getProperty("os.name");

    public static void AlteraIconeFrame(JFrame frame, ImageIcon icone) {
        frame.setIconImage(icone.getImage());
    }

    public static void setlookAndFeel() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        if (os.toUpperCase().contains("WINDOWS")) {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("WINDOWS".equals(info.getName().toUpperCase())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } else {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("GTK+".equals(info.getName().toUpperCase())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
    }

    public static boolean isCpf(String cpf) {
        cpf = cpf.replace(".", "");
        cpf = cpf.replace("-", "");
        int d1, d2;
        int digito1, digito2, resto;
        int digitoCPF;
        String nDigResult;

        d1 = d2 = 0;
        digito1 = digito2 = resto = 0;

        for (int nCount = 1; nCount < cpf.length() - 1; nCount++) {
            digitoCPF = Integer.valueOf(cpf.substring(nCount - 1, nCount)).intValue();
            d1 = d1 + (11 - nCount) * digitoCPF;
            d2 = d2 + (12 - nCount) * digitoCPF;
        }

        resto = (d1 % 11);

        if (resto < 2) {
            digito1 = 0;
        } else {
            digito1 = 11 - resto;
        }

        d2 += 2 * digito1;
        resto = (d2 % 11);

        if (resto < 2) {
            digito2 = 0;
        } else {
            digito2 = 11 - resto;
        }

        String nDigVerific = cpf.substring(cpf.length() - 2, cpf.length());
        nDigResult = String.valueOf(digito1) + String.valueOf(digito2);

        return nDigVerific.equals(nDigResult);
    }
}
