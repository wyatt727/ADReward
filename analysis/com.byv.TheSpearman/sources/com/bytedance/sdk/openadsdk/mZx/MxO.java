package com.bytedance.sdk.openadsdk.mZx;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.google.android.gms.nearby.messages.Strategy;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;

/* compiled from: OpenAppSuccEvent.java */
/* loaded from: classes2.dex */
public class MxO {
    private static volatile MxO EYQ;
    private Map<String, Object> IPb;
    private final Handler Td;
    private HandlerThread mZx;
    private final Executor Pm = Executors.newCachedThreadPool();
    private mZx Kbd = mZx.EYQ();

    public static MxO EYQ() {
        if (EYQ == null) {
            synchronized (MxO.class) {
                if (EYQ == null) {
                    EYQ = new MxO();
                }
            }
        }
        return EYQ;
    }

    public MxO EYQ(Map<String, Object> map) {
        this.IPb = map;
        return EYQ();
    }

    private MxO() {
        if (this.mZx == null) {
            HandlerThread handlerThread = new HandlerThread("OpenAppSuccEvent_HandlerThread", 10);
            this.mZx = handlerThread;
            handlerThread.start();
        }
        this.Td = new Handler(this.mZx.getLooper(), new Handler.Callback() { // from class: com.bytedance.sdk.openadsdk.mZx.MxO.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                if (message.what != 100) {
                    return true;
                }
                EYQ eyq = null;
                if (message.obj != null && (message.obj instanceof EYQ)) {
                    eyq = (EYQ) message.obj;
                }
                if (eyq == null) {
                    return true;
                }
                MxO.this.mZx(eyq);
                return true;
            }
        });
    }

    public void EYQ(UB ub, String str) {
        Message messageObtainMessage = this.Td.obtainMessage();
        messageObtainMessage.what = 100;
        messageObtainMessage.obj = EYQ.EYQ(ub, str, this.IPb);
        messageObtainMessage.sendToTarget();
    }

    private void EYQ(EYQ eyq) {
        if (eyq == null) {
            return;
        }
        eyq.mZx();
        if (eyq.EYQ() * this.Kbd.EYQ > this.Kbd.mZx) {
            Td(eyq.EYQ(false));
            return;
        }
        Message messageObtainMessage = this.Td.obtainMessage();
        messageObtainMessage.what = 100;
        messageObtainMessage.obj = eyq;
        this.Td.sendMessageDelayed(messageObtainMessage, this.Kbd.EYQ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mZx(EYQ eyq) {
        if (eyq == null) {
            return;
        }
        boolean zPm = com.bytedance.sdk.openadsdk.core.nWX.EYQ().Pm();
        boolean zEYQ = com.bytedance.sdk.openadsdk.core.nWX.EYQ().EYQ(true);
        if (zPm || !zEYQ) {
            if (eyq.Kbd == null) {
                eyq.Kbd = new HashMap();
            }
            eyq.Kbd.put("is_background", Boolean.valueOf(zPm));
            eyq.Kbd.put("has_focus", Boolean.valueOf(zEYQ));
            Td(eyq.EYQ(true));
            return;
        }
        EYQ(eyq);
    }

    private void Td(EYQ eyq) {
        if (eyq == null) {
            return;
        }
        this.Pm.execute(eyq);
    }

    /* compiled from: OpenAppSuccEvent.java */
    private static class EYQ implements Serializable, Runnable {
        public Map<String, Object> Kbd;
        public String Pm;
        public UB Td;
        public final AtomicInteger EYQ = new AtomicInteger(0);
        public final AtomicBoolean mZx = new AtomicBoolean(false);

        public static EYQ EYQ(UB ub, String str, Map<String, Object> map) {
            return new EYQ(ub, str, map);
        }

        public EYQ(UB ub, String str, Map<String, Object> map) {
            this.Td = ub;
            this.Pm = str;
            this.Kbd = map;
        }

        public EYQ EYQ(boolean z) {
            this.mZx.set(z);
            return this;
        }

        public int EYQ() {
            return this.EYQ.get();
        }

        public void mZx() {
            this.EYQ.incrementAndGet();
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            if (this.Td == null || TextUtils.isEmpty(this.Pm)) {
                return;
            }
            String str = this.mZx.get() ? "dpl_success" : "dpl_failed";
            if (this.Kbd == null) {
                this.Kbd = new HashMap();
            }
            UB ub = this.Td;
            if (ub != null && ub.CE() == 0) {
                Map<String, Object> map = this.Kbd;
                UB ub2 = this.Td;
                map.put("auto_click", Boolean.valueOf((ub2 == null || ub2.Td()) ? false : true));
            }
            this.Kbd.put("lifeCycleInit", Boolean.valueOf(com.bytedance.sdk.openadsdk.core.nWX.EYQ().Td()));
            Td.EYQ(this.Td, this.Pm, str, this.Kbd);
        }
    }

    /* compiled from: OpenAppSuccEvent.java */
    private static class mZx {
        public int EYQ = Strategy.TTL_SECONDS_DEFAULT;
        public int mZx = 6000;

        private mZx() {
        }

        public static mZx EYQ() {
            return new mZx();
        }
    }
}
