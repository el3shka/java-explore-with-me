package ru.practicum.event.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import ru.practicum.User.dto.UserDtoShort;
import ru.practicum.category.dto.CategoryOutputDto;

import java.time.LocalDateTime;

@Data
public class EventShortDto {

    private Long id;

    private UserDtoShort initiator;     // Event initiator

    private CategoryOutputDto category;     // Event Category

    Integer confirmedRequests;      // Number of approved applications for participation in this event

    private String title;       // Event name

    private String annotation;      // Event Annotation

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime eventDate;    // Date and time of the event

    private Boolean paid;   // Paid event

    Integer views;      // Number of views of the event
}
