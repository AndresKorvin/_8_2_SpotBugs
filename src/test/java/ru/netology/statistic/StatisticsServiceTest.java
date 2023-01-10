package ru.netology.statistic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @ParameterizedTest
    @CsvFileSource (resources = "/data.csv")
    void findMax(long a0, long a1, long a2, long a3, long a4, long a5, long a6, long a7, long a8, long a9, long a10, long expected) {

        long[] incomesInBillions = {a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10};

        long actual = new StatisticsService().findMax(incomesInBillions);
        assertEquals(expected, actual);
    }
}