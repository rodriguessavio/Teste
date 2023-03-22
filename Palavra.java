import java.util.Scanner;

public class Palavra{
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        String str, contrario = "", semEspaco = "";
        System.out.println("Informe a string: ");
        str = entrada.nextLine();
        entrada.close();
        semEspaco = str.replaceAll(" ","");
        // semEspaco é uma string que receberá a o que foi armazenado em str sem os espaços, usando o método replaceAll
        for(int i = (semEspaco.length() -1 ) ; i >= 0 ; i-- ){
            // Usa-se o método charAt para percorrer a String, com o for acima, percorremos o vetor de trás para frente e vamos imprimindo as letras percorridas
            contrario = contrario + semEspaco.charAt(i);
        }
        System.out.println(contrario);

    }
}