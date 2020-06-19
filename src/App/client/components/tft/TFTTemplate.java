package client.components.tft;

import java.awt.Color;

import javax.swing.JPanel;

import services.ObjGraficosService;
import services.RecursosService;

public class TFTTemplate extends JPanel {
    
    private TFTComponent tftComponent;

    // Declaracion de servicios
    private ObjGraficosService sObjGraficos;
    private RecursosService sRecursos;

    public TFTTemplate(TFTComponent tftComponent){
        this.tftComponent = tftComponent;

        sObjGraficos = ObjGraficosService.getService();
        sRecursos = RecursosService.getService();

        this.setBounds(0, 0, 1055, 638);
        this.setLayout(null);
        this.setBackground(Color.DARK_GRAY);
    }
}