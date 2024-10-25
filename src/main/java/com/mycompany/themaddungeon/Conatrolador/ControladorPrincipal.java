
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.themaddungeon.Conatrolador;


import com.mycompany.themaddungeon.Vista.GUIHistoria;
import com.mycompany.themaddungeon.Vista.GUIInstrucciones;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.mycompany.themaddungeon.Vista.GUIPrincipal;
import java.util.Set;


/**
 *
 * @author esteb
 */
public class ControladorPrincipal implements ActionListener {
    private GUIPrincipal guiPrincipal;
    private GUIInstrucciones guiInstrucciones;
    private GUIHistoria guiHistoria;
    
    //constructor

    public ControladorPrincipal() {
        guiPrincipal= new GUIPrincipal(this);
        guiInstrucciones = new GUIInstrucciones();
        guiInstrucciones.escuchar(this);
        guiHistoria = new GUIHistoria();
        guiHistoria.escuchar(this);
        guiPrincipal.setVisible(true);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()){
            case "instrucciones":
                guiPrincipal.setVisible(false);
                guiInstrucciones.setVisible(true);
            break;
            
            case "jugar":
                System.out.println("Presiono jugar");
            break;
            
             case "historia":
                guiPrincipal.setVisible(false);
                guiHistoria.setVisible(true);
                 
            break;
            
            case "btnatras":
                guiInstrucciones.setVisible(false);
                guiPrincipal.setVisible(true);
                
            break;
            
            case "btnatrashistoria":
               guiHistoria.setVisible(false);
               guiPrincipal.setVisible(true);
                
            break;
            
            
             case "salir":
                System.exit(0);
                
            break;
            
        }
        
        
    }
    
}
