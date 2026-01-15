package javabot;

public class Robot {
    private String nombre;
    
    public Robot (String nombre){
        setNombre(nombre);
    }
    public void setNombre(String nombre) {
        if(nombre != null){
            this.nombre = nombre;
    }
    }
    public void saludar(){
        saludar("extranio");
    }
    public void saludar(String nombrePersona){
        System.out.println("Hola "+ nombrePersona+ " mi nombre es "+ nombre);
         }
    }

