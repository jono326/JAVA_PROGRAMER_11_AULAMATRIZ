package vehiculo;

public class Auto extends Vehiculo {

    private int ejes;
    private String transmision;

    public Auto(String marca, String modelo, int cilindraje, int ejes, String transmision) {
        super( marca, modelo, cilindraje);
        this.ejes = ejes;
        this.transmision = transmision;
    }

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;


    }



    @Override
    public String toString() {
        return "Auto{" +
                "ejes=" + ejes +
                ", transmision='" + transmision + '\'' +
                '}';
    }
}



