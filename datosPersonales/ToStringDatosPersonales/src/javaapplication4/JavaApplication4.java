package javaapplication4;

public class JavaApplication4 {

    public static void main(String[] args) {
        Persona per1 = new Persona("Ale", "Farelli", 29, false);
        Persona per2 = new Persona("Roberto", "Ibarra", 45, true);
        Persona per3 = new Persona("Maria", "Ribera", 47, true);
        
        System.out.println(per1);
        System.out.println(per2);
        System.out.println(per3);
    }
    
}
