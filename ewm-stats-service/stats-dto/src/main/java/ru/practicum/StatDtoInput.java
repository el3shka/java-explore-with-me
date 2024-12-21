package ru.practicum;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StatDtoInput {

    @NotBlank
    @Size(max = 255)
    private String app; //Идентификатор сервиса для которого записывается информация

    @NotBlank
    @NotEmpty
    @Size(max = 255)
    private String uri; //URI для которого был осуществлен запрос

    @NotBlank
    @Size(max = 255)
    private String ip; //IP-адрес пользователя, осуществившего запрос

    @NotNull
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", shape = JsonFormat.Shape.STRING)
    private LocalDateTime timestamp; //Дата и время, когда был совершен запрос к эндпоинту (в формате "yyyy-MM-dd HH:mm:ss")

    public @NotBlank @Size(max = 255) String getApp() {
        return this.app;
    }

    public @NotBlank @NotEmpty @Size(max = 255) String getUri() {
        return this.uri;
    }

    public @NotBlank @Size(max = 255) String getIp() {
        return this.ip;
    }

    public @NotNull LocalDateTime getTimestamp() {
        return this.timestamp;
    }

    public void setApp(@NotBlank @Size(max = 255) String app) {
        this.app = app;
    }

    public void setUri(@NotBlank @NotEmpty @Size(max = 255) String uri) {
        this.uri = uri;
    }

    public void setIp(@NotBlank @Size(max = 255) String ip) {
        this.ip = ip;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", shape = JsonFormat.Shape.STRING)
    public void setTimestamp(@NotNull LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof StatDtoInput)) return false;
        final StatDtoInput other = (StatDtoInput) o;
        if (!other.canEqual((Object) this)) return false;
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
        return other instanceof StatDtoInput;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
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
        return "StatDtoInput(app=" + this.getApp() + ", uri=" + this.getUri() + ", ip=" + this.getIp() + ", timestamp=" + this.getTimestamp() + ")";
    }
}
