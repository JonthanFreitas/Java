package Ex_faculdade;

import java.util.Locale;
import java.util.Scanner;

public class Ex_faculdade_02{

    public static void main(String[] args) {
        
        // Define o ponto (.) como separador decimal padrão
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite a sua idade: ");
        int idade = teclado.nextInt();

        System.out.println("Digite o seu peso (ex: 70.5): ");
        double peso = teclado.nextDouble();

        // Limpa o buffer do teclado antes de ler texto
        teclado.nextLine(); 

        System.out.println("Digite o seu nome completo: ");
        String nome = teclado.nextLine();

        System.out.println("\n--- Dados Registados ---");
        System.out.println("Nome: " + nome);
        System.out.printf("Peso: %.2f kg\n", peso);
        System.out.printf("Idade: %d anos\n", idade);

        teclado.close();
    }
}