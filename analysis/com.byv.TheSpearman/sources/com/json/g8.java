package com.json;

import android.content.Context;
import com.json.mediationsdk.utils.IronSourceUtils;
import com.json.mediationsdk.utils.c;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0016\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/ironsource/g8;", "", "<init>", "()V", "a", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public class g8 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u000e"}, d2 = {"Lcom/ironsource/g8$a;", "", "Landroid/content/Context;", "context", "Lorg/json/JSONObject;", "a", "Lcom/ironsource/mediationsdk/utils/c;", "c", "Lcom/ironsource/i2;", "d", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: com.ironsource.g8$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final JSONObject a(Context context) {
            try {
                return new JSONObject(IronSourceUtils.getLastResponse(context));
            } catch (JSONException unused) {
                return new JSONObject();
            }
        }

        @JvmStatic
        public final boolean b(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            CachedResponse cachedResponseD = d(context);
            if (cachedResponseD.d().length() > 0) {
                if (cachedResponseD.e().length() > 0) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.json.mediationsdk.utils.c c(android.content.Context r5) {
            /*
                r4 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                com.ironsource.i2 r0 = r4.d(r5)
                java.lang.String r1 = r0.d()
                int r1 = r1.length()
                r2 = 1
                r3 = 0
                if (r1 <= 0) goto L17
                r1 = r2
                goto L18
            L17:
                r1 = r3
            L18:
                if (r1 == 0) goto L2a
                java.lang.String r1 = r0.e()
                int r1 = r1.length()
                if (r1 <= 0) goto L26
                r1 = r2
                goto L27
            L26:
                r1 = r3
            L27:
                if (r1 == 0) goto L2a
                goto L2b
            L2a:
                r2 = r3
            L2b:
                r1 = 0
                if (r2 == 0) goto L2f
                goto L30
            L2f:
                r0 = r1
            L30:
                if (r0 == 0) goto L48
                com.ironsource.mediationsdk.utils.c r1 = new com.ironsource.mediationsdk.utils.c
                java.lang.String r2 = r0.d()
                java.lang.String r3 = r0.f()
                java.lang.String r0 = r0.e()
                r1.<init>(r5, r2, r3, r0)
                com.ironsource.mediationsdk.utils.c$a r5 = com.ironsource.mediationsdk.utils.c.a.CACHE
                r1.a(r5)
            L48:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.json.g8.Companion.c(android.content.Context):com.ironsource.mediationsdk.utils.c");
        }

        @JvmStatic
        public final CachedResponse d(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            JSONObject jSONObjectA = a(context);
            String cachedAppKey = jSONObjectA.optString("appKey");
            String cachedUserId = jSONObjectA.optString("userId");
            String cachedSettings = jSONObjectA.optString(c.Y1);
            Intrinsics.checkNotNullExpressionValue(cachedAppKey, "cachedAppKey");
            Intrinsics.checkNotNullExpressionValue(cachedUserId, "cachedUserId");
            Intrinsics.checkNotNullExpressionValue(cachedSettings, "cachedSettings");
            return new CachedResponse(cachedAppKey, cachedUserId, cachedSettings);
        }
    }

    @JvmStatic
    public static final boolean a(Context context) {
        return INSTANCE.b(context);
    }

    @JvmStatic
    public static final c b(Context context) {
        return INSTANCE.c(context);
    }

    @JvmStatic
    public static final CachedResponse c(Context context) {
        return INSTANCE.d(context);
    }
}
