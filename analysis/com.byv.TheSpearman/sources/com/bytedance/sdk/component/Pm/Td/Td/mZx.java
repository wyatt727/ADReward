package com.bytedance.sdk.component.Pm.Td.Td;

import java.io.Closeable;
import java.io.IOException;

/* compiled from: IOUtils.java */
/* loaded from: classes2.dex */
public class mZx {
    public static void EYQ(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }
}
