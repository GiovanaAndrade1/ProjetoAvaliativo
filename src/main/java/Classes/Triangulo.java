/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.Scanner;
/**
 *
 * @author Giovana
 */
public class Triangulo {
 
  private Ponto p1, p2, p3;
 
    public Triangulo() {
        this.p1 = new Ponto();
        this.p2 = new Ponto();
        this.p3 = new Ponto();
    }
 
    public Triangulo(Ponto p1, Ponto p2, Ponto p3) {
        this.p1 = new Ponto(p1);
        this.p2 = new Ponto(p2);
        this.p3 = new Ponto(p3);
    }
 
    public void imprimir() {
        System.out.println("Triângulo: " +
            p1.imprimir() + ", " +
            p2.imprimir() + ", " +
            p3.imprimir());
    }
    public void adicionarTriangulo(Scanner sc) {
        System.out.println("-- Ponto 1 --");
        p1.adicionarPonto(sc);
        System.out.println("-- Ponto 2 --");
        p2.adicionarPonto(sc);
        System.out.println("-- Ponto 3 --");
        p3.adicionarPonto(sc);
    }
 
    private double determinante() {
        double diagPrinc = p1.getX() * p2.getY() * 1 +
                           p1.getY() * 1 * p3.getX() +
                           1 * p2.getX()* p3.getY();
 
        double diagSec   = 1 * p2.getY() * p3.getX() +
                           p1.getX() * 1 * p3.getY() +
                           p1.getY() * p2.getX() * 1;
 
        return diagPrinc - diagSec;
    }
 
    public boolean isColineares() {
        return determinante() == 0;
    }
 
    public double area() {
        if (isColineares())
            return 0.0;
        return Math.abs(determinante() / 2.0);
    }
 
    public double perimetro() {
        double lado1 = p1.distancia(p2);
        double lado2 = p2.distancia(p3);
        double lado3 = p3.distancia(p1);
        return lado1 + lado2 + lado3;
    }
 
    public String tipo() {
        if (isColineares())
            return "Não é um triângulo (pontos colineares)";
 
        double lado1 = p1.distancia(p2);
        double lado2 = p2.distancia(p3);
        double lado3 = p3.distancia(p1);
 
        if (lado1 == lado2 && lado2 == lado3)
            return "Equilátero";
        else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3)
            return "Isósceles";
        else
            return "Escaleno";
    }
    
    public Ponto getP1() { return p1; }
    public void setP1(Ponto p1) { this.p1 = new Ponto(p1); }
 
    public Ponto getP2() { return p2; }
    public void setP2(Ponto p2) { this.p2 = new Ponto(p2); }
 
    public Ponto getP3() { return p3; }
    public void setP3(Ponto p3) { this.p3 = new Ponto(p3); }
}
