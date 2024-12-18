package ru.practicum.event.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import ru.practicum.User.dto.UserDtoShort;
import ru.practicum.category.dto.CategoryOutputDto;
import ru.practicum.event.model.EventState;
import ru.practicum.event.model.Location;

import java.time.LocalDateTime;

@Data
public class EventFullDto {

    private Long id;

    private UserDtoShort initiator;     // Event initiator

    private CategoryOutputDto category; // Event Category

    Integer confirmedRequests;      // Number of approved applications for participation in this event

    private Location location;      // Event venue

    private String title;           // Event name

    private String annotation;      // Event Annotation

    private String description;     // Event Description

    private EventState state;       // Event Status

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime eventDate;        // Date and time of the event

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createdOn;        // Date and time of event creation

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime publishedOn;      // Date and time of publication of the event

    private Integer participantLimit;       // Limit of participants

    private Boolean paid;       // Paid event

    private Boolean requestModeration;      // Moderation of applications

    Integer views;      // Number of views of the event
}
