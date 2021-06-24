package lab7.proxy.model;

public class Cliente {

    private String codAgencia;
    private String numero;
    private String senha;
    private String codLetras;


    public Cliente(String codAgencia, String numero, String senha, String codLetras) {
        this.codAgencia = codAgencia;
        this.numero = numero;
        this.senha = senha;
        this.codLetras = codLetras;
    }

    public String getCodAgencia() {
        return this.codAgencia;
    }

    public void setCodAgencia(String codAgencia) {
        this.codAgencia = codAgencia;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCodLetras() {
        return this.codLetras;
    }

    public void setCodLetras(String codLetras) {
        this.codLetras = codLetras;
    }
    
}
