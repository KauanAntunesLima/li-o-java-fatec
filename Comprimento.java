import java.util.Scanner;

public class Comprimento {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o comprimento em centimetros");
        double centimetros = scanner.nextDouble();
        scanner.close();

        Double conversao = centimetros / 2.54;

        System.out.println("A conversão em polegadas é: " + conversao);
    }
}
