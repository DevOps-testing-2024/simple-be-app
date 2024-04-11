package com.simple.api.service;

import com.simple.api.dto.request.DescriptionRequestDto;
import com.simple.api.dto.response.DescriptionResponseDto;

import java.util.List;

public interface DescriptionService {

    List<DescriptionResponseDto> getDescriptions();

    void createDescription(DescriptionRequestDto descriptionRequestDto);

    void updateDescription(long descriptionId, DescriptionRequestDto descriptionRequestDto);

    void deleteDescription(long descriptionId);
}
