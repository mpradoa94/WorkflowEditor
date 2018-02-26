/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package diagrameditor;

import core.webmet.EJBWebServicev20;
import core.webmet.GenerateUrlIndata;
import core.webmet.GenerateUrlResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MPA
 */
public class Precondiciones {
    private List funciones;
    
    public Precondiciones (){
        funciones = new ArrayList();
        getPrecondiciones(getUri());
    }
    
    private void getPrecondiciones(String uri){
        if (uri.length() > 0) {
           
            try {
                URL url = new URL(uri);
                URLConnection conn = url.openConnection();
                BufferedReader br = new BufferedReader(
                        new InputStreamReader(conn.getInputStream()));
                String inputLine;
                while ((inputLine = br.readLine()) != null) {
                    String[] inputSeparado = inputLine.split("=");
                    if (inputSeparado.length == 2)
                        funciones.add(new Precondicion(inputSeparado[0], inputSeparado[1]));
                    else if (inputSeparado.length == 1)
                        funciones.add(new Precondicion(inputSeparado[0]));
                }
            } catch (MalformedURLException ex) {
                Logger.getLogger(CuestionarioPanel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(CuestionarioPanel.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    private String getUri() {
        EJBWebServicev20 port = DiagramEditor.getPort();
        GenerateUrlIndata indata = new GenerateUrlIndata();
        indata.setNmArchivo("funciones.txt");
        indata.setNmContenedor("LegalPro Produccion/Notaria 52/23_307");
        
        GenerateUrlResponse respuesta = port.generaUrlW(indata);
        return respuesta.getURI();
    }
    
    public List getFunciones(){
        return funciones;
    }
    
}
