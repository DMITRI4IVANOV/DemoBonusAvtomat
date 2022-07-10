package ru.netology.unit;

import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static org.testng.AssertJUnit.assertEquals;

public class BonusServiceTest1 {

    @Test
    void calculateBonus() {
//        3:подготовка данных, выполнение целевого действия, сравнение ожидаемого и фактического результата
        BonusService bonusService = new BonusService();
        int amount = 3000;
        int actual = bonusService.calculateBonus(amount);
        int expected = 20;
        assertEquals(expected, actual);
    }
}