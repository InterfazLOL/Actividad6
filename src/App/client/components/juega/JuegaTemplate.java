package client.components.juega;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import services.ObjGraficosService;
import services.RecursosService;

public class JuegaTemplate extends JPanel {
    
    private JuegaComponent juegaComponent;

    // Declaracion de servicios
    private ObjGraficosService sObjGraficos;
    private RecursosService sRecursos;

    private JLabel lFondo;
    private ImageIcon iFondoJuega;

    public JuegaTemplate(JuegaComponent juegaComponent){
        this.juegaComponent = juegaComponent;

        sObjGraficos = ObjGraficosService.getService();
        sRecursos = RecursosService.getService();

        iFondoJuega = new ImageIcon("resources/img/juega/fondoJuega.jpg");
        lFondo = new JLabel();
        lFondo.setBounds(0, 0, 1055, 638);
        lFondo.setIcon(iFondoJuega);
        this.add(lFondo);

        this.setSize(1055, 638);
        this.setLayout(null);
        this.setBackground(null);
        this.setVisible(true);
    }
}