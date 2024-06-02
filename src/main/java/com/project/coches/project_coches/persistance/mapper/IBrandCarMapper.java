package com.project.coches.project_coches.persistance.mapper;

import com.project.coches.project_coches.domain.pojo.BrandCarPojo;
import com.project.coches.project_coches.persistance.entity.BrandCarEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * Mapper que transforma objetos de MarcaCoche a pojo o entidades
 */
@Mapper(componentModel = "spring")
public interface IBrandCarMapper {

    /**
     * convierte un pojo a una entidad de marca coches
     * @param marcaEntity pojo a convertir
     * @return  Entity convertido
     */
    @Mapping(source = "id", target = "id")
    BrandCarPojo toMarcaCochePojo (BrandCarEntity marcaEntity);

    @InheritInverseConfiguration
    BrandCarEntity toMarcaCocheEntity (BrandCarPojo marcaPojo);


    List<BrandCarPojo> toMarcasCochePojo(List<BrandCarEntity> marcaEntities);
}
