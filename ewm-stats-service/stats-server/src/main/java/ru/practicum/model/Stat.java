package ru.practicum.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Table(name = "stats")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Stat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "app", nullable = false)
    private String app;

    @Column(name = "uri", nullable = false)
    private String uri;

    @Column(name = "ip", nullable = false)
    private String ip;

    @Column(name = "time_stamp", nullable = false)
    private LocalDateTime timestamp;

    public Long getId() {
        return this.id;
    }

    public String getApp() {
        return this.app;
    }

    public String getUri() {
        return this.uri;
    }

    public String getIp() {
        return this.ip;
    }

    public LocalDateTime getTimestamp() {
        return this.timestamp;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Stat)) return false;
        final Stat other = (Stat) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$app = this.getApp();
        final Object other$app = other.getApp();
        if (this$app == null ? other$app != null : !this$app.equals(other$app)) return false;
        final Object this$uri = this.getUri();
        final Object other$uri = other.getUri();
        if (this$uri == null ? other$uri != null : !this$uri.equals(other$uri)) return false;
        final Object this$ip = this.getIp();
        final Object other$ip = other.getIp();
        if (this$ip == null ? other$ip != null : !this$ip.equals(other$ip)) return false;
        final Object this$timestamp = this.getTimestamp();
        final Object other$timestamp = other.getTimestamp();
        if (this$timestamp == null ? other$timestamp != null : !this$timestamp.equals(other$timestamp)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Stat;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $app = this.getApp();
        result = result * PRIME + ($app == null ? 43 : $app.hashCode());
        final Object $uri = this.getUri();
        result = result * PRIME + ($uri == null ? 43 : $uri.hashCode());
        final Object $ip = this.getIp();
        result = result * PRIME + ($ip == null ? 43 : $ip.hashCode());
        final Object $timestamp = this.getTimestamp();
        result = result * PRIME + ($timestamp == null ? 43 : $timestamp.hashCode());
        return result;
    }

    public String toString() {
        return "Stat(id=" + this.getId() + ", app=" + this.getApp() + ", uri=" + this.getUri() + ", ip=" + this.getIp() + ", timestamp=" + this.getTimestamp() + ")";
    }
}