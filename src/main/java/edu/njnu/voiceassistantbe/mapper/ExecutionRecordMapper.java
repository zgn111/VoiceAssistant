package edu.njnu.voiceassistantbe.mapper;

import edu.njnu.voiceassistantbe.pojo.entity.ExecutionRecord;

import java.util.List;

public interface ExecutionRecordMapper {
    int insertExecutionRecord(ExecutionRecord executionRecord);
    int deleteExecutionRecordById(Integer id);
    int updateExecutionRecord(ExecutionRecord executionRecord);
    ExecutionRecord selectExecutionRecordById(Integer id);
    ExecutionRecord selectExecutionRecordByUserId(Integer userId);
    List<ExecutionRecord> selectAllExecutionRecords();
}
