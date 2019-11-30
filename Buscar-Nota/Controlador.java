import java.util.Vector;
import javax.swing.JOptionPane;
/**
 * Clase Controlador
 * 
 * @author López Santiago Oscar  
 * @version 30/11/2019
 */
public class Controlador
{
    /**
     * Este método se encarga de la ejecución del programa
     * @param args [] ignorar-
     * @return void
     */
    public static void main(String [] args)
    {
        //pon tu código aquí
        BuscarNota busqueda=new BuscarNota();
        Vector<Nota> bn= new Vector();
        int caso;
        boolean x=true;

        while(x){
            caso=0;
            while(caso==0){
                try{
                    caso=Integer.parseInt(JOptionPane.showInputDialog("Opciones\n1:Agregar Nota\n2:Eliminar\n3:Buscar pot Titulo\n4"+
                            "Buscar por Texto\n5:Salir"));
                }catch(NumberFormatException miExcepcion){
                    System.out.println("Opcion invalido");
                }
            }
            switch(caso){
                case 1:
                bn.add(new Nota(JOptionPane.showInputDialog("Titulo de Nota"),JOptionPane.showInputDialog("Texto")));
                break;
                case 2:
                String eli=JOptionPane.showInputDialog("Eliminar nota con titulo:");
                for(int t=0;t<bn.size();t++)
                    if(bn.get(t).getitulo().toUpperCase().contains(eli.toUpperCase()))
                        bn.remove(t);
                break;
                case 3:
                System.out.println(busqueda.buscarTitulo(bn,JOptionPane.showInputDialog("Buscar Notas que contengan en el Titulo:")));
                break;
                case 4:
                System.out.println(busqueda.buscarTexto(bn,JOptionPane.showInputDialog("Buscar Notas que contengan en el Texto:")));
                break;
                case 5:
                x=false; 
                break;
            }
        }
    }//Cierre del método
}//Cierre de la clase
