
package boletin15;


public class Boletin15 {

    
    public static void main(String[] args) {
        Seleccion sel=new Seleccion();
        Xogador xog=new Xogador(122,"Sergio","Benavides",21,12,"portero");
        Adestrador ades=new Adestrador(055,"Manuel","augusto",40,"");
        Masaxista mas=new Masaxista(280,"Javier","Teixeira",30,"masaxista",18);
        Seleccion obx=new Xogador(205,"Fran","Abril",22,23,"defensa");
        
        sel.concentrarse();
        xog.concentrarse();
        ades.concentrarse();
        mas.concentrarse();
        obx.concentrarse();
        
        sel.viajar();
        System.out.println(sel.visualizar());
        xog.viajar();
        System.out.println(xog.visualizar());
        ades.viajar();
        System.out.println(ades.visualizar());
        mas.viajar();
        System.out.println(mas.visualizar());
        obx.viajar();
        System.out.println(obx.visualizar());
    }
    
}
