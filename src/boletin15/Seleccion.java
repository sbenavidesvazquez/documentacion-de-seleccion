package boletin15;
/**
 * superclase que heredaran el resto
 * @author sbenavidesvazquez
 * @version 15/1/15C
 */
public class Seleccion {

    private int id;
    private String nome, apelidos;
    private int edade;
/**
 * constructor vacio
 */
    public Seleccion() {

    }
/**
 * constructor con parametros
 * @param id
 * @param nome
 * @param apelidos
 * @param edad 
 */
    public Seleccion(int id, String nome, String apelidos, int edad) {
        this.id = id;
        this.apelidos = apelidos;
        this.nome = nome;
        this.edade = edad;
    }
/**
 * 
 * @return id
 */
    public int getId() {
        return id;
    }
/**
 * 
 * @param id 
 */
    public void setId(int id) {
        this.id = id;
    }
/**
 * 
 * @return nome
 */
    public String getNome() {
        return nome;
    }
/**
 * 
 * @param nome 
 */
    public void setNome(String nome) {
        this.nome = nome;
    }
/**
 * 
 * @return apelidos
 */
    public String getApelidos() {
        return apelidos;
    }
/**
 * 
 * @param apelidos 
 */
    public void setApelidos(String apelidos) {
        this.apelidos = apelidos;
    }
/**
 * 
 * @return edad
 */
    public int getEdade() {
        return edade;
    }
/**
 * 
 * @param edade 
 */
    public void setEdade(int edade) {
        this.edade = edade;
    }
/**
 * salida por teclado
 */
    public void concentrarse() {
        System.out.println("Concentrase a selección");
    }
/**
 * salida por teclado
 */
    public void viajar() {
        System.out.println("Viaxa a selección");
    }
 /**
  * 
  * @return 
  */   
    public String visualizar(){
        return(id+", Nome: "+nome+" "+apelidos+", "+edade+" años");
    }
}
