package ru.practicum.event.model;

import jakarta.persistence.*;
import lombok.*;
import ru.practicum.User.model.User;
import ru.practicum.category.model.Category;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "events")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "initiator_id", nullable = false)
    private User initiator; // Event initiator

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category; // Event Category

    @Column(name = "confirmed_requests")
    Integer confirmedRequests; // Number of approved applications for participation in this event

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "location_id", nullable = false)
    private Location location; // Event venue

    private String title; // Event name

    private String annotation;  // Event Abstract

    private String description; // Event Description

    @Enumerated(EnumType.STRING)
    private EventState state; // Event Status

    @Column(name = "event_date", nullable = false)
    private LocalDateTime eventDate; // Date and time of the event

    @Column(name = "created_on")
    private LocalDateTime createdOn; // Date and time of event creation

    @Column(name = "published_on")
    private LocalDateTime publishedOn; // Date and time of publication of the event

    @Column(name = "participant_limit")
    private Integer participantLimit; // Limit of participants

    private Boolean paid; // Paid event

    @Column(name = "request_moderation")
    private Boolean requestModeration; // Moderation of applications

    @Transient
    Integer views; // Number of views of the event
}
