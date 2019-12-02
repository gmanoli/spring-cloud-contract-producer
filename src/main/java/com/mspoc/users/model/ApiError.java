package com.mspoc.users.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ApiError {

    private final Long code;
    private final String description;
}
