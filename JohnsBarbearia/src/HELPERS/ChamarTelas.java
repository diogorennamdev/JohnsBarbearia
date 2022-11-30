package HELPERS;

import EXCEPTIONS.ErroAoListarDadosException;
import EXCEPTIONS.NaoFoiPossivelEstabelecerConexaoComBDException;
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
            throws NaoFoiPossivelEstabelecerConexaoComBDException,
            ErroAoListarDadosException {

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
