package prova2;



public class Main {
    public static void main(String[] args) {
        
        var c1 = new Automovel("Hyundai", "i30", 2012, 40000, 30000.00f);
        var c2 = new Automovel("Ford", "EcoSport", 2020, 3000, 85000.00f);
        var p1 = new Proprietario("123");
        var p2 = new Proprietario("987");
        var p3 = new Proprietario("456");
        var p4 = new Proprietario("654");
        var p5 = new Proprietario("321");

        
        c1.adicionarProprietario(p1);
        c1.exibirProprietarios();
        c1.adicionarProprietario(p2);
        c1.removerProprietario(p1);
        c1.adicionarProprietario(p2);
        c1.exibirProprietarios();

        c2.adicionarProprietario(p3);
        c2.exibirProprietarios();
        c2.removerProprietario(p3);
        c2.adicionarProprietario(p4);
        c2.exibirProprietarios();
        c2.adicionarProprietario(p5);
        c2.removerProprietario(p4);
        c2.adicionarProprietario(p5);
        c2.exibirProprietarios();
    }
    
}
