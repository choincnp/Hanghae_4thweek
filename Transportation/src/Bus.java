import exception.PassengerOutOfRange;

public class Bus implements Vehicle {
    private int busNum;
    private BusStatus busStatus;
    private int maxPerson;
    private int nowPerson;
    private int fare;
    private int oil;
    private int speed;

    public Bus() {
        this.busStatus = BusStatus.운행중;
        this.oil = 100;
    }

    public Bus(int busNum, BusStatus busStatus, int maxPerson, int nowPerson, int fare, int oil, int speed) {
        this.busNum = busNum;
        this.busStatus = busStatus;
        this.maxPerson = maxPerson;
        this.nowPerson = nowPerson;
        this.fare = fare;
        this.oil = oil;
        this.speed = speed;
    }

    @Override
    public void drive(int speed) {
        if (!checkOil()) System.out.println("주유량을 확인해 주세요");
        else setSpeed(getSpeed()+speed);
    }

    @Override
    public void board(int passenger) {
        if (checkPerson(passenger)&&getBusStatus().equals(BusStatus.운행중)) setNowPerson(getNowPerson()+passenger);
        else System.out.println("승객 상태나 버스 상태 확인 바람");
    }

    @Override
    public boolean checkOil() {
        return getOil() >= 10;
    }

    @Override
    public boolean checkPerson(int passenger) throws PassengerOutOfRange {
        try {
            if (getNowPerson()+passenger > getMaxPerson()) throw new PassengerOutOfRange();
        } catch (PassengerOutOfRange e) {
            System.out.println("공간이 없다니까");
            return false;
        }
        return true;
    }
    public BusStatus getBusStatus() {return busStatus;}
    public void setBusStatus(BusStatus busStatus) {
        if (!checkOil()) {
            System.out.println("주유가 필요합니다");
            this.busStatus = BusStatus.차고지행;
        }
        else this.busStatus = busStatus;
    }
    public int getBusNum() {return busNum;}
    public void setBusNum(int busNum) {this.busNum = busNum;}
    public int getMaxPerson() {return maxPerson;}
    public void setMaxPerson(int maxPerson) {this.maxPerson = maxPerson;}
    public int getNowPerson() {return nowPerson;}
    public void setNowPerson(int nowPerson) {this.nowPerson = nowPerson;}
    public int getFare() {return fare;}
    public void setFare(int fare) {this.fare = fare;}
    public int getOil() {return oil;}
    public void setOil(int oil) {this.oil += oil;}
    public int getSpeed() {return speed;}
    public void setSpeed(int speed) {this.speed = speed;}

    @Override
    public String toString() {
        return "["+getBusNum()+"번 버스 현황"+"]"+
                "\n탑승 승객 수 = "+getNowPerson()+
                "\n잔여 승객 수 = "+(getMaxPerson()-getNowPerson())+
                "\n요금 확인 = "+(getFare()*getNowPerson())+
                "\n주유량 = "+getOil()+
                "\n상태 = "+ getBusStatus()+
                (checkOil()? "": "\n주유가 필요합니다.")
                ;
    }
}
