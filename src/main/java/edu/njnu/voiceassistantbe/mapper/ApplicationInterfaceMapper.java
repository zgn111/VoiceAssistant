package edu.njnu.voiceassistantbe.mapper;

import edu.njnu.voiceassistantbe.pojo.entity.ApplicationInterface;

import java.util.List;

public interface ApplicationInterfaceMapper {
    int insertApplicationInterface(ApplicationInterface applicationInterface);
    int deleteApplicationInterfaceById(Integer id);
    int updateApplicationInterface(ApplicationInterface applicationInterface);
    ApplicationInterface selectApplicationInterfaceById(Integer id);
    ApplicationInterface selectApplicationInterfaceByName(String name);

    List<ApplicationInterface> selectAllApplicationInterfaces();

}
