package boletin15;
/**
 * subclase masaxista
 * @author sbenavidesvazquez
 */
public class Masaxista extends Seleccion{
    
    private String titulacion;
    private int anosExperiencia;
    /**
     * constructor vacio
     */
    public Masaxista(){
        super();
    }
    /**
     * constructor con parametros
     * @param id
     * @param nome
     * @param apelido
     * @param edad
     * @param titulacion
     * @param aExp 
     */
    public Masaxista(int id, String nome, String apelido, int edad, String titulacion, int aExp){
        super(id,nome,apelido,edad);
        this.titulacion=titulacion;
        this.anosExperiencia=aExp;
    }
    /**
     * 
     */
    public void darMasaxe(){
        
    }
    /**
     * 
     * @return 
     */
    public String getTitulacion() {
        return titulacion;
    }
    /**
     * 
     * @param titulacion 
     */
    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }
    /**
     * 
     * @return años esperiencia
     */
    public int getAnosExperiencia() {
        return anosExperiencia;
    }
   /**
    * 
    * @param anosExperiencia 
    */
    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }
    /**
     * sobreescrito
     */
    @Override
    public void viajar() {
        System.out.println("Viaxa o masaxista: ");
    }
    /**
     * sobrescrito
     * @return 
     */
    @Override
    public String visualizar(){
        return(super.visualizar()+", "+this.anosExperiencia+" anos de experiencia, "+this.titulacion);
    }
}
