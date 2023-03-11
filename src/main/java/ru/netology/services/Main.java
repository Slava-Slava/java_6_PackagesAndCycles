package ru.netology.services;

public class Main {
    public static void main(String[] args) {
        RestService service = new RestService();
        // int rest = service.calculate(100_000, 60_000, 150_000);
        // System.out.println("Количество месяцев отдыха в году: " + rest);
        System.out.println("Количество месяцев отдыха в году: " + service.calculate(100_000, 60_000, 150_000));
    }
}