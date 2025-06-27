package com.json;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J'\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0004HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/ironsource/ge;", "", "Lorg/json/JSONObject;", "g", "", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "c", x6.k, x6.l, x6.m, "", "toString", "", "hashCode", "other", "equals", "Z", "e", "()Z", "f", "d", "<init>", "(ZZZ)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: com.ironsource.ge, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class ViewVisibilityParams {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isVisible;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    private final boolean isWindowVisible;

    /* renamed from: c, reason: from kotlin metadata and from toString */
    private final boolean isShown;

    public ViewVisibilityParams(boolean z, boolean z2, boolean z3) {
        this.isVisible = z;
        this.isWindowVisible = z2;
        this.isShown = z3;
    }

    public static /* synthetic */ ViewVisibilityParams a(ViewVisibilityParams viewVisibilityParams, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = viewVisibilityParams.isVisible;
        }
        if ((i & 2) != 0) {
            z2 = viewVisibilityParams.isWindowVisible;
        }
        if ((i & 4) != 0) {
            z3 = viewVisibilityParams.isShown;
        }
        return viewVisibilityParams.a(z, z2, z3);
    }

    public final ViewVisibilityParams a(boolean isVisible, boolean isWindowVisible, boolean isShown) {
        return new ViewVisibilityParams(isVisible, isWindowVisible, isShown);
    }

    /* renamed from: a, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getIsWindowVisible() {
        return this.isWindowVisible;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getIsShown() {
        return this.isShown;
    }

    public final boolean d() {
        return this.isShown;
    }

    public final boolean e() {
        return this.isVisible;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ViewVisibilityParams)) {
            return false;
        }
        ViewVisibilityParams viewVisibilityParams = (ViewVisibilityParams) other;
        return this.isVisible == viewVisibilityParams.isVisible && this.isWindowVisible == viewVisibilityParams.isWindowVisible && this.isShown == viewVisibilityParams.isShown;
    }

    public final boolean f() {
        return this.isWindowVisible;
    }

    public final JSONObject g() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put(x6.k, this.isVisible).put(x6.l, this.isWindowVisible).put(x6.m, this.isShown);
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "JSONObject()\n\t\t\t.put(ISN…ts.IS_SHOWN_KEY, isShown)");
        return jSONObjectPut;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    public int hashCode() {
        boolean z = this.isVisible;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r2 = this.isWindowVisible;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        boolean z2 = this.isShown;
        return i3 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        return "ViewVisibilityParams(isVisible=" + this.isVisible + ", isWindowVisible=" + this.isWindowVisible + ", isShown=" + this.isShown + ')';
    }
}
