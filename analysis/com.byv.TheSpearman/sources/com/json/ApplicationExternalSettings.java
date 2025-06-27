package com.json;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u001f\u0010\u0004\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0003HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/ironsource/s0;", "", "", "", "a", "mediationTypes", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/Map;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "()Ljava/util/Map;", "<init>", "(Ljava/util/Map;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: com.ironsource.s0, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class ApplicationExternalSettings {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<String, String> mediationTypes;

    /* JADX WARN: Multi-variable type inference failed */
    public ApplicationExternalSettings() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public ApplicationExternalSettings(Map<String, String> mediationTypes) {
        Intrinsics.checkNotNullParameter(mediationTypes, "mediationTypes");
        this.mediationTypes = mediationTypes;
    }

    public /* synthetic */ ApplicationExternalSettings(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MapsKt.emptyMap() : map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApplicationExternalSettings a(ApplicationExternalSettings applicationExternalSettings, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = applicationExternalSettings.mediationTypes;
        }
        return applicationExternalSettings.a(map);
    }

    public final ApplicationExternalSettings a(Map<String, String> mediationTypes) {
        Intrinsics.checkNotNullParameter(mediationTypes, "mediationTypes");
        return new ApplicationExternalSettings(mediationTypes);
    }

    public final Map<String, String> a() {
        return this.mediationTypes;
    }

    public final Map<String, String> b() {
        return this.mediationTypes;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ApplicationExternalSettings) && Intrinsics.areEqual(this.mediationTypes, ((ApplicationExternalSettings) other).mediationTypes);
    }

    public int hashCode() {
        return this.mediationTypes.hashCode();
    }

    public String toString() {
        return "ApplicationExternalSettings(mediationTypes=" + this.mediationTypes + ')';
    }
}
