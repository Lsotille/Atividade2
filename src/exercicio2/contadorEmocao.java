package exercicio2;

import java.util.regex.PatternSyntaxException;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class ContadorEmocao {
    public void getEmocao(String frase) {
        frase = frase.replaceAll("[0-9]","0");
        frase = getFeliz(frase);
        frase = getTriste(frase);
        getaCalcular(frase);
    }


    private String getFeliz(String frase)
    {
        String str = frase;
        String str2;
        String pattern = ":-\\)";
        str2 = str.replaceAll(pattern, "1");
        return str2;
    }
    private String getTriste(String frase)
    {
        String str = frase;
        String str2;
        String pattern = ":-\\(";
        str2= str.replaceAll(pattern, "2");
        return str2;
    }

    private void getaCalcular(String frase)
    {
        Integer contador = 0;
        for (int i = 0; i < frase.length()  ; i++){
            if (frase.charAt(i) == '1')
            {
                contador++;
            }
            if (frase.charAt(i) == '2')
            {
                contador--;
            }

        }
        if (contador == 0){System.out.println("Neutro");}
        if (contador > 0){System.out.println("Feliz");}
        if (contador < 0){System.out.println("triste");}
    }

}
