package com.my.target;

import android.content.Context;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes4.dex */
public final class k1 extends p1 {

    /* renamed from: a, reason: collision with root package name */
    public volatile String f4022a;
    public j1 b;
    public Map<String, String> c;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Map map) {
        boolean zB = b();
        synchronized (this) {
            map.put("rooted", zB ? "1" : "0");
        }
    }

    public j1 a() {
        return this.b;
    }

    public String a(Context context) {
        if (c0.a()) {
            ba.a("DeviceParamsDataProvider: You must not call getInstanceId method from main thread");
            return "";
        }
        if (this.f4022a == null) {
            synchronized (this) {
                if (this.f4022a == null) {
                    String strG = s7.a(context).g();
                    if (TextUtils.isEmpty(strG)) {
                        strG = UUID.randomUUID().toString();
                        s7.a(context).g(strG);
                    }
                    this.f4022a = strG;
                }
            }
        }
        String str = this.f4022a;
        return str == null ? "" : str;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(41:9|10|118|11|12|114|13|20|21|112|22|23|(6:137|24|25|133|26|27)|(4:139|(1:29)(1:31)|30|33)|(32:40|116|41|42|121|(1:44)(1:45)|46|49|50|(5:52|(1:54)(1:55)|56|(2:58|(1:60)(1:61))(1:62)|63)(1:64)|65|(1:70)(1:69)|71|(1:73)(1:74)|75|(1:77)(1:78)|79|(7:123|81|(1:83)(1:84)|85|135|86|(1:88))|125|89|127|90|129|91|131|92|93|(2:96|94)|141|97|98|99)(1:47)|48|49|50|(0)(0)|65|(2:67|70)(0)|71|(0)(0)|75|(0)(0)|79|(0)|125|89|127|90|129|91|131|92|93|(1:94)|141|97|98|99) */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0198 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c1 A[Catch: all -> 0x00dd, TRY_ENTER, TryCatch #14 {all -> 0x00dd, blocks: (B:29:0x00c1, B:31:0x00cb), top: B:139:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cb A[Catch: all -> 0x00dd, TRY_LEAVE, TryCatch #14 {all -> 0x00dd, blocks: (B:29:0x00c1, B:31:0x00cb), top: B:139:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0112 A[Catch: all -> 0x02c5, TryCatch #4 {, blocks: (B:4:0x0005, B:6:0x0009, B:9:0x0012, B:20:0x00a1, B:50:0x0108, B:52:0x0112, B:54:0x0121, B:56:0x0128, B:58:0x0132, B:60:0x013b, B:65:0x0160, B:67:0x016c, B:71:0x0173, B:79:0x0193, B:93:0x01d8, B:94:0x0274, B:96:0x027a, B:97:0x02a9, B:19:0x0089), top: B:120:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016c A[Catch: all -> 0x02c5, TryCatch #4 {, blocks: (B:4:0x0005, B:6:0x0009, B:9:0x0012, B:20:0x00a1, B:50:0x0108, B:52:0x0112, B:54:0x0121, B:56:0x0128, B:58:0x0132, B:60:0x013b, B:65:0x0160, B:67:0x016c, B:71:0x0173, B:79:0x0193, B:93:0x01d8, B:94:0x0274, B:96:0x027a, B:97:0x02a9, B:19:0x0089), top: B:120:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x027a A[Catch: all -> 0x02c5, LOOP:0: B:94:0x0274->B:96:0x027a, LOOP_END, TryCatch #4 {, blocks: (B:4:0x0005, B:6:0x0009, B:9:0x0012, B:20:0x00a1, B:50:0x0108, B:52:0x0112, B:54:0x0121, B:56:0x0128, B:58:0x0132, B:60:0x013b, B:65:0x0160, B:67:0x016c, B:71:0x0173, B:79:0x0193, B:93:0x01d8, B:94:0x0274, B:96:0x027a, B:97:0x02a9, B:19:0x0089), top: B:120:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized java.util.Map<java.lang.String, java.lang.String> a(com.my.target.common.MyTargetConfig r28, android.content.Context r29) {
        /*
            Method dump skipped, instructions count: 712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.target.k1.a(com.my.target.common.MyTargetConfig, android.content.Context):java.util.Map");
    }

    public final void a(Map<String, String> map, Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir == null) {
            return;
        }
        long totalSpace = filesDir.getTotalSpace();
        long freeSpace = filesDir.getFreeSpace();
        map.put("mm_tt", String.valueOf(totalSpace));
        map.put("mm_av", String.valueOf(freeSpace));
    }

    public final void b(Map<String, String> map, Context context) {
        List<InputMethodInfo> enabledInputMethodList;
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        if (inputMethodManager == null || (enabledInputMethodList = inputMethodManager.getEnabledInputMethodList()) == null) {
            return;
        }
        HashSet hashSet = null;
        Iterator<InputMethodInfo> it = enabledInputMethodList.iterator();
        while (it.hasNext()) {
            List<InputMethodSubtype> enabledInputMethodSubtypeList = inputMethodManager.getEnabledInputMethodSubtypeList(it.next(), true);
            if (enabledInputMethodSubtypeList != null) {
                for (InputMethodSubtype inputMethodSubtype : enabledInputMethodSubtypeList) {
                    if ("keyboard".equals(inputMethodSubtype.getMode())) {
                        String locale = inputMethodSubtype.getLocale();
                        if (!TextUtils.isEmpty(locale)) {
                            if (hashSet == null) {
                                hashSet = new HashSet();
                            }
                            hashSet.add(locale.split("_", 2)[0]);
                        }
                    }
                }
            }
        }
        if (hashSet == null || hashSet.isEmpty()) {
            return;
        }
        String strJoin = TextUtils.join(",", hashSet);
        if (TextUtils.isEmpty(strJoin)) {
            return;
        }
        map.put("kb_lang", strJoin);
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x009f A[EXC_TOP_SPLITTER, PHI: r0 r8
      0x009f: PHI (r0v16 boolean) = (r0v14 boolean), (r0v13 boolean) binds: [B:40:0x009d, B:37:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x009f: PHI (r8v7 java.lang.Process) = (r8v6 java.lang.Process), (r8v8 java.lang.Process) binds: [B:40:0x009d, B:37:0x0099] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0091 A[EXC_TOP_SPLITTER, PHI: r9
      0x0091: PHI (r9v2 java.io.BufferedReader) = (r9v1 java.io.BufferedReader), (r9v3 java.io.BufferedReader) binds: [B:35:0x0096, B:27:0x0085] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00a2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b() {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.target.k1.b():boolean");
    }

    public final void c(Map<String, String> map, Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return;
        }
        map.put("rs", audioManager.getRingerMode() == 2 ? "1" : "0");
    }
}
