package ru.practicum.event.controller;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.practicum.event.dto.EventFullDto;
import ru.practicum.event.dto.EventUpdateDto;
import ru.practicum.event.service.EventService;

import java.util.List;

@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("/admin/events")
public class EventControllerAdmin {
    private final EventService eventService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<EventFullDto> getAllByAdmin(
            @RequestParam(required = false) final List<Long> users,
            @RequestParam(required = false) final List<String> states,
            @RequestParam(required = false) final List<Long> categories,
            @RequestParam(required = false) final String rangeStart,
            @RequestParam(required = false) final String rangeEnd,
            @RequestParam(defaultValue = "0") @PositiveOrZero final int from,
            @RequestParam(defaultValue = "10") @Positive final int size) {
        return eventService.getAllByAdmin(users, states, categories, rangeStart, rangeEnd, from, size);
    }

    @PatchMapping("/{eventId}")
    public EventFullDto approveEventByAdmin(@PathVariable @Positive final Long eventId,
                                            @RequestBody @Valid final EventUpdateDto eventUpdateDto) {
        return eventService.approveEventByAdmin(eventId, eventUpdateDto);
    }
}
