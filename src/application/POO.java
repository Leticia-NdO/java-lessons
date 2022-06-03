package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;
/*Por exemplo no problema do triângulo (vídeo 63 iniciando o tópico de O.O.): 
Quando declaramos "Scanner sc = new Scanner(System.in);" estamos instanciando 
um novo objeto chamado sc a partir da classe Scanner e utilizando o método System.in?? 
Essa classe Scanner já é pré existente na API do Java e apenas a importamos correto? 
Em outro ponto do código quando declaramos "x.a = sc.nextDouble();" estamos utilizando 
o método nextDouble() associado ao objeto sc para atribuir um valor ao atributo "a" do 
objeto x (o triângulo) correto? */
public class POO {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite as medidas de um triângulo X: ");

        
        Triangle y, x;
        x = new Triangle();
        y = new Triangle();

        x.a = scanner.nextDouble();
        x.b = scanner.nextDouble();
        x.c = scanner.nextDouble();

        double areaX = x.area();

        System.out.println("Digite as medidas de um triângulo Y: ");
        y.a = scanner.nextDouble();
        y.b = scanner.nextDouble();
        y.c = scanner.nextDouble();

        double areaY = y.area();
        scanner.close();


        System.out.println("O triângulo X tem área: " + areaX);
        System.out.println("O triângulo Y tem área: " + areaY);

        if (areaX > areaY) {
            System.out.println("O triângulo de maior área é: X");
        } else {
            System.out.println("O triângulo de maior área é: Y");
        }

    }
}
