package com.apm.insight.l;

import com.bytedance.applog.encryptor.EncryptorUtil;

/* loaded from: classes.dex */
public class g {
    public static byte[] a(byte[] bArr) {
        return EncryptorUtil.encrypt(bArr, bArr.length);
    }
}
