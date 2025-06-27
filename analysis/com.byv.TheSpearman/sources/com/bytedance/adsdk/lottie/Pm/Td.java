package com.bytedance.adsdk.lottie.Pm;

/* compiled from: FileExtension.java */
/* loaded from: classes2.dex */
public enum Td {
    JSON(".json"),
    ZIP(".zip");

    public final String Td;

    Td(String str) {
        this.Td = str;
    }

    public String EYQ() {
        return ".temp" + this.Td;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.Td;
    }
}
