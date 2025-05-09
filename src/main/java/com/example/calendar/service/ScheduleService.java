package com.example.calendar.service;

import com.example.calendar.dto.ScheduleResponseDto;
import com.example.calendar.model.Schedule;
import com.example.calendar.repository.ScheduleRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ScheduleService {

    //속성
    private ScheduleRepository scheduleRepository;

    //생성자
    public ScheduleService(ScheduleRepository scheduleRepository) {
        this.scheduleRepository = scheduleRepository;
    }

    //기능

    //일정 생성 및 DB 저장
    public Schedule createSchedule(Schedule schedule) {
        return scheduleRepository.save(schedule); // DB 저장
    }


    public List<ScheduleResponseDto> getSchedules(String name, String date) {
        // Repository에 조건을 넘겨서 일정 리스트를 DB에서 조회
        List<Schedule> schedules = scheduleRepository.findAll(name, date);

        // 조회된 Schedule 리스트를 ScheduleResponseDto 리스트로 변환
        List<ScheduleResponseDto> responseList = new ArrayList<>();
        for (Schedule schedule : schedules) {
            responseList.add(new ScheduleResponseDto(schedule));
        }

        // Controller로 반환
        return responseList;
    }


}