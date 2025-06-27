package com.json.mediationsdk;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.json.environment.thread.IronSourceThreadManager;
import com.json.h4;
import com.json.i1;
import com.json.mediationsdk.IronSource;
import com.json.mediationsdk.d;
import com.json.mediationsdk.logger.IronLog;
import com.json.mediationsdk.logger.IronSourceLogger;
import com.json.mediationsdk.logger.IronSourceLoggerManager;
import com.json.mediationsdk.utils.IronSourceAES;
import com.json.mediationsdk.utils.IronSourceUtils;
import com.json.mediationsdk.utils.c;
import com.json.y0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final String f1951a;
    private final String b;
    private final String c;
    private final String d;
    private f e;
    private IronSource.AD_UNIT f;
    private String g;
    private com.json.mediationsdk.utils.a h;
    private y0 i;
    private ISBannerSize j;

    public static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        protected WeakReference<y0> f1952a;
        protected d.a b;
        protected int c;
        protected String d;
        protected long e;
        protected int f;
        private int h;
        private final URL k;
        private final JSONObject l;
        private final boolean m;
        private final int n;
        private final long o;
        private final boolean p;
        private final boolean q;
        protected String g = "other";
        protected String i = "";
        protected int j = 0;

        public a(y0 y0Var, URL url, JSONObject jSONObject, boolean z, int i, long j, boolean z2, boolean z3, int i2) {
            this.f1952a = new WeakReference<>(y0Var);
            this.k = url;
            this.l = jSONObject;
            this.m = z;
            this.n = i;
            this.o = j;
            this.p = z2;
            this.q = z3;
            this.h = i2;
        }

        private String a() {
            return this.h == 2 ? h4.b().d() : h4.b().c();
        }

        private String a(HttpURLConnection httpURLConnection) throws IOException {
            InputStreamReader inputStreamReader = new InputStreamReader(httpURLConnection.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuilder sb = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    inputStreamReader.close();
                    return sb.toString();
                }
                sb.append(line);
            }
        }

        private HttpURLConnection a(URL url, long j) throws IOException {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
            httpURLConnection.setReadTimeout((int) j);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            return httpURLConnection;
        }

        private JSONObject a(String str, String str2) throws JSONException {
            String strDecode = IronSourceAES.decode(str, str2);
            if (TextUtils.isEmpty(strDecode)) {
                throw new JSONException("decryption error");
            }
            return new JSONObject(strDecode);
        }

        private void a(long j, long j2) {
            long time = j - (new Date().getTime() - j2);
            if (time > 0) {
                SystemClock.sleep(time);
            }
        }

        private void a(HttpURLConnection httpURLConnection, JSONObject jSONObject, boolean z) throws Exception {
            String strA;
            String strEncode;
            OutputStream outputStream = httpURLConnection.getOutputStream();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, C.UTF8_NAME);
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            if (this.h == 2) {
                try {
                    strA = h4.b().a();
                } catch (JSONException e) {
                    this.i = e.getLocalizedMessage();
                    this.j = 1015;
                    this.h = 1;
                    IronLog.INTERNAL.error("get encrypted session key exception " + e.getMessage());
                }
            } else {
                strA = "";
            }
            String string = jSONObject.toString();
            String strA2 = a();
            if (z) {
                IronLog.INTERNAL.verbose("compressing and encrypting auction request");
                strEncode = IronSourceAES.compressAndEncrypt(strA2, string);
            } else {
                strEncode = IronSourceAES.encode(strA2, string);
            }
            bufferedWriter.write(this.h == 2 ? String.format("{\"sk\" : \"%1$s\", \"ct\" : \"%2$s\"}", strA, strEncode) : String.format("{\"request\" : \"%1$s\"}", strEncode));
            bufferedWriter.flush();
            bufferedWriter.close();
            outputStreamWriter.close();
            outputStream.close();
        }

        private JSONObject b(String str, String str2) throws JSONException {
            IronLog.INTERNAL.verbose("decrypting and decompressing auction response");
            String strDecryptAndDecompress = IronSourceAES.decryptAndDecompress(str, str2);
            if (strDecryptAndDecompress != null) {
                return new JSONObject(strDecryptAndDecompress);
            }
            throw new JSONException("decompression error");
        }

        protected JSONObject a(JSONObject jSONObject, boolean z) throws JSONException {
            String strA = a();
            String string = jSONObject.getString(this.h == 2 ? "ct" : c.Y1);
            return z ? b(strA, string) : a(strA, string);
        }

        protected void a(String str, boolean z, boolean z2) throws JSONException {
            if (TextUtils.isEmpty(str)) {
                throw new JSONException("empty response");
            }
            JSONObject jSONObject = new JSONObject(str);
            if (z) {
                jSONObject = a(jSONObject, z2);
            }
            d.a aVarB = d.c().b(jSONObject);
            this.b = aVarB;
            this.c = aVarB.c();
            this.d = this.b.d();
        }

        protected void a(boolean z, y0 y0Var, long j) {
            if (z) {
                y0Var.a(this.b.h(), this.b.a(), this.b.e(), this.b.f(), this.b.b(), this.f + 1, j, this.j, this.i);
            } else {
                y0Var.a(this.c, this.d, this.f + 1, this.g, j);
            }
        }

        protected boolean b() {
            long time;
            int responseCode;
            String str;
            this.e = new Date().getTime();
            try {
                this.h = this.j == 1015 ? 1 : this.h;
                this.f = 0;
                HttpURLConnection httpURLConnectionA = null;
                while (true) {
                    int i = this.f;
                    int i2 = this.n;
                    if (i >= i2) {
                        this.f = i2 - 1;
                        this.g = "trials_fail";
                        return false;
                    }
                    try {
                        time = new Date().getTime();
                        String str2 = "Auction Handler: auction trial " + (this.f + 1) + " out of " + this.n + " max trials";
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, str2, 0);
                        IronSourceUtils.sendAutomationLog(str2);
                        httpURLConnectionA = a(this.k, this.o);
                        a(httpURLConnectionA, this.l, this.p);
                        responseCode = httpURLConnectionA.getResponseCode();
                    } catch (SocketTimeoutException e) {
                        if (httpURLConnectionA != null) {
                            httpURLConnectionA.disconnect();
                        }
                        this.c = 1006;
                        this.d = "Connection timed out";
                        IronLog.INTERNAL.error("Auction socket timeout exception " + e.getMessage());
                    } catch (Throwable th) {
                        IronLog.INTERNAL.error("getting exception " + th);
                        if (httpURLConnectionA != null) {
                            httpURLConnectionA.disconnect();
                        }
                        this.c = 1000;
                        this.d = th.getMessage();
                        this.g = "other";
                        return false;
                    }
                    if (responseCode == 200 || responseCode == 204) {
                        try {
                            a(a(httpURLConnectionA), this.m, this.q);
                            httpURLConnectionA.disconnect();
                            return true;
                        } catch (JSONException e2) {
                            if (e2.getMessage() != null && e2.getMessage().equalsIgnoreCase("decryption error")) {
                                this.c = 1003;
                                str = "Auction decryption error";
                            } else if (e2.getMessage() == null || !e2.getMessage().equalsIgnoreCase("decompression error")) {
                                this.c = 1002;
                                str = "Auction parsing error";
                            } else {
                                this.c = 1008;
                                str = "Auction decompression error";
                            }
                            this.d = str;
                            this.g = "parsing";
                            IronLog.INTERNAL.error("Auction handle response exception " + e2.getMessage());
                            httpURLConnectionA.disconnect();
                            return false;
                        }
                    }
                    this.c = 1001;
                    String str3 = "Auction response code not valid, error code response from server - " + responseCode;
                    this.d = str3;
                    IronLog.INTERNAL.error(str3);
                    httpURLConnectionA.disconnect();
                    if (this.f < this.n - 1) {
                        a(this.o, time);
                    }
                    this.f++;
                }
            } catch (Exception e3) {
                this.c = 1007;
                this.d = e3.getMessage();
                this.f = 0;
                this.g = "other";
                IronLog.INTERNAL.error("Auction request exception " + e3.getMessage());
                return false;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean zB = b();
            y0 y0Var = this.f1952a.get();
            if (y0Var == null) {
                return;
            }
            a(zB, y0Var, new Date().getTime() - this.e);
        }
    }

    @Deprecated
    public e(IronSource.AD_UNIT ad_unit, com.json.mediationsdk.utils.a aVar, y0 y0Var) {
        this.f1951a = "1";
        this.b = "102";
        this.c = "102";
        this.d = "GenericNotifications";
        this.f = ad_unit;
        this.h = aVar;
        this.i = y0Var;
        this.g = IronSourceUtils.getSessionId();
    }

    public e(f fVar) {
        this.f1951a = "1";
        this.b = "102";
        this.c = "102";
        this.d = "GenericNotifications";
        this.e = fVar;
    }

    private JSONObject a(Context context, Map<String, Object> map, List<String> list, h hVar, int i, boolean z, IronSourceSegment ironSourceSegment) throws JSONException {
        new JSONObject();
        if (!p.p().k().b().getApplicationConfigurations().j().f()) {
            JSONObject jSONObjectA = d.c().a(context, map, list, hVar, i, this.g, this.h, this.j, ironSourceSegment != null ? ironSourceSegment.toJson() : null, false, false);
            jSONObjectA.put("adUnit", this.f.toString());
            jSONObjectA.put(d.l0, z ? "false" : com.json.mediationsdk.metadata.a.g);
            return jSONObjectA;
        }
        AuctionRequestParams iVar = new AuctionRequestParams(this.f);
        iVar.a(map);
        iVar.a(list);
        iVar.a(hVar);
        iVar.a(i);
        iVar.a(this.j);
        iVar.a(ironSourceSegment);
        iVar.b(z);
        return d.c().a(iVar);
    }

    public void a(Context context, AuctionRequestParams iVar, y0 y0Var) {
        try {
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.e.a(context, iVar, y0Var));
        } catch (Exception e) {
            IronLog.INTERNAL.error("execute auction exception " + e.getMessage());
            if (y0Var != null) {
                y0Var.a(1000, e.getMessage(), 0, "other", 0L);
            }
        }
    }

    @Deprecated
    public void a(Context context, Map<String, Object> map, List<String> list, h hVar, int i, IronSourceSegment ironSourceSegment) {
        try {
            boolean zIsEncryptedResponse = IronSourceUtils.isEncryptedResponse();
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new a(this.i, new URL(this.h.a(false)), a(context, map, list, hVar, i, zIsEncryptedResponse, ironSourceSegment), zIsEncryptedResponse, this.h.g(), this.h.m(), this.h.n(), this.h.o(), this.h.d()));
        } catch (Exception e) {
            IronLog.INTERNAL.error("execute auction exception " + e.getMessage());
            this.i.a(1000, e.getMessage(), 0, "other", 0L);
        }
    }

    @Deprecated
    public void a(Context context, Map<String, Object> map, List<String> list, h hVar, int i, IronSourceSegment ironSourceSegment, ISBannerSize iSBannerSize) {
        this.j = iSBannerSize;
        a(context, map, list, hVar, i, ironSourceSegment);
    }

    public void a(i1 i1Var, int i, i1 i1Var2) throws NumberFormatException {
        Iterator<String> it = i1Var.g().iterator();
        while (it.hasNext()) {
            d.c().a("reportLoadSuccess", i1Var.c(), d.c().a(it.next(), i, i1Var, "", "", ""));
        }
        if (i1Var2 != null) {
            Iterator<String> it2 = i1Var2.g().iterator();
            while (it2.hasNext()) {
                d.c().a("reportLoadSuccess", "GenericNotifications", d.c().a(it2.next(), i, i1Var, "", "102", ""));
            }
        }
    }

    public void a(i1 i1Var, int i, i1 i1Var2, String str) throws NumberFormatException {
        Iterator<String> it = i1Var.b().iterator();
        while (it.hasNext()) {
            d.c().a("reportImpression", i1Var.c(), d.c().a(it.next(), i, i1Var, "", "", str));
        }
        if (i1Var2 != null) {
            Iterator<String> it2 = i1Var2.b().iterator();
            while (it2.hasNext()) {
                d.c().a("reportImpression", "GenericNotifications", d.c().a(it2.next(), i, i1Var, "", "102", str));
            }
        }
    }

    public void a(ArrayList<String> arrayList, ConcurrentHashMap<String, i1> concurrentHashMap, int i, i1 i1Var, i1 i1Var2) {
        int i2 = i1Var2.i();
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (!next.equals(i1Var2.c())) {
                i1 i1Var3 = concurrentHashMap.get(next);
                int i3 = i1Var3.i();
                String strH = i1Var3.h();
                String str = i3 < i2 ? "1" : "102";
                IronLog.INTERNAL.verbose("instance=" + i1Var3.c() + ", instancePriceOrder= " + i3 + ", loseReasonCode=" + str + ", winnerInstance=" + i1Var2.c() + ", winnerInstancePriceOrder=" + i2);
                Iterator<String> it2 = i1Var3.f().iterator();
                while (it2.hasNext()) {
                    d.c().a("reportAuctionLose", i1Var3.c(), d.c().a(it2.next(), i, i1Var2, strH, str, ""));
                }
            }
        }
        if (i1Var != null) {
            Iterator<String> it3 = i1Var.f().iterator();
            while (it3.hasNext()) {
                d.c().a("reportAuctionLose", "GenericNotifications", d.c().a(it3.next(), i, i1Var2, "", "102", ""));
            }
        }
    }

    public void a(CopyOnWriteArrayList<a0> copyOnWriteArrayList, ConcurrentHashMap<String, i1> concurrentHashMap, int i, i1 i1Var, i1 i1Var2) {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<a0> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().c());
        }
        a(arrayList, concurrentHashMap, i, i1Var, i1Var2);
    }

    public boolean a() {
        return this.e.a();
    }
}
