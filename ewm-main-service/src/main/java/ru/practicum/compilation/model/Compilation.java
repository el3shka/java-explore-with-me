package ru.practicum.compilation.model;

import jakarta.persistence.*;
import lombok.*;
import ru.practicum.event.model.Event;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "compilations")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Compilation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    @JoinTable(name = "compilations_events",
            joinColumns = {@JoinColumn(name = "compilation_id")},
            inverseJoinColumns = {@JoinColumn(name = "events_id")})
    private List<Event> events;

    private Boolean pinned;

    private String title;
}
