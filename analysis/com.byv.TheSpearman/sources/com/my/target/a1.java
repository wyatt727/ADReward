package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3918a;
    public final s b;
    public final j c;
    public final y9 d;
    public String e;
    public boolean f = true;

    public a1(s sVar, j jVar, Context context) {
        this.b = sVar;
        this.c = jVar;
        this.f3918a = context;
        this.d = y9.a(sVar, jVar, context);
    }

    public static a1 a(s sVar, j jVar, Context context) {
        return new a1(sVar, jVar, context);
    }

    public static String a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            StringBuilder sb = new StringBuilder(str2);
            if (sb.length() > 0) {
                Matcher matcher = Pattern.compile("<script\\s+[^>]*\\bsrc\\s*=\\s*(\\\\?[\\\"\\'])mraid\\.js\\1[^>]*>\\s*<\\/script>\\n*", 2).matcher(str2);
                if (matcher.find()) {
                    int iStart = matcher.start();
                    sb.delete(iStart, matcher.end());
                    sb.insert(iStart, "<script src=\"" + str + "\"></script>");
                    return sb.toString();
                }
            }
        }
        return null;
    }

    public static String a(JSONObject jSONObject, n nVar) {
        String strA = null;
        if (!jSONObject.has("src") && !jSONObject.has(FirebaseAnalytics.Param.SOURCE)) {
            nVar.a(m.n);
            return null;
        }
        String strOptString = jSONObject.optString("src", "");
        if (!TextUtils.isEmpty(strOptString) && (strA = m1.a(strOptString)) != null) {
            return strA;
        }
        String strOptString2 = jSONObject.optString(FirebaseAnalytics.Param.SOURCE, "");
        return !TextUtils.isEmpty(strOptString2) ? da.a(strOptString2) : strA;
    }

    public final i7 a(i7 i7Var, JSONObject jSONObject) {
        return jSONObject == null ? i7Var : j7.a(this.c, this.b.b, this.f, this.f3918a).a(i7Var, jSONObject);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0241 A[PHI: r2
      0x0241: PHI (r2v46 int) = (r2v45 int), (r2v53 int) binds: [B:77:0x021b, B:82:0x022a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x029b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(org.json.JSONObject r13, com.my.target.b r14) {
        /*
            Method dump skipped, instructions count: 822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.target.a1.a(org.json.JSONObject, com.my.target.b):void");
    }

    public final void b(String str, String str2) {
        if (this.f) {
            String str3 = this.b.f4116a;
            z4 z4VarC = z4.a(str).e(str2).a(this.c.getSlotId()).c(this.e);
            if (str3 == null) {
                str3 = this.b.b;
            }
            z4VarC.b(str3).b(this.f3918a);
        }
    }
}
