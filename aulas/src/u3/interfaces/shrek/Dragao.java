package u3.interfaces.shrek;

public class Dragao implements Passaro, Lagarto {

    @Override
    public void andaNoChao() {
       System.out.println("Anda no chão...");
        
    }

    @Override
    public void voar() {
        System.out.println("Voa pelo ar...");
        
    }

    @Override
    public String toString() {
        return "Dragao";
    }

    
    
    
}
