package ru.netology.basics;

import org.junit.Test;
import org.junit.Assert;
public class CashBackHackerServiceTest {
    @Test
    public void ifAmountLessBoundary() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void ifAmountMoreBoundary() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 1100;

        int actual = service.remain(amount);
        int expected = 900;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void ifAmountEqualBoundary() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }

}
