package practice.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateOperationTest {

    @Test
    void getAge() {
        assertEquals(43, DateOperation.getAge("07/10/1980"));
        assertEquals(37, DateOperation.getAge("1986-08-18"));
    }

    @Test
    void sortStringDates() {
        String[] dates = {"2000-12-01", "10/12/2000", "1970-08-12", "2010-10-05"};
        String[] expected = {"1970-08-12", " 2000-12-01", "10/12/2000", "2010-10-05"};
        String[] actual = DateOperation.sortStringDates(dates);
        assertArrayEquals(expected, actual);
    }
}