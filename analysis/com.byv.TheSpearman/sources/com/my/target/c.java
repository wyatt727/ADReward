package com.my.target;

import com.my.target.common.models.ImageData;
import java.util.List;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final ImageData f3931a;
    public final String b;
    public List<a> c;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f3932a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final boolean f;

        public a(String str, String str2, String str3, String str4, String str5, boolean z) {
            this.f3932a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = z;
        }

        public static a a(String str, String str2, String str3, String str4, String str5, boolean z) {
            return new a(str, str2, str3, str4, str5, z);
        }
    }

    public c(ImageData imageData, String str) {
        this.f3931a = imageData;
        this.b = str;
    }

    public static c a(ImageData imageData, String str) {
        return new c(imageData, str);
    }

    public List<a> a() {
        return this.c;
    }

    public void a(List<a> list) {
        this.c = list;
    }

    public String b() {
        return this.b;
    }

    public ImageData c() {
        return this.f3931a;
    }
}
