package at.inderbiev.datetimeapi;

import at.inderbiev.datetimeapi.controller.DateTimeController;
import at.inderbiev.datetimeapi.service.DateTimeService;
import org.apache.tomcat.jni.Local;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalTime;

@SpringBootTest
class DateTimeControllerTest {

    @Autowired
    DateTimeController dateTimeController;

    @Autowired
    DateTimeService dateTimeService;

    @Test
    public void testGetDate () {
        Assertions.assertEquals(dateTimeService.getToday(),LocalDate.now());
    }

    @Test
    public void testGetTime(){
        Assertions.assertEquals(dateTimeService.getTime(), LocalTime.now());
    }

}