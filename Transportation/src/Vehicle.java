import exception.PassengerOutOfRange;

public interface Vehicle {
    void drive(int speed);
    void board(int passenger);

    boolean checkOil();
    boolean checkPerson(int num) throws PassengerOutOfRange;
}
