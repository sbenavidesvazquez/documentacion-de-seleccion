package boletin15;

public class Adestrador extends Seleccion{
    
    private String idFederacion;
    
    public Adestrador(){
        super();
    }
    
    public Adestrador(int id, String nome, String apelido, int edad, String idF){
        super(id,nome,apelido,edad);
        this.idFederacion=idF;
    }

    
    public String getIdFederacion() {
        return idFederacion;
    }

    
    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
    
    public void dirixirPartido(){
        
    }
    
    public void dirixirAdestramento(){
        
    }
    
    @Override
    public void viajar() {
        System.out.println("Viaxa o Adestrador: ");
    }
    
    @Override
    public String visualizar(){
        return(super.visualizar()+", "+this.idFederacion);
    }
}
