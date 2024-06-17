import java.util.Scanner;

public class aula10 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        double base, altura;

        System.out.println("Digite o valor da base");
        base = input.nextDouble();

        System.out.println("Digite o valor da altura");
        altura = input.nextDouble();

        System.out.println("O valor da área do retângulo é: " + (base * altura));

    }
}
