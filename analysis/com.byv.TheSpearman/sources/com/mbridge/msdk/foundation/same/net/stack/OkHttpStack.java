package com.mbridge.msdk.foundation.same.net.stack;

import android.text.TextUtils;
import com.mbridge.msdk.c.e;
import com.mbridge.msdk.foundation.same.net.dns.MBDns;
import com.mbridge.msdk.foundation.same.net.i;
import com.mbridge.msdk.foundation.same.net.stack.c;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.thrid.okhttp.Call;
import com.mbridge.msdk.thrid.okhttp.Connection;
import com.mbridge.msdk.thrid.okhttp.EventListener;
import com.mbridge.msdk.thrid.okhttp.Headers;
import com.mbridge.msdk.thrid.okhttp.MediaType;
import com.mbridge.msdk.thrid.okhttp.OkHttpClient;
import com.mbridge.msdk.thrid.okhttp.Protocol;
import com.mbridge.msdk.thrid.okhttp.Request;
import com.mbridge.msdk.thrid.okhttp.RequestBody;
import com.mbridge.msdk.thrid.okhttp.Response;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class OkHttpStack implements b {
    private final OkHttpClient mClient = c.a.f2912a.b();

    @Override // com.mbridge.msdk.foundation.same.net.stack.b
    public com.mbridge.msdk.foundation.same.net.f.b performRequest(i<?> iVar) throws IOException {
        int iO = iVar.o();
        int iJ = iVar.j();
        int iM = iVar.m();
        int iP = iVar.p();
        int i = iVar.i();
        if (iJ == 0) {
            iJ = iO;
        }
        if (iM == 0) {
            iM = iO;
        }
        if (iP != 0) {
            iO = iP;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(Protocol.HTTP_1_1);
        arrayList.add(Protocol.HTTP_2);
        OkHttpClient.Builder builderEventListener = this.mClient.newBuilder().protocols(arrayList).readTimeout(iM, TimeUnit.MILLISECONDS).connectTimeout(iJ, TimeUnit.MILLISECONDS).writeTimeout(iO, TimeUnit.MILLISECONDS).eventListener(new DefaultEventListener(iVar.s()));
        if (i > 0) {
            builderEventListener.callTimeout(i, TimeUnit.MILLISECONDS);
        }
        builderEventListener.dns(new MBDns());
        StringBuilder sb = new StringBuilder();
        sb.append("connectTimeout: ");
        sb.append(iJ);
        sb.append(" readTimeout: ");
        sb.append(iM);
        sb.append(" writeTimeout: ");
        sb.append(iO);
        sb.append(" callTimeout: ");
        sb.append(i == 0 ? "not set" : Integer.valueOf(i));
        ad.a("OkHttpStack", sb.toString());
        Request.Builder builder = new Request.Builder();
        for (Map.Entry<String, String> entry : iVar.k().entrySet()) {
            builder.addHeader(entry.getKey(), entry.getValue());
        }
        setConnectionParametersForRequest(builder, iVar);
        Response responseExecute = builderEventListener.build().newCall(builder.url(iVar.s()).build()).execute();
        Headers headers = responseExecute.headers();
        ArrayList arrayList2 = new ArrayList();
        int size = headers.size();
        for (int i2 = 0; i2 < size; i2++) {
            String strName = headers.name(i2);
            String strValue = headers.value(i2);
            if (strName != null) {
                arrayList2.add(new com.mbridge.msdk.foundation.same.net.d.b(strName, strValue));
            }
        }
        return new com.mbridge.msdk.foundation.same.net.f.b(responseExecute.code(), arrayList2, responseExecute.body().byteStream());
    }

    private static void setConnectionParametersForRequest(Request.Builder builder, i<?> iVar) throws IOException {
        switch (iVar.l()) {
            case 0:
                builder.get();
                return;
            case 1:
                builder.post(createRequestBody(iVar));
                return;
            case 2:
                builder.put(createRequestBody(iVar));
                return;
            case 3:
                builder.delete();
                return;
            case 4:
                builder.head();
                return;
            case 5:
                builder.method("OPTIONS", null);
                return;
            case 6:
                builder.method("TRACE", null);
                return;
            case 7:
                builder.patch(createRequestBody(iVar));
                return;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }

    private static RequestBody createRequestBody(i iVar) {
        byte[] bArrH = iVar.h();
        if (bArrH == null) {
            return null;
        }
        return RequestBody.create((MediaType) null, bArrH);
    }

    private static class DefaultEventListener extends EventListener {
        private long callDuring;
        private long callStart;
        private long connectDuring;
        private String connectErrorMessage;
        private long connectStart;
        private long connectionDuring;
        private long connectionStart;
        private long dnsDuring;
        private String dnsResult;
        private long dnsStart;
        private String hostName;
        private c.b httpStatus;
        private boolean isReportHttpStatus;
        private String method;

        public DefaultEventListener(String str) {
            try {
                boolean zA = c.a().a(str);
                this.isReportHttpStatus = zA;
                if (zA) {
                    this.httpStatus = c.a().c();
                }
            } catch (Exception unused) {
                this.isReportHttpStatus = false;
                this.httpStatus = null;
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.EventListener
        public void callStart(Call call) {
            super.callStart(call);
            try {
                com.mbridge.msdk.foundation.same.net.a.a().e();
            } catch (Exception unused) {
            }
            if (!this.isReportHttpStatus || this.httpStatus == null) {
                return;
            }
            this.callStart = System.currentTimeMillis();
            if (call != null) {
                try {
                    this.method = call.request().method();
                } catch (Exception unused2) {
                    this.method = "";
                }
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.EventListener
        public void dnsStart(Call call, String str) {
            super.dnsStart(call, str);
            if (!this.isReportHttpStatus || this.httpStatus == null) {
                return;
            }
            this.dnsStart = System.currentTimeMillis();
        }

        @Override // com.mbridge.msdk.thrid.okhttp.EventListener
        public void dnsEnd(Call call, String str, List<InetAddress> list) {
            super.dnsEnd(call, str, list);
            if (!this.isReportHttpStatus || this.httpStatus == null) {
                return;
            }
            try {
                this.dnsDuring = System.currentTimeMillis() - this.dnsStart;
                if (TextUtils.isEmpty(str)) {
                    this.hostName = "unKnown";
                } else {
                    this.hostName = str;
                }
                if (list != null && list.size() != 0) {
                    InetAddress inetAddress = list.get(0);
                    if (inetAddress != null && !TextUtils.isEmpty(inetAddress.getHostAddress())) {
                        this.dnsResult = inetAddress.getHostAddress();
                        return;
                    }
                    this.dnsResult = "unKnown";
                    return;
                }
                this.dnsResult = "unKnown";
            } catch (Exception e) {
                ad.b("OkHttpStack", e.getMessage());
                this.hostName = "";
                this.dnsResult = "";
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.EventListener
        public void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
            super.connectStart(call, inetSocketAddress, proxy);
            if (!this.isReportHttpStatus || this.httpStatus == null) {
                return;
            }
            this.connectStart = System.currentTimeMillis();
        }

        @Override // com.mbridge.msdk.thrid.okhttp.EventListener
        public void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
            super.connectEnd(call, inetSocketAddress, proxy, protocol);
            if (this.isReportHttpStatus && this.httpStatus != null) {
                this.connectDuring = System.currentTimeMillis() - this.connectStart;
                this.connectErrorMessage = "";
            }
            try {
                e.a().e(call.request().url().host());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.EventListener
        public void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
            super.connectFailed(call, inetSocketAddress, proxy, protocol, iOException);
            if (this.isReportHttpStatus && this.httpStatus != null) {
                this.connectDuring = System.currentTimeMillis() - this.connectStart;
                this.connectErrorMessage = iOException != null ? iOException.getMessage() : "IO Exception";
            }
            try {
                e.a().d(call.request().url().host());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.EventListener
        public void connectionAcquired(Call call, Connection connection) {
            super.connectionAcquired(call, connection);
            if (!this.isReportHttpStatus || this.httpStatus == null) {
                return;
            }
            this.connectionStart = System.currentTimeMillis();
        }

        @Override // com.mbridge.msdk.thrid.okhttp.EventListener
        public void connectionReleased(Call call, Connection connection) {
            super.connectionReleased(call, connection);
            if (!this.isReportHttpStatus || this.httpStatus == null) {
                return;
            }
            this.connectionDuring = System.currentTimeMillis() - this.connectionStart;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.EventListener
        public void callEnd(Call call) {
            super.callEnd(call);
            try {
                com.mbridge.msdk.foundation.same.net.a.a().b();
            } catch (Exception unused) {
            }
            if (!this.isReportHttpStatus || this.httpStatus == null) {
                return;
            }
            try {
                this.callDuring = System.currentTimeMillis() - this.callStart;
                this.httpStatus.k = 0;
                this.httpStatus.j = this.method;
                this.httpStatus.f2913a = this.callDuring;
                this.httpStatus.i = this.hostName;
                this.httpStatus.f = this.dnsDuring;
                this.httpStatus.g = this.dnsResult;
                this.httpStatus.c = this.connectDuring;
                this.httpStatus.e = this.connectionDuring;
                c.a().a(this.httpStatus);
            } catch (Exception e) {
                ad.b("OkHttpStack", e.getMessage());
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.EventListener
        public void callFailed(Call call, IOException iOException) {
            super.callFailed(call, iOException);
            try {
                com.mbridge.msdk.foundation.same.net.a.a().c();
            } catch (Exception unused) {
            }
            if (!this.isReportHttpStatus || this.httpStatus == null) {
                return;
            }
            try {
                this.callDuring = System.currentTimeMillis() - this.callStart;
                if (!TextUtils.isEmpty(this.connectErrorMessage)) {
                    this.httpStatus.k = 1;
                    this.httpStatus.d = this.connectErrorMessage;
                } else {
                    this.httpStatus.k = 2;
                }
                this.httpStatus.b = iOException != null ? iOException.getMessage() : "IO Exception";
                this.httpStatus.f2913a = this.callDuring;
                this.httpStatus.i = this.hostName;
                this.httpStatus.j = this.method;
                this.httpStatus.f = this.dnsDuring;
                this.httpStatus.g = this.dnsResult;
                this.httpStatus.c = this.connectDuring;
                this.httpStatus.e = this.connectionDuring;
                c.a().a(this.httpStatus);
            } catch (Exception e) {
                ad.b("OkHttpStack", e.getMessage());
            }
        }
    }
}
