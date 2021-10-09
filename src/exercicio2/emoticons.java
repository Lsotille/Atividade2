package exercicio2;

import java.util.Scanner;

import static java.lang.System.*;

public class emoticons {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        out.println("Digite sua Frase do dia!!");
        String fraseDoDia = input.nextLine();
        contadorEmocao emocao = new contadorEmocao();
        emocao.getEmocao(fraseDoDia);




    }
}