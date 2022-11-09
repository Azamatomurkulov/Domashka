public class Ram {

    private int volume;
    String brand;

    public Ram(int volume, String brand) {
        this.volume = volume;
        this.brand = brand;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return
                "Volume: " + volume +
                ", Brand: '" + brand + '\'' ;
    }
}
