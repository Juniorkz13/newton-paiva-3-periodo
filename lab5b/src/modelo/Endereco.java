package modelo;

import javax.persistence.Embeddable;

@Embeddable
public class Endereco {
    
    private String endereco;


    public Endereco() {
    }


    public Endereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    

}
