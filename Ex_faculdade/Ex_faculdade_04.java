package Ex_faculdade;

import java.util.Scanner;

// Exercício 04: jogo de adivinhação. O usuário tenta acertar o valor secreto
// e o programa dá dicas ("mais" ou "menos") até ele acertar
public class Ex_faculdade_04 {
   // função main é o ponto de entrada do programa
   public static void main(String [] args) {

    // Scanner lê o que o usuário digita no teclado
    Scanner teclado = new Scanner(System.in);
    // Guarda o palpite digitado pelo usuário
    int palpite;
    
    // Valor secreto que o usuário precisa adivinhar
    int valorCorreto = 10000;
    // Pede o primeiro palpite e lê o número digitado
    System.out.println("Digite a seu palpite:");
    palpite = teclado.nextInt();

    // Repete enquanto o palpite for diferente do valor correto
    // (quando o usuário acertar, a condição fica falsa e o laço termina)
    while (palpite != valorCorreto) {
        
        /*
        --- Operador ternário:
        
        String resultado = (palpite > valorCorreto) ? "Um pouco menos..." : "Um pouco mais...";
        System.out.println(resultado);

        -- pode ser substituído por um if/else, como abaixo:
         */

        // Palpite maior que o valor correto: dica para tentar um número menor
        if (palpite > valorCorreto) {
            System.out.println("Um pouco menos...");
        }
        // Senão o palpite é menor (o caso de ser igual já saiu do laço): dica para tentar um número maior
        else {
            System.out.println("Um pouco mais...");
        }
        // Pede um novo palpite e lê o número; depois volta ao início do while para testar de novo
        System.out.println("Digite outro palpite:");palpite = teclado.nextInt();
    }

    // Só chega aqui quando o palpite é igual ao valor correto, ou seja, o usuário acertou
    System.out.println("Parabéns! Você acertou o valor correto!");
    // Fecha o scanner para liberar recursos
    teclado.close(); 
   } 
}