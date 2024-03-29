package io.github.cafeteru.netflix.chapters.adapter.api.mapper;

import io.github.cafeteru.netflix.chapters.adapter.api.dto.ChapterDto;
import io.github.cafeteru.netflix.chapters.adapter.db.model.Chapter;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;

@Mapper(
        componentModel = MappingConstants.ComponentModel.SPRING,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface ChapterMapper {
    ChapterDto toDto(Chapter chapter);
}
