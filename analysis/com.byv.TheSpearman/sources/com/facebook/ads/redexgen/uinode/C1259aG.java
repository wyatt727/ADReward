package com.facebook.ads.redexgen.uinode;

import android.os.Bundle;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.S2SRewardedVideoAdExtendedListener;
import com.json.mediationsdk.utils.IronSourceConstants;
import java.util.Arrays;
import kotlin.io.encoding.Base64;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.aG, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1259aG extends C2I implements S2SRewardedVideoAdExtendedListener {
    public static byte[] A02;
    public final C1269aQ A00;
    public final C2F A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 24);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{103, 96, 122, 113, 107, 124, 124, 97, 124, 113, 109, 97, 106, 107, 113, 101, 107, 119, 34, 37, Utf8.REPLACEMENT_BYTE, 52, 57, Base64.padSymbol, 52, Base64.padSymbol, 34, 47, 46, 36, 52, 47, 62, 57, 42, Utf8.REPLACEMENT_BYTE, 34, 36, 37, 52, 32, 46, 50, 62, Base64.padSymbol, 60, 53, 45, 59, 60, 36, 51, 62, 59, 54, 51, 38, 59, Base64.padSymbol, 60, 45, 38, 59, Utf8.REPLACEMENT_BYTE, 55, 45, 57, 55, 43, 74, 77, 75, 70, 92, 75, 75, 86, 75, 70, 84, 92, 74, 74, 88, 94, 92, 70, 82, 92, 64};
    }

    public C1259aG(String str, C2K c2k, C1269aQ c1269aQ, C2F c2f) {
        super(str, c2k);
        this.A00 = c1269aQ;
        this.A01 = c2f;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad) {
        super.A00.ACJ(2104, super.A01, null);
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad) {
        Bundle bundle = new Bundle();
        bundle.putLong(A00(43, 26, 106), this.A00.A0F());
        bundle.putInt(A00(18, 25, 115), this.A01.A00);
        super.A00.ACJ(2100, super.A01, bundle);
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad, AdError adError) {
        Bundle bundle = new Bundle();
        bundle.putString(A00(69, 21, 1), adError.getErrorMessage());
        bundle.putInt(A00(0, 18, 54), adError.getErrorCode());
        super.A00.ACJ(IronSourceConstants.IS_CHECK_CAPPED_TRUE, super.A01, bundle);
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad) {
        super.A00.ACJ(2105, super.A01, null);
    }

    @Override // com.facebook.ads.S2SRewardedVideoAdListener
    public final void onRewardServerFailed() {
        super.A00.ACJ(3002, super.A01, null);
    }

    @Override // com.facebook.ads.S2SRewardedVideoAdListener
    public final void onRewardServerSuccess() {
        super.A00.ACJ(3001, super.A01, null);
    }

    @Override // com.facebook.ads.RewardedVideoAdExtendedListener
    public final void onRewardedVideoActivityDestroyed() {
        super.A00.ACJ(2106, super.A01, null);
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public final void onRewardedVideoClosed() {
        super.A00.ACJ(IronSourceConstants.IS_CALLBACK_LOAD_ERROR, super.A01, null);
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public final void onRewardedVideoCompleted() {
        super.A00.ACJ(3000, super.A01, null);
    }
}
