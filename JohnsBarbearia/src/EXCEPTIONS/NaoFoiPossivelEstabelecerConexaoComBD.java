
package EXCEPTIONS;


public class NaoFoiPossivelEstabelecerConexaoComBD extends Exception {
 @Override
    public String getMessage() {
        return "Não foi possivel realizar Conexão com o Banco de dados";
    }
}
