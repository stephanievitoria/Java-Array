
// Nome: Stephanie Soares
// RA: 10428278

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int [] num = new int [5];
        for (int i=0; i < 5; i++){
            System.out.print ("Digite um número inteiro: ");
            num [i] = entrada.nextInt();
        }
        System.out.print("Digite outro número inteiro: ");
        int numOutro = entrada.nextInt();
        boolean numIgual = false;
        for (int i=1; i < num.length; i++){
            if (numOutro == num[i]){
                System.out.println("Saída: " + i);
                numIgual = true;
                break;
            }
        }
        if (!numIgual){
            System.out.println("Saída: -1");
        }
        entrada.close();
    }
}
