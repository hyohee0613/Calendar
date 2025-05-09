package com.example.calendar.service;

import com.example.calendar.model.Schedule;
import com.example.calendar.repository.ScheduleRepository;
import org.springframework.stereotype.Service;

@Service
public class ScheduleService {

    //속성
    private ScheduleRepository scheduleRepository;

    //생성자

    //기능

    public Schedule createSchedule(Schedule schedule) {
        // 임시: 저장 없이 그대로 반환 (Repository 연결 해야함)
        return schedule;
    }




}