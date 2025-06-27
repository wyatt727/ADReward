package com.json;

import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b!\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b(\u0010)J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0003JI\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0005\u0010\u0019R\"\u0010\r\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u0003\u0010\u001dR\"\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018\"\u0004\b\u0003\u0010\u0019R\"\u0010\u000f\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\u0003\u0010\"R$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010%\"\u0004\b\u0005\u0010&R$\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010#\u001a\u0004\b'\u0010%\"\u0004\b\u0003\u0010&¨\u0006*"}, d2 = {"Lcom/ironsource/mb;", "", "", "a", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "c", "", "d", "", "e", "f", "pixelEventsEnabled", "pixelEventsUrl", "pixelEventsCompression", "pixelEventsCompressionLevel", "pixelOptOut", "pixelOptIn", "toString", "hashCode", "other", "equals", "Z", CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, "()Z", "(Z)V", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "g", "I", CmcdHeadersFactory.STREAMING_FORMAT_HLS, "()I", "(I)V", "[I", CmcdHeadersFactory.STREAM_TYPE_LIVE, "()[I", "([I)V", CampaignEx.JSON_KEY_AD_K, "<init>", "(ZLjava/lang/String;ZI[I[I)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: com.ironsource.mb, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class PixelSettings {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean pixelEventsEnabled;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    private String pixelEventsUrl;

    /* renamed from: c, reason: from kotlin metadata and from toString */
    private boolean pixelEventsCompression;

    /* renamed from: d, reason: from kotlin metadata and from toString */
    private int pixelEventsCompressionLevel;

    /* renamed from: e, reason: from kotlin metadata and from toString */
    private int[] pixelOptOut;

    /* renamed from: f, reason: from kotlin metadata and from toString */
    private int[] pixelOptIn;

    public PixelSettings() {
        this(false, null, false, 0, null, null, 63, null);
    }

    public PixelSettings(boolean z, String pixelEventsUrl, boolean z2, int i, int[] iArr, int[] iArr2) {
        Intrinsics.checkNotNullParameter(pixelEventsUrl, "pixelEventsUrl");
        this.pixelEventsEnabled = z;
        this.pixelEventsUrl = pixelEventsUrl;
        this.pixelEventsCompression = z2;
        this.pixelEventsCompressionLevel = i;
        this.pixelOptOut = iArr;
        this.pixelOptIn = iArr2;
    }

    public /* synthetic */ PixelSettings(boolean z, String str, boolean z2, int i, int[] iArr, int[] iArr2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? nb.f2033a : str, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? -1 : i, (i2 & 16) != 0 ? null : iArr, (i2 & 32) != 0 ? null : iArr2);
    }

    public static /* synthetic */ PixelSettings a(PixelSettings pixelSettings, boolean z, String str, boolean z2, int i, int[] iArr, int[] iArr2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = pixelSettings.pixelEventsEnabled;
        }
        if ((i2 & 2) != 0) {
            str = pixelSettings.pixelEventsUrl;
        }
        String str2 = str;
        if ((i2 & 4) != 0) {
            z2 = pixelSettings.pixelEventsCompression;
        }
        boolean z3 = z2;
        if ((i2 & 8) != 0) {
            i = pixelSettings.pixelEventsCompressionLevel;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            iArr = pixelSettings.pixelOptOut;
        }
        int[] iArr3 = iArr;
        if ((i2 & 32) != 0) {
            iArr2 = pixelSettings.pixelOptIn;
        }
        return pixelSettings.a(z, str2, z3, i3, iArr3, iArr2);
    }

    public final PixelSettings a(boolean pixelEventsEnabled, String pixelEventsUrl, boolean pixelEventsCompression, int pixelEventsCompressionLevel, int[] pixelOptOut, int[] pixelOptIn) {
        Intrinsics.checkNotNullParameter(pixelEventsUrl, "pixelEventsUrl");
        return new PixelSettings(pixelEventsEnabled, pixelEventsUrl, pixelEventsCompression, pixelEventsCompressionLevel, pixelOptOut, pixelOptIn);
    }

    public final void a(int i) {
        this.pixelEventsCompressionLevel = i;
    }

    public final void a(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pixelEventsUrl = str;
    }

    public final void a(boolean z) {
        this.pixelEventsCompression = z;
    }

    public final void a(int[] iArr) {
        this.pixelOptIn = iArr;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getPixelEventsEnabled() {
        return this.pixelEventsEnabled;
    }

    /* renamed from: b, reason: from getter */
    public final String getPixelEventsUrl() {
        return this.pixelEventsUrl;
    }

    public final void b(boolean z) {
        this.pixelEventsEnabled = z;
    }

    public final void b(int[] iArr) {
        this.pixelOptOut = iArr;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getPixelEventsCompression() {
        return this.pixelEventsCompression;
    }

    /* renamed from: d, reason: from getter */
    public final int getPixelEventsCompressionLevel() {
        return this.pixelEventsCompressionLevel;
    }

    /* renamed from: e, reason: from getter */
    public final int[] getPixelOptOut() {
        return this.pixelOptOut;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PixelSettings)) {
            return false;
        }
        PixelSettings pixelSettings = (PixelSettings) other;
        return this.pixelEventsEnabled == pixelSettings.pixelEventsEnabled && Intrinsics.areEqual(this.pixelEventsUrl, pixelSettings.pixelEventsUrl) && this.pixelEventsCompression == pixelSettings.pixelEventsCompression && this.pixelEventsCompressionLevel == pixelSettings.pixelEventsCompressionLevel && Intrinsics.areEqual(this.pixelOptOut, pixelSettings.pixelOptOut) && Intrinsics.areEqual(this.pixelOptIn, pixelSettings.pixelOptIn);
    }

    /* renamed from: f, reason: from getter */
    public final int[] getPixelOptIn() {
        return this.pixelOptIn;
    }

    public final boolean g() {
        return this.pixelEventsCompression;
    }

    public final int h() {
        return this.pixelEventsCompressionLevel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    public int hashCode() {
        boolean z = this.pixelEventsEnabled;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int iHashCode = ((r0 * 31) + this.pixelEventsUrl.hashCode()) * 31;
        boolean z2 = this.pixelEventsCompression;
        int i = (((iHashCode + (z2 ? 1 : z2 ? 1 : 0)) * 31) + this.pixelEventsCompressionLevel) * 31;
        int[] iArr = this.pixelOptOut;
        int iHashCode2 = (i + (iArr == null ? 0 : Arrays.hashCode(iArr))) * 31;
        int[] iArr2 = this.pixelOptIn;
        return iHashCode2 + (iArr2 != null ? Arrays.hashCode(iArr2) : 0);
    }

    public final boolean i() {
        return this.pixelEventsEnabled;
    }

    public final String j() {
        return this.pixelEventsUrl;
    }

    public final int[] k() {
        return this.pixelOptIn;
    }

    public final int[] l() {
        return this.pixelOptOut;
    }

    public String toString() {
        return "PixelSettings(pixelEventsEnabled=" + this.pixelEventsEnabled + ", pixelEventsUrl=" + this.pixelEventsUrl + ", pixelEventsCompression=" + this.pixelEventsCompression + ", pixelEventsCompressionLevel=" + this.pixelEventsCompressionLevel + ", pixelOptOut=" + Arrays.toString(this.pixelOptOut) + ", pixelOptIn=" + Arrays.toString(this.pixelOptIn) + ')';
    }
}
