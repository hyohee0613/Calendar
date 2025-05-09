package com.example.calendar.repository;

import com.example.calendar.model.Schedule;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


//Schedule 데이터를 저장하고, 읽고, 수정하고, 삭제하는 기능을 담당
//실제 데이터를 관리(저장소 역할)

@Repository
public class ScheduleRepository {

    private final JdbcTemplate jdbcTemplate;

    public ScheduleRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    // 기능
    // 임시 저장
    public Schedule save(Schedule schedule) {
        String sql = "INSERT INTO schedule (title, name, password, updated_at) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql,
                schedule.getTitle(),
                schedule.getName(),
                schedule.getPassword(),
                schedule.getUpdatedAt()
        );
        return schedule;
    }
}
