package client.components.inicio;

import client.vistaPrincipal.VistaPrincipalComponent;

public class InicioComponent {
    
    private InicioTemplate inicioTemplate;
    private VistaPrincipalComponent vistaPrincipalComponent;

    public InicioComponent(VistaPrincipalComponent vistaPrincipalComponent){

        this.vistaPrincipalComponent = vistaPrincipalComponent;
        inicioTemplate = new InicioTemplate(this);
    }

    public InicioTemplate gInicioTemplate(){
        return inicioTemplate;
    }
}