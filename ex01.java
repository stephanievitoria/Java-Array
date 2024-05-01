
// Nome: Stephanie Soares
// RA: 10428278

import java.util.Scanner;
public class ex01
{
	public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int [] num = new int [10];
        for (int i=0; i < 10; i++){
            System.out.print ("Digite um número inteiro: ");
            num [i] = entrada.nextInt();
        }
        int numMaior = num[0];
        for (int i=1; i < num.length; i++){
            if (num[i] > numMaior){
                numMaior = num[i];
            }
        }
        System.out.println("O maior número é: " + numMaior);
        entrada.close();
	}
}