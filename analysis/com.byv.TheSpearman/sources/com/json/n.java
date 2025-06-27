package com.json;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R3\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\nj\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004`\u000b8\u0006¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\u0007\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/ironsource/n;", "", "", i1.o, "", "timingValue", "", "a", "c", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "()Ljava/util/HashMap;", "instanceToTimingValuesMapping", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final n f2025a = new n();

    /* renamed from: b, reason: from kotlin metadata */
    private static final HashMap<String, Long> instanceToTimingValuesMapping = new HashMap<>();

    private n() {
    }

    public final HashMap<String, Long> a() {
        return instanceToTimingValuesMapping;
    }

    public final boolean a(String instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        HashMap<String, Long> map = instanceToTimingValuesMapping;
        if (map.get(instance) == null) {
            return false;
        }
        map.remove(instance);
        return true;
    }

    public final boolean a(String instance, long timingValue) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (!(instance.length() == 0)) {
            HashMap<String, Long> map = instanceToTimingValuesMapping;
            if (!map.containsKey(instance)) {
                map.put(instance, Long.valueOf(timingValue));
                return true;
            }
        }
        return false;
    }

    public final long b(String instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Long l = instanceToTimingValuesMapping.get(instance);
        if (l != null) {
            return System.currentTimeMillis() - l.longValue();
        }
        return -1L;
    }

    public final long c(String instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Long l = instanceToTimingValuesMapping.get(instance);
        if (l != null) {
            return l.longValue();
        }
        return -1L;
    }
}
