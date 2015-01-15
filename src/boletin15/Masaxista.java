package boletin15;

public class Masaxista extends Seleccion{
    
    private String titulacion;
    private int anosExperiencia;
    
    public Masaxista(){
        super();
    }
    
    public Masaxista(int id, String nome, String apelido, int edad, String titulacion, int aExp){
        super(id,nome,apelido,edad);
        this.titulacion=titulacion;
        this.anosExperiencia=aExp;
    }
    
    public void darMasaxe(){
        
    }
    
    public String getTitulacion() {
        return titulacion;
    }
    
    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }
    
    public int getAnosExperiencia() {
        return anosExperiencia;
    }
   
    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }
    
    @Override
    public void viajar() {
        System.out.println("Viaxa o masaxista: ");
    }
    
    @Override
    public String visualizar(){
        return(super.visualizar()+", "+this.anosExperiencia+" anos de experiencia, "+this.titulacion);
    }
}
