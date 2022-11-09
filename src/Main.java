public class Main {

    public static void main(String[] args){


        Keyboard keyboard = new Keyboard(true,true);
        USB usb = new USB(2.0,"abty2159");
        Ram ram = new Ram(8,"DDR5");
        SSD ssd = new SSD(512,2);
        LCD lcd = new LCD(17.2,"Samsung","IPS");
        Computer computer = new Computer(lcd,"Asus","White",ssd,ram,"Nvidia",usb,keyboard);
        //System.out.println(computer);
        //System.out.println(computer.getRam().brand);
       ssd.setDividedFor(9);




    }
}
