package edu.njnu.voiceassistantbe.pojo.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Log {
    private Integer id;
    private String level;
    private String message;
    private Timestamp createTime;
}
