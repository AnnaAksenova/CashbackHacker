package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturn200IfAmountIs800() {
        CashbackHackService service = new CashbackHackService();
        int amount = 800;

        int actual = service.remain(amount);

        int expected = 200;

        assertEquals(expected,actual);
    }

    @Test
    public void shouldReturn1000IfAmountIs0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(amount);

        int expected = 1000;

        assertEquals(expected,actual);
    }
    @Test
    public void shouldReturn1IfAmountIs999() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;

        int actual = service.remain(amount);

        int expected = 1;

        assertEquals(expected,actual);
    }

    @Test
    public void shouldReturn400IfAmountIs600() {
        CashbackHackService service = new CashbackHackService();
        int amount = 600;

        int actual = service.remain(amount);

        int expected = 400;

        assertEquals(expected,actual);
    }

    @Test
    public void shouldReturn0IfAmountMore1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;

        int actual = service.remain(amount);

        int expected = 0;

        assertEquals(expected,actual);
    }
    @Test
    public void shouldReturn0IfAmountEqual1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);

        int expected = 0;

        assertEquals(expected,actual);
    }
}