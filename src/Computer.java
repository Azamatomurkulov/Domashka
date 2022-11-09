public class Computer {

    private LCD lcd;
    private String brand;
    private String color;
    private SSD ssd;
    private Ram ram;
    private String videoCard;
    private USB usb;
    private Keyboard keyboard;

    public Computer(LCD lcd, String brand, String color, SSD ssd, Ram ram, String videoCard, USB usb, Keyboard keyboard) {
        this.lcd = lcd;
        this.brand = brand;
        this.color = color;
        this.ssd = ssd;
        this.ram = ram;
        this.videoCard = videoCard;
        this.usb = usb;
        this.keyboard = keyboard;
    }

    public LCD getLcd() {
        return lcd;
    }

    public void setLcd(LCD lcd) {
        this.lcd = lcd;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public SSD getSsd() {
        return ssd;
    }

    public void setSsd(SSD ssd) {
        this.ssd = ssd;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    public USB getUsb() {
        return usb;
    }

    public void setUsb(USB usb) {
        this.usb = usb;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    @Override
    public String toString() {
        return "Computer: " +
                "\n LCD: " + lcd +
                ". \n Brand: '" + brand + '\'' +
                ". \n Color: '" + color + '\'' +
                ". \n SSD: " + ssd +
                ". \n RAM: " + ram +
                ". \n VideoCard: '" + videoCard + '\'' +
                ". \n USB: " + usb +
                ". \n Keyboard: " + keyboard+".";
    }
}
