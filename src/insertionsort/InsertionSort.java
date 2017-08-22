/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsort;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Erberto Sousa
 */
public class InsertionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int []v = {9,8,3,6,9};
        System.out.println(Arrays.toString(v));
        //JOptionPane.showMessageDialog(null,Arrays.toString(v));
        System.out.println("Insertion Sort");
        insertionSort(v);
        System.out.println(Arrays.toString(v));
        System.out.println("Selection Sort");
        selection(v);
        System.out.println(Arrays.toString(v));
       
       
        
    }

    private static void insertionSort(int[] v) {
        int x,j; //variaveis auxiliares
        for(int i = 1; i<v.length;i++){// inicia da primeira posição
            x = v[i]; //armazeno o indice 1
            j = i - 1; // 
            //É feita a comparação entre a variavel e  J
            while((j>=0)&& v[j]>x){ // Enquanto v[j], que é o indice passado for maior que o indice x
                v[j+1] = v[j];
                j = j -1;
            }
            v[j+1] = x;
       
            
        }
    }

    private static void selection(int[] v) {
        for(int i = 0; i < v.length;i++){
            int menor = i;
            for(int j = i+1; j<v.length;j++){
                if(v[j]<v[menor]){
                    menor = j;
                }
                    trocar(v,i,menor);
            }
        }
    }

    private static void trocar(int[] v, int i, int menor) {
        int aux = v[i];
        v[i] = v[menor];
        v[menor] = aux;
    }
    
}
