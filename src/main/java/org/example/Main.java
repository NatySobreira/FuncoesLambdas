package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Funções Lambdas - Java 8");
        System.out.println("Imprimir os 7 primeiros valores da lista \n" +
                "multiplicados por 2, mas apenas se o número for par.");
        System.out.println("Lista: (1,5,8,7,4,6,3,2,1,8,5,7,4)");
        System.out.println("");
        //javaProceduralSolution();
        javaFunctionalSolutionLambda();


    }

    public static void javaProceduralSolution(){
        List<Integer> lista = Arrays.asList(1,5,8,7,4,6,3,2,1,8,5,7,4);
        System.out.println("Solução Procedural");
        for (int i = 0; i < 7; i++) {
            Integer numero = lista.get(i);
            if (numero % 2 == 0) {
                System.out.println(numero * 2);
            }
        }
    }

    public static void javaFunctionalSolutionLambda() {
        List<Integer> lista = Arrays.asList(1, 5, 8, 7, 4, 6, 3, 2, 1, 8, 5, 7, 4);
        System.out.println("Solução Funcional");
        lista.stream()
                .limit(7)
                .filter(e -> e % 2 == 0)
                .map(e -> e * 2)
                .forEach(System.out::println);
        }

    }