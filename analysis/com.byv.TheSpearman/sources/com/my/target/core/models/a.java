package com.my.target.core.models;

import java.util.Objects;

/* loaded from: classes4.dex */
public abstract class a<T> {
    protected int height;
    private T t;
    protected final String url;
    protected int width;

    public a(String str) {
        this.url = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.width == aVar.width && this.height == aVar.height && this.url.equals(aVar.url) && Objects.equals(this.t, aVar.t);
    }

    public T getData() {
        return this.t;
    }

    public int getHeight() {
        return this.height;
    }

    public String getUrl() {
        return this.url;
    }

    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Objects.hash(this.url);
    }

    public void setData(T t) {
        this.t = t;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setWidth(int i) {
        this.width = i;
    }
}
