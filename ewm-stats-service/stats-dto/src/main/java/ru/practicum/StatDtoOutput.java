package ru.practicum;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StatDtoOutput {

    private String app; // Service name

    private String uri; // Service URI

    private Long hits; // Number of views
}