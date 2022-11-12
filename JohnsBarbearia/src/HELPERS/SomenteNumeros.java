package HELPERS;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class SomenteNumeros extends PlainDocument {
//Class SomenteNumeros bloqueia letras e caracteres especias nos JText escolhidos

    @Override
    public void insertString(int offs, String str, AttributeSet a)
            throws BadLocationException {

        super.insertString(offs,
                str.replaceAll("[^0-9]", ""), a);
    }

}
