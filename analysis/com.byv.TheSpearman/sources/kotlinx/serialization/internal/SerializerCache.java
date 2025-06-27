package kotlinx.serialization.internal;

import com.google.android.gms.ads.RequestConfiguration;
import com.json.t2;
import kotlin.Metadata;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;

/* compiled from: Platform.common.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lkotlinx/serialization/internal/SerializerCache;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "get", "Lkotlinx/serialization/KSerializer;", t2.h.W, "Lkotlin/reflect/KClass;", "kotlinx-serialization-core"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public interface SerializerCache<T> {
    KSerializer<T> get(KClass<Object> key);
}
