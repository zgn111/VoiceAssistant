package edu.njnu.voiceassistantbe.mapper;

import edu.njnu.voiceassistantbe.pojo.entity.VoiceInstruction;

import java.util.List;

public interface VoiceInstructionMapper {
    int insertVoiceInstruction(VoiceInstruction voiceInstruction);
    int deleteVoiceInstructionById(Integer id);
    int updateVoiceInstruction(VoiceInstruction voiceInstruction);
    VoiceInstruction selectVoiceInstructionById(Integer id);
    VoiceInstruction selectVoiceInstructionByInstruction(String instruction);
    List<VoiceInstruction> selectAllVoiceInstructions();
}
