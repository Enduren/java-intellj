

public class app {
    public static void main(String[] args) {
        Computer computer1 = new Computer();
        computer1.GPU= "Nvidia";
        computer1.Harddisk= "WD";
        computer1.motherboard= "motherboard";
        computer1.RAM= 1024;
        System.out.println(computer1.GPU);
        System.out.println(computer1.Harddisk);
        System.out.println(computer1.motherboard);
        System.out.println(computer1.RAM);
    }
}
