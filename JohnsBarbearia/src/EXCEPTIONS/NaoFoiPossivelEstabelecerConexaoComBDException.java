package EXCEPTIONS;

public class NaoFoiPossivelEstabelecerConexaoComBDException extends Exception {

    @Override
    public String getMessage() {
        return "Não foi possivel realizar Conexão com o Banco de dados";
    }
}
