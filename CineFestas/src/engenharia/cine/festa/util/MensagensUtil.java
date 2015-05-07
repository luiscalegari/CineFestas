package engenharia.cine.festa.util;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author LuisFernando
 */
public class MensagensUtil {

    public static void addMsg(Component component, String msg) {
        JOptionPane.showMessageDialog(component, msg);
    }
}
