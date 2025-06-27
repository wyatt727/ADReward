package com.iab.omid.library.unity3d.adsession;

/* loaded from: classes4.dex */
public enum ErrorType {
    GENERIC("generic"),
    VIDEO("video");

    private final String errorType;

    ErrorType(String str) {
        this.errorType = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.errorType;
    }
}
