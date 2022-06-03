import java.util.Scanner;

public class while_ {
    public static void main(String[] args){
        int i;
        int resultado = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        i = scanner.nextInt();


        while(i >= 0){
            System.out.println(i);
            resultado += i;
            i -= 1;
        }
        scanner.close();
        System.out.printf("A soma desses números é:  %d\n", resultado);
    }
}
