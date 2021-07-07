
import java.util.StringTokenizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gerardo Fac
 */
public class Traductor {

    /**
     * @return the idiomaOrigen
     */
    public static final int FRANCES = 0;
    public static final int ESPAÑOL = 1;
    public static final int INGLES = 2;
    public static final int NUM_IDIOMAS = 3;

    private int idiomaOrigen;
    private int idiomaDestino;

    private String[][] diccionario = {
        {"Longue", "Rédiut", "Pain", "Bombe", "Moto"},
        {"largo", "Barato", "Pan", "Petardo", "Moto"},
        {"Long", "Cheap", "Bread", "Bomb", "Motorbike"}};

    private static String[] cadena = {"Francés", "Español", "Inglés"};

    public Traductor() {
        this.idiomaOrigen = ESPAÑOL;
        this.idiomaDestino = INGLES;
    }

    public int getIdiomaOrigen() {
        return idiomaOrigen;
    }

    public void setIdiomaOrigen(int idiomaOrigen) {
        this.idiomaOrigen = idiomaOrigen;
    }

    public int getIdiomaDestino() {
        return idiomaDestino;
    }

    public void setIdiomaDestino(int idiomaDestino) {
        this.idiomaDestino = idiomaDestino;
    }
    public  String[] getCadenaIdioma(int codIdioma){
        return diccionario[codIdioma];
    }
    public String[] getPalabras(int codIdioma){
        return diccionario[codIdioma];
    }
    public void invierteIdioma(){
        int aux;
        aux=idiomaOrigen;
        idiomaOrigen=idiomaDestino;
        idiomaDestino=aux;
        
        
     }
    
    
    public String traducePalabra(String palabra){
        return this.traducePalabra(palabra,this.idiomaOrigen,this.idiomaDestino);
        
   
}

    public String traducePalabra(String palabra, int codOrigen, int codDestino) {
        int i=0;
        boolean encontrado=false;
        
        while ((i<diccionario[ESPAÑOL].length) && ! encontrado)
        {
            if (palabra.equalsIgnoreCase (
                diccionario[codOrigen][i])){
                encontrado=true;
                
            }else{
                i++;
            }
        
    }if (encontrado) {
            return diccionario[codDestino][i];
        }else{
        
    }
        return "X";
    }

    public String TraduceTexto(String texto){
        return this.TraduceTexto(texto,this.idiomaOrigen,this.idiomaDestino);
    }

    public String TraduceTexto(String texto, int codOrigen, int codDestino) {
        StringBuffer traduccion=new StringBuffer();
        StringTokenizer st=new StringTokenizer(texto,"\n");
        
        while (st.hasMoreTokens()){
            String palabra=st.nextToken();
            traduccion.append(this.traducePalabra(palabra, codOrigen, codDestino));
        }
        
        return traduccion.toString();
    }
    
}