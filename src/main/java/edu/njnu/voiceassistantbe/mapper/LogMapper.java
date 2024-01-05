package edu.njnu.voiceassistantbe.mapper;

import edu.njnu.voiceassistantbe.pojo.entity.Log;

import java.util.List;

public interface LogMapper {
    int insertLog(Log log);
    int deleteLogById(Integer id);
    int updateLog(Log log);
    Log selectLogById(Integer id);
    List<Log> selectAllLogs();

}
