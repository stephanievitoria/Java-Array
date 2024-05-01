
// Nome: Stephanie Soares
// RA: 10428278

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.print("Digite o tamanho desejado do seu array: ");
        int tamanhoDesejado = entrada.nextInt();
        int [] tamanhoArray = new int [tamanhoDesejado];
        for (int i = 0; i < tamanhoArray.length; i++){
            System.out.print("Digite o " + (i + 1) + " número: ");
            int nums = entrada.nextInt();
            tamanhoArray[i] = nums;
        }
        System.out.print("Digite o tamanho desejado do seu segundo array: ");
        int tamanhoDesejado2 = entrada.nextInt();
        int [] tamanhoArray2 = new int [tamanhoDesejado2];
        for (int i = 0; i < tamanhoArray2.length; i++){
            System.out.print("Digite o " + (i + 1) + " número: ");
            int nums2 = entrada.nextInt();
            tamanhoArray2[i] = nums2;
        }
        System.out.print("Saída: Intersecção entre 1 e 2 = ");
        for (int i = 0; i < tamanhoArray.length; i++) {
            for (int ii = 0; ii < tamanhoArray2.length; ii++) {
                if (tamanhoArray[i] == tamanhoArray2[ii]) {
                    System.out.print(tamanhoArray[i] + " ");
                    break;
                }
            }
        }
        entrada.close();
    }
}
