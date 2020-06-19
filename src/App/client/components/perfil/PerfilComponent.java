package client.components.perfil;

import client.vistaPrincipal.VistaPrincipalComponent;

public class PerfilComponent {
    
    private PerfilTemplate perfilTemplate;
    private VistaPrincipalComponent vistaPrincipalComponent;

    public PerfilComponent(VistaPrincipalComponent vistaPrincipalComponent){
        this.vistaPrincipalComponent = vistaPrincipalComponent;
        perfilTemplate = new PerfilTemplate(this);
    }

    public PerfilTemplate gPerfilTemplate(){
        return perfilTemplate;
    }
}