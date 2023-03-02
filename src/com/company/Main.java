package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    double num1, num2, result = 0;
    char operador = '-';

    while (operador != '0') {


            System.out.printf("Digite o primeiro número");
            num1 = scanner.nextDouble();

            System.out.printf("Agora digite a operação (entre as -, +, *, /)");
            operador = scanner.next().charAt(0);

            System.out.printf("Digite o segundo número");
            num2 = scanner.nextDouble();

            switch (operador) {

                case '-':
                    result = num1 - num2;
                    break;

                case '+':
                    result = num1 + num2;
                    break;

                case '*':
                    result = num1 * num2;
                    break;

                case '/':
                    result = num1 / num2;
                    break;

                default:
                    System.out.printf("Operador inválido...");

        }
        System.out.println( num1 +" " + operador + " " + num2 + " = " + result);

        System.out.println("Se desejar parar a calculadora digite 0, se não aperte qualquer botão");
        operador = scanner.next().charAt(0);
        if(operador==0){
            break;
        }


        }
    }
}
