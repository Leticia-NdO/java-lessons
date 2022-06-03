import java.util.Scanner;

public class case_switch {
    public static void main(String[] args){
        String dia;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número de 1 à 7:");
        dia = sc.nextLine();
        switch(dia) {
            case "1": System.out.println("Dia da semana: domingo!");
            break;

            case "2": System.out.println("Dia da semana: segunda!");
            break;

            case "3": System.out.println("Dia da semana: terça!");
            break;

            case "4": System.out.println("Dia da semana: quarta!");
            break;

            case "5": System.out.println("Dia da semana: quinta!");
            break;

            case "6": System.out.println("Dia da semana: sexta!");
            break;

            case "7": System.out.println("Dia da semana: sabádo!");
            break;

            default: System.out.println("Dia da semána: valor inválido.");
        }

        sc.close();
    }
}
