/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package diagrameditor;

import java.io.Serializable;
import javax.swing.JPanel;

/**
 *
 * @author MPA
 */
public interface Nodo extends Serializable{
    
    public void setEtiqueta(String valor);
    public String getEtiqueta();
    public void setNombre(String nombre);
    public String getNombre();
    public String generateXMLstringInicio();
    public String generateXMLstringFin();
}
