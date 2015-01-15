package boletin15;
/**
 * subclase xogador
 * @author sbenavidesvazquez
 */
public class Xogador extends Seleccion{
    
    private int dorsal;
    private String demarcacion;

    /**
     * 
     */
    public Xogador(){
        super();
    }
    /**
     * 
     * @param id
     * @param nome
     * @param apelido
     * @param edad
     * @param dorsal
     * @param demarc 
     */
    public Xogador(int id, String nome, String apelido, int edad, int dorsal,String demarc){
        super(id,nome,apelido,edad);
        this.dorsal=dorsal;
        this.demarcacion=demarc;
    }
    /**
     * 
     * @return 
     */
    public int getDorsal() {
        return dorsal;
    }
     /**
      * 
      * @param dorsal 
      */   
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
    /**
     * 
     * @return 
     */    
    public String getDemarcacion() {
        return demarcacion;
    }
   /**
    * 
    * @param demarcacion 
    */     
    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
    /**
     * 
     */
    public void xogarPartido(){
        
    }
   /**
    * 
    */ 
    public void entrenar(){
        
    }
    /**
     * metodo sobrescrito
     */
    @Override
    public void viajar() {
        System.out.println("Viaxan os xogadores: ");
    }
    /**
     * metodo sobrescrito
     * @return 
     */
    @Override
    public String visualizar(){
        return(super.visualizar()+", "+this.demarcacion+", dorsal: "+this.dorsal);
    }
}
