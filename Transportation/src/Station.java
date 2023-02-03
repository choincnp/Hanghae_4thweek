public class Station {
    public static void main(String[] args) {
        BusFactory largeBusFactory = new LargeBusFactory();
        BusFactory smallBusFactory = new SmallBusFactory();
        Bus bus = largeBusFactory.createBus();
        Bus bus1 = smallBusFactory.createBus();
        System.out.println(bus);
        bus.board(2);
        System.out.println(bus);
        bus.setOil(-50);
        System.out.println(bus);
        bus.setBusStatus(BusStatus.차고지행);
        bus.setOil(10);
        System.out.println(bus);
        bus.setBusStatus(BusStatus.운행중);
        bus.board(50);
        System.out.println(bus);
        bus.board(5);
        bus.setOil(-55);
        System.out.println(bus);


    }
}
