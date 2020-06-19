package client.components.barraNotificaciones;

public class BarraLateralComponent {
    
    private BarraLateralTemplate barraLateralTemplate;

    public BarraLateralComponent(){
        barraLateralTemplate = new BarraLateralTemplate(this);
    }

    public BarraLateralTemplate getBarraLateralTemplate(){
        return barraLateralTemplate;
    }

}