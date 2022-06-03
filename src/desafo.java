import java.util.Scanner;

public class desafo {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        String T = scan.nextLine();


        String respostaCompetidores = scan.nextLine();

        String [] respostaCompetidoresSplit = respostaCompetidores.split("");

        int count = 0;

        for (int i=0; i<=4; i++){

            if (respostaCompetidoresSplit[i].equalsIgnoreCase(T)){
                count++;
            }
        }

        scan.close();

        System.out.println(count);
    }
}
