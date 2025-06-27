package com.json;

import com.json.mediationsdk.logger.IronSourceError;

/* loaded from: classes4.dex */
public class k2 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f1854a = true;
    private IronSourceError b = null;

    public IronSourceError a() {
        return this.b;
    }

    public void a(IronSourceError ironSourceError) {
        this.f1854a = false;
        this.b = ironSourceError;
    }

    public boolean b() {
        return this.f1854a;
    }

    public void c() {
        this.f1854a = true;
        this.b = null;
    }

    public String toString() {
        StringBuilder sb;
        if (b()) {
            sb = new StringBuilder();
            sb.append("valid:");
            sb.append(this.f1854a);
        } else {
            sb = new StringBuilder();
            sb.append("valid:");
            sb.append(this.f1854a);
            sb.append(", IronSourceError:");
            sb.append(this.b);
        }
        return sb.toString();
    }
}
