package boletin15;

public class Seleccion {

    private int id;
    private String nome, apelidos;
    private int edade;

    public Seleccion() {

    }

    public Seleccion(int id, String nome, String apelidos, int edad) {
        this.id = id;
        this.apelidos = apelidos;
        this.nome = nome;
        this.edade = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelidos() {
        return apelidos;
    }

    public void setApelidos(String apelidos) {
        this.apelidos = apelidos;
    }

    public int getEdade() {
        return edade;
    }

    public void setEdade(int edade) {
        this.edade = edade;
    }

    public void concentrarse() {
        System.out.println("Concentrase a selección");
    }

    public void viajar() {
        System.out.println("Viaxa a selección");
    }
    
    public String visualizar(){
        return(id+", Nome: "+nome+" "+apelidos+", "+edade+" años");
    }
}
