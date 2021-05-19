package prova2;



import java.util.ArrayList;
import java.util.List;

public class Automovel {
    
    private String marca;
    private String modelo;
    private int ano;
    private int km;
    private float valor;
    private List<Proprietario> proprietarios;


    public Automovel(String marca, String modelo, int ano, int km, float valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.km = km;
        this.valor = valor;
        this.proprietarios = new ArrayList<>();
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getKm() {
        return this.km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public float getValor() {
        return this.valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "{" +
            " marca='" + getMarca() + "'" +
            ", modelo='" + getModelo() + "'" +
            ", ano='" + getAno() + "'" +
            ", km='" + getKm() + "'" +
            ", valor='" + getValor() + "'" +
            "}";
    }

    public void adicionarProprietario(Proprietario cpf) {
		if (proprietarios.size() != 0) {
			System.out.println("Já existe proprietário!");
			return;
		}
		this.proprietarios.add(cpf);
	}

	public void removerProprietario(Proprietario cpf) {
		if (proprietarios.size() == 0) {
			System.out.println("Proprietario não encontrado!");
			return;
		}
		this.proprietarios.remove(cpf);
	}

    public void exibirProprietarios() {
		System.out.printf("\nLista de proprietarios do carro %s:\n", modelo);
		for (Proprietario a : proprietarios) {
			System.out.println(a.getCpf());

		}

	}

}
