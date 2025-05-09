package com.example.calendar.service;

import com.example.calendar.model.Schedule;
import com.example.calendar.repository.ScheduleRepository;
import org.springframework.stereotype.Service;

@Service
public class ScheduleService {

    //속성
    private ScheduleRepository scheduleRepository;

    //생성자
    public ScheduleService(ScheduleRepository scheduleRepository) {
        this.scheduleRepository = scheduleRepository;
    }

    //기능

    public Schedule createSchedule(Schedule schedule) {
        return scheduleRepository.save(schedule); // DB 저장
    }


}