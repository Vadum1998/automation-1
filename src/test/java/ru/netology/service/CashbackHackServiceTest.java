package ru.netology.service;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void minimumBuy() {
        int amount = 100;
        int expected = 900;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);

        assertEquals(expected, actual);

    }

    @org.junit.Test
    public void averageBuy() {
        int amount = 500;
        int expected = 500;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void maximumBuy() {
        int amount = 900;
        int expected = 100;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(expected, actual);


    }

    @org.junit.Test
    public void maximumBuy2() {
        int amount = 1000;
        int expected = 0;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
}