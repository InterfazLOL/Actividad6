package client.components.perfil;

import java.awt.Color;

import javax.swing.JPanel;

import services.ObjGraficosService;
import services.RecursosService;

public class PerfilTemplate extends JPanel{
    
    private PerfilComponent perfilComponent;

    // Declaracion de servicios
    private ObjGraficosService sObjGraficos;
    private RecursosService sRecursos;

    public PerfilTemplate(PerfilComponent perfilComponent) {
    
        this.perfilComponent = perfilComponent;
        sObjGraficos = ObjGraficosService.getService();
        sRecursos = RecursosService.getService();

        this.setBounds(0, 0, 1055, 638);
        this.setLayout(null);
        this.setBackground(Color.BLUE);
    }
}