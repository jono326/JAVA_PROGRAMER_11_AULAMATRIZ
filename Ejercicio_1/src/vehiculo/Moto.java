package vehiculo;

public class Moto extends Vehiculo{

    private boolean radiador;

    public Moto(String marca, String modelo, int cilindraje, boolean radiador) {
        super(marca, modelo, cilindraje);
        this.radiador = radiador;
    }

    public boolean isRadiador() {
        return radiador;
    }

    public void setRadiador(boolean radiador) {
        this.radiador = radiador;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "radiador=" + radiador +
                '}';
    }
}
