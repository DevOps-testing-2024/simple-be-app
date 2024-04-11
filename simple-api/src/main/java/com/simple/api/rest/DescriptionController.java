package com.simple.api.rest;

import com.simple.api.dto.request.DescriptionRequestDto;
import com.simple.api.dto.response.DescriptionResponseDto;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/description/v1")
public interface DescriptionController {

    @GetMapping
    List<DescriptionResponseDto> getDescriptions();

    @PostMapping
    void createDescription(@RequestBody @Validated DescriptionRequestDto descriptionRequestDto);

    @PutMapping(path = "/id/{descriptionId}")
    void updateDescription(@PathVariable long descriptionId,
                           @RequestBody @Validated DescriptionRequestDto descriptionRequestDto);

    @DeleteMapping(path = "/id/{descriptionId}")
    void deleteDescription(@PathVariable long descriptionId);
}
