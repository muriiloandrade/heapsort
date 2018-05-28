//Exemplo de contagem em Python: https://ideone.com/Te5Wul
//Faltando a contagem das comparações. Onde colocar os comp++?

package heapsort;

public class HeapSort {
    //public int comp=0;
    
    public void ordenarArvore(int[] vetor, int tamanho, int raiz){
        int maior = raiz;
        int indiceEsquerda = 2*raiz + 1;
        int indiceDireita = 2*raiz + 2;
        
        //Se o índice da esquerda for maior que a raiz
        if(indiceEsquerda<tamanho && vetor[indiceEsquerda] > vetor[maior])
            maior = indiceEsquerda;
        
        //Se o índice da direita for maior que o maior até agora
        if(indiceDireita<tamanho && vetor[indiceDireita] > vetor[maior])
            maior = indiceDireita;
        
        //Se o maior não for a raiz
        if(maior != raiz){
            int troca = vetor[raiz];
            vetor[raiz] = vetor[maior];
            vetor[maior] = troca;
            
            ordenarArvore(vetor, tamanho, maior);
        }
    }
    
    public void ordenarVetor(int[] vetor){
        int tamanho = vetor.length;
        
        //Constrói a arvore (reorganiza o vetor)
        for (int i = (tamanho/2 -1); i >= 0; i--)
            ordenarArvore(vetor, tamanho, i);
        
        //Extrair elemento um a um da heap
        for (int i= (tamanho-1); i >= 0; i--){
            //Mover a raiz atual para o fim
            int temp = vetor[0];
            vetor[0] = vetor[i];
            vetor[i] = temp;
            
            ordenarArvore(vetor, i, 0);
        }
    }
    
    public void imprimirVetor(int[] vetor){
        int tamanho = vetor.length;
        
        for(int i= 0; i<tamanho; ++i)
            System.out.print(vetor[i] + " ");
    }
}
