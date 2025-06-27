package com.bytedance.sdk.component.EYQ;

/* compiled from: PermissionGroup.java */
/* loaded from: classes2.dex */
public enum NZ {
    PUBLIC,
    PROTECTED,
    PRIVATE;

    @Override // java.lang.Enum
    public String toString() {
        return this == PRIVATE ? "private" : this == PROTECTED ? "protected" : "public";
    }
}
