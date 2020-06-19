package client.vistaPrincipal;

import client.components.barraNavegacion.BarraSuperiorComponent;
import client.components.barraNotificaciones.BarraLateralComponent;
import client.components.botin.BotinComponent;
import client.components.clash.ClashComponent;
import client.components.coleccion.ColeccionComponent;
import client.components.inicio.InicioComponent;
import client.components.perfil.PerfilComponent;
import client.components.tft.TFTComponent;
import client.components.tienda.TiendaComponent;

import java.awt.event.ActionEvent;

public class VistaPrincipalComponent {

    private VistaPrincipalTemplate vistaPrincipalTemplate;
    private BarraSuperiorComponent barraSuperiorComponent;
    private BarraLateralComponent barraLateralComponent;
    private InicioComponent inicioComponent;
    private PerfilComponent perfilComponent;
    private ColeccionComponent coleccionComponent;
    private TFTComponent tftComponent;
    private ClashComponent clashComponent;
    private BotinComponent botinComponent;
    private TiendaComponent tiendaComponent;

    public VistaPrincipalComponent() {
        vistaPrincipalTemplate = new VistaPrincipalTemplate(this);
        barraSuperiorComponent = new BarraSuperiorComponent(this);
        vistaPrincipalTemplate.getPSuperior().add(barraSuperiorComponent.getBarraSuperiorTemplate());
        inicioComponent = new InicioComponent(this);
        vistaPrincipalTemplate.getPCentral().add(inicioComponent.gInicioTemplate());
        barraLateralComponent = new BarraLateralComponent();
        vistaPrincipalTemplate.getPLateral().add(barraLateralComponent.getBarraLateralTemplate());
    }

    public VistaPrincipalTemplate getVistaPrincipalTemplate() {
        return vistaPrincipalTemplate;
    }

    public void mostrarComponente(String componente, ActionEvent e) {
        vistaPrincipalTemplate.getPCentral().removeAll();
        switch (componente) {
            case "INICIO":
                vistaPrincipalTemplate.getPCentral().add(inicioComponent.gInicioTemplate());
                break;
            case "PERFIL":
                if (perfilComponent == null)
                    perfilComponent = new PerfilComponent(this);
                vistaPrincipalTemplate.getPCentral().add(perfilComponent.gPerfilTemplate());
                break;
            case "COLECCION":
                if (coleccionComponent == null)
                    coleccionComponent = new ColeccionComponent();
                vistaPrincipalTemplate.getPCentral().add(coleccionComponent.gColeccionTemplate());
                break;
            case "TFT":
                if (tftComponent == null)
                    tftComponent = new TFTComponent();
                vistaPrincipalTemplate.getPCentral().add(tftComponent.gTftTemplate());
                break;
            case "CLASH":
                if (clashComponent == null)
                    clashComponent = new ClashComponent();
                vistaPrincipalTemplate.getPCentral().add(clashComponent.gClashTemplate());
                break;
            case "":
                if(e.getSource()==barraSuperiorComponent.getBarraSuperiorTemplate().gBInicio()){
                    if (botinComponent == null) 
                        botinComponent = new BotinComponent();
                    vistaPrincipalTemplate.getPCentral().add(botinComponent.gBotinTemplate());
                }else{
                    if (tiendaComponent == null) 
                        tiendaComponent = new TiendaComponent();
                    vistaPrincipalTemplate.getPCentral().add(tiendaComponent.gTiendaTemplate());
                }
                break;
            default:
                break;
        }
        vistaPrincipalTemplate.getPCentral().repaint();
    }
}