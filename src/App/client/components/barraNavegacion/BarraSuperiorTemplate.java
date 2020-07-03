package client.components.barraNavegacion;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import services.ObjGraficosService;
import services.RecursosService;

public class BarraSuperiorTemplate extends JPanel {

    private BarraSuperiorComponent barraSuperiorComponent;
    // Declaracion de servicios
    private ObjGraficosService sObjGraficos;
    private RecursosService sRecursos;

    private JButton bInicio, bPerfil, bColeccion, bTFT, bClash, bTienda, bBotin, bJugar;
    private JLabel lRP, lEsenciaAzul, lFondo;

    private ImageIcon iAux, iPerfil, iColeccion, iBotin, iTienda, iRP, iEsenciaAzul, iFondoInicio, iFondoTFT,
            iFondoPerfil, iFondoColeccion, iFondoClash, iFondoJugar, iFondoTienda, iFondoBotin;
    private Font fuente;

    public BarraSuperiorTemplate(BarraSuperiorComponent barraSuperiorComponent) {
        this.barraSuperiorComponent = barraSuperiorComponent;
        sObjGraficos = ObjGraficosService.getService();
        sRecursos = RecursosService.getService();

        crearObjDecoradores();
        crearJButtons();
        crearJLabels();

        lFondo = new JLabel();
        lFondo.setSize(1055, 80);
        lFondo.setIcon(iFondoInicio);
        this.add(lFondo);

        this.setSize(1055, 80);
        this.setLayout(null);
        this.setBackground(null);
        // this.setBorder(bordeInf);
        this.setVisible(true);
    }

    private void crearObjDecoradores() {

        iPerfil = new ImageIcon("resources/img/barraSuperior/perfil.png");
        iColeccion = new ImageIcon("resources/img/barraSuperior/coleccion.png");
        iBotin = new ImageIcon("resources/img/barraSuperior/botin.png");
        iTienda = new ImageIcon("resources/img/barraSuperior/tienda.png");
        iRP = new ImageIcon("resources/img/barraSuperior/rp.png");
        iEsenciaAzul = new ImageIcon("resources/img/barraSuperior/esenciaAzul.png");
        iFondoInicio = new ImageIcon("resources/img/barraSuperior/fondoInicio.jpg");
        iFondoTFT = new ImageIcon("resources/img/barraSuperior/fondoTFT.jpg");
        iFondoJugar = new ImageIcon("resources/img/barraSuperior/fondoJugar.jpg");
        iFondoClash = new ImageIcon("resources/img/barraSuperior/fondoClash.jpg");
        iFondoPerfil = new ImageIcon("resources/img/barraSuperior/fondoPerfil.jpg");
        iFondoColeccion = new ImageIcon("resources/img/barraSuperior/fondoColeccion.jpg");
        iFondoBotin = new ImageIcon("resources/img/barraSuperior/fondoBotin.jpg");
        iFondoTienda = new ImageIcon("resources/img/barraSuperior/fondoTienda.jpg");
        fuente = new Font("Cambria", Font.BOLD, 16);
    }

    private void crearJLabels() {

        lRP = new JLabel(" 45");
        lRP.setBounds(960, 20, 80, 20);
        iAux = new ImageIcon(iRP.getImage().getScaledInstance(15, 15, Image.SCALE_AREA_AVERAGING));
        lRP.setFont(fuente);
        lRP.setForeground(Color.WHITE);
        lRP.setIcon(iAux);
        this.add(lRP);
        lEsenciaAzul = new JLabel(" 6271");
        lEsenciaAzul.setBounds(962, 42, 80, 20);
        iAux = new ImageIcon(iEsenciaAzul.getImage().getScaledInstance(12, 17, Image.SCALE_AREA_AVERAGING));
        lEsenciaAzul.setIcon(iAux);
        lEsenciaAzul.setFont(fuente);
        lEsenciaAzul.setForeground(Color.WHITE);
        this.add(lEsenciaAzul);
    }

    private void crearJButtons() {
        /*
         * bJugar = sObjGraficos.crearJButton("Juega", 60, 20, 130, 40,
         * sRecursos.getcMano(), null, null, sRecursos.getColorFndoJuega(), Color.WHITE,
         * null, "c", false, false);
         */
        bJugar = new JButton("JUEGA");
        bJugar.setBounds(60, 20, 130, 40);
        bJugar.setBackground(sRecursos.getColorFndoJuega());
        bJugar.addActionListener(barraSuperiorComponent);
        bJugar.setFont(fuente);
        bJugar.setForeground(Color.WHITE);
        bJugar.setFocusable(false);
        this.add(bJugar);
        bInicio = sObjGraficos.crearJButton("INICIO", 215, 0, 80, 80, sRecursos.getcMano(), null, null,
                new Color(0, 0, 14), Color.WHITE, null, "c", false, false);
        bInicio.addActionListener(barraSuperiorComponent);
        bInicio.setForeground(sRecursos.getColorHerramietas());
        bInicio.setFont(fuente);
        this.add(bInicio);
        bTFT = sObjGraficos.crearJButton("TFT", 295, 0, 60, 80, sRecursos.getcMano(), null, null, Color.CYAN, null,
                null, "c", false, false);
        bTFT.addActionListener(barraSuperiorComponent);
        bTFT.setFont(fuente);
        bTFT.setForeground(sRecursos.getColorHerramietas());
        this.add(bTFT);
        bClash = sObjGraficos.crearJButton("CLASH", 355, 0, 80, 80, sRecursos.getcMano(), null, null, Color.DARK_GRAY,
                null, null, "c", false, false);
        bClash.addActionListener(barraSuperiorComponent);
        bClash.setFont(fuente);
        bClash.setForeground(sRecursos.getColorHerramietas());
        this.add(bClash);
        iAux = new ImageIcon(iPerfil.getImage().getScaledInstance(25, 23, Image.SCALE_AREA_AVERAGING));
        bPerfil = sObjGraficos.crearJButton("", 710, 0, 55, 80, sRecursos.getcMano(), iAux, null, null, null, null, "c",
                false, false);
        bPerfil.addActionListener(barraSuperiorComponent);
        this.add(bPerfil);
        iAux = new ImageIcon(iColeccion.getImage().getScaledInstance(26, 24, Image.SCALE_AREA_AVERAGING));
        bColeccion = sObjGraficos.crearJButton("", 765, 0, 55, 80, sRecursos.getcMano(), iAux, null, null, null, null,
                "c", false, false);
        bColeccion.addActionListener(barraSuperiorComponent);
        this.add(bColeccion);
        iAux = new ImageIcon(iBotin.getImage().getScaledInstance(24, 24, Image.SCALE_AREA_AVERAGING));
        bBotin = sObjGraficos.crearJButton("", 820, 0, 55, 80, sRecursos.getcMano(), iAux, null, null, null, null, "c",
                false, false);
        bBotin.addActionListener(barraSuperiorComponent);
        this.add(bBotin);
        iAux = new ImageIcon(iTienda.getImage().getScaledInstance(25, 24, Image.SCALE_AREA_AVERAGING));
        bTienda = sObjGraficos.crearJButton("", 875, 0, 55, 80, sRecursos.getcMano(), iAux, null, null, null, null, "c",
                false, false);
        bTienda.addActionListener(barraSuperiorComponent);
        this.add(bTienda);
    }

    public JButton gBInicio() {
        return bInicio;
    }

    public JButton gBPerfil() {
        return bPerfil;
    }

    public JButton gBBotin() {
        return bBotin;
    }

    public JButton gBColeccion() {
        return bColeccion;
    }

    public JButton gBTienda() {
        return bTienda;
    }

    public JLabel getLFondo() {
        return lFondo;
    }

    public void fondo(String fondo) {
        switch (fondo) {
            case "J":
                lFondo.setIcon(iFondoJugar);
                break;
            case "I":
                lFondo.setIcon(iFondoInicio);
                break;
            case "T":
                lFondo.setIcon(iFondoTFT);
                break;
            case "CL":
                lFondo.setIcon(iFondoClash);
                break;
            case "P":
                lFondo.setIcon(iFondoPerfil);
                break;
            case "TI":
                lFondo.setIcon(iFondoTienda);
                break;
            case "B":
                lFondo.setIcon(iFondoBotin);
                break;
            case "CO":
                lFondo.setIcon(iFondoColeccion);
                break;           
            default:
                break;
        }
    }

}
