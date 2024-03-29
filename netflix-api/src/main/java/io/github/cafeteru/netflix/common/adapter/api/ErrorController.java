package io.github.cafeteru.netflix.common.adapter.api;

import io.github.cafeteru.netflix.common.adapter.api.dto.ErrorDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErrorController {

    @ExceptionHandler(value = IllegalArgumentException.class)
    public ResponseEntity<ErrorDto> catchIllegalArgumentException(IllegalArgumentException exception) {
        var errorDto = ErrorDto.builder()
                .message(exception.getMessage())
                .build();
        return ResponseEntity.badRequest().body(errorDto);
    }
}
