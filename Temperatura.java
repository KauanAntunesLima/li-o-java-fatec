import java.util.Scanner;

public class Temperatura{
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura em Fahrenheit");
        double fahrenheit = scanner.nextDouble();
        scanner.close();
        
        Double calculo = 5.0 * (fahrenheit - 32) / 9;

        System.out.println("A temperatura convertida para Celsius é: " + calculo);
    }
    

}