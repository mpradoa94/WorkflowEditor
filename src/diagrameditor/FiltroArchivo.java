/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package diagrameditor;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author MPA
 */
class FiltroArchivo extends FileFilter {
    
    private final String extension;
    private final String descripcion;

    public FiltroArchivo(String extension, String descripcion) {
        this.extension = extension.toLowerCase();
        this.descripcion = descripcion;
    }

    @Override
    public boolean accept(File archivo) {
        return archivo.isDirectory() || archivo.getName().toLowerCase().endsWith(extension);
    }

    @Override
    public String getDescription() {
        return descripcion;
    }

    String getExtension() {
        return extension;
    }
    
}
