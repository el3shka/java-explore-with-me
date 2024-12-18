package ru.practicum.request.model;

import jakarta.persistence.*;
import lombok.*;
import ru.practicum.User.model.User;
import ru.practicum.event.model.Event;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "requests")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class ParticipationRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "requester_id", nullable = false)
    private User requester;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "event_id", nullable = false)
    private Event event;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private ParticipationRequestStatus status;

    @Column(name = "created", nullable = false)
    private LocalDateTime created;
}
