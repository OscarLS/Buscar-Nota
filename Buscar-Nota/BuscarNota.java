import java.util.Queue;
import java.util.LinkedList;
import java.util.Vector;
/**
 * Clase Buscar notas busca las notas mediante una palabra o frace 
 * 
 * @author López Santiago Oscar  
 * @version 30/11/2019
 */
public class BuscarNota
{
    /**
     * Este método se encarga de la regresar las notas que contengan una palabra en el titulo
     * @param notas del tipo vector, datos del tipo String 
     * @return Queue<String>
     */
    public static Queue<String> buscarTitulo(Vector<Nota> notas, String dato)
    {
        //pon tu código aquí
        Queue<String> q=new LinkedList<>();
        for(Nota nota: notas)
            if(nota.getitulo().toUpperCase().contains(dato.toUpperCase()))
                q.add("\n"+nota.getitulo()+"\n"+nota.getexto()+"\n");
        return q;
    }

    /**
     * Este método se encarga de la regresar las notas que contengan una palabra en el texto
     * @param notas del tipo vector, datos del tipo String 
     * @return Queue<String>
     */
    public static Queue<String> buscarTexto(Vector<Nota> notas, String dato)
    {
        //pon tu código aquí
        Queue<String> q=new LinkedList<>();
        for(Nota nota: notas)
            if(nota.getexto().toUpperCase().contains(dato.toUpperCase()))
                q.add("\n"+nota.getitulo()+"\n"+nota.getexto()+"\n");
        return q;
    }//Cierre del método
}//Cierre de la clase
