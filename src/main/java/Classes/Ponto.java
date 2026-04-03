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
public class Ponto {
    
    private double x;
    private double y;

    public Ponto() {
        this.x = 0.0;
        this.y = 0.0;        
    }

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Ponto(Ponto outro){
        this.x = outro.getX();
        this.y = outro.getY();
    }
    
    public String imprimir(){
        String texto = "";
        texto = "("+this.x+", "+ this.y+")";
        return texto;
    }
    
    public double distancia(Ponto outro){
        double dist = 0.0;
        
        double dx = this.x - outro.getX();
        double dy = this.y - outro.getY();
        
        dist = Math.sqrt(dx*dx + dy*dy);
        
        return dist;
    }
      public void adicionarPonto(Scanner sc) {
        System.out.print("Digite o valor de X: ");
        this.x = sc.nextDouble();
        System.out.print("Digite o valor de Y: ");
        this.y = sc.nextDouble();
    }
    
    
    /**
     * @return the x
     */
    public double getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public double getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(double y) {
        this.y = y;
    }
    
    
}
