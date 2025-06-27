package com.json.mediationsdk.demandOnly;

import com.google.android.gms.ads.RequestConfiguration;
import com.json.ba;
import com.json.j4;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006J)\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ironsource/mediationsdk/demandOnly/o;", "Lcom/ironsource/j4;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/ironsource/ba;", "mapper", "a", "(Lcom/ironsource/ba;)Ljava/lang/Object;", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public interface o extends j4<String> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0004H\u0016R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\t¨\u0006\r"}, d2 = {"Lcom/ironsource/mediationsdk/demandOnly/o$a;", "Lcom/ironsource/mediationsdk/demandOnly/o;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/ironsource/ba;", "", "mapper", "a", "(Lcom/ironsource/ba;)Ljava/lang/Object;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Ljava/lang/String;", "rowAdm", "<init>", "(Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements o {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String rowAdm;

        public a(String rowAdm) {
            Intrinsics.checkNotNullParameter(rowAdm, "rowAdm");
            this.rowAdm = rowAdm;
        }

        @Override // com.json.mediationsdk.demandOnly.o
        public <T> T a(ba<String, T> mapper) {
            Intrinsics.checkNotNullParameter(mapper, "mapper");
            return mapper.a(this.rowAdm);
        }

        @Override // com.json.j4
        /* renamed from: b, reason: from getter and merged with bridge method [inline-methods] */
        public String a() {
            return this.rowAdm;
        }
    }

    <T> T a(ba<String, T> mapper);
}
