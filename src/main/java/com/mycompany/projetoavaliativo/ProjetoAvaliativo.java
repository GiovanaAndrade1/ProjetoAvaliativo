/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetoavaliativo;
import Classes.Ponto;
import Classes.Quadrado;
import Classes.Triangulo;
import java.util.Scanner;
/**
 *
 * @author Giovana
 */
public class ProjetoAvaliativo {

 public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
 
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Criar Ponto");
            System.out.println("2 - Criar Triângulo");
            System.out.println("3 - Criar Quadrado");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
 
            switch (opcao) {
 
                case 1:
                    Ponto ponto = new Ponto();
                    ponto.adicionarPonto(sc);
                    System.out.println("\nPonto criado: ");
                    ponto.imprimir();
                    break;
 
                case 2:
                    Triangulo triangulo = new Triangulo();
                    triangulo.adicionarTriangulo(sc);
                    System.out.println("\nTriângulo criado:");
                    triangulo.imprimir();
                    System.out.println("É colinear? " + triangulo.isColineares());
                    System.out.println("Área: " + triangulo.area());
                    System.out.println("Perímetro: " + triangulo.perimetro());
                    System.out.println("Tipo: " + triangulo.tipo());
                    break;
 
                case 3:
                    Quadrado quadrado = new Quadrado();
                    quadrado.adicionarQuadrado(sc);
                    System.out.println("\nQuadrado criado:");
                    quadrado.imprimir();
                    System.out.println("É quadrado? " + quadrado.isQuadrado());
                    System.out.println("Área: " + quadrado.area());
                    System.out.println("Perímetro: " + quadrado.perimetro());
                    System.out.println("Tipo: " + quadrado.tipo());
                    break;
 
                case 0:
                    System.out.println("Encerrando...");
                    break;
 
                default:
                    System.out.println("Opção inválida!");
            }
 
        } while (opcao != 0);
 
        sc.close();
    }
}


/* Fiz uma tabela para o usuário escolher entre ponto, triângulo e quadrado mas 
tenho consciência que seria melhor somente oferecer os pontos e verificar se é 
um triângulo, quadrado ou colinear sem precisar do usuário pensar. vou melhorar 
o meu código na próxima :) */
