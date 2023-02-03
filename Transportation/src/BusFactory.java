abstract class BusFactory implements Factory {

    public static int busNum = 0;

    public abstract Bus createBus();

    public static int getBusNum() {return busNum;}

    public static void setBusNum(int busNum) {BusFactory.busNum = busNum;}
}
