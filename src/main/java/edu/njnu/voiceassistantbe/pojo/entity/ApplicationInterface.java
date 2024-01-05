package edu.njnu.voiceassistantbe.pojo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApplicationInterface {
    private Integer id;
    private String name;
    private String url;
    private Timestamp createTime;
}
