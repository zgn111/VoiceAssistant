package edu.njnu.voiceassistantbe.pojo.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VoiceInstruction {
    private Integer id;
    private String instruction;
    private Timestamp createTime;
}
