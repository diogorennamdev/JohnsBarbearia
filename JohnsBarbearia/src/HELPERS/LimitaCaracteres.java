package HELPERS;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class LimitaCaracteres extends PlainDocument {
//Class LimitaCaracteres limita o cpf em 11 caracteres

    public enum TipoEntrada {
        CPF, OBSERVACAO, VALOR;
    };

    private final int qtdCaracteres;
    private final TipoEntrada tpEntrada;

    public LimitaCaracteres(int qtdCaracteres, TipoEntrada tpEntrada) {
        this.qtdCaracteres = qtdCaracteres;
        this.tpEntrada = tpEntrada;
    }

    @Override
    public void insertString(int offs, String str, AttributeSet a)
            throws BadLocationException {

        if (str == null || getLength() == qtdCaracteres) {
            return;
        }
        int totalCaracter = getLength() + str.length();
        //filtro de caracteres
        String regex = "";
        switch (tpEntrada) {
            case CPF:
                regex = "[^0-9]";
                break;
            case OBSERVACAO:
                regex = "[^\\p{IsLatin} ][^0-9] :";
                break;
            case VALOR:
                regex = "[^0-9]";
                break;

        }
        //fazendo a substituição
        str = str.replaceAll(regex, "");

        if (totalCaracter <= qtdCaracteres) {
            super.insertString(offs, str, a);
//        } else {
//            String nova = String.substring(0, qtdCaracteres);
//            super.insertString(offs, nova, a);
        }

    }

}
