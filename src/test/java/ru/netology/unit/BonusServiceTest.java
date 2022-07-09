package ru.netology.unit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void calculateBonus() {
//        3:подготовка данных, выполнение целевого действия, сравнение ожидаемого и фактического результата
        BonusService bonusService = new BonusService();
        int amount = 2000;
        int actual = bonusService.calculateBonus(amount);
        int expected = 10;
        assertEquals(expected, actual);
    }

}