
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class Mate {
    int a=0;
    int b=0;
    int c=0;
    
    
    public Mate(){
        a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de a: "));
        b=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de b: "));
        c=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de c: "));
        double determinante=Math.pow(b, 2)-(4*a*c); //discriminante
        double eje= ((-b)/2*a); //eje de simetría y vertice x
        double y=((-determinante)/4*a); // vertice en y
        
        if (a<0){
            System.out.println("Concava hacia arriba");
        }
        else
            System.out.println("concava hacia abajo");
        
        if(determinante>0)
        {
            System.out.println("El discriminante es: "+ determinante);
            double x1=( (b*(-1))+ Math.sqrt(determinante))/(2*a);
            double x2=( (b*(-1))- Math.sqrt(determinante))/(2*a);
            System.out.println("Cortes en X:  x1 = " +x1+ " X2= " +x2);
        }
        else
            System.out.println("El determinante es negativo y no se puede completar la operacion");
            System.out.println("Corte en el eje Y es= 0"+ c);
            System.out.println("Dominio = R");
            System.out.println("Codominio = R");
            System.out.println("Eje de simetría es: "+eje+" , "+y);
            System.out.println("El punto máximo es: " +y+ " , "+eje);
            System.out.println("Crece: -∞"+eje);
            System.out.println("Decrece: "+eje+"+∞");
    }
    
    public static void main(String[] args) {
        new Mate();
    }
}