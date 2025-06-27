package com.my.target;

/* loaded from: classes4.dex */
public class r5 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4113a;
    public final String b;

    public r5(String str, String str2) {
        str.hashCode();
        str.hashCode();
        switch (str) {
            case "vpaidInit":
            case "close":
            case "setOrientationProperties":
            case "setResizeProperties":
            case "vpaidEvent":
            case "playheadEvent":
                this.f4113a = false;
                break;
            case "playVideo":
            case "expand":
                this.f4113a = "inline".equals(str2);
                break;
            case "resize":
            case "createCalendarEvent":
            case "open":
            case "storePicture":
                this.f4113a = true;
                break;
            default:
                this.f4113a = false;
                str = "";
                break;
        }
        this.b = str;
    }

    public String toString() {
        return this.b;
    }
}
