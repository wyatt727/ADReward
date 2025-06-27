package com.bykv.vk.openvk.component.video.EYQ.mZx;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import com.bykv.vk.openvk.component.video.EYQ.mZx.VwS;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ProxyServer.java */
/* loaded from: classes.dex */
public class IPb {
    private static volatile IPb Pm;
    private volatile ServerSocket EYQ;
    private final VwS.Td HX;
    private volatile com.bykv.vk.openvk.component.video.EYQ.mZx.EYQ.Td IPb;
    private volatile com.bykv.vk.openvk.component.video.EYQ.mZx.mZx.Td Kbd;
    private volatile Td MxO;
    private final SparseArray<Set<VwS>> QQ;
    private final AtomicInteger Td = new AtomicInteger(0);
    private volatile com.bykv.vk.openvk.component.video.EYQ.mZx.EYQ.mZx VwS;
    private volatile int mZx;
    private final AtomicBoolean pi;
    private volatile Td tp;
    private final Runnable tsL;

    static /* synthetic */ void EYQ(String str, String str2) {
    }

    boolean EYQ(int i, String str) {
        if (str == null) {
            return false;
        }
        synchronized (this.QQ) {
            Set<VwS> set = this.QQ.get(i);
            if (set != null) {
                for (VwS vwS : set) {
                    if (vwS != null && str.equals(vwS.QQ)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public static IPb EYQ() {
        if (Pm == null) {
            synchronized (IPb.class) {
                if (Pm == null) {
                    Pm = new IPb();
                }
            }
        }
        return Pm;
    }

    private IPb() {
        SparseArray<Set<VwS>> sparseArray = new SparseArray<>(2);
        this.QQ = sparseArray;
        this.HX = new VwS.Td() { // from class: com.bykv.vk.openvk.component.video.EYQ.mZx.IPb.1
            @Override // com.bykv.vk.openvk.component.video.EYQ.mZx.VwS.Td
            public void EYQ(VwS vwS) {
                synchronized (IPb.this.QQ) {
                    Set set = (Set) IPb.this.QQ.get(vwS.IPb());
                    if (set != null) {
                        set.add(vwS);
                    }
                }
            }

            @Override // com.bykv.vk.openvk.component.video.EYQ.mZx.VwS.Td
            public void mZx(VwS vwS) {
                if (Kbd.Td) {
                    Log.d("ProxyServer", "afterExecute, ProxyTask: ".concat(String.valueOf(vwS)));
                }
                int iIPb = vwS.IPb();
                synchronized (IPb.this.QQ) {
                    Set set = (Set) IPb.this.QQ.get(iIPb);
                    if (set != null) {
                        set.remove(vwS);
                    }
                }
            }
        };
        this.tsL = new Runnable() { // from class: com.bykv.vk.openvk.component.video.EYQ.mZx.IPb.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    int i = 0;
                    IPb.this.EYQ = new ServerSocket(0, 50, InetAddress.getByName(IPb.this.HX()));
                    IPb iPb = IPb.this;
                    iPb.mZx = iPb.EYQ.getLocalPort();
                    if (IPb.this.mZx != -1) {
                        tp.EYQ(IPb.this.HX(), IPb.this.mZx);
                        if (IPb.this.VwS()) {
                            AtomicInteger unused = IPb.this.Td;
                            if (IPb.this.Td.compareAndSet(0, 1)) {
                                AtomicInteger unused2 = IPb.this.Td;
                                boolean z = Kbd.Td;
                                while (IPb.this.Td.get() == 1) {
                                    try {
                                        try {
                                            Socket socketAccept = IPb.this.EYQ.accept();
                                            com.bykv.vk.openvk.component.video.EYQ.mZx.mZx.Td td = IPb.this.Kbd;
                                            if (td != null) {
                                                final VwS vwSEYQ = new VwS.EYQ().EYQ(td).EYQ(socketAccept).EYQ(IPb.this.HX).EYQ();
                                                com.bytedance.sdk.component.VwS.IPb.Td().execute(new com.bytedance.sdk.component.VwS.QQ("ProxyTask", 10) { // from class: com.bykv.vk.openvk.component.video.EYQ.mZx.IPb.2.1
                                                    @Override // java.lang.Runnable
                                                    public void run() {
                                                        vwSEYQ.run();
                                                    }
                                                });
                                            } else {
                                                com.bykv.vk.openvk.component.video.EYQ.Td.EYQ.EYQ(socketAccept);
                                            }
                                        } catch (IOException e) {
                                            IPb.EYQ("accept error", Log.getStackTraceString(e));
                                            i++;
                                            if (i > 3) {
                                                break;
                                            }
                                        }
                                    } catch (Throwable th) {
                                        String stackTraceString = Log.getStackTraceString(th);
                                        Log.e("ProxyServer", "proxy server crashed!  ".concat(String.valueOf(stackTraceString)));
                                        IPb.EYQ("error", stackTraceString);
                                    }
                                }
                                boolean z2 = Kbd.Td;
                                IPb.this.Kbd();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    IPb.EYQ("socket not bound", "");
                    IPb.this.Kbd();
                } catch (IOException e2) {
                    if (Kbd.Td) {
                        Log.e("ProxyServer", "create ServerSocket error!  " + Log.getStackTraceString(e2));
                    }
                    IPb.EYQ("create ServerSocket error", Log.getStackTraceString(e2));
                    IPb.this.Kbd();
                }
            }
        };
        this.pi = new AtomicBoolean();
        sparseArray.put(0, new HashSet());
        sparseArray.put(1, new HashSet());
    }

    Td mZx() {
        return this.tp;
    }

    Td Td() {
        return this.MxO;
    }

    void EYQ(com.bykv.vk.openvk.component.video.EYQ.mZx.mZx.Td td) {
        this.Kbd = td;
    }

    void EYQ(com.bykv.vk.openvk.component.video.EYQ.mZx.EYQ.Td td) {
        this.IPb = td;
    }

    public String EYQ(boolean z, boolean z2, String str, String... strArr) {
        String str2;
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            return strArr[0];
        }
        if (this.Kbd == null) {
            return strArr[0];
        }
        if ((z ? this.VwS : this.IPb) == null) {
            return strArr[0];
        }
        if (this.Td.get() != 1) {
            return strArr[0];
        }
        List<String> listEYQ = com.bykv.vk.openvk.component.video.EYQ.Td.EYQ.EYQ(strArr);
        if (listEYQ == null) {
            return strArr[0];
        }
        String strEYQ = HX.EYQ(str, z2 ? str : com.bykv.vk.openvk.component.video.api.IPb.mZx.EYQ(str), listEYQ);
        if (strEYQ == null) {
            return strArr[0];
        }
        if (z) {
            str2 = "https://" + HX() + ":" + this.mZx + "?f=1&" + strEYQ;
        } else {
            str2 = "https://" + HX() + ":" + this.mZx + "?" + strEYQ;
        }
        return str2.replaceFirst(CmcdHeadersFactory.STREAMING_FORMAT_SS, "");
    }

    public void Pm() {
        if (this.pi.compareAndSet(false, true)) {
            Thread thread = new Thread(this.tsL);
            thread.setName("csj_proxy_server");
            thread.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Kbd() {
        if (this.Td.compareAndSet(1, 2) || this.Td.compareAndSet(0, 2)) {
            com.bykv.vk.openvk.component.video.EYQ.Td.EYQ.EYQ(this.EYQ);
            IPb();
        }
    }

    private void IPb() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.QQ) {
            int size = this.QQ.size();
            for (int i = 0; i < size; i++) {
                SparseArray<Set<VwS>> sparseArray = this.QQ;
                Set<VwS> set = sparseArray.get(sparseArray.keyAt(i));
                if (set != null) {
                    arrayList.addAll(set);
                    set.clear();
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((VwS) it.next()).EYQ();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean VwS() {
        com.bytedance.sdk.component.VwS.VwS vwS = new com.bytedance.sdk.component.VwS.VwS(new EYQ(HX(), this.mZx), 5, 1);
        com.bytedance.sdk.component.VwS.IPb.Td().submit(vwS);
        QQ();
        try {
            if (!((Boolean) vwS.get()).booleanValue()) {
                Log.e("ProxyServer", "Ping error");
                Kbd();
                return false;
            }
            boolean z = Kbd.Td;
            return true;
        } catch (Throwable th) {
            Log.getStackTraceString(th);
            Kbd();
            return false;
        }
    }

    /* compiled from: ProxyServer.java */
    private static final class EYQ implements Callable<Boolean> {
        private final String EYQ;
        private final int mZx;

        EYQ(String str, int i) {
            this.EYQ = str;
            this.mZx = i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            Socket socket;
            Throwable th;
            try {
                socket = new Socket(this.EYQ, this.mZx);
                try {
                    socket.setSoTimeout(2000);
                    OutputStream outputStream = socket.getOutputStream();
                    outputStream.write("Ping\n".getBytes(com.bykv.vk.openvk.component.video.EYQ.Td.EYQ.EYQ));
                    outputStream.flush();
                    if ("OK".equals(new BufferedReader(new InputStreamReader(socket.getInputStream())).readLine())) {
                        return Boolean.TRUE;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        th.getMessage();
                        IPb.EYQ("ping error", Log.getStackTraceString(th));
                        com.bykv.vk.openvk.component.video.EYQ.Td.EYQ.EYQ(socket);
                        return Boolean.FALSE;
                    } finally {
                        com.bykv.vk.openvk.component.video.EYQ.Td.EYQ.EYQ(socket);
                    }
                }
            } catch (Throwable th3) {
                socket = null;
                th = th3;
            }
            com.bykv.vk.openvk.component.video.EYQ.Td.EYQ.EYQ(socket);
            return Boolean.FALSE;
        }
    }

    private void QQ() {
        Socket socketAccept = null;
        try {
            socketAccept = this.EYQ.accept();
            socketAccept.setSoTimeout(2000);
            if ("Ping".equals(new BufferedReader(new InputStreamReader(socketAccept.getInputStream())).readLine())) {
                OutputStream outputStream = socketAccept.getOutputStream();
                outputStream.write("OK\n".getBytes(com.bykv.vk.openvk.component.video.EYQ.Td.EYQ.EYQ));
                outputStream.flush();
            }
        } catch (IOException e) {
            Log.getStackTraceString(e);
        } finally {
            com.bykv.vk.openvk.component.video.EYQ.Td.EYQ.EYQ(socketAccept);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String HX() {
        return new String(Base64.decode("MTI3LjAuMC4x".getBytes(), 0));
    }
}
