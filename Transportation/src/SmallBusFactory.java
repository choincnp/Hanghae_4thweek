public class SmallBusFactory extends BusFactory{
    @Override
    public Bus createBus(){
        setBusNum(++BusFactory.busNum);
        System.out.println(getBusNum()+"번 작은 버스가 만들어졌습니다.");
        return new SmallBus(getBusNum());
    }
}
