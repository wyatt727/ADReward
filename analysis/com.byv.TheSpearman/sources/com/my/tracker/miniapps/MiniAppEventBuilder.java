package com.my.tracker.miniapps;

import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes4.dex */
public abstract class MiniAppEventBuilder {

    /* renamed from: a, reason: collision with root package name */
    final int f4205a;
    final String b;
    final String c;
    String d;
    String e;
    String f;
    Map<String, String> g;

    public static final class CloseEventBuilder extends MiniAppEventBuilder {
        CloseEventBuilder(String str, String str2) {
            super(21, str, str2);
        }
    }

    public static final class CustomEventBuilder extends MiniAppEventBuilder {
        CustomEventBuilder(String str, String str2, String str3) {
            super(24, str, str2);
            this.f = str3;
        }

        public CustomEventBuilder withCustomUserId(String str) {
            this.e = str;
            return this;
        }

        public CustomEventBuilder withEventParams(Map<String, String> map) {
            this.g = map;
            return this;
        }
    }

    public static final class EventBuilder {

        /* renamed from: a, reason: collision with root package name */
        final String f4206a;
        final String b;

        EventBuilder(String str, String str2) {
            this.f4206a = str;
            this.b = str2;
        }

        public CloseEventBuilder closeEvent() {
            return new CloseEventBuilder(this.f4206a, this.b);
        }

        public CustomEventBuilder customEvent(String str) {
            return new CustomEventBuilder(this.f4206a, this.b, str);
        }

        public UserEventBuilder loginEvent() {
            return new UserEventBuilder(22, this.f4206a, this.b);
        }

        public OpenEventBuilder openEvent(String str) {
            return new OpenEventBuilder(this.f4206a, this.b, str);
        }

        public UserEventBuilder registrationEvent() {
            return new UserEventBuilder(23, this.f4206a, this.b);
        }
    }

    public static final class OpenEventBuilder extends MiniAppEventBuilder {
        OpenEventBuilder(String str, String str2, String str3) {
            super(20, str, str2);
            this.d = str3;
        }
    }

    public static final class UserEventBuilder extends MiniAppEventBuilder {
        UserEventBuilder(int i, String str, String str2) {
            super(i, str, str2);
        }

        public UserEventBuilder withCustomUserId(String str) {
            this.e = str;
            return this;
        }
    }

    MiniAppEventBuilder(int i, String str, String str2) {
        this.f4205a = i;
        this.b = str;
        this.c = str2;
    }

    public static EventBuilder newEventBuilder(String str, String str2) {
        return new EventBuilder(str, str2);
    }

    public final MiniAppEvent build() {
        return new MiniAppEvent(this.f4205a, this.b, this.c, this.d, this.e, this.f, this.g == null ? null : new TreeMap(this.g));
    }
}
