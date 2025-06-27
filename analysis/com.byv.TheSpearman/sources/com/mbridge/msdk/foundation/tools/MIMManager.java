package com.mbridge.msdk.foundation.tools;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.json.m4;
import com.json.mediationsdk.utils.IronSourceConstants;
import com.json.t2;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public final class MIMManager {

    /* renamed from: a, reason: collision with root package name */
    private static volatile String f2961a;
    private final AtomicBoolean b;
    private int c;
    private CopyOnWriteArrayList<CampaignEx> d;
    private Context e;
    private volatile Boolean f;
    private CampaignEx g;
    private volatile b h;
    private volatile MiOverseaMiniCardBroadcasterReceiver i;

    private MIMManager() {
        this.c = 0;
        this.d = new CopyOnWriteArrayList<>();
        this.b = new AtomicBoolean(false);
    }

    public static MIMManager a() {
        return a.f2967a;
    }

    public final void a(CampaignEx campaignEx) {
        try {
            if (this.f != null && campaignEx != null && this.f.booleanValue()) {
                this.g = campaignEx;
                this.d.add(campaignEx);
            }
            if (com.mbridge.msdk.f.b.b() && campaignEx != null && campaignEx.getDeepLinkURL().startsWith("mimarket")) {
                if (this.i == null) {
                    try {
                        if (this.i == null) {
                            this.i = new MiOverseaMiniCardBroadcasterReceiver();
                        }
                        IntentFilter intentFilter = new IntentFilter(x.a("DFKwWgtuDkKwLZPwD+z8H+N/xjK+n3eyNVx6ZVPn5jcincKZx5f5ncN="));
                        Context contextC = com.mbridge.msdk.foundation.controller.c.m().c();
                        if (contextC != null) {
                            contextC.registerReceiver(this.i, intentFilter);
                        }
                    } catch (Exception e) {
                        ad.a("MIMManager", e.getMessage());
                    }
                }
                this.g = campaignEx;
                this.d.add(campaignEx);
            }
        } catch (Exception e2) {
            ad.b("MIMManager", e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CampaignEx a(String str) {
        try {
            CampaignEx campaignEx = this.g;
            if (campaignEx != null && TextUtils.equals(campaignEx.getPackageName(), str)) {
                return this.g;
            }
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.d;
            if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
                return null;
            }
            Iterator<CampaignEx> it = this.d.iterator();
            while (it.hasNext()) {
                CampaignEx next = it.next();
                if (next != null && TextUtils.equals(next.getPackageName(), str)) {
                    return next;
                }
            }
            return null;
        } catch (Exception e) {
            ad.b("MIMManager", e.getMessage());
            return null;
        }
    }

    final CampaignEx b() {
        return this.g;
    }

    public final String c() {
        try {
            return f2961a == null ? "" : String.format("[%s]", f2961a);
        } catch (Exception unused) {
            return "";
        }
    }

    public final void a(final Context context) {
        this.e = context;
        com.mbridge.msdk.foundation.same.f.b.b().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.tools.MIMManager.1
            @Override // java.lang.Runnable
            public final void run() {
                if (MIMManager.this.b.compareAndSet(false, true)) {
                    try {
                        MIMManager mIMManager = MIMManager.this;
                        mIMManager.f = mIMManager.g();
                    } catch (Exception e) {
                        ad.a("MIMManager", e.getMessage());
                    }
                    if (MIMManager.this.f == null || !MIMManager.this.f.booleanValue() || context == null) {
                        return;
                    }
                    try {
                        MIMManager.this.h = new b();
                        IntentFilter intentFilter = new IntentFilter();
                        intentFilter.addAction(x.a("DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KyVj5GxVN="));
                        intentFilter.addAction(x.a("DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KanjKnxVN="));
                        intentFilter.addAction(x.a("DFKwWgtuDkKwLZPwD+z8H+N/xjQZxVfV+T2SZVe6V2xS5c5n"));
                        context.registerReceiver(MIMManager.this.h, intentFilter);
                    } catch (Exception e2) {
                        ad.a("MIMManager", e2.getMessage());
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Boolean g() {
        Cursor cursorQuery;
        Context contextC = com.mbridge.msdk.foundation.controller.c.m().c();
        Boolean boolValueOf = null;
        if (contextC != null) {
            try {
                if (contextC.getContentResolver() != null) {
                    try {
                        cursorQuery = contextC.getContentResolver().query(Uri.parse(x.a("DFK/J75/JaEXWFfXYZP9LkcXYk3/YkcBLF5TWgSBYbHuH75BW3xuhr5UJj2tLkeNhrKFLkxQhl==")), null, null, null, null);
                    } catch (Exception unused) {
                        cursorQuery = null;
                    }
                    if (cursorQuery != null) {
                        while (cursorQuery.moveToNext()) {
                            try {
                                String string = cursorQuery.getString(cursorQuery.getColumnIndex("support"));
                                if (!TextUtils.isEmpty(string) && !string.equalsIgnoreCase(AbstractJsonLexerKt.NULL) && (string.equalsIgnoreCase("false") || string.equalsIgnoreCase(com.json.mediationsdk.metadata.a.g))) {
                                    boolValueOf = Boolean.valueOf(Boolean.parseBoolean(string));
                                }
                            } catch (Exception e) {
                                ad.a("MIMManager", e.getMessage());
                            }
                            try {
                                f2961a = cursorQuery.getString(cursorQuery.getColumnIndex("detailStyle"));
                            } catch (Exception e2) {
                                ad.a("MIMManager", e2.getMessage());
                            }
                        }
                        try {
                            cursorQuery.close();
                        } catch (Exception e3) {
                            ad.a("MIMManager", e3.getMessage());
                        }
                    }
                }
            } catch (Exception e4) {
                ad.b("MIMManager", e4.getMessage());
            }
        }
        return boolValueOf;
    }

    public final Boolean d() {
        return this.f;
    }

    public final void e() {
        this.c++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f() {
        int i = this.c - 1;
        this.c = i;
        if (i <= 0) {
            Context context = this.e;
            if (context != null) {
                try {
                    try {
                        if (this.h != null) {
                            context.unregisterReceiver(this.h);
                        }
                        if (this.i != null) {
                            context.unregisterReceiver(this.i);
                        }
                    } catch (Exception e) {
                        ad.a("MIMManager", e.getMessage());
                    }
                } finally {
                    this.g = null;
                    this.d.clear();
                    this.d = null;
                    this.h = null;
                    this.e = null;
                }
            }
            try {
                try {
                    if (this.i != null) {
                        Context contextC = com.mbridge.msdk.foundation.controller.c.m().c();
                        if (contextC != null) {
                            contextC.unregisterReceiver(this.i);
                        }
                        this.g = null;
                        this.d.clear();
                        this.d = null;
                        this.i = null;
                    }
                } catch (Exception e2) {
                    ad.a("MIMManager", e2.getMessage());
                }
            } catch (Throwable th) {
                ad.b("MIMManager", th.getMessage());
            }
        }
    }

    public final void b(CampaignEx campaignEx) {
        try {
            if (this.f == null || campaignEx == null || !this.f.booleanValue()) {
                return;
            }
            this.g = null;
            try {
                this.d.remove(campaignEx);
            } catch (Exception e) {
                ad.a("MIMManager", e.getMessage());
            }
        } catch (Exception e2) {
            ad.b("MIMManager", e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final MIMManager f2967a = new MIMManager();
    }

    private static class b extends BroadcastReceiver {
        private b() {
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x0083 A[Catch: Exception -> 0x00a8, TryCatch #0 {Exception -> 0x00a8, blocks: (B:13:0x0033, B:16:0x003a, B:18:0x004b, B:21:0x0052, B:24:0x005d, B:36:0x0083, B:37:0x008a, B:31:0x006f, B:32:0x0075, B:33:0x007b), top: B:43:0x0033 }] */
        @Override // android.content.BroadcastReceiver
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onReceive(final android.content.Context r9, android.content.Intent r10) {
            /*
                r8 = this;
                java.lang.String r0 = r10.getAction()
                boolean r1 = android.text.TextUtils.isEmpty(r0)
                if (r1 == 0) goto Lb
                return
            Lb:
                java.lang.String r1 = "DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KyVj5GxVN="
                java.lang.String r1 = com.mbridge.msdk.foundation.tools.x.a(r1)
                boolean r1 = r0.equals(r1)
                if (r1 == 0) goto L19
                goto Lb2
            L19:
                java.lang.String r1 = "DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KanjKnxVN="
                java.lang.String r1 = com.mbridge.msdk.foundation.tools.x.a(r1)
                boolean r1 = r0.equals(r1)
                if (r1 == 0) goto L27
                goto Lb2
            L27:
                java.lang.String r1 = "DFKwWgtuDkKwLZPwD+z8H+N/xjQZxVfV+T2SZVe6V2xS5c5n"
                java.lang.String r1 = com.mbridge.msdk.foundation.tools.x.a(r1)
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto Lb2
                android.os.Bundle r10 = r10.getExtras()     // Catch: java.lang.Exception -> La8
                if (r10 != 0) goto L3a
                return
            L3a:
                java.lang.String r0 = "statusCode"
                r1 = -1
                int r7 = r10.getInt(r0, r1)     // Catch: java.lang.Exception -> La8
                java.lang.String r0 = "packageName"
                java.lang.String r2 = ""
                java.lang.String r10 = r10.getString(r0, r2)     // Catch: java.lang.Exception -> La8
                if (r7 == r1) goto La7
                boolean r0 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Exception -> La8
                if (r0 == 0) goto L52
                goto La7
            L52:
                com.mbridge.msdk.foundation.tools.MIMManager r0 = com.mbridge.msdk.foundation.tools.MIMManager.a.a()     // Catch: java.lang.Exception -> La8
                com.mbridge.msdk.foundation.entity.CampaignEx r10 = com.mbridge.msdk.foundation.tools.MIMManager.a(r0, r10)     // Catch: java.lang.Exception -> La8
                if (r10 != 0) goto L5d
                return
            L5d:
                com.mbridge.msdk.foundation.tools.MIMManager r0 = com.mbridge.msdk.foundation.tools.MIMManager.a.a()     // Catch: java.lang.Exception -> La8
                r1 = 3001(0xbb9, float:4.205E-42)
                if (r7 == r1) goto L7b
                r1 = 3002(0xbba, float:4.207E-42)
                if (r7 == r1) goto L75
                r1 = 3008(0xbc0, float:4.215E-42)
                if (r7 == r1) goto L6f
                r10 = 0
                goto L81
            L6f:
                com.mbridge.msdk.foundation.tools.MIMManager$4 r1 = new com.mbridge.msdk.foundation.tools.MIMManager$4     // Catch: java.lang.Exception -> La8
                r1.<init>()     // Catch: java.lang.Exception -> La8
                goto L80
            L75:
                com.mbridge.msdk.foundation.tools.MIMManager$3 r1 = new com.mbridge.msdk.foundation.tools.MIMManager$3     // Catch: java.lang.Exception -> La8
                r1.<init>()     // Catch: java.lang.Exception -> La8
                goto L80
            L7b:
                com.mbridge.msdk.foundation.tools.MIMManager$2 r1 = new com.mbridge.msdk.foundation.tools.MIMManager$2     // Catch: java.lang.Exception -> La8
                r1.<init>()     // Catch: java.lang.Exception -> La8
            L80:
                r10 = r1
            L81:
                if (r10 == 0) goto L8a
                java.util.concurrent.ThreadPoolExecutor r0 = com.mbridge.msdk.foundation.same.f.b.b()     // Catch: java.lang.Exception -> La8
                r0.execute(r10)     // Catch: java.lang.Exception -> La8
            L8a:
                com.mbridge.msdk.foundation.tools.MIMManager r3 = com.mbridge.msdk.foundation.tools.MIMManager.a.a()     // Catch: java.lang.Exception -> La8
                java.lang.String r5 = "dm_page_status"
                com.mbridge.msdk.foundation.tools.MIMManager r10 = com.mbridge.msdk.foundation.tools.MIMManager.a.a()     // Catch: java.lang.Exception -> La8
                com.mbridge.msdk.foundation.entity.CampaignEx r6 = r10.b()     // Catch: java.lang.Exception -> La8
                java.util.concurrent.ThreadPoolExecutor r10 = com.mbridge.msdk.foundation.same.f.b.b()     // Catch: java.lang.Exception -> La8
                com.mbridge.msdk.foundation.tools.MIMManager$5 r0 = new com.mbridge.msdk.foundation.tools.MIMManager$5     // Catch: java.lang.Exception -> La8
                r2 = r0
                r4 = r9
                r2.<init>()     // Catch: java.lang.Exception -> La8
                r10.execute(r0)     // Catch: java.lang.Exception -> La8
                goto Lb2
            La7:
                return
            La8:
                r9 = move-exception
                java.lang.String r9 = r9.getMessage()
                java.lang.String r10 = "MIMManager"
                com.mbridge.msdk.foundation.tools.ad.b(r10, r9)
            Lb2:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.MIMManager.b.onReceive(android.content.Context, android.content.Intent):void");
        }
    }

    public static class MiOverseaMiniCardBroadcasterReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (x.a("DFKwWgtuDkKwLZPwD+z8H+N/xjK+n3eyNVx6ZVPn5jcincKZx5f5ncN=").equals(intent.getAction())) {
                String stringExtra = intent.getStringExtra("packageName");
                int intExtra = intent.getIntExtra(IronSourceConstants.EVENTS_ERROR_CODE, 0);
                int intExtra2 = intExtra < 0 ? intent.getIntExtra("reason", 0) : -1;
                ad.b("MIMManager", stringExtra + " " + intExtra + " " + intExtra2);
                if (intExtra == 1 || intExtra == 2 || intExtra == 3 || intExtra == 4 || intExtra == 7) {
                    try {
                        com.mbridge.msdk.foundation.same.report.d.b bVar = new com.mbridge.msdk.foundation.same.report.d.b();
                        com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                        dVar.a(t2.h.W, URLEncoder.encode("m_mini_card", m4.M));
                        CampaignEx campaignExA = a.f2967a.a(stringExtra);
                        if (campaignExA != null) {
                            dVar.a("rid", campaignExA.getRequestId());
                            dVar.a("rid_n", campaignExA.getRequestIdNotice());
                            dVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, campaignExA.getCampaignUnitId());
                            dVar.a("u_stid", com.mbridge.msdk.foundation.controller.c.b.get(campaignExA.getCampaignUnitId()));
                            bVar.a(campaignExA);
                        }
                        dVar.a(NotificationCompat.CATEGORY_EVENT, String.valueOf(intExtra));
                        dVar.a("pkg_name", stringExtra);
                        if (intExtra2 != -1) {
                            dVar.a("reasonCode", String.valueOf(intExtra2));
                        }
                        bVar.a("m_mini_card", dVar);
                        com.mbridge.msdk.foundation.same.report.d.c.a().a("m_mini_card", bVar);
                    } catch (Exception e) {
                        ad.b("MIMManager", e.getMessage());
                    }
                }
            }
        }
    }
}
