package Automobil;

public class Camion extends Automobil{
    private String culoare;
    private int pretRecomandat = 50000;
    private int anul;

    public Camion(String culoare, int anul) {
        super("CAMION");
        this.culoare = culoare;
        this.anul = anul;
    }

    public String getCuloare() {
        return culoare;
    }

    public int getPretRecomandat() {
        return pretRecomandat;
    }

    public int getAnul() {
        return anul;
    }

    public void setPretRecomandat(int pretRecomandat) {
        this.pretRecomandat = pretRecomandat;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", culoare='" + culoare + '\'' +
                ", pretRecomandat=" + pretRecomandat + " lei" +
                ", anul=" + anul;
    }
}
