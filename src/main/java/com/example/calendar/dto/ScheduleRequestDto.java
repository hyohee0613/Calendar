package com.example.calendar.dto;


import com.example.calendar.model.Schedule;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ScheduleRequestDto {

    //속성
    private String title;
    private String name;
    private int password;

    //생성자 (@NoArgsConstructor로 자동 생성)


    //기능
    //클라이언트가 보낸 JSON 데이터를 받는 용도
    //toEntity() : ScheduleRequestDto의 데이터를 이용해 객체 Schedule을 생성

    public Schedule toEntity() {
        return new Schedule(title, name, password);
    }

}
