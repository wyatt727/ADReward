package com.bytedance.sdk.openadsdk.Pm;

import android.util.Pair;
import com.bykv.vk.openvk.preload.geckox.buffer.stream.BufferOutputStream;
import com.bykv.vk.openvk.preload.geckox.net.INetWork;
import com.bykv.vk.openvk.preload.geckox.net.Response;
import com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils;
import com.bytedance.sdk.component.mZx.EYQ.HX;
import com.bytedance.sdk.component.mZx.EYQ.IPb;
import com.bytedance.sdk.component.mZx.EYQ.KO;
import com.bytedance.sdk.component.mZx.EYQ.Kbd;
import com.bytedance.sdk.component.mZx.EYQ.MxO;
import com.bytedance.sdk.component.mZx.EYQ.Td;
import com.bytedance.sdk.component.mZx.EYQ.nWX;
import com.bytedance.sdk.component.mZx.EYQ.pi;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: DefaultNetWork.java */
/* loaded from: classes2.dex */
public class EYQ implements INetWork {
    protected MxO EYQ = new MxO.EYQ().EYQ(10, TimeUnit.SECONDS).mZx(10, TimeUnit.SECONDS).Td(10, TimeUnit.SECONDS).EYQ();
    protected MxO mZx = new MxO.EYQ().EYQ(10, TimeUnit.SECONDS).mZx(30, TimeUnit.SECONDS).Td(30, TimeUnit.SECONDS).EYQ();

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public void syncDoGet(final String str) {
        this.EYQ.EYQ(new pi.EYQ().EYQ().EYQ(str).mZx()).EYQ(new Td() { // from class: com.bytedance.sdk.openadsdk.Pm.EYQ.1
            @Override // com.bytedance.sdk.component.mZx.EYQ.Td
            public void EYQ(com.bytedance.sdk.component.mZx.EYQ.mZx mzx, KO ko) throws IOException {
            }

            @Override // com.bytedance.sdk.component.mZx.EYQ.Td
            public void EYQ(com.bytedance.sdk.component.mZx.EYQ.mZx mzx, IOException iOException) {
            }
        });
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public Response doGet(String str) throws Exception {
        KO koEYQ = this.EYQ.EYQ(new pi.EYQ().EYQ().EYQ(str).mZx()).EYQ();
        return new Response(EYQ(koEYQ.VwS()), koEYQ.Td() == 200 ? koEYQ.IPb().mZx() : null, koEYQ.Td(), koEYQ.Kbd());
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public Response doPost(String str, List<Pair<String, String>> list) throws Exception {
        Kbd.EYQ eyq = new Kbd.EYQ();
        if (list != null) {
            for (Pair<String, String> pair : list) {
                eyq.EYQ((String) pair.first, (String) pair.second);
            }
        }
        KO koEYQ = this.EYQ.EYQ(new pi.EYQ().EYQ(str).EYQ((nWX) eyq.EYQ()).mZx()).EYQ();
        return new Response(EYQ(koEYQ.VwS()), koEYQ.Td() == 200 ? koEYQ.IPb().mZx() : null, koEYQ.Td(), koEYQ.Kbd());
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public Response doPost(String str, String str2) throws Exception {
        KO koEYQ = this.EYQ.EYQ(new pi.EYQ().EYQ(str).EYQ(nWX.EYQ(HX.EYQ("application/json; charset=utf-8"), str2)).mZx()).EYQ();
        return new Response(EYQ(koEYQ.VwS()), koEYQ.Td() == 200 ? koEYQ.IPb().mZx() : null, koEYQ.Td(), koEYQ.Kbd());
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public void downloadFile(String str, long j, BufferOutputStream bufferOutputStream) throws Exception {
        int iTd;
        Exception e;
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2 = null;
        try {
            try {
                KO koEYQ = this.mZx.EYQ(new pi.EYQ().EYQ().EYQ(str).mZx()).EYQ();
                iTd = koEYQ.Td();
                try {
                    bufferedInputStream = new BufferedInputStream(koEYQ.IPb().Td());
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Exception e3) {
                iTd = 0;
                e = e3;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[2048];
            while (true) {
                int i = bufferedInputStream.read(bArr, 0, 2048);
                if (i != -1) {
                    bufferOutputStream.write(bArr, 0, i);
                } else {
                    CloseableUtils.close(bufferedInputStream);
                    return;
                }
            }
        } catch (Exception e4) {
            e = e4;
            bufferedInputStream2 = bufferedInputStream;
            throw new RuntimeException("downloadFile failed, code: " + iTd + ", url:" + str + ", caused by:" + e.getMessage(), e);
        } catch (Throwable th2) {
            th = th2;
            bufferedInputStream2 = bufferedInputStream;
            CloseableUtils.close(bufferedInputStream2);
            throw th;
        }
    }

    private Map<String, String> EYQ(IPb iPb) {
        if (iPb == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (int i = 0; i < iPb.EYQ(); i++) {
            map.put(iPb.EYQ(i), iPb.mZx(i));
        }
        return map;
    }
}
