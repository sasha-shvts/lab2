package main;

import model.House;

/**
 * Головний клас програми.
 * Створює масив об'єктів House, фільтрує та виводить їх за різними критеріями.
 */
public class Main {
    public static void main(String[] args) {
        House[] houses = {
                new House(1, 12, 85.0, 2, 3, "Shevchenko"),
                new House(2, 15, 64.5, 5, 2, "Centralna"),
                new House(3, 9, 90.0, 9, 4, "Kyivska"),
                new House(4, 21, 53.5, 1, 2, "Shevchenko"),
                new House(5, 17, 120.0, 8, 4, "Dniprovska")
        };
        int roomsCriterion = 4;
        int floorMin = 8;
        int floorMax = 10;
        double areaCriterion = 80.0;

        System.out.println("a) Квартири із " + roomsCriterion + " кімнатами:");
        filterByRoomsCount(houses, roomsCriterion);

        System.out.println("\nb) Квартири із " + roomsCriterion +
                " кімнатами на поверхах " + floorMin + "-" + floorMax + ":");
        filterByRoomsAndFloor(houses, roomsCriterion, floorMin, floorMax);

        System.out.println("\nc) Квартири з площею більше " + areaCriterion + ":");
        filterByArea(houses, areaCriterion);
    }

    /**
     * Виводить квартири з вказаною кількістю кімнат.
     */
    public static void filterByRoomsCount(House[] houses, int roomsCount) {
        for (House h : houses) {
            if (h.getRoomsCount() == roomsCount) {
                System.out.println(h);
            }
        }
    }

    /**
     * Виводить квартири з вказаною кількістю кімнат, які знаходяться на заданому діапазоні поверхів.
     */
    public static void filterByRoomsAndFloor(House[] houses, int roomsCount, int floorMin, int floorMax) {
        for (House h : houses) {
            if (h.getRoomsCount() == roomsCount &&
                    h.getFloor() >= floorMin &&
                    h.getFloor() <= floorMax) {
                System.out.println(h);
            }
        }
    }

    /**
     * Виводить квартири, площа яких перевищує задану.
     */
    public static void filterByArea(House[] houses, double minArea) {
        for (House h : houses) {
            if (h.getArea() > minArea) {
                System.out.println(h);
            }
        }
    }
}
