package com.json;

import com.google.android.gms.ads.RequestConfiguration;
import com.json.mediationsdk.d;
import com.json.mediationsdk.logger.IronLog;
import com.json.y1;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004J\u001d\u0010\u0007\u001a\u0004\u0018\u00018\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\n\u001a\u00020\t2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004J \u0010\n\u001a\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004J\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004R\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/ironsource/me;", "Lcom/ironsource/y1;", "Smash", "", "", d.h, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "c", "(Ljava/util/List;)Lcom/ironsource/y1;", "", "a", "smash", "Lcom/ironsource/ne;", "d", "Lcom/ironsource/p;", "Lcom/ironsource/p;", "managerData", "<init>", "(Lcom/ironsource/p;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class me<Smash extends y1<?>> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p managerData;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "a", "kotlin.jvm.PlatformType", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Integer.valueOf(((y1) t).i().k()), Integer.valueOf(((y1) t2).i().k()));
        }
    }

    public me(p managerData) {
        Intrinsics.checkNotNullParameter(managerData, "managerData");
        this.managerData = managerData;
    }

    public final boolean a(y1<?> smash, List<? extends Smash> waterfall) {
        Object next;
        Intrinsics.checkNotNullParameter(smash, "smash");
        Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        Iterator<T> it = b(waterfall).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!((y1) next).w()) {
                break;
            }
        }
        return Intrinsics.areEqual(next, smash);
    }

    public final boolean a(List<? extends Smash> waterfall) {
        int i;
        Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        if ((waterfall instanceof Collection) && waterfall.isEmpty()) {
            i = 0;
        } else {
            Iterator<T> it = waterfall.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((y1) it.next()).x() && (i = i + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        return i >= this.managerData.getMaxSmashesToLoad();
    }

    public final List<Smash> b(List<? extends Smash> waterfall) {
        Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        return CollectionsKt.sortedWith(waterfall, new a());
    }

    public final Smash c(List<? extends Smash> waterfall) {
        Object next;
        Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        Iterator<T> it = b(waterfall).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((y1) next).A()) {
                break;
            }
        }
        return (Smash) next;
    }

    public final ne<Smash> d(List<? extends Smash> waterfall) {
        Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        IronLog.INTERNAL.verbose(this.managerData.getAdUnit().name() + " waterfall size: " + waterfall.size());
        oe<Smash> oeVarA = oe.INSTANCE.a(this.managerData.getAdvancedLoading() ? le.BIDDER_SENSITIVE : le.DEFAULT, this.managerData.getMaxSmashesToLoad(), this.managerData.getShowPriorityEnabled(), waterfall);
        Iterator<? extends Smash> it = waterfall.iterator();
        while (it.hasNext()) {
            oeVarA.d(it.next());
            if (oeVarA.e()) {
                return new ne<>(oeVarA);
            }
        }
        return new ne<>(oeVarA);
    }
}
