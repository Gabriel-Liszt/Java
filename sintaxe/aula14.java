import java.util.Scanner;

public class aula14 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        double gramas, Kg;

        System.out.println("Digite um valor em gramas: ");
        gramas = input.nextDouble();

        Kg = gramas / 1000;
        gramas = gramas % 1000;

        System.out.println("Você possui: "+ Kg + " Kg");
        System.out.println("Você possui: "+gramas+" gramas");



    }

}
