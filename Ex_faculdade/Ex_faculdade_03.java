package Ex_faculdade;

import java.util.Scanner;

// Exercício 03: calcula o IMC (Índice de Massa Corporal) e mostra a classificação
public class Ex_faculdade_03 {
    // função main é o ponto de entrada do programa
    public static void main(String[] args) {
        // Variáveis que guardam os dados digitados (double aceita números com vírgula)
        double peso;
        double altura;

        // Scanner lê o que o usuário digita no teclado
        Scanner teclado = new Scanner(System.in);

        // Pede e lê o peso em quilos
        System.out.println("Digite seu peso em Kg (ex: 70,5): ");
        peso = teclado.nextDouble();

        // Pede e lê a altura em metros
        System.out.println("Digite sua altura em metros (ex: 1,75): ");
        altura = teclado.nextDouble();

        // Fórmula do IMC: peso dividido pela altura ao quadrado
        double imc = peso / (altura * altura);

        // Mostra o IMC com 2 casas decimais
        System.out.printf("Seu IMC é: %.2f", imc);

        // Classificação do IMC: o primeiro teste verdadeiro é executado
        // e os demais são ignorados (por isso não precisa testar o limite inferior)
        if (imc < 18.5) {
            System.out.println(" Abaixo do peso normal");
        }
        else if (imc < 25) {
            System.out.println(" Peso normal");
        }
        else if (imc < 30) {
            System.out.println(" Acima do peso");
        }
        else if (imc < 35) {
            System.out.println(" Obesidade de grau 1");
        }
        else if (imc < 40) {
            System.out.println(" Obesidade de grau 2");
        }
        else {
            // IMC de 40 ou mais
            System.out.println(" Obesidade de grau 3");
        }

        // Fecha o Scanner, liberando a entrada do teclado
        teclado.close();
    }
}