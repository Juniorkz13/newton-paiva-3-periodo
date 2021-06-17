package lab6.prototype.model;

public class Circulo implements Cloneable {

    private int x;
    private int y;
    private int raio;

    public Circulo(int x, int y, int raio) {
        super();
        this.x = x;
        this.y = y;
        this.raio = raio;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRaio() {
        return this.raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    @Override
    public String toString() {
        return "Circulo [x=" + x + ", y=" + y + ", raio=" + raio + "]";
    }

    public Circulo clone() throws CloneNotSupportedException {

        return (Circulo) super.clone();
    }

}
