package client.components.clash;

import java.awt.Color;

import javax.swing.JPanel;

import services.ObjGraficosService;
import services.RecursosService;

public class ClashTemplate extends JPanel {
    
    private ClashComponent clashComponent;

    // Declaracion de servicios
    private ObjGraficosService sObjGraficos;
    private RecursosService sRecursos;

    public ClashTemplate(ClashComponent clashComponent){
        
        this.clashComponent = clashComponent;
        sObjGraficos = ObjGraficosService.getService();
        sRecursos = RecursosService.getService();

        this.setBounds(0, 0, 1055, 638);
        this.setLayout(null);
        this.setBackground(Color.GRAY);
    }
}