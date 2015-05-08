
import engenharia.cine.festa.util.MensagensUtil;
import engenharia.cine.festa.gui.CadClienteFrame;
import javax.swing.UIManager;

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
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
            MensagensUtil.addMsg(null, "Não foi possível iniciar o sistema!!!");
        }
        
        new CadClienteFrame().setVisible(true);
    }
}
