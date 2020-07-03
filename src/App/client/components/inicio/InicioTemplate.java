package client.components.inicio;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import services.ObjGraficosService;
import services.RecursosService;

public class InicioTemplate extends JPanel {

    private InicioComponent inicioComponent;

    // Declaracion de servicios
    private ObjGraficosService sObjGraficos;
    private RecursosService sRecursos;

    private JLabel lFondo;
    private ImageIcon iFondo;

    public InicioTemplate(InicioComponent inicioComponent){

        this.inicioComponent = inicioComponent;
        sObjGraficos = ObjGraficosService.getService();
        sRecursos = RecursosService.getService();

        lFondo = new JLabel();
        lFondo.setBounds(0, 0, 1055, 638);
        iFondo = new ImageIcon("resources/img/inicio/fondoInicio.jpg");
        lFondo.setIcon(iFondo);
        this.add(lFondo);

        this.setBounds(0, 0, 1055, 638);
        this.setLayout(null);
        this.setBackground(null);
    }
}
