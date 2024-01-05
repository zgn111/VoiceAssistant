package edu.njnu.voiceassistantbe.pojo.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ScreenOperation {
    private Integer id;
    private String name;
    private Integer x;
    private Integer y;
    private Integer width;
    private Integer height;
    private Integer apiId;
    private Timestamp createTime;
}
