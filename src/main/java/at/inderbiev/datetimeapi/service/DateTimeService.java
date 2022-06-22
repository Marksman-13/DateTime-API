package at.inderbiev.datetimeapi.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Service
public class DateTimeService {

    public LocalDate getToday() {
        return LocalDate.now();
    }

    public LocalTime getTime(){ return LocalTime.now();}


}
