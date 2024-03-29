package io.github.cafeteru.netflix.chapters.domain;

import io.github.cafeteru.netflix.chapters.adapter.api.dto.ChapterDto;
import io.github.cafeteru.netflix.chapters.adapter.api.mapper.ChapterMapper;
import io.github.cafeteru.netflix.chapters.adapter.db.ChapterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChapterService {
    private final ChapterRepository chapterRepository;
    private final ChapterMapper chapterMapper;

    public Page<ChapterDto> findAll(Pageable pageable) {
        var chapters = chapterRepository.findAll(pageable);
        return chapters.map(chapterMapper::toDto);
    }
}
