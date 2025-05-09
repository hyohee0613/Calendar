package com.example.calendar.repository;

import com.example.calendar.dto.ScheduleResponseDto;
import com.example.calendar.model.Schedule;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


//Schedule 데이터를 저장하고, 읽고, 수정하고, 삭제하는 기능을 담당
//실제 데이터를 관리(저장소 역할)

@Repository
public class ScheduleRepository {

    private final JdbcTemplate jdbcTemplate;

    public ScheduleRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    // 기능: DB 저장
    public Schedule save(Schedule schedule) {
        String sql = "INSERT INTO schedule (title, name, password, updated_at) VALUES (?, ?, ?, ?)";

        int rows = jdbcTemplate.update(sql,
                    schedule.getTitle(),
                    schedule.getName(),
                    schedule.getPassword(),
                    schedule.getUpdatedAt());

        return schedule;
    }

    public List<ScheduleResponseDto> findAll(String name, String date) {
        // 일정 조회 (name, date 조건 걸어서)
        String sql = "SELECT * FROM schedule"; //이건 모든 일정 조회, 수정해야함




        return schedule;

    }
}
