import exception.PassengerOutOfRange;

public class Taxi implements Vehicle {
    @Override
    public void drive(int speed) {

    }

    @Override
    public void board(int passenger) {

    }

    @Override
    public boolean checkOil() {
        return false;
    }

    @Override
    public boolean checkPerson(int num) throws PassengerOutOfRange {
        return false;
    }
}
