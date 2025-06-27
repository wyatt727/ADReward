package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.json.m4;
import com.json.t2;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.e.w;
import com.mbridge.msdk.foundation.db.BatchReportDao;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.foundation.tools.al;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Stack;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MBRevenueBatchReportManager.java */
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static final String f2930a = "f";
    private static String b = "roas";
    private static volatile f c;
    private AtomicInteger d;
    private BatchReportDao e;
    private int f;
    private long g;
    private String h;
    private volatile int i;
    private boolean j;
    private Executor k = Executors.newSingleThreadExecutor();
    private Handler l;
    private Stack<Long> m;
    private com.mbridge.msdk.e.m n;

    private f() throws JSONException {
        com.mbridge.msdk.c.a aVarN;
        com.mbridge.msdk.e.o oVar;
        this.f = 1;
        this.g = 0L;
        this.h = com.mbridge.msdk.foundation.same.net.g.d.f().F;
        this.i = 0;
        this.j = false;
        com.mbridge.msdk.c.g gVarB = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
        if (gVarB != null && (aVarN = gVarB.n()) != null) {
            this.f = aVarN.a();
            this.g = aVarN.c() * 1000;
            this.h = com.mbridge.msdk.foundation.same.net.g.d.f().F;
            this.i = aVarN.b();
            boolean z = aVarN.d() == 1;
            this.j = z;
            if (z && this.i != 1) {
                int iA = af.a().a("bcp", "type", af.a().a("t_r_t", 1));
                if (iA != 0 && iA != 1) {
                    iA = 0;
                }
                w.a aVarA = new w.a().a(new d()).a(new o());
                if (iA == 1) {
                    oVar = new com.mbridge.msdk.e.o(new n((byte) 2), com.mbridge.msdk.foundation.same.net.g.d.f().k, com.mbridge.msdk.foundation.same.net.g.d.f().o);
                } else {
                    oVar = new com.mbridge.msdk.e.o(new com.mbridge.msdk.e.a.a.g(), com.mbridge.msdk.foundation.same.net.g.d.f().F, 0);
                }
                this.n = com.mbridge.msdk.e.m.a(b, com.mbridge.msdk.foundation.controller.c.m().c(), aVarA.a(iA, oVar).e(af.a().a("t_m_e_t", 604800000)).a(af.a().a("t_m_e_s", 50)).d(af.a().a("t_m_r_c", 50)).b(af.a().a("t_m_t", DefaultLoadControl.DEFAULT_MIN_BUFFER_MS)).c(af.a().a("t_m_r_t_s", 2)).a());
                JSONObject jSONObjectA = c.a();
                try {
                    jSONObjectA.put("device_type", z.v(com.mbridge.msdk.foundation.controller.c.m().c()) ? "pad" : "phone");
                    if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_OTHER)) {
                        jSONObjectA.put(com.mbridge.msdk.foundation.same.net.h.e.g, z.n());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                this.n.a(jSONObjectA);
                this.n.a();
            }
        }
        ad.a(f2930a, "初始化批量上报： " + this.h + " " + this.f + " " + this.g + " " + this.i);
        this.d = new AtomicInteger(0);
        this.m = new Stack<>();
        this.e = BatchReportDao.getInstance(com.mbridge.msdk.foundation.controller.c.m().c());
        HandlerThread handlerThread = new HandlerThread("mb_revenue_batch_report_thread");
        handlerThread.start();
        this.l = new Handler(handlerThread.getLooper()) { // from class: com.mbridge.msdk.foundation.same.report.f.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) throws UnsupportedEncodingException {
                int i = message.what;
                if (i == 1) {
                    Bundle data = message.getData();
                    if (f.this.l == null || f.this.e == null || data == null) {
                        return;
                    }
                    f.this.l.removeMessages(2);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    ArrayList<BatchReportMessage> batchReportMessages = f.this.e.getBatchReportMessages(jCurrentTimeMillis, 2);
                    f.a(f.this, batchReportMessages, jCurrentTimeMillis);
                    f.this.d.set(0);
                    String str = f.f2930a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("超时上报触发了，需要上报的数据： ");
                    sb.append(batchReportMessages != null ? batchReportMessages.size() : 0);
                    ad.a(str, sb.toString());
                    return;
                }
                if (i == 2) {
                    Bundle data2 = message.getData();
                    if (f.this.l == null || f.this.e == null || data2 == null) {
                        return;
                    }
                    f.this.l.removeMessages(1);
                    long j = data2.getLong("last_report_time");
                    ArrayList<BatchReportMessage> batchReportMessages2 = f.this.e.getBatchReportMessages(j, 2);
                    f.a(f.this, batchReportMessages2, j);
                    String str2 = f.f2930a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("队列上报触发了，需要上报的数据： ");
                    sb2.append(batchReportMessages2 != null ? batchReportMessages2.size() : 0);
                    ad.a(str2, sb2.toString());
                    return;
                }
                if (i == 3) {
                    Bundle data3 = message.getData();
                    if (data3 != null) {
                        f.b(f.this, data3.getParcelableArrayList("report_message"), data3.getLong("last_report_time"));
                        return;
                    }
                    return;
                }
                if (i != 4) {
                    return;
                }
                Bundle data4 = message.getData();
                if (f.this.l == null || f.this.e == null || data4 == null || !f.this.j) {
                    return;
                }
                f.this.l.removeMessages(4);
                ArrayList<BatchReportMessage> batchReportMessages3 = f.this.e.getBatchReportMessages(System.currentTimeMillis(), 2);
                if (batchReportMessages3 != null && batchReportMessages3.size() > 0) {
                    for (int i2 = 0; i2 < batchReportMessages3.size(); i2++) {
                        BatchReportMessage batchReportMessage = batchReportMessages3.get(i2);
                        f.a(f.this, batchReportMessage.getReportMessage(), batchReportMessage.getTimestamp());
                    }
                }
                String str3 = f.f2930a;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("切换上报lib，需要上报的数据： ");
                sb3.append(batchReportMessages3 != null ? batchReportMessages3.size() : 0);
                ad.a(str3, sb3.toString());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, String str) {
        com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
        dVar.a("state", Integer.valueOf(i));
        if (i == 2) {
            dVar.a("reason", str);
        }
        com.mbridge.msdk.foundation.same.report.d.b bVar = new com.mbridge.msdk.foundation.same.report.d.b();
        bVar.a("m_ad_rev_s_s", dVar);
        com.mbridge.msdk.foundation.same.report.d.c.a().a("m_ad_rev_s_s", bVar);
    }

    private JSONObject b(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(str)) {
            return jSONObject;
        }
        try {
            for (String str2 : str.split(t2.i.c)) {
                String[] strArrSplit = str2.split(t2.i.b);
                if (strArrSplit.length == 2) {
                    jSONObject.put(strArrSplit[0], strArrSplit[1]);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public static synchronized f a() {
        if (c == null) {
            c = new f();
        }
        return c;
    }

    public final void b() {
        Handler handler = this.l;
        if (handler == null || handler.hasMessages(1) || this.i == 1 || this.j) {
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        this.l.sendMessageDelayed(messageObtain, 5000L);
    }

    public final synchronized void a(final String str) {
        if (this.i == 1) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.mbridge.msdk.foundation.same.report.f.3
            @Override // java.lang.Runnable
            public final void run() {
                if (f.this.e == null) {
                    return;
                }
                ad.a(f.f2930a, "接收到上报数据： " + str);
                if (!f.this.j) {
                    if (f.this.i != 1) {
                        f.a(f.this, str);
                    }
                } else {
                    f.a(f.this, str, 0L);
                    if (((Integer) al.a(com.mbridge.msdk.foundation.controller.c.m().c(), "roas_use_event", 0)).intValue() == 0) {
                        al.b(com.mbridge.msdk.foundation.controller.c.m().c(), "roas_use_event", 1);
                        f.this.l.sendEmptyMessage(4);
                    }
                }
            }
        };
        com.mbridge.msdk.foundation.controller.d.a();
        Executor executor = this.k;
        if (executor != null) {
            executor.execute(runnable);
        } else {
            runnable.run();
        }
    }

    static /* synthetic */ void a(f fVar, ArrayList arrayList, long j) {
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        Message messageObtain = Message.obtain();
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("report_message", arrayList);
        bundle.putLong("last_report_time", j);
        messageObtain.setData(bundle);
        messageObtain.what = 3;
        fVar.l.sendMessage(messageObtain);
    }

    static /* synthetic */ void b(f fVar, final ArrayList arrayList, final long j) throws UnsupportedEncodingException {
        if (arrayList != null && arrayList.size() > 0) {
            ad.a(f2930a, "需要上报的数据条数： " + arrayList.size());
            Context contextC = com.mbridge.msdk.foundation.controller.c.m().c();
            if (contextC == null) {
                return;
            }
            com.mbridge.msdk.foundation.same.net.h.e eVarA = k.a(contextC);
            eVarA.a("app_id", com.mbridge.msdk.foundation.controller.c.m().k());
            eVarA.a("m_sdk", "msdk");
            eVarA.a("lqswt", String.valueOf(1));
            eVarA.a("device_type", z.v(contextC) ? "pad" : "phone");
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_OTHER)) {
                eVarA.a(com.mbridge.msdk.foundation.same.net.h.e.g, z.n());
            }
            StringBuilder sb = new StringBuilder();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                try {
                    BatchReportMessage batchReportMessage = (BatchReportMessage) arrayList.get(i);
                    if (batchReportMessage != null) {
                        sb.append(batchReportMessage.getReportMessage() + "&ts=" + batchReportMessage.getTimestamp());
                        if (i >= 0 && i < size - 1) {
                            sb.append("\n");
                        }
                    }
                } catch (Throwable th) {
                    ad.b(f2930a, th.getMessage());
                }
            }
            try {
                String strEncode = URLEncoder.encode(sb.toString(), m4.M);
                eVarA.a("data", strEncode);
                ad.a(f2930a, "需要批量上报的数据： " + strEncode);
                com.mbridge.msdk.foundation.same.report.e.a aVar = new com.mbridge.msdk.foundation.same.report.e.a(com.mbridge.msdk.foundation.controller.c.m().c());
                fVar.a(0, "");
                aVar.post(0, fVar.h, eVarA, new com.mbridge.msdk.foundation.same.report.e.b() { // from class: com.mbridge.msdk.foundation.same.report.f.2
                    @Override // com.mbridge.msdk.foundation.same.report.e.b
                    public final void onSuccess(String str) {
                        ad.a(f.f2930a, "批量上报成功");
                        f.this.a(1, "");
                        try {
                            if (f.this.e != null) {
                                f.this.e.deleteBatchReportMessagesByTimestamp(j);
                            }
                        } catch (Exception e) {
                            ad.b(f.f2930a, e.getMessage());
                        }
                        synchronized (f.this.m) {
                            f.this.m.clear();
                        }
                    }

                    @Override // com.mbridge.msdk.foundation.same.report.e.b
                    public final void onFailed(String str) {
                        Stack stack;
                        ad.a(f.f2930a, "批量上报失败： " + str);
                        f.this.a(2, str);
                        synchronized (f.this.m) {
                            f.this.m.add(Long.valueOf(j));
                            if (f.this.e != null) {
                                f.this.e.updateMessagesReportState(arrayList);
                            }
                            if (f.this.m.size() >= 5) {
                                ad.a(f.f2930a, "批量上报失败，上报失败的数据超过阈值");
                                try {
                                    try {
                                        f.this.m.pop();
                                        long jLongValue = ((Long) f.this.m.pop()).longValue();
                                        f.this.m.clear();
                                        if (f.this.e != null) {
                                            f.this.e.deleteBatchReportMessagesByTimestamp(jLongValue);
                                        }
                                        stack = f.this.m;
                                    } catch (Exception e) {
                                        ad.b(f.f2930a, e.getMessage());
                                        stack = f.this.m;
                                    }
                                    stack.clear();
                                } catch (Throwable th2) {
                                    f.this.m.clear();
                                    throw th2;
                                }
                            }
                        }
                    }
                });
                return;
            } catch (Exception e) {
                ad.b(f2930a, e.getMessage());
                return;
            }
        }
        ad.a(f2930a, "需要上报的数据条数： 0");
    }

    static /* synthetic */ void a(f fVar, String str, long j) {
        if (fVar.n != null) {
            com.mbridge.msdk.e.e eVar = new com.mbridge.msdk.e.e("roas");
            eVar.a(true);
            if (j != 0) {
                eVar.a(j);
            }
            eVar.b(1);
            try {
                eVar.a(fVar.b(str));
            } catch (Exception e) {
                e.printStackTrace();
            }
            fVar.n.a(eVar);
        }
    }

    static /* synthetic */ void a(f fVar, String str) {
        fVar.e.addReportMessage(str, 2);
        Handler handler = fVar.l;
        if (handler != null && !handler.hasMessages(1)) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            fVar.l.sendMessageDelayed(messageObtain, fVar.g);
        }
        if (fVar.d.incrementAndGet() < fVar.f || fVar.l == null) {
            return;
        }
        Message messageObtain2 = Message.obtain();
        Bundle bundle = new Bundle();
        bundle.putLong("last_report_time", System.currentTimeMillis());
        messageObtain2.setData(bundle);
        messageObtain2.what = 2;
        fVar.l.sendMessage(messageObtain2);
        fVar.d.set(0);
    }
}
