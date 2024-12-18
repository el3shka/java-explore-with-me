package ru.practicum.event.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "locations")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "location_id")
    private Long id;

    @Column(nullable = false)
    private Float lat;

    @Column(nullable = false)
    private Float lon;
}
