package at.inderbiev.datetimeapi.controller;

import at.inderbiev.datetimeapi.service.DateTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@RestController
@RequestMapping("/api")
public class DateTimeController {

    @Autowired
    DateTimeService dateTimeService;

    @GetMapping("/today")
    public ResponseEntity<LocalDate> getToday () {
        return new ResponseEntity<>(dateTimeService.getToday(), HttpStatus.OK);
    }

    @GetMapping("/now")
    public ResponseEntity<LocalTime> getTime () {
        return new ResponseEntity<>(dateTimeService.getTime(), HttpStatus.OK);
    }
}
