
import engenharia.cine.festa.gui.CadFestaFrame;
import engenharia.cine.festa.util.MensagensUtil;
import engenharia.cine.festa.util.Utilidades;

/**
 *
 * @author Aluno
 */
public class Main {

    public static void main(String[] args) {
        new Main().executa();
    }

    private void executa() {
        try {
            Utilidades.setlookAndFeel();
        } catch (Exception e) {
            e.printStackTrace();
            MensagensUtil.addMsg(null, e.getMessage());
        }

//        new CadClienteFrame().setVisible(true);
        new CadFestaFrame().setVisible(true);
    }
}
