package com.simple.app.rest;

import com.simple.api.dto.request.DescriptionRequestDto;
import com.simple.api.dto.response.DescriptionResponseDto;
import com.simple.api.rest.DescriptionController;
import com.simple.api.service.DescriptionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class DescriptionControllerImpl implements DescriptionController {

    private final DescriptionService descriptionService;

    @Override
    public List<DescriptionResponseDto> getDescriptions() {
        return descriptionService.getDescriptions();
    }

    @Override
    public void createDescription(DescriptionRequestDto descriptionRequestDto) {
        descriptionService.createDescription(descriptionRequestDto);
    }

    @Override
    public void updateDescription(long descriptionId, DescriptionRequestDto descriptionRequestDto) {
        descriptionService.updateDescription(descriptionId, descriptionRequestDto);
    }

    @Override
    public void deleteDescription(long descriptionId) {
        descriptionService.deleteDescription(descriptionId);
    }
}
