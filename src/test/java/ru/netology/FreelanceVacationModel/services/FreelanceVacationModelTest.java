package ru.netology.FreelanceVacationModel.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FreelanceVacationModelTest {
    @Test
    void shouldMonthVacation1() {
        FreelanceVacationModel service = new FreelanceVacationModel();
        int expected = 3;
        int actual = service.calculate(10_000, 3_000, 20_000); // вызываем целевой метод
        Assertions.assertEquals(expected, actual);// производим проверку (сравниваем ожидаемый и фактический)
    }

    @Test
    void shouldMonthVacation2() {
        FreelanceVacationModel service = new FreelanceVacationModel();
        int expected = 2;
        int actual = service.calculate(100_000, 60_000, 150_000); // Вызываем целевой метод
        Assertions.assertEquals(expected, actual);// Производим проверку (сравниваем ожидаемый и фактический)
    }
}