package com.br.zup;

import java.util.Scanner;

public class IO {

    public static void saidaDados(String texto){
        System.out.println(texto);
    }
    public static Scanner entradaDados(){
        return new Scanner(System.in);
    }
}
