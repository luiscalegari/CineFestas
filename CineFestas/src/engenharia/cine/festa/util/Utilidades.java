package engenharia.cine.festa.util;

import java.text.SimpleDateFormat;
import java.util.Date;
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
    
    public static String formataData(Date data) {
        SimpleDateFormat dataFormater = new SimpleDateFormat("dd/MM/yyyy");
        String d = dataFormater.format(data).toString();
        return dataFormater.format(data).toString();
    }
    
    public static Date formataData(String data) {
        SimpleDateFormat dataFormater = new SimpleDateFormat("dd/MM/yyyy");
        return dataFormater.format(data);
    }
}
