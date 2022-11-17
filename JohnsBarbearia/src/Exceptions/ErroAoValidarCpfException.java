
package Exceptions;


public class ErroAoValidarCpfException extends Exception {

    @Override
    public String getMessage() {
        return "Erro ao validar CPF";
    } 
    
}
