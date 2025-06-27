package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import org.json.JSONObject;

/* compiled from: ExpressInitHelper.java */
/* loaded from: classes2.dex */
public class tp {
    public static void EYQ() {
        com.bytedance.sdk.component.adexpress.EYQ.EYQ.EYQ.EYQ().EYQ(new com.bytedance.sdk.component.adexpress.EYQ.EYQ.mZx() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.tp.1
            @Override // com.bytedance.sdk.component.adexpress.EYQ.EYQ.mZx
            public int EYQ(String str, ContentValues contentValues, String str2, String[] strArr) {
                return com.bytedance.sdk.openadsdk.multipro.EYQ.EYQ.EYQ(com.bytedance.sdk.openadsdk.core.hu.EYQ(), str, contentValues, str2, strArr);
            }

            @Override // com.bytedance.sdk.component.adexpress.EYQ.EYQ.mZx
            public Cursor EYQ(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
                return new com.bytedance.sdk.openadsdk.multipro.aidl.Td(com.bytedance.sdk.openadsdk.multipro.EYQ.EYQ.EYQ(com.bytedance.sdk.openadsdk.core.hu.EYQ(), str, strArr, str2, strArr2, str3, str4, str5));
            }

            @Override // com.bytedance.sdk.component.adexpress.EYQ.EYQ.mZx
            public int EYQ(String str, String str2, String[] strArr) {
                return com.bytedance.sdk.openadsdk.multipro.EYQ.EYQ.EYQ(com.bytedance.sdk.openadsdk.core.hu.EYQ(), str, str2, strArr);
            }

            @Override // com.bytedance.sdk.component.adexpress.EYQ.EYQ.mZx
            public void EYQ(String str, ContentValues contentValues) {
                com.bytedance.sdk.openadsdk.multipro.EYQ.EYQ.EYQ(com.bytedance.sdk.openadsdk.core.hu.EYQ(), str, contentValues);
            }
        });
        com.bytedance.sdk.component.adexpress.EYQ.EYQ.EYQ.EYQ().EYQ(new com.bytedance.sdk.component.adexpress.EYQ.EYQ.Td() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.tp.2
            @Override // com.bytedance.sdk.component.adexpress.EYQ.EYQ.Td
            public int HX() {
                return 1;
            }

            @Override // com.bytedance.sdk.component.adexpress.EYQ.EYQ.Td
            public int tsL() {
                return 0;
            }

            @Override // com.bytedance.sdk.component.adexpress.EYQ.EYQ.Td
            public int EYQ() {
                if (com.bytedance.sdk.openadsdk.core.hu.Pm() == null) {
                    return 0;
                }
                return com.bytedance.sdk.openadsdk.core.hu.Pm().Pm();
            }

            @Override // com.bytedance.sdk.component.adexpress.EYQ.EYQ.Td
            public Context mZx() {
                return com.bytedance.sdk.openadsdk.core.hu.EYQ();
            }

            @Override // com.bytedance.sdk.component.adexpress.EYQ.EYQ.Td
            public Handler Td() {
                return com.bytedance.sdk.openadsdk.core.pi.Td();
            }

            @Override // com.bytedance.sdk.component.adexpress.EYQ.EYQ.Td
            public void Pm() {
                if ((com.bytedance.sdk.openadsdk.core.hu.Pm().Nuq() == 0 || com.bytedance.sdk.openadsdk.core.hu.Pm().dVQ() == 0) && (com.bytedance.sdk.openadsdk.core.hu.Pm().xh() == 0 || com.bytedance.sdk.openadsdk.core.hu.Pm().GfQ() == 0)) {
                    return;
                }
                com.bytedance.sdk.component.adexpress.Kbd.Kbd.EYQ().EYQ(com.bytedance.sdk.openadsdk.core.hu.Pm().Nuq());
                com.bytedance.sdk.component.adexpress.Kbd.Kbd.EYQ().mZx(com.bytedance.sdk.openadsdk.core.hu.Pm().GfQ());
                final MessageQueue[] messageQueueArr = new MessageQueue[1];
                if (Build.VERSION.SDK_INT >= 23) {
                    messageQueueArr[0] = com.bytedance.sdk.openadsdk.core.pi.Td().getLooper().getQueue();
                    EYQ(messageQueueArr[0]);
                } else if (Looper.getMainLooper() == Looper.myLooper()) {
                    messageQueueArr[0] = Looper.myQueue();
                    EYQ(messageQueueArr[0]);
                } else {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.tp.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            messageQueueArr[0] = Looper.myQueue();
                            EYQ(messageQueueArr[0]);
                        }
                    });
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void EYQ(MessageQueue messageQueue) {
                if (messageQueue != null) {
                    messageQueue.addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.tp.2.2
                        @Override // android.os.MessageQueue.IdleHandler
                        public boolean queueIdle() {
                            if (com.bytedance.sdk.openadsdk.core.hu.Pm().dVQ() > 0) {
                                com.bytedance.sdk.openadsdk.core.widget.EYQ.mZx mzx = new com.bytedance.sdk.openadsdk.core.widget.EYQ.mZx();
                                mzx.EYQ(false);
                                mzx.mZx();
                            }
                            if (com.bytedance.sdk.openadsdk.core.hu.Pm().GfQ() > 0) {
                                com.bytedance.sdk.openadsdk.core.widget.EYQ.mZx mzx2 = new com.bytedance.sdk.openadsdk.core.widget.EYQ.mZx();
                                mzx2.EYQ(true);
                                mzx2.mZx();
                            }
                            return false;
                        }
                    });
                }
            }

            @Override // com.bytedance.sdk.component.adexpress.EYQ.EYQ.Td
            public com.bytedance.sdk.component.adexpress.EYQ.Td.EYQ Kbd() {
                return com.bytedance.sdk.openadsdk.core.hu.Td().EYQ();
            }

            @Override // com.bytedance.sdk.component.adexpress.EYQ.EYQ.Td
            public com.bytedance.sdk.component.IPb.mZx.EYQ IPb() {
                return com.bytedance.sdk.openadsdk.MxO.Td.EYQ().mZx().Pm();
            }

            @Override // com.bytedance.sdk.component.adexpress.EYQ.EYQ.Td
            public com.bytedance.sdk.component.IPb.mZx.mZx VwS() {
                return com.bytedance.sdk.openadsdk.MxO.Td.EYQ().mZx().Td();
            }

            @Override // com.bytedance.sdk.component.adexpress.EYQ.EYQ.Td
            public String QQ() {
                return com.bytedance.sdk.openadsdk.core.QQ.mZx().Pm();
            }

            @Override // com.bytedance.sdk.component.adexpress.EYQ.EYQ.Td
            public int tp() {
                return com.bytedance.sdk.openadsdk.core.hu.Pm().Nuq();
            }

            @Override // com.bytedance.sdk.component.adexpress.EYQ.EYQ.Td
            public int MxO() {
                return com.bytedance.sdk.openadsdk.core.hu.Pm().xh();
            }
        });
        com.bytedance.sdk.component.adexpress.EYQ.EYQ.EYQ.EYQ().EYQ(new com.bytedance.sdk.component.adexpress.EYQ.EYQ.Pm() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.tp.3
            @Override // com.bytedance.sdk.component.adexpress.EYQ.EYQ.Pm
            public void EYQ(int i) {
                com.bytedance.sdk.openadsdk.tp.Td.EYQ().EYQ(com.bytedance.sdk.openadsdk.tp.EYQ.Td.mZx().mZx(i).IPb(com.bytedance.sdk.openadsdk.core.VwS.EYQ(i)));
            }
        });
        com.bytedance.sdk.component.widget.EYQ.EYQ.EYQ().EYQ(new com.bytedance.sdk.component.widget.EYQ.mZx() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.tp.4
            @Override // com.bytedance.sdk.component.widget.EYQ.mZx
            public void EYQ(com.bytedance.sdk.component.widget.mZx.EYQ eyq, String str, String str2, JSONObject jSONObject, long j) {
                com.bytedance.sdk.openadsdk.core.model.UB ubMZx = com.bytedance.sdk.openadsdk.core.model.UB.mZx();
                ubMZx.UB(eyq.EYQ());
                ubMZx.zF(eyq.mZx());
                ubMZx.Uc(eyq.Td());
                com.bytedance.sdk.openadsdk.mZx.Td.mZx(ubMZx, str, str2, jSONObject, j);
            }
        });
    }
}
