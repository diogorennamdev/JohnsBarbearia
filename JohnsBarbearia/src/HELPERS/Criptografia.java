package HELPERS;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Criptografia {

    //Criptografia da senha no padrão SHA-256 
    public static String criptografiaDaSenha(String senha_usuario) {
        String cript = senha_usuario;
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("SHA-256");
            BigInteger hash = new BigInteger(1,
                    md.digest(senha_usuario.getBytes()));
            cript = hash.toString(24);
        } catch (NoSuchAlgorithmException ex) {
            System.out.println("erro ao criptografar senha");
        }
        return cript;
    }
}
