package lab6.prototype;

import lab6.prototype.model.Circulo;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        
        Circulo circulo = new Circulo(3, 5, 15);
        System.out.println(circulo);

        Circulo cloneCirculo = circulo.clone();
        
        System.out.println("-----------");
        System.out.println("ORIGINAL");
        System.out.println(circulo);
        System.out.println("-----------");

        System.out.println("-----------");
        System.out.println("CÓPIA");
        System.out.println(cloneCirculo);
        System.out.println("-----------");
        
        cloneCirculo.setX(5);
        cloneCirculo.setY(7);
        cloneCirculo.setRaio(17);
        System.out.println("-----------");
        System.out.println("CÓPIA MODIFICADA");
        System.out.println(cloneCirculo);
        System.out.println("-----------");

        System.out.println("-----------");
        System.out.println("ORIGINAL SEM ESTAR MODIFICADO (PROVA)");
        System.out.println(circulo);
        System.out.println("-----------");
    }
}
