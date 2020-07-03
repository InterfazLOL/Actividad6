package client.components.juega;

public class JuegaComponent {
    
    private JuegaTemplate juegaTemplate;

    public JuegaComponent(){

        juegaTemplate = new JuegaTemplate(this);
    }

    public JuegaTemplate gJuegaTemplate(){
        return juegaTemplate;
    }
}