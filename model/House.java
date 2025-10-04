package model;

/**
 * Клас для представлення житлового об'єкта (квартира).
 * Зберігає інформацію про ідентифікатор, номер квартири, площу,
 * поверх, кількість кімнат та вулицю.
 */
public class House {
    private int id;
    private int apartmentNumber;
    private double area;
    private int floor;
    private int roomsCount;
    private String street;

    /**
     * Створює новий об'єкт House із зазначеними параметрами.
     * @param id ідентифікатор
     * @param apartmentNumber номер квартири
     * @param area площа
     * @param floor поверх
     * @param roomsCount кількість кімнат
     * @param street назва вулиці
     */
    public House(int id, int apartmentNumber, double area, int floor, int roomsCount, String street) {
        this.id = id;
        this.apartmentNumber = apartmentNumber;
        this.area = area;
        this.floor = floor;
        this.roomsCount = roomsCount;
        this.street = street;
    }

    /**
     * Встановлює нові значення для всіх полів об'єкта.
     */
    public void setValue(int id, int apartmentNumber, double area, int floor, int roomsCount, String street) {
        this.id = id;
        this.apartmentNumber = apartmentNumber;
        this.area = area;
        this.floor = floor;
        this.roomsCount = roomsCount;
        this.street = street;
    }

    // Геттери для доступу до приватних полів:
    public int getId() { return id; }
    public int getApartmentNumber() { return apartmentNumber; }
    public double getArea() { return area; }
    public int getFloor() { return floor; }
    public int getRoomsCount() { return roomsCount; }
    public String getStreet() { return street; }

    /**
     * Повертає рядкове представлення об'єкта House.
     */
    public String toString() {
        return "House{" +
                "id=" + id +
                ", apartmentNumber=" + apartmentNumber +
                ", area=" + area +
                ", floor=" + floor +
                ", roomsCount=" + roomsCount +
                ", street='" + street + '\'' +
                '}';
    }
}
