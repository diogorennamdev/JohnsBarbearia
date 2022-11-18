
package EXCEPTIONS;


public class ErroAoValidarCPF extends Exception {

    @Override
    public String getMessage() {
        return "Erro ao validar CPF";
    } 
    
}
