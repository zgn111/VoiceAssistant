package edu.njnu.voiceassistantbe.pojo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserVoiceInstruction {
    private Integer id;
    private Integer userId;
    private Integer voiceInstructionId;
    private Timestamp createTime;
}
