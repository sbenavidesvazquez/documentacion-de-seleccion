package boletin15;
/**
 * subclase adestrador
 * @author sbenavidesvazquez
 */
public class Adestrador extends Seleccion{
    
    private String idFederacion;
    /**
     * constructor vacio
     */
    public Adestrador(){
        super();
    }
    /**
     * constructor con parametros
     * @param id
     * @param nome
     * @param apelido
     * @param edad
     * @param idF 
     */
    public Adestrador(int id, String nome, String apelido, int edad, String idF){
        super(id,nome,apelido,edad);
        this.idFederacion=idF;
    }

    /**
     * 
     * @return id
     */
    public String getIdFederacion() {
        return idFederacion;
    }

    /**
     * 
     * @param idFederacion 
     */
    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
    /**
     * 
     */
    public void dirixirPartido(){
        
    }
    /**
     * 
     */
    public void dirixirAdestramento(){
        
    }
    /**
     * metodo sobrescrito
     */
    @Override
    public void viajar() {
        System.out.println("Viaxa o Adestrador: ");
    }
    /**
     * metodo sobrescrito
     * @return 
     */
    @Override
    public String visualizar(){
        return(super.visualizar()+", "+this.idFederacion);
    }
}
