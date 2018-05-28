package heapsort;

import java.util.Scanner;

public class HeapSortMain {

    public static void main(String[] args) {
        HeapSort heapsort = new HeapSort();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Insira o tamanho do vetor: ");
        int tamanhoVetor = input.nextInt();
        
        int[] vetor = new int[tamanhoVetor];
        
        for(int loop=0; loop<50; loop++){
            
            for(int i=0; i<vetor.length; i++)
                vetor[i] = (int)(Math.random()*1000);
            
            System.out.println("\nVetor "+ (loop+1));
            System.out.print("Vetor antes: ");
            
            for(int i : vetor)
                System.out.print(i + " ");
            
            double tempoInicial = System.nanoTime();
            heapsort.ordenarVetor(vetor);
            double tempoFinal = System.nanoTime();
            
            System.out.print("\nVetor depois: ");
            heapsort.imprimirVetor(vetor);
            /*for(int i : vetor)
                System.out.print(i + " ");*/
            
            System.out.print("\nTempo de execução: ");
            System.out.print((tempoFinal - tempoInicial)/1000000 + " ms\n");
            //System.out.println("Quantidade de comparações: " + heapsort.comp);
        }
    }
}
