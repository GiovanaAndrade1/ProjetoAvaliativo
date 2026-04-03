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
public class Quadrado {
 
    private Ponto p1, p2, p3, p4;
 
    public Quadrado() {
        this.p1 = new Ponto();
        this.p2 = new Ponto();
        this.p3 = new Ponto();
        this.p4 = new Ponto();
    }
 
    public Quadrado(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        this.p1 = new Ponto(p1);
        this.p2 = new Ponto(p2);
        this.p3 = new Ponto(p3);
        this.p4 = new Ponto(p4);
    }
      private boolean iguais(double a, double b) {
        return Math.abs(a - b) < 1e-9;
    }
 
    public void imprimir() {
        System.out.println("Quadrado: " +
            p1.imprimir() + ", " +
            p2.imprimir() + ", " +
            p3.imprimir() + ", " +
            p4.imprimir());
    }
    public void adicionarQuadrado(Scanner sc) {
        System.out.println("-- Ponto 1 --");
        p1.adicionarPonto(sc);
        System.out.println("-- Ponto 2 --");
        p2.adicionarPonto(sc);
        System.out.println("-- Ponto 3 --");
        p3.adicionarPonto(sc);
        System.out.println("-- Ponto 4 --");
        p4.adicionarPonto(sc);
    }
 
    public boolean isQuadrado() {
       double lado1 = p1.distancia(p2);
       double lado2 = p2.distancia(p3);
       double lado3 = p3.distancia(p4);
       double lado4 = p4.distancia(p1);
 
       
       double diag1 = p1.distancia(p3);
       double diag2 = p2.distancia(p4);
 
        
       boolean ladosIguais = iguais(lado1, lado2) && iguais(lado2, lado3) && iguais(lado3, lado4);
 
   
       boolean pitagoras1 = iguais(diag1 * diag1, lado1 * lado1 + lado2 * lado2);
       boolean pitagoras2 = iguais(diag2 * diag2, lado2 * lado2 + lado3 * lado3);
 
       return ladosIguais && pitagoras1 && pitagoras2;
    }
 
    public double area() {
        if (!isQuadrado())
            return 0.0;
        double lado = p1.distancia(p2);
        return lado * lado;
    }
 
    public double perimetro() {
        if (!isQuadrado())
            return 0.0;
        double lado = p1.distancia(p2);
        return lado * 4;
    }
 
    public String tipo() {
        if (isQuadrado())
            return "Quadrado";
        else
            return "Os 4 pontos fornecidos não formam um quadrado.";
    }
 
    public Ponto getP1() { return p1; }
    public void setP1(Ponto p1) { this.p1 = new Ponto(p1); }
 
    public Ponto getP2() { return p2; }
    public void setP2(Ponto p2) { this.p2 = new Ponto(p2); }
 
    public Ponto getP3() { return p3; }
    public void setP3(Ponto p3) { this.p3 = new Ponto(p3); }
 
    public Ponto getP4() { return p4; }
    public void setP4(Ponto p4) { this.p4 = new Ponto(p4); }
}

/* utilizei a IA para me ensinar o porque o meu quadrado não estava retornando, 
mesmo com cordenadas reais, aprendi que dependendo da ordem das cordenadas não 
funciona corretamente, precisando calcular duas diagonais diferentes que 
retornam o mesmo resultado, também aprendi que o math.sqrt pode 'bugar' 
dependendo das casas decimais então tive que criar uma verificação apartir da 
< 1e-9 casa decimal. Também não sabia que o get mudava quando o atributo da 
classe era referencial de outro atruibuto de outra classe.*/
