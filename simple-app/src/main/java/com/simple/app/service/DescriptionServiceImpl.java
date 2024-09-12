package com.simple.app.service;

import com.simple.api.dto.request.DescriptionRequestDto;
import com.simple.api.dto.response.DescriptionResponseDto;
import com.simple.api.service.DescriptionService;
import com.simple.app.repository.jpa.DescriptionRepository;
import com.simple.app.repository.jpa.entity.Description;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DescriptionServiceImpl implements DescriptionService {

    private final DescriptionRepository descriptionRepository;

    @Override
    public List<DescriptionResponseDto> getDescriptions() {
        List<Description> descriptions = descriptionRepository.findAllOrderById();
        return descriptions.stream()
                .map(this::convertToResponseDto)
                .toList();
    }

    @Override
    public void createDescription(DescriptionRequestDto descriptionRequestDto) {
        Description newDescription = new Description();
        newDescription.setDetails(descriptionRequestDto.getDetails());
        descriptionRepository.save(newDescription);
    }

    @Override
    public void updateDescription(long descriptionId, DescriptionRequestDto descriptionRequestDto) {
        Description existingDescription = descriptionRepository.findById(descriptionId).orElse(null);
        if (existingDescription != null) {
            existingDescription.setDetails(descriptionRequestDto.getDetails());
            descriptionRepository.save(existingDescription);
        }
    }

    @Override
    public void deleteDescription(long descriptionId) {
        descriptionRepository.deleteById(descriptionId);
    }

    private DescriptionResponseDto convertToResponseDto(Description description) {
        DescriptionResponseDto descriptionResponseDto = new DescriptionResponseDto();
        descriptionResponseDto.setId(description.getId());
        descriptionResponseDto.setDetails(description.getDetails());
        return descriptionResponseDto;
    }
}
