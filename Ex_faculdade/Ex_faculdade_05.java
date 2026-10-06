package Ex_faculdade;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

/*Exercício 05: lê uma quantidade de nomes, guarda numa lista (ArrayList) e depois mostra os nomes na ordem inversa da digitação*/
public class Ex_faculdade_05 {
    // função main é o ponto de entrada do programa
    public static void main(String[] args) {
        /* Array 
        int megaSena[] = {30, 12, 45, 23, 56, 10};*/

        // Scanner lê o que o usuário digita no teclado
        Scanner teclado = new Scanner(System.in);

        // Lista que guarda os nomes digitados (diferente do array, o tamanho cresce sozinho)
        ArrayList<String> listaNomes = new ArrayList<String>();
        // Pergunta quantos nomes serão digitados e lê o número
        System.out.println("Digite a quantidade de nomes: ");
        int qtd = teclado.nextInt();

        // Guarda o nome digitado a cada volta do laço
        String nome;

        // Repete uma vez para cada nome que o usuário quer digitar (de 0 até qtd - 1)
        for (int i=0; i < qtd; i++) {
            // Mostra o número do nome sendo pedido (i começa em 0, por isso soma 1)
            System.out.println("Digite o nome " + (i + 1) + ": ");
            // next() lê apenas uma palavra e ignora o Enter que sobrou do nextInt(),
            // por isso aqui não precisa do nextLine() de limpeza.
            // Atenção: nomes com espaço (ex: "Maria da Silva") são separados em várias palavras
            nome = teclado.next();
            // Adiciona o nome no final da lista
            listaNomes.add(nome);
        }

        // Percorre a lista de trás para frente: começa na última posição (size() - 1)
        // e vai até a posição 0, mostrando os nomes na ordem inversa
        for(int i = listaNomes.size() - 1; i>=0; i--) {
            // get(i) pega o nome que está na posição i da lista
            System.out.println(listaNomes.get(i));
        }
        // Fecha o Scanner, liberando a entrada do teclado

        /* 
        Ordem inversa usando Collections.reverse() (não precisa de laço for)
        
        System.out.println("Ordem normal:");
        System.out.println(listaNomes);

        Collections.reverse(listaNomes);
        System.out.println("Ordem normal:");
        System.out.println(listaNomes);
        */

        teclado.close();
    }
}