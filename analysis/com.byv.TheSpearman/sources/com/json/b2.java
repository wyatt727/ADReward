package com.json;

import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.json.mediationsdk.d;
import com.json.mediationsdk.logger.IronLog;
import com.json.mediationsdk.utils.IronSourceUtils;
import com.json.y1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0000\u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B/\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\b\b\u0002\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\t\u001a\u00020\bH\u0016R\u0016\u0010\f\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/ironsource/b2;", "Lcom/ironsource/y1;", "Smash", "Lcom/ironsource/oe;", "smash", "", "c", "(Lcom/ironsource/y1;)V", "", "e", CmcdHeadersFactory.STREAMING_FORMAT_HLS, "Z", "isBidderReached", "", "maxSmashesToLoad", d.q0, "", d.h, "<init>", "(IZLjava/util/List;Z)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class b2<Smash extends y1<?>> extends oe<Smash> {

    /* renamed from: h, reason: from kotlin metadata */
    private boolean isBidderReached;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(int i, boolean z, List<? extends Smash> waterfall, boolean z2) {
        super(i, z, waterfall);
        Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        this.isBidderReached = z2;
    }

    public /* synthetic */ b2(int i, boolean z, List list, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z, list, (i2 & 8) != 0 ? false : z2);
    }

    @Override // com.json.oe
    public void c(Smash smash) {
        String str;
        Intrinsics.checkNotNullParameter(smash, "smash");
        if (!smash.v()) {
            IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.c() + " (non-bidder) is ready to load");
            smash.a(true);
            c().add(smash);
            return;
        }
        this.isBidderReached = true;
        if (d() == 0) {
            str = "Advanced Loading: Starting to load bidder " + smash.c() + ". No other instances will be loaded at the same time.";
            smash.a(true);
            c().add(smash);
        } else {
            str = "Advanced Loading: Won't start loading bidder " + smash.c() + " as a non bidder is being loaded";
        }
        IronLog.INTERNAL.verbose(smash.g().name() + " - " + str);
        IronSourceUtils.sendAutomationLog(str);
    }

    @Override // com.json.oe
    public boolean e() {
        return super.e() || this.isBidderReached;
    }
}
