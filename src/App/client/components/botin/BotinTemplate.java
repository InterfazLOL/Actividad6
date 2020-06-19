package client.components.botin;

import java.awt.Color;

import javax.swing.JPanel;

import services.ObjGraficosService;
import services.RecursosService;

public class BotinTemplate extends JPanel {
    
    private BotinComponent botinComponent;

    // Declaracion de servicios
    private ObjGraficosService sObjGraficos;
    private RecursosService sRecursos;

    public BotinTemplate(BotinComponent botinComponent){

        this.botinComponent = botinComponent;
        sObjGraficos = ObjGraficosService.getService();
        sRecursos = RecursosService.getService();

        this.setBounds(0, 0, 1055, 638);
        this.setLayout(null);
        this.setBackground(Color.GREEN);
    }
}