package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int soma = 0;
        int numero;
        int contador=4;
        while(contador!=0) {
            Scanner input = new Scanner(System.in);
            System.out.println("Digite o numero:");
            numero = input.nextInt();
           // contador = contador -1 ;
            contador-- ;
           // soma+= numero + soma;
            soma+= numero;

            System.out.println("numero: "+ numero+ "contador: "+contador+ "soma: "+soma);


        };









    }
}
