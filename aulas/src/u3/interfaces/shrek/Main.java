package u3.interfaces.shrek;

public class Main {
    public static void main(String[] args) {
        
        var dragao = new Dragao();

        dragao.andaNoChao();
        dragao.voar();

        var castelo = new Castelo();
        castelo.entrarPelaJanela(dragao);
        castelo.entrarPelaPorta(dragao);
    }
}
