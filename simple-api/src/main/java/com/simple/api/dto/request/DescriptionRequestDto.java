package com.simple.api.dto.request;

import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.NonNull;

@Getter
@Setter
public class DescriptionRequestDto {

    @NonNull
    private String details;
}
