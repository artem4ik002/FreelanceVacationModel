package ru.netology.FreelanceVacationModel.services;

public class FreelanceVacationModel {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // Счётчик месяцев отдыха
        int money = 0; // Количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // Можем ли отдыхать?
                count++; // Увеличиваем счётчик месяцев отдыха
                money = (money - expenses) / 3;
            } else {
                money = money + income - expenses;
            }
        }
        return count;
    }
}
