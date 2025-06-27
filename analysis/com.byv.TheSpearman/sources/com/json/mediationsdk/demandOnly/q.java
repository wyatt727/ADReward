package com.json.mediationsdk.demandOnly;

import com.json.mediationsdk.ISBannerSize;
import com.json.mediationsdk.demandOnly.h;
import com.json.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0002\u0004\u0005J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/ironsource/mediationsdk/demandOnly/q;", "", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "c", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public interface q {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/ironsource/mediationsdk/demandOnly/q$a;", "", "Lcom/ironsource/mediationsdk/demandOnly/h;", "loadParams", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "a", "", "Ljava/lang/String;", "adFormat", "<init>", "(Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String adFormat;

        public a(String adFormat) {
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            this.adFormat = adFormat;
        }

        public final IronSourceError a(h loadParams) {
            Intrinsics.checkNotNullParameter(loadParams, "loadParams");
            h.b bVar = (h.b) loadParams;
            if (bVar.getActivity() == null) {
                return new IronSourceError(1060, this.adFormat + " was initialized and loaded without Activity");
            }
            if (bVar.getCom.my.tracker.ads.AdFormat.BANNER java.lang.String() == null) {
                return new IronSourceError(510, "Missing banner layout");
            }
            if (bVar.getCom.my.tracker.ads.AdFormat.BANNER java.lang.String().isDestroyed()) {
                return new IronSourceError(510, "Banner layout is destroyed");
            }
            ISBannerSize size = bVar.getCom.my.tracker.ads.AdFormat.BANNER java.lang.String().getSize();
            if (size == null) {
                return new IronSourceError(510, "Missing banner size");
            }
            if ("CUSTOM" == size.getDescription() && (size.getHeight() <= 0 || size.getWidth() <= 0)) {
                return new IronSourceError(510, "Unsupported banner size. Height and width must be bigger than 0");
            }
            if (bVar.getInstanceId() == null) {
                return new IronSourceError(510, "Missing instance Id");
            }
            String strA = bVar.getAdMarkup();
            if ((strA == null || strA.length() == 0) && loadParams.getBidding()) {
                return new IronSourceError(510, "Missing adm");
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/ironsource/mediationsdk/demandOnly/q$b;", "", "Lcom/ironsource/mediationsdk/demandOnly/h$d;", "loadParams", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "a", "", "Ljava/lang/String;", "adFormat", "<init>", "(Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String adFormat;

        public b(String adFormat) {
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            this.adFormat = adFormat;
        }

        public final IronSourceError a(h.d loadParams) {
            Intrinsics.checkNotNullParameter(loadParams, "loadParams");
            if (loadParams.getActivity() == null) {
                return new IronSourceError(1060, this.adFormat + " was initialized and loaded without Activity");
            }
            if (loadParams.getInstanceId() == null) {
                return new IronSourceError(510, "Missing instance Id");
            }
            String strA = loadParams.getAdMarkup();
            if ((strA == null || strA.length() == 0) && loadParams.getBidding()) {
                return new IronSourceError(510, "Missing adm");
            }
            return null;
        }
    }

    IronSourceError c();
}
