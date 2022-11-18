package HELPERS;

import EXCEPTIONS.NaoFoiPossivelEstabelecerConexaoComBD;
import VIEW.JFrameTelaAgendamento;
import VIEW.JFrameTelaCadastro;
import VIEW.JframeTelaLogin;

public class ChamarTelas {

    //Metodo que retorna JframeTelaCadastro
    public static void chamarTelaCadastro() {
        JFrameTelaCadastro janelaJframeTelaCadastro
                = new JFrameTelaCadastro();
        janelaJframeTelaCadastro.setVisible(true);
    }

    //Metodo que retorna JframeTeAgendamento
    public static void chamarTelaAgendamento()
            throws NaoFoiPossivelEstabelecerConexaoComBD {

        JFrameTelaAgendamento telaJframeTelaAgendamento
                = new JFrameTelaAgendamento();
        telaJframeTelaAgendamento.setVisible(true);
    }

    //Metodo que retorna JframeTelaLogin
    public static void chamarTelaLogin() {
        JframeTelaLogin janelaJframeTelaLogin = new JframeTelaLogin();
        janelaJframeTelaLogin.setVisible(true);
    }

}
