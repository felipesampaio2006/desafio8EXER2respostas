package desafio8exer2respostas;

import java.util.Scanner;

/**
 *
 * @author Felipe
 */
public class Desafio8EXER2respostas {
    public static void main(String[] args) {
        int numeros, cont025, cont2650, cont5175, cont76100;
        Scanner ler = new Scanner(System.in);
        cont025 = 0;  cont2650 = 0;  cont5175 = 0;   cont76100 = 0;
        System.out.println("Digite um numero positivo para continuar ou negativo para sair:");
        numeros = ler.nextInt();
        while (numeros >= 0) {
            if (numeros >= 0 && numeros <= 25) {
                cont025++;
            } else 
                if (numeros >= 26 && numeros <= 50) {
                cont2650++;
            } else 
                if (numeros >= 51 && numeros <= 75) {
                cont5175++;
            } else 
                if (numeros >= 76 && numeros <= 100) {
                cont76100++;     
           
            }
        System.out.println("Digite um numero positivo para continuar ou negativo para sair:");
        numeros = ler.nextInt();
        }//fim do loop
        System.out.println("Foram digitados "+cont025+" números entre 0 e 25");
        System.out.println("Foram digitados "+cont2650+" números entre 26 e 50");
        System.out.println("Foram digitados "+cont5175+" números entre 51 e 75");
        System.out.println("Foram digitados "+cont76100+" números entre 76 e 100");
    }
    
}
