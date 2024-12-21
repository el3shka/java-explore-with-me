package ru.practicum;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class StatDtoOutput {

    private String app; //Название сервиса

    private String uri; //URI сервиса

    private Long hits; //Количество просмотров

    public String getApp() {
        return this.app;
    }

    public String getUri() {
        return this.uri;
    }

    public Long getHits() {
        return this.hits;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public void setHits(Long hits) {
        this.hits = hits;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof StatDtoOutput)) return false;
        final StatDtoOutput other = (StatDtoOutput) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$app = this.getApp();
        final Object other$app = other.getApp();
        if (this$app == null ? other$app != null : !this$app.equals(other$app)) return false;
        final Object this$uri = this.getUri();
        final Object other$uri = other.getUri();
        if (this$uri == null ? other$uri != null : !this$uri.equals(other$uri)) return false;
        final Object this$hits = this.getHits();
        final Object other$hits = other.getHits();
        if (this$hits == null ? other$hits != null : !this$hits.equals(other$hits)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof StatDtoOutput;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $app = this.getApp();
        result = result * PRIME + ($app == null ? 43 : $app.hashCode());
        final Object $uri = this.getUri();
        result = result * PRIME + ($uri == null ? 43 : $uri.hashCode());
        final Object $hits = this.getHits();
        result = result * PRIME + ($hits == null ? 43 : $hits.hashCode());
        return result;
    }

    public String toString() {
        return "StatDtoOutput(app=" + this.getApp() + ", uri=" + this.getUri() + ", hits=" + this.getHits() + ")";
    }
}