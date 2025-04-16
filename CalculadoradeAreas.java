/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.calculadoratpa.calculadoradeareas;

/**
 *
 * @author Renato Aparecido da SIlva
 */
import java.util.Scanner;
public class CalculadoradeAreas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
                System.out.println("---- CALCULADORA DE ÁREAS ----");
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Área do Triângulo");
        System.out.println("2 - Área da Circunferência");
        System.out.println("3 - Área de um Cubo (Poliedro Regular)");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Digite a base do triângulo: ");
                double base = scanner.nextDouble();
                System.out.print("Digite a altura do triângulo: ");
                double altura = scanner.nextDouble();
                double areaTriangulo = (base * altura) / 2;
                System.out.println("Área do triângulo: " + areaTriangulo);
                break;

            case 2:
                System.out.print("Digite o raio da circunferência: ");
                double raio = scanner.nextDouble();
                double areaCircunferencia = Math.PI * Math.pow(raio, 2);
                System.out.println("Área da circunferência: " + areaCircunferencia);
                break;

            case 3:
                System.out.print("Digite a aresta do cubo: ");
                double aresta = scanner.nextDouble();
                double areaCubo = 6 * Math.pow(aresta, 2);
                System.out.println("Área do cubo: " + areaCubo);
                break;

            default:
                System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}
