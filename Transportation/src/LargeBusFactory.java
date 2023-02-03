public class LargeBusFactory extends BusFactory{
    @Override
    public Bus createBus(){
        setBusNum(++BusFactory.busNum);
        System.out.println(getBusNum()+"번 큰버스가 만들어졌습니다.");
        return new LargeBus(getBusNum());
    }
}
