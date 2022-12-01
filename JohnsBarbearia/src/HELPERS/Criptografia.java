package HELPERS;

import EXCEPTIONS.ErroAoCriptografaSenhaException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Criptografia {

    //Criptografia da senha no padrão SHA-256 
    public static String criptografiaDaSenha(String senha_usuario)
            throws ErroAoCriptografaSenhaException {
        String criptgrafa = senha_usuario;
        MessageDigest MD;
        try {
            MD = MessageDigest.getInstance("SHA-256");
            BigInteger hash = new BigInteger(1,
                    MD.digest(senha_usuario.getBytes()));
            criptgrafa = hash.toString(12);
        } catch (NoSuchAlgorithmException ex) {
            System.out.println("ERRO AO CRIPTOGRAFAR SENHA!");
            throw new ErroAoCriptografaSenhaException();
        }
        return criptgrafa;
    }
}
