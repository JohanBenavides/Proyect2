package proyect2;

import java.io.*;

/**
 *
 * @author BOG-A409-E-023
 */
public class Proyect2 {
        
    static  BufferedReader br =  new  BufferedReader ( new  InputStreamReader ( System . in));
    static  BufferedWriter bw =  new  BufferedWriter ( new  OutputStreamWriter ( System . out));

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
            String [] cadena = new String[100];
            
            String texto = "En las vacaciones de este año primero fui diez días a un hotel con mi familia, en el hotel de al lado estaba un amigo y todos los días salíamos juntos a la piscina, a la playa, etc. En el hotel había un bufete donde íbamos a desayunar, almorzar y cenar, por la noche paseábamos por el paseo marítimo mientras nos tomábamos un helado, algunos días íbamos a otras playas que estaban más lejos del hotel, algunas eran salvajes, tenían el agua cristalina y había muchos peces y plantas, otros días los pasábamos en la piscina que era muy grande.";
            
            String textosincomas = texto.replaceAll(",", "");
            String textosinpuntos = textosincomas.replaceAll("\\.", "");
            String textofinal = textosinpuntos.replaceAll(" ", "♠");
            
            cadena = textofinal.split("♠");
            
            //bw.write(textofinal);
            
            for (int i =0;i<cadena.length;i++){
                //bw.write("\n"+cadena[i]);
                //bw.flush();
            }
            
            bw.write("Van "+cadena.length+" palabras\n");
            
            bw.flush();
            
        }catch (IOException ex) {}
        
    }
    
}
