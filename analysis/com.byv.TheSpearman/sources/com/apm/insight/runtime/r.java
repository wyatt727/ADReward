package com.apm.insight.runtime;

import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.vungle.ads.internal.signals.SignalManager;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private static File f151a;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f152a;
        public String b;
        public long c;

        a(String str) {
            String[] strArrSplit = str.split("\\s+");
            if (strArrSplit.length != 3) {
                com.apm.insight.c.a().a("NPTH_CATCH", new RuntimeException("err ProcessTrack line:" + str));
                return;
            }
            this.f152a = strArrSplit[0];
            this.b = strArrSplit[1];
            try {
                this.c = Long.parseLong(strArrSplit[2]);
            } catch (Throwable th) {
                com.apm.insight.c.a().a("NPTH_CATCH", new RuntimeException("err ProcessTrack line:" + str, th));
            }
        }
    }

    private static File a() {
        if (f151a == null) {
            String strC = com.apm.insight.l.a.c(com.apm.insight.i.g());
            if (strC == null) {
                return null;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            f151a = new File(com.apm.insight.l.o.j(com.apm.insight.i.g()), "apminsight/ProcessTrack/" + ((jCurrentTimeMillis - (jCurrentTimeMillis % SignalManager.TWENTY_FOUR_HOURS_MILLIS)) / SignalManager.TWENTY_FOUR_HOURS_MILLIS) + '/' + strC.replace(AbstractJsonLexerKt.COLON, '_') + ".txt");
        }
        return f151a;
    }

    public static File a(long j) {
        return new File(com.apm.insight.l.o.j(com.apm.insight.i.g()), "apminsight/ProcessTrack/" + ((j - (j % SignalManager.TWENTY_FOUR_HOURS_MILLIS)) / SignalManager.TWENTY_FOUR_HOURS_MILLIS));
    }

    public static HashMap<String, a> a(long j, String str) throws Throwable {
        File file = new File(com.apm.insight.l.o.j(com.apm.insight.i.g()), "apminsight/ProcessTrack/" + ((j - (j % SignalManager.TWENTY_FOUR_HOURS_MILLIS)) / SignalManager.TWENTY_FOUR_HOURS_MILLIS));
        String[] list = file.list();
        HashMap<String, a> map = new HashMap<>();
        if (list != null) {
            for (String str2 : list) {
                File file2 = new File(file, str2);
                long length = file2.length();
                try {
                    JSONArray jSONArrayA = com.apm.insight.l.i.a(file2, length > PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED ? length - PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED : 0L);
                    int length2 = jSONArrayA.length() - 1;
                    while (true) {
                        if (length2 >= 0) {
                            String strOptString = jSONArrayA.optString(length2);
                            if (!TextUtils.isEmpty(strOptString) && strOptString.startsWith(str)) {
                                map.put(str2.replace('_', AbstractJsonLexerKt.COLON).replace(".txt", ""), new a(strOptString));
                                break;
                            }
                            length2--;
                        }
                    }
                } catch (IOException unused) {
                }
            }
        }
        return map;
    }

    public static void a(String str, String str2) {
        try {
            File fileA = a();
            if (fileA != null) {
                com.apm.insight.l.i.a(fileA, str + ' ' + str2 + ' ' + System.currentTimeMillis() + '\n', true);
            }
        } catch (Throwable unused) {
        }
    }
}
