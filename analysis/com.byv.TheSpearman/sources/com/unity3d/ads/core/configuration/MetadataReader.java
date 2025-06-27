package com.unity3d.ads.core.configuration;

import com.google.android.gms.ads.RequestConfiguration;
import com.json.t2;
import com.unity3d.services.core.misc.JsonStorage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* compiled from: MetadataReader.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001e\u0010\f\u001a\u0002H\u0001\"\u0006\b\u0001\u0010\u0001\u0018\u00012\u0006\u0010\r\u001a\u0002H\u0001H\u0086\b¢\u0006\u0002\u0010\u000eJ\u001e\u0010\u000f\u001a\u0002H\u0001\"\u0006\b\u0001\u0010\u0001\u0018\u00012\u0006\u0010\r\u001a\u0002H\u0001H\u0086\b¢\u0006\u0002\u0010\u000eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/unity3d/ads/core/configuration/MetadataReader;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "jsonStorage", "Lcom/unity3d/services/core/misc/JsonStorage;", t2.h.W, "", "(Lcom/unity3d/services/core/misc/JsonStorage;Ljava/lang/String;)V", "getJsonStorage", "()Lcom/unity3d/services/core/misc/JsonStorage;", "getKey", "()Ljava/lang/String;", "read", "defaultValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "readAndDelete", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class MetadataReader<T> {
    private final JsonStorage jsonStorage;
    private final String key;

    public MetadataReader(JsonStorage jsonStorage, String key) {
        Intrinsics.checkNotNullParameter(jsonStorage, "jsonStorage");
        Intrinsics.checkNotNullParameter(key, "key");
        this.jsonStorage = jsonStorage;
        this.key = key;
    }

    public final JsonStorage getJsonStorage() {
        return this.jsonStorage;
    }

    public final String getKey() {
        return this.key;
    }

    public final /* synthetic */ <T> T read(T defaultValue) throws JSONException {
        Object obj = getJsonStorage().get(getKey());
        if (obj == null) {
            return defaultValue;
        }
        Intrinsics.reifiedOperationMarker(3, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        if (!(obj instanceof Object)) {
            obj = defaultValue;
        }
        return obj == null ? defaultValue : (T) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ <T> T readAndDelete(T defaultValue) throws JSONException {
        Object obj = getJsonStorage().get(getKey());
        if (obj != 0) {
            Intrinsics.checkNotNullExpressionValue(obj, "get(key)");
            Intrinsics.reifiedOperationMarker(3, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
            boolean z = obj instanceof Object;
            T t = obj;
            if (!z) {
                t = defaultValue;
            }
            if (t != null) {
                defaultValue = t;
            }
        }
        Object obj2 = getJsonStorage().get(getKey());
        if (obj2 != null) {
            Intrinsics.checkNotNullExpressionValue(obj2, "get(key)");
            getJsonStorage().delete(getKey());
        }
        return defaultValue;
    }
}
