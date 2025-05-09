package com.example.calendar.controller;

import com.example.calendar.dto.ScheduleRequestDto;
import com.example.calendar.dto.ScheduleResponseDto;
import com.example.calendar.model.Schedule;
import com.example.calendar.service.ScheduleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/schedule")
public class ScheduleController {

    //사용자 요청 처리 (REST API 요청 처리)
    //클라이언트의 요청을 받아서 적절한 서비스로 전달하고 응답을 반환하는 역할
    //속성
    private final ScheduleService scheduleService;

    //생성자
    public ScheduleController(ScheduleService scheduleService) {
        this.scheduleService = scheduleService;
    }

    //기능: 클라이언트로부터 JSON 요청을 받아서 서비스에 전달하는 메서드
    //생성
    @PostMapping
    public ResponseEntity<ScheduleResponseDto> createSchedule(@RequestBody ScheduleRequestDto requestDto) {
        Schedule saved = scheduleService.createSchedule(requestDto.toEntity());
        ScheduleResponseDto responseDto = new ScheduleResponseDto(saved);
        return ResponseEntity.status(HttpStatus.CREATED).body(responseDto);
    }

    //조회
    @GetMapping
    public ResponseEntity<List<ScheduleResponseDto>> getSchedules(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String date) {
        List<ScheduleResponseDto> schedules = scheduleService.getSchedules(name, date);
        return ResponseEntity.ok(schedules);
    }



}
