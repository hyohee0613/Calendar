package com.example.calendar.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Schedule {

    private long id;
    private String title;
    private String name;
    private int password;
    private LocalDateTime updatedAt;

    public Schedule(String title, String name, int password) {
        this.title = title;
        this.name = name;
        this.password = password;
        this.updatedAt = LocalDateTime.now();
    }


}
