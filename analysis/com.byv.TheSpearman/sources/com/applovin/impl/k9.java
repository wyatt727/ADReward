package com.applovin.impl;

import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Charsets;
import com.applovin.impl.w6;
import com.applovin.impl.x7;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class k9 implements x7 {
    public static final x7.c d = new x7.c() { // from class: com.applovin.impl.k9$$ExternalSyntheticLambda1
        @Override // com.applovin.impl.x7.c
        public final x7 a(UUID uuid) {
            return k9.b(uuid);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final UUID f592a;
    private final MediaDrm b;
    private int c;

    private static boolean e() {
        return "ASUS_Z00AD".equals(yp.d);
    }

    @Override // com.applovin.impl.x7
    public int c() {
        return 2;
    }

    @Override // com.applovin.impl.x7
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public j9 d(byte[] bArr) {
        return new j9(a(this.f592a), bArr, yp.f1214a < 21 && r2.d.equals(this.f592a) && "L3".equals(a("securityLevel")));
    }

    private static byte[] e(byte[] bArr) {
        yg ygVar = new yg(bArr);
        int iM = ygVar.m();
        short sO = ygVar.o();
        short sO2 = ygVar.o();
        if (sO != 1 || sO2 != 1) {
            kc.c("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
            return bArr;
        }
        short sO3 = ygVar.o();
        Charset charset = Charsets.UTF_16LE;
        String strA = ygVar.a(sO3, charset);
        if (strA.contains("<LA_URL>")) {
            return bArr;
        }
        int iIndexOf = strA.indexOf("</DATA>");
        if (iIndexOf == -1) {
            kc.d("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
        }
        String str = strA.substring(0, iIndexOf) + "<LA_URL>https://x</LA_URL>" + strA.substring(iIndexOf);
        int i = iM + 52;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putInt(i);
        byteBufferAllocate.putShort(sO);
        byteBufferAllocate.putShort(sO2);
        byteBufferAllocate.putShort((short) (str.length() * 2));
        byteBufferAllocate.put(str.getBytes(charset));
        return byteBufferAllocate.array();
    }

    private k9(UUID uuid) {
        a1.a(uuid);
        a1.a(!r2.b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f592a = uuid;
        MediaDrm mediaDrm = new MediaDrm(a(uuid));
        this.b = mediaDrm;
        this.c = 1;
        if (r2.d.equals(uuid) && e()) {
            a(mediaDrm);
        }
    }

    @Override // com.applovin.impl.x7
    public void c(byte[] bArr) {
        this.b.closeSession(bArr);
    }

    public static k9 c(UUID uuid) throws tp {
        try {
            return new k9(uuid);
        } catch (UnsupportedSchemeException e) {
            throw new tp(1, e);
        } catch (Exception e2) {
            throw new tp(2, e2);
        }
    }

    @Override // com.applovin.impl.x7
    public byte[] d() {
        return this.b.openSession();
    }

    @Override // com.applovin.impl.x7
    public x7.d b() {
        MediaDrm.ProvisionRequest provisionRequest = this.b.getProvisionRequest();
        return new x7.d(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ x7 b(UUID uuid) {
        try {
            return c(uuid);
        } catch (tp unused) {
            kc.b("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new e7();
        }
    }

    private static void a(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    private static class a {
        public static boolean a(MediaDrm mediaDrm, String str) {
            return mediaDrm.requiresSecureDecoder(str);
        }
    }

    @Override // com.applovin.impl.x7
    public Map b(byte[] bArr) {
        return this.b.queryKeyStatus(bArr);
    }

    @Override // com.applovin.impl.x7
    public byte[] b(byte[] bArr, byte[] bArr2) throws JSONException {
        if (r2.c.equals(this.f592a)) {
            bArr2 = g3.b(bArr2);
        }
        return this.b.provideKeyResponse(bArr, bArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static byte[] b(java.util.UUID r3, byte[] r4) {
        /*
            java.util.UUID r0 = com.applovin.impl.r2.e
            boolean r1 = r0.equals(r3)
            if (r1 == 0) goto L18
            byte[] r1 = com.applovin.impl.fi.a(r4, r3)
            if (r1 != 0) goto Lf
            goto L10
        Lf:
            r4 = r1
        L10:
            byte[] r4 = e(r4)
            byte[] r4 = com.applovin.impl.fi.a(r0, r4)
        L18:
            int r1 = com.applovin.impl.yp.f1214a
            r2 = 23
            if (r1 >= r2) goto L26
            java.util.UUID r1 = com.applovin.impl.r2.d
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L58
        L26:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L5f
            java.lang.String r0 = com.applovin.impl.yp.c
            java.lang.String r1 = "Amazon"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5f
            java.lang.String r0 = com.applovin.impl.yp.d
            java.lang.String r1 = "AFTB"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTS"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTM"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5f
        L58:
            byte[] r3 = com.applovin.impl.fi.a(r4, r3)
            if (r3 == 0) goto L5f
            return r3
        L5f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.k9.b(java.util.UUID, byte[]):byte[]");
    }

    @Override // com.applovin.impl.x7
    public x7.a a(byte[] bArr, List list, int i, HashMap map) throws NotProvisionedException {
        byte[] bArrB;
        String strA;
        w6.b bVarA = null;
        if (list != null) {
            bVarA = a(this.f592a, list);
            bArrB = b(this.f592a, (byte[]) a1.a(bVarA.f));
            strA = a(this.f592a, bVarA.d);
        } else {
            bArrB = null;
            strA = null;
        }
        MediaDrm.KeyRequest keyRequest = this.b.getKeyRequest(bArr, bArrB, strA, i, map);
        byte[] bArrA = a(this.f592a, keyRequest.getData());
        String defaultUrl = keyRequest.getDefaultUrl();
        if ("https://x".equals(defaultUrl)) {
            defaultUrl = "";
        }
        if (TextUtils.isEmpty(defaultUrl) && bVarA != null && !TextUtils.isEmpty(bVarA.c)) {
            defaultUrl = bVarA.c;
        }
        return new x7.a(bArrA, defaultUrl, yp.f1214a >= 23 ? keyRequest.getRequestType() : Integer.MIN_VALUE);
    }

    public String a(String str) {
        return this.b.getPropertyString(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(x7.b bVar, MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        bVar.a(this, bArr, i, i2, bArr2);
    }

    @Override // com.applovin.impl.x7
    public void a(byte[] bArr) throws DeniedByServerException {
        this.b.provideProvisionResponse(bArr);
    }

    @Override // com.applovin.impl.x7
    public synchronized void a() {
        int i = this.c - 1;
        this.c = i;
        if (i == 0) {
            this.b.release();
        }
    }

    @Override // com.applovin.impl.x7
    public void a(byte[] bArr, byte[] bArr2) {
        this.b.restoreKeys(bArr, bArr2);
    }

    @Override // com.applovin.impl.x7
    public void a(final x7.b bVar) {
        this.b.setOnEventListener(bVar == null ? null : new MediaDrm.OnEventListener() { // from class: com.applovin.impl.k9$$ExternalSyntheticLambda0
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                this.f$0.a(bVar, mediaDrm, bArr, i, i2, bArr2);
            }
        });
    }

    @Override // com.applovin.impl.x7
    public boolean a(byte[] bArr, String str) {
        if (yp.f1214a >= 31) {
            return a.a(this.b, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f592a, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    private static w6.b a(UUID uuid, List list) {
        if (!r2.d.equals(uuid)) {
            return (w6.b) list.get(0);
        }
        if (yp.f1214a >= 28 && list.size() > 1) {
            w6.b bVar = (w6.b) list.get(0);
            int length = 0;
            for (int i = 0; i < list.size(); i++) {
                w6.b bVar2 = (w6.b) list.get(i);
                byte[] bArr = (byte[]) a1.a(bVar2.f);
                if (yp.a((Object) bVar2.d, (Object) bVar.d) && yp.a((Object) bVar2.c, (Object) bVar.c) && fi.a(bArr)) {
                    length += bArr.length;
                }
            }
            byte[] bArr2 = new byte[length];
            int i2 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                byte[] bArr3 = (byte[]) a1.a(((w6.b) list.get(i3)).f);
                int length2 = bArr3.length;
                System.arraycopy(bArr3, 0, bArr2, i2, length2);
                i2 += length2;
            }
            return bVar.a(bArr2);
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            w6.b bVar3 = (w6.b) list.get(i4);
            int iD = fi.d((byte[]) a1.a(bVar3.f));
            int i5 = yp.f1214a;
            if (i5 < 23 && iD == 0) {
                return bVar3;
            }
            if (i5 >= 23 && iD == 1) {
                return bVar3;
            }
        }
        return (w6.b) list.get(0);
    }

    private static UUID a(UUID uuid) {
        return (yp.f1214a >= 27 || !r2.c.equals(uuid)) ? uuid : r2.b;
    }

    private static String a(UUID uuid, String str) {
        return (yp.f1214a < 26 && r2.c.equals(uuid) && ("video/mp4".equals(str) || "audio/mp4".equals(str))) ? "cenc" : str;
    }

    private static byte[] a(UUID uuid, byte[] bArr) {
        return r2.c.equals(uuid) ? g3.a(bArr) : bArr;
    }
}
