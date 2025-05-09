package com.example.calendar.dto;

import com.example.calendar.model.Schedule;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
public class ScheduleResponseDto {

    //속성
    private long id;
    private String title;
    private String name;
    private LocalDateTime updatedAt;

    //생성자
    public ScheduleResponseDto(Schedule schedule) {
        this.id = schedule.getId();
        this.title = schedule.getTitle();
        this.name = schedule.getName();
        this.updatedAt = schedule.getUpdatedAt();
    }



}
