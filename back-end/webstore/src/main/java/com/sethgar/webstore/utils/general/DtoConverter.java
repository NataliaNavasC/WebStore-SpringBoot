package com.sethgar.webstore.utils.general;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class DtoConverter {
    
    @Autowired
    private ModelMapper modelMapper;

    public<DTO,Entity> DTO entityToDto(Entity entity, Class<DTO> dtoClass){
        if (entity!=null){
            return modelMapper.map(entity, dtoClass);
        }
        return null;
    }

    public<DTO,Entity> Entity dtoToEntity(DTO dto, Class<Entity> entityClass){
        if(dto!=null){
            return modelMapper.map(dto, entityClass);
        }
        return null;
    }

    public<DTO,Entity> List<DTO> convertEntitiesToDtos(Page<Entity> entities, Class<DTO> dtoClass){
        List<DTO> dtos = new ArrayList<DTO>();
        for (Entity entity : entities) {
            dtos.add(entityToDto(entity, dtoClass));
        }
        return dtos;
    }

    public<DTO,Entity> List<Entity> convertDtosToEntities(Page<DTO> dtos, Class<Entity> entityClass){
        List<Entity> entities = new ArrayList<Entity>();
        for (DTO dto : dtos) {
            entities.add(entityToDto(dto, entityClass));
        }
        return entities;
    }
}
