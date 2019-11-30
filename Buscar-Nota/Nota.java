/**
 * Clase Nota
 * 
 * @author López Santiago Oscar  
 * @version 30/11/2019
 */
public class Nota
{
    //inicializar variables de instancia 
    private String titulo;
    private String texto;

    /**
     * Constructor de objetos de clase Nota
     * @param 2 variables de tipo String  ti, te
     */
    public Nota(String ti,String te){
        //pon tu código aquí
        titulo=ti;
        texto=te;
    }
    //Cierre del constructor
    /**
     * Método que regresa el valor del  titulo de la nota 
     * @parem 
     * @return String
     */
    public String getitulo(){
        //pon tu código aquí
        return titulo;
    }
    //Cierre del método
    /**
     * Método que asigna un valor al titulo de la nota
     * @parem t del tipo String
     * @return void
     */
    public void setitulo(String t){
        //pon tu código aquí
        titulo=t;
    }
    //Cierre del método
    /**
     * Método que regresa el valor del titulo de la nota 
     * @parem 
     * @return String
     */
    public String getexto(){
        //pon tu código aquí
        return texto;
    }
    //Cierre del método
    /**
     * Método que asigna un valor al texto de la nota 
     * @parem t del tipo String
     * @return void
     */
    public void setexto(String t){
        //pon tu código aquí
        texto=t;
    }
    //Cierre del método
    /**
     * Método que regresa el valor del texto de la nota 
     * @parem 
     * @return String
     */
    public String getexto(String t){
        //pon tu código aquí
        return texto;
    }
    //Cierre del método
    /**
     * Método que regresa todo el texto de la nota
     * @parem 
     * @return String
     */
    public String toString (){
        //pon tu código aquí
        return "\nTitulo: "+titulo+"\n"+texto+"\n";
    }//Cierre del método
}//Cierre de la clase

