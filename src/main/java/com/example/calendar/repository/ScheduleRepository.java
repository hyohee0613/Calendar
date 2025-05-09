package com.example.calendar.repository;

import com.example.calendar.model.Schedule;
import org.springframework.stereotype.Repository;


//Schedule 데이터를 저장하고, 읽고, 수정하고, 삭제하는 기능을 담당
//실제 데이터를 관리(저장소 역할)

@Repository
public class ScheduleRepository {
    // 임시 저장 방식
    public Schedule save(Schedule schedule) {
        // 실제 DB 로직이 들어올 자리
        return schedule;
    }
}
