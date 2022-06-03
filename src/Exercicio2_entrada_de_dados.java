import java.util.Scanner;

public class Exercicio2_entrada_de_dados {

    public static void main(String[] args){

        // Para ler string:
        // Scanner sc = new Scanner(System.in);
        // String x;
        // x = sc.next();
        // System.out.println("Você digitou: " + x);
        // sc.close();

        // O next sozinho lê apenas uma palavra, para ler a linha inteira usa-se o nextLine()
 
        // Para ler números inteiros: 

        // Scanner sc = new Scanner(System.in);
        // int x;
        // x = sc.nextInt();
        // System.out.println("você digitou: " + x);
        // sc.close();

        // Para ler um double:
       
        // Scanner sc = new Scanner(System.in);
        // double x;
        // x = sc.nextDouble();
        // System.out.println("você digitou: " + x);
        // sc.close();

        // Para armazenar vários resultados

            Scanner sc = new Scanner(System.in);
            int x, y;
            double resultado;

            x = sc.nextInt();
            y = sc.nextInt();
            resultado = x * y;
            sc.close();
            System.out.printf("A multiplicação de %s e %s é: %.1f %n", x, y, resultado);
                

        // Ler um caracter:

        // Scanner sc = new Scanner(System.in);
        // char x;
        // x = sc.next().charAt(0);
        // System.out.println("A primeira letra da palavra que você digitou é: " + x);
        // sc.close();

    }
}
