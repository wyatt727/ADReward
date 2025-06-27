package com.facebook.ads.redexgen.uinode;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.Tl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class ViewOnClickListenerC1079Tl extends AbstractC0933Nv implements View.OnClickListener {
    public static byte[] A0D;
    public static String[] A0E = {"idQnrwKrPQs0c3zYYHT6WTvW1aXoRMqQ", "Gekt1WHQiHnIJqxdwB9j8FzDtIJy1cfJ", "sF2V", "CdtBVDHmuEaNC9R8", "jtmNaJ8NDkAfiILRFeCM3WK", "aXO2Ks7stxeTyHMnCxwSATKtkmhK3bmt", "xmLEl9t0StR", ""};
    public static final int A0F;
    public int A00;
    public int A01;
    public Bitmap A02;
    public Paint A03;
    public Rect A04;
    public C1207Yn A05;
    public L9 A06;
    public C1081Tn A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public final C0929Nr A0B;
    public final Map<String, String> A0C;

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            int i5 = bArrCopyOfRange[i4] ^ i3;
            if (A0E[2].length() != 4) {
                throw new RuntimeException();
            }
            A0E[3] = "DG";
            bArrCopyOfRange[i4] = (byte) (i5 ^ 83);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A0D = new byte[]{3, 12, 9, 3, 11, Utf8.REPLACEMENT_BYTE, 19, 15, 21, 18, 3, 5, 8, 12, 67, 3, 11, 29, 29, 11, 0, 9, 11, 28, Byte.MAX_VALUE, 121, 111, 120, 105, 102, 99, 105, 97};
    }

    static {
        A07();
        A0F = (int) (LD.A02 * 24.0f);
    }

    public ViewOnClickListenerC1079Tl(C1207Yn c1207Yn, AbstractC1310b5 abstractC1310b5, C1P c1p, J2 j2, MC mc, RE re, C0866Lg c0866Lg) {
        this(c1207Yn, abstractC1310b5.A0L(), c1p, abstractC1310b5.A0x().A0F().A06(), j2, mc, re, c0866Lg, abstractC1310b5.A0y());
        this.A0B.A04(abstractC1310b5);
    }

    public ViewOnClickListenerC1079Tl(C1207Yn c1207Yn, String str, C1P c1p, J2 j2, MC mc, RE re, C0866Lg c0866Lg, C1U c1u) {
        this(c1207Yn, str, c1p, false, j2, mc, re, c0866Lg, c1u);
    }

    public ViewOnClickListenerC1079Tl(C1207Yn c1207Yn, String str, C1P c1p, boolean z, J2 j2, MC mc, RE re, C0866Lg c0866Lg, C1U c1u) {
        super(c1207Yn, c1p);
        this.A0C = new HashMap();
        this.A05 = c1207Yn;
        this.A0A = z;
        this.A0B = new C0929Nr(c1207Yn, str, re, c0866Lg, j2, c1u, mc);
        setOnClickListener(this);
        AbstractC0874Lo.A0G(1001, this);
    }

    public static Bitmap A03(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    private void A05() {
        String str;
        if (this.A0A && (str = this.A09) != null) {
            this.A02 = A03(AbstractC0883Lx.A03(this.A05, str.contains(A04(12, 12, 61)) ? EnumC0882Lw.MESSENGER : EnumC0882Lw.WHATSAPP));
            this.A03 = new Paint();
            int i = A0F;
            setPadding(i, 0, i, 0);
        }
    }

    private void A06() {
        L9 l9 = this.A06;
        if (l9 != null) {
            l9.A06();
        }
        C1081Tn c1081Tn = this.A07;
        if (c1081Tn != null) {
            c1081Tn.A04();
        }
    }

    public static boolean A08(AbstractC1310b5 abstractC1310b5) {
        return ((long) abstractC1310b5.A0u()) > 0 && abstractC1310b5.A0s() >= 0;
    }

    public final void A09(String str) {
        if (TextUtils.isEmpty(this.A08) || TextUtils.isEmpty(this.A09)) {
            return;
        }
        A06();
        this.A0C.put(A04(0, 12, 51), str);
        this.A0B.A07(this.A08, this.A09, this.A0C);
    }

    public final boolean A0A(AbstractC1310b5 abstractC1310b5, MB mb) {
        if (this.A06 != null || !A08(abstractC1310b5) || abstractC1310b5.A11().A01() == null || abstractC1310b5.A11().A00() == null) {
            return false;
        }
        this.A07 = new C1081Tn(abstractC1310b5.A0s(), abstractC1310b5.A0u(), abstractC1310b5.A0t(), abstractC1310b5.A11().A01(), abstractC1310b5.A11().A00(), mb, this);
        L9 l9 = new L9(abstractC1310b5.A0u(), this.A07);
        this.A06 = l9;
        l9.A07();
        return true;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (KL.A02(this)) {
            return;
        }
        try {
            A09(A04(24, 9, 89));
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A06();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.A02 != null) {
            this.A04 = new Rect(0, 0, this.A02.getWidth(), this.A02.getHeight());
            int width = this.A02.getWidth();
            this.A01 = width;
            this.A00 = 12;
            int shift = (width + 12) / 2;
            canvas.save();
            canvas.translate(shift, 0.0f);
        }
        super.onDraw(canvas);
        if (this.A02 != null) {
            float width2 = (getWidth() / 2.0f) - ((getPaint().measureText((String) getText()) + 10.0f) / 2.0f);
            float textWidth = this.A01;
            float f = width2 - textWidth;
            float textWidth2 = this.A00;
            int i = (int) (f - textWidth2);
            int top = (getHeight() / 2) - (this.A01 / 2);
            int left = this.A01;
            Rect destRect = new Rect(i, top, i + left, left + top);
            canvas.drawBitmap(this.A02, this.A04, destRect, this.A03);
            canvas.restore();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            A06();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (!z) {
            A06();
        }
    }

    public void setCreativeAsCtaLoggingHelper(OG og) {
        this.A0B.A06(og);
    }

    public void setCta(C1Q c1q, String str, Map<String, String> extraData) {
        setCta(c1q, str, extraData, null);
    }

    public void setCta(C1Q c1q, String str, Map<String, String> extraData, InterfaceC0928Nq interfaceC0928Nq) {
        this.A08 = str;
        this.A09 = c1q.A05();
        this.A0C.putAll(extraData);
        this.A0B.A05(interfaceC0928Nq);
        String strA04 = c1q.A04();
        if (!TextUtils.isEmpty(strA04)) {
            String buttonText = this.A09;
            if (!TextUtils.isEmpty(buttonText)) {
                setText(strA04);
                A05();
                return;
            }
        }
        setVisibility(8);
    }

    public void setIsInAppBrowser(boolean z) {
        this.A0B.A08(z);
    }
}
