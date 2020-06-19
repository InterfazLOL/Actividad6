package client.components.tienda;

import java.awt.Color;

import javax.swing.JPanel;

import services.ObjGraficosService;
import services.RecursosService;

public class TiendaTemplate extends JPanel {
    
    private TiendaComponent tiendaComponent;

    // Declaracion de servicios
    private ObjGraficosService sObjGraficos;
    private RecursosService sRecursos;

    public TiendaTemplate(TiendaComponent tiendaComponent){

        this.tiendaComponent = tiendaComponent;
        sObjGraficos = ObjGraficosService.getService();
        sRecursos = RecursosService.getService();

        this.setBounds(0, 0, 1055, 638);
        this.setLayout(null);
        this.setBackground(Color.LIGHT_GRAY);
    }
}