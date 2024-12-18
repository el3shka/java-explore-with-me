package ru.practicum;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StatDtoInput {

    @NotBlank
    @Size(max = 255)
    private String app; // Identifier of the service for which the information is recorded

    @NotBlank
    @NotEmpty
    @Size(max = 255)
    private String uri; // URI for which the request was made

    @NotBlank
    @Size(max = 255)
    private String ip; // IP address of the user who made the request

    @NotNull
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", shape = JsonFormat.Shape.STRING)
    private LocalDateTime timestamp; // Date and time when the request to the endpoint was made (in the format “yyyyy-MM-dd HH:mm:ss”)
}
