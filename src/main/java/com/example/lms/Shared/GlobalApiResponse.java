package com.example.lms.Shared.pojo;

import lombok.*;
import org.springframework.stereotype.Service;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder


public class GlobalApiResponse<T> {
    private String message;
    private String data;
    private int statusCode;
}

