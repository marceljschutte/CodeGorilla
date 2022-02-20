package nl.codegorilla.CodeGorilla;

import nl.codegorilla.CodeGorilla.exercises.dag6.exercise1.JavaTimeExercise;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.*;

public class JavaTimeExerciseTest {

    JavaTimeExercise test = new JavaTimeExercise();


    @Test
    void testAddYear() {
        LocalDate localDate = LocalDate.of(2018, 10, 20);
        LocalDate expected = LocalDate.of(2019, 10, 20);

        LocalDate actual = test.addOneYear(localDate);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testAddMonth() {
        LocalDate localDate = LocalDate.of(2018, 10, 20);
        LocalDate expected = LocalDate.of(2018, 11, 20);

        LocalDate actual = test.addOneMonth(localDate);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testAddDay() {
        LocalDate localDate = LocalDate.of(2018, 10, 20);
        LocalDate expected = LocalDate.of(2018, 10, 21);

        LocalDate actual = test.addOneDay(localDate);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testAddHour() {
        LocalTime localTime = LocalTime.of(10, 5, 20);
        LocalTime expected = LocalTime.of(11, 5, 20);

        LocalTime actual = test.addOneHour(localTime);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testAddMinute() {
        LocalTime localTime = LocalTime.of(10, 5, 20);
        LocalTime expected = LocalTime.of(10, 6, 20);

        LocalTime actual = test.addOneMinute(localTime);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testAddSecond() {
        LocalTime localTime = LocalTime.of(10, 5, 20);
        LocalTime expected = LocalTime.of(10, 5, 21);

        LocalTime actual = test.addOneSecond(localTime);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetDayOfWeek() {
        LocalDateTime localDateTime = LocalDateTime.of(2018, 10, 8, 10, 11, 12);

        DayOfWeek actual = test.getDayOfWeek(localDateTime);

        Assertions.assertEquals(DayOfWeek.MONDAY, actual);
    }

    @Test
    void testGetLocalDateTimeOnAFriday() {
        LocalDateTime actual = test.getLocalDateTimeOnAFriday();

        Assertions.assertEquals(DayOfWeek.FRIDAY, actual.getDayOfWeek());
    }

    @Test
    public void testMakeZonedDateTimeInUTC() {
        LocalDate localDate = LocalDate.of(2019, 4, 24);
        LocalTime localTime = LocalTime.of(10, 20, 30);
        ZonedDateTime expected = ZonedDateTime.of(2019, 4, 24, 10, 20, 30, 0, ZoneOffset.UTC);

        ZonedDateTime actual = test.makeZonedDateTimeInUTC(localDate, localTime);
        Assertions.assertEquals(expected, actual);

    }
}
