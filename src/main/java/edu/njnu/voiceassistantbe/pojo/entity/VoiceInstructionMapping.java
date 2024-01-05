package edu.njnu.voiceassistantbe.pojo.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VoiceInstructionMapping {
    private Integer id;
    private Integer voiceInstructionId;
    private Integer screenOperationId;
    private Timestamp createTime;

}
