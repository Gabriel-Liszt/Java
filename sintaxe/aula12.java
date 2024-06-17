import java.util.Scanner;

public class aula12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double PI = 3.14;
        double raio, area;

        System.out.println("Digite o tamanho do raio");
        raio = input.nextDouble();

        area = (raio*raio) * PI;

        System.out.println("A area da circunferência é: " + area);
    }
}
