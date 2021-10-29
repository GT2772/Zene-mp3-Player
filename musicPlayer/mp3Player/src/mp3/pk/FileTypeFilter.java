/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp3.pk;

import java.io.File;
import javax.swing.filechooser.FileFilter;


public class FileTypeFilter extends FileFilter{
    

    private final String extension;
    private final String description;
    

    public FileTypeFilter(String extension, String description){
        this.extension = extension;
        this.description = description;
    }
    
    @Override
    public boolean accept(File file) {
        // If File Is Returning Directory
        if(file.isDirectory()){
            return true;
        }
        // Return File Name with Extension
        return file.getName().endsWith(extension);
    }

    @Override
    public String getDescription() {
        // Return To Display File Type and Description
        return description + String.format(" (*%s)", extension);
    }
    
}
