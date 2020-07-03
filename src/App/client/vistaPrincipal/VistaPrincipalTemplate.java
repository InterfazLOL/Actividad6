package client.vistaPrincipal;

import java.awt.Color;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

import services.ObjGraficosService;
import services.RecursosService;

public class VistaPrincipalTemplate extends JFrame{

    private JPanel pSuperior, pCentral, pLateral, pFondo;
    private JLabel lFondo;
    private Border borde;

    private VistaPrincipalComponent vistaPrincipalComponent;
    private ObjGraficosService sObjGraficos;
    private RecursosService sRecursos;

    private ImageIcon iFondo;

    public VistaPrincipalTemplate(VistaPrincipalComponent vistaPrincipalComponent){
        this.vistaPrincipalComponent = vistaPrincipalComponent;
        sRecursos = RecursosService.getService();
        sObjGraficos = ObjGraficosService.getService();
        borde = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.WHITE);

        crearJPanels();
        //super("Vista principal");
        this.setTitle("Vista principal");
        this.setSize(1278, 720);
        this.setLocationRelativeTo(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setUndecorated(true); //Se quitan los barra superior con todas sus herramientas
        //this.getContentPane().setBackground(Color.BLUE); 
        this.setLayout(null);
        this.setVisible(true);
    }

    private void crearJPanels(){
        pSuperior = sObjGraficos.construirJPanel(0, 0, 1055, 79, null, null, null);
        pSuperior.setBorder(borde);
        this.add(pSuperior);
        pCentral = sObjGraficos.construirJPanel(0, 80, 1055, 640, null, null, null);
        this.add(pCentral);
        pLateral = sObjGraficos.construirJPanel(1055, 0, 223, 720, null, null, null);
        this.add(pLateral);
    }

    public JPanel getPSuperior(){
        return pSuperior;
    }

    public JPanel getPCentral(){
        return pCentral;
    }

    public JPanel getPLateral(){
        return pLateral;
    }
}