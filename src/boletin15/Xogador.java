package boletin15;

public class Xogador extends Seleccion{
    
    private int dorsal;
    private String demarcacion;

    
    public Xogador(){
        super();
    }
    
    public Xogador(int id, String nome, String apelido, int edad, int dorsal,String demarc){
        super(id,nome,apelido,edad);
        this.dorsal=dorsal;
        this.demarcacion=demarc;
    }
    public int getDorsal() {
        return dorsal;
    }
        
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
        
    public String getDemarcacion() {
        return demarcacion;
    }
        
    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
    
    public void xogarPartido(){
        
    }
    
    public void entrenar(){
        
    }
    
    @Override
    public void viajar() {
        System.out.println("Viaxan os xogadores: ");
    }
    
    @Override
    public String visualizar(){
        return(super.visualizar()+", "+this.demarcacion+", dorsal: "+this.dorsal);
    }
}
