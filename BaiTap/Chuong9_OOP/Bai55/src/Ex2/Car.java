package Ex2;

public class Car extends Automobile{
    private int numOfDoor;
    private int numOfSeat; // số ghế ngồi
    private String category;// loại xe
    private String driveForm; // hình thức dẫn động
    private String typeOfEnergy; // loai động cơ

    public Car() {
    }

    public Car(String brand, int year, float price, float weight) {
        super(brand, year, price, weight);
    }

    public Car(int numOfDoor, int numOfSeat, String category, String driveForm,
               String typeOfEnergy) {
        this.numOfDoor = numOfDoor;
        this.numOfSeat = numOfSeat;
        this.category = category;
        this.driveForm = driveForm;
        this.typeOfEnergy = typeOfEnergy;
    }

    public Car(int numOfWheel, String engineType, String name, String color, Owner owner,
               int numOfDoor, int numOfSeat, String category, String driveForm, String typeOfEnergy) {
        super(numOfWheel, engineType, name, color, owner);
        this.numOfDoor = numOfDoor;
        this.numOfSeat = numOfSeat;
        this.category = category;
        this.driveForm = driveForm;
        this.typeOfEnergy = typeOfEnergy;
    }

    // ghi đè phương thức của lớp cha
    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Xe con khởi động bằng công tắc");
    }

    @Override
    public void stopEngine() {
        super.stopEngine();
        System.out.println("Xe con tắt máy bằng công tắc");
    }

    @Override
    public void speedUp() {
        super.speedUp();
        System.out.println("Xe con tăng tốc bằng đạp ga");
    }

    @Override
    public void brake() {
        super.brake();
        System.out.println("Xe con phanh bằng phanh chân hoặc phanh tay");
    }

    @Override
    public void turnLight() {
        super.turnLight();
        System.out.println("Xe con bật đèn chiếu gần");
    }

    public int getNumOfDoor() {
        return numOfDoor;
    }

    public final void setNumOfDoor(int numOfDoor) {
        this.numOfDoor = numOfDoor;
    }

    public final int getNumOfSeat() {
        return numOfSeat;
    }

    public final void setNumOfSeat(int numOfSeat) {
        this.numOfSeat = numOfSeat;
    }

    public final String getCategory() {
        return category;
    }

    public final void setCategory(String category) {
        this.category = category;
    }

    public final String getDriveForm() {
        return driveForm;
    }

    public final void setDriveForm(String driveForm) {
        this.driveForm = driveForm;
    }

    public final String getTypeOfEnergy() {
        return typeOfEnergy;
    }

    public final void setTypeOfEnergy(String typeOfEnergy) {
        this.typeOfEnergy = typeOfEnergy;
    }
}
