package com.bytedance.sdk.component.adexpress.EYQ.mZx;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.sdk.component.adexpress.EYQ.Td.EYQ;
import com.bytedance.sdk.component.utils.lEs;
import com.bytedance.sdk.component.utils.pi;
import com.json.m4;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: TemplateCacheBaseApi.java */
/* loaded from: classes2.dex */
public abstract class Td {
    public abstract File EYQ();

    protected boolean EYQ(Map<String, com.bytedance.sdk.component.adexpress.EYQ.Td.EYQ> map) {
        if (map == null || map.size() == 0) {
            return false;
        }
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            com.bytedance.sdk.component.adexpress.EYQ.Td.EYQ eyq = map.get(it.next());
            if (eyq != null && !EYQ(eyq.IPb())) {
                return false;
            }
        }
        return true;
    }

    protected boolean EYQ(List<EYQ.C0089EYQ> list) throws IOException {
        if (list == null || list.size() <= 0 || EYQ() == null) {
            return false;
        }
        for (EYQ.C0089EYQ c0089eyq : list) {
            String strEYQ = com.bytedance.sdk.component.utils.Kbd.EYQ(c0089eyq.EYQ());
            if (TextUtils.isEmpty(strEYQ)) {
                return false;
            }
            File file = new File(EYQ(), strEYQ);
            String strEYQ2 = com.bytedance.sdk.component.utils.Kbd.EYQ(file);
            if (!file.exists() || !file.isFile() || c0089eyq.mZx() == null || !c0089eyq.mZx().equals(strEYQ2)) {
                return false;
            }
        }
        return true;
    }

    protected boolean EYQ(EYQ.mZx mzx) {
        if (mzx == null || EYQ() == null) {
            return false;
        }
        List<Pair<String, String>> listMZx = mzx.mZx();
        if (listMZx == null || listMZx.size() <= 0) {
            return true;
        }
        Iterator<Pair<String, String>> it = listMZx.iterator();
        while (it.hasNext()) {
            File file = new File(EYQ(), (String) it.next().first);
            if (!file.exists() || !file.isFile()) {
                return false;
            }
        }
        return true;
    }

    public List<EYQ.C0089EYQ> EYQ(com.bytedance.sdk.component.adexpress.EYQ.Td.EYQ eyq, com.bytedance.sdk.component.adexpress.EYQ.Td.EYQ eyq2) {
        Map<String, com.bytedance.sdk.component.adexpress.EYQ.Td.EYQ> mapEYQ = eyq.EYQ();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (mapEYQ.size() == 0) {
            if (eyq2 != null && eyq2.EYQ().size() != 0) {
                Map<String, com.bytedance.sdk.component.adexpress.EYQ.Td.EYQ> mapEYQ2 = eyq2.EYQ();
                Iterator<String> it = mapEYQ2.keySet().iterator();
                while (it.hasNext()) {
                    com.bytedance.sdk.component.adexpress.EYQ.Td.EYQ eyq3 = mapEYQ2.get(it.next());
                    if (eyq3 != null) {
                        arrayList.addAll(eyq3.IPb());
                    }
                }
            }
        } else if (eyq2 == null || eyq2.EYQ().size() == 0) {
            if (mapEYQ.size() != 0) {
                Iterator<String> it2 = mapEYQ.keySet().iterator();
                while (it2.hasNext()) {
                    com.bytedance.sdk.component.adexpress.EYQ.Td.EYQ eyq4 = mapEYQ.get(it2.next());
                    if (eyq4 != null) {
                        arrayList2.addAll(eyq4.IPb());
                    }
                }
            }
        } else {
            Map<String, com.bytedance.sdk.component.adexpress.EYQ.Td.EYQ> mapEYQ3 = eyq2.EYQ();
            for (String str : mapEYQ.keySet()) {
                com.bytedance.sdk.component.adexpress.EYQ.Td.EYQ eyq5 = mapEYQ.get(str);
                com.bytedance.sdk.component.adexpress.EYQ.Td.EYQ eyq6 = mapEYQ3.get(str);
                if (eyq6 == null && eyq5 != null) {
                    arrayList2.addAll(eyq5.IPb());
                } else if (eyq5 == null && eyq6 != null) {
                    arrayList.addAll(eyq6.IPb());
                } else if (eyq5 != null) {
                    for (EYQ.C0089EYQ c0089eyq : eyq5.IPb()) {
                        if (c0089eyq != null && !eyq6.IPb().contains(c0089eyq) && c0089eyq.mZx() != null && c0089eyq.EYQ() != null) {
                            arrayList2.add(c0089eyq);
                        }
                    }
                    for (EYQ.C0089EYQ c0089eyq2 : eyq6.IPb()) {
                        if (c0089eyq2 != null && !eyq5.IPb().contains(c0089eyq2)) {
                            arrayList.add(c0089eyq2);
                        }
                    }
                }
            }
        }
        if (EYQ(arrayList2, arrayList3)) {
            return arrayList;
        }
        return null;
    }

    private boolean EYQ(List<EYQ.C0089EYQ> list, List<EYQ.C0089EYQ> list2) {
        for (EYQ.C0089EYQ c0089eyq : list) {
            String strEYQ = c0089eyq.EYQ();
            String strEYQ2 = com.bytedance.sdk.component.utils.Kbd.EYQ(strEYQ);
            File file = new File(EYQ(), strEYQ2);
            File file2 = new File(file + ".tmp");
            if (file.exists()) {
                try {
                    file.delete();
                } catch (Throwable unused) {
                }
            }
            if (file2.exists()) {
                try {
                    file2.delete();
                } catch (Throwable unused2) {
                }
            }
            com.bytedance.sdk.component.IPb.mZx.EYQ eyqIPb = com.bytedance.sdk.component.adexpress.EYQ.EYQ.EYQ.EYQ().Td().IPb();
            eyqIPb.EYQ(strEYQ);
            eyqIPb.EYQ(EYQ().getAbsolutePath(), strEYQ2);
            com.bytedance.sdk.component.IPb.mZx mzxEYQ = eyqIPb.EYQ();
            list2.add(c0089eyq);
            if (mzxEYQ == null || !mzxEYQ.IPb() || mzxEYQ.Kbd() == null || !mzxEYQ.Kbd().exists()) {
                Td(list2);
                return false;
            }
        }
        return true;
    }

    public List<EYQ.C0089EYQ> mZx(com.bytedance.sdk.component.adexpress.EYQ.Td.EYQ eyq, com.bytedance.sdk.component.adexpress.EYQ.Td.EYQ eyq2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (eyq2 == null || eyq2.IPb().isEmpty()) {
            arrayList2.addAll(eyq.IPb());
        } else if (eyq.IPb().isEmpty()) {
            arrayList.addAll(eyq2.IPb());
        } else {
            for (EYQ.C0089EYQ c0089eyq : eyq.IPb()) {
                if (!eyq2.IPb().contains(c0089eyq) && c0089eyq != null && c0089eyq.EYQ() != null && c0089eyq.mZx() != null) {
                    arrayList2.add(c0089eyq);
                }
            }
            for (EYQ.C0089EYQ c0089eyq2 : eyq2.IPb()) {
                if (!eyq.IPb().contains(c0089eyq2)) {
                    arrayList.add(c0089eyq2);
                }
            }
        }
        if (EYQ(arrayList2, arrayList3)) {
            return arrayList;
        }
        return null;
    }

    public void mZx(List<EYQ.C0089EYQ> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<EYQ.C0089EYQ> it = list.iterator();
        while (it.hasNext()) {
            File file = new File(EYQ(), com.bytedance.sdk.component.utils.Kbd.EYQ(it.next().EYQ()));
            File file2 = new File(file + ".tmp");
            if (file.exists()) {
                try {
                    file.delete();
                } catch (Throwable unused) {
                }
            }
            if (file2.exists()) {
                try {
                    file2.delete();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public boolean EYQ(String str) {
        String strEYQ = com.bytedance.sdk.component.utils.Kbd.EYQ(str);
        File file = new File(EYQ().getAbsoluteFile(), strEYQ + ".zip");
        com.bytedance.sdk.component.IPb.mZx.EYQ eyqIPb = com.bytedance.sdk.component.adexpress.EYQ.EYQ.EYQ.EYQ().Td().IPb();
        eyqIPb.EYQ(str);
        eyqIPb.EYQ(file.getParent(), file.getName());
        com.bytedance.sdk.component.IPb.mZx mzxEYQ = eyqIPb.EYQ();
        if (mzxEYQ.IPb() && mzxEYQ.Kbd() != null && mzxEYQ.Kbd().exists()) {
            File fileKbd = mzxEYQ.Kbd();
            try {
                lEs.EYQ(fileKbd.getAbsolutePath(), file.getParent());
                if (!fileKbd.exists()) {
                    return true;
                }
                fileKbd.delete();
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public void EYQ(int i) {
        if (com.bytedance.sdk.component.adexpress.EYQ.EYQ.EYQ.EYQ().Pm() != null) {
            com.bytedance.sdk.component.adexpress.EYQ.EYQ.EYQ.EYQ().Pm().EYQ(i);
        }
    }

    public void Td(List<EYQ.C0089EYQ> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<EYQ.C0089EYQ> it = list.iterator();
        while (it.hasNext()) {
            File file = new File(EYQ(), com.bytedance.sdk.component.utils.Kbd.EYQ(it.next().EYQ()));
            File file2 = new File(file + ".tmp");
            if (file.exists()) {
                try {
                    file.delete();
                } catch (Throwable unused) {
                }
            }
            if (file2.exists()) {
                try {
                    file2.delete();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public static void EYQ(File file, com.bytedance.sdk.component.adexpress.EYQ.Td.EYQ eyq, String str) throws IOException {
        if (eyq == null) {
            return;
        }
        String strHX = eyq.HX();
        if (TextUtils.isEmpty(strHX)) {
            return;
        }
        File file2 = new File(file, str);
        File file3 = new File(file2 + ".tmp");
        if (file3.exists()) {
            file3.delete();
        }
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file3);
            try {
                fileOutputStream2.write(strHX.getBytes(m4.M));
                if (file2.exists()) {
                    file2.delete();
                }
                file3.renameTo(file2);
                try {
                    fileOutputStream2.close();
                } catch (IOException unused) {
                }
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                try {
                    pi.EYQ("PlayComponentEngineCacheManager", "version save error3", th);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                } catch (Throwable th2) {
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static boolean Td(com.bytedance.sdk.component.adexpress.EYQ.Td.EYQ eyq, com.bytedance.sdk.component.adexpress.EYQ.Td.EYQ eyq2) {
        if (eyq != null) {
            try {
                if (!TextUtils.isEmpty(eyq.Td())) {
                    if (eyq2 == null) {
                        return false;
                    }
                    if (EYQ(eyq.Td(), eyq2.Td())) {
                        return true;
                    }
                    Map<String, com.bytedance.sdk.component.adexpress.EYQ.Td.EYQ> mapEYQ = eyq.EYQ();
                    Map<String, com.bytedance.sdk.component.adexpress.EYQ.Td.EYQ> mapEYQ2 = eyq2.EYQ();
                    if (mapEYQ.isEmpty()) {
                        return !mapEYQ2.isEmpty();
                    }
                    if (mapEYQ2.isEmpty()) {
                        return false;
                    }
                    return EYQ(mapEYQ, mapEYQ2);
                }
            } catch (Throwable th) {
                th.getMessage();
                return false;
            }
        }
        return true;
    }

    private static boolean EYQ(Map<String, com.bytedance.sdk.component.adexpress.EYQ.Td.EYQ> map, Map<String, com.bytedance.sdk.component.adexpress.EYQ.Td.EYQ> map2) {
        if (map.size() != map2.size()) {
            return true;
        }
        for (String str : map2.keySet()) {
            com.bytedance.sdk.component.adexpress.EYQ.Td.EYQ eyq = map.get(str);
            if (eyq == null) {
                return true;
            }
            com.bytedance.sdk.component.adexpress.EYQ.Td.EYQ eyq2 = map2.get(str);
            if (eyq2 == null) {
                return false;
            }
            if (EYQ(eyq.Td(), eyq2.Td())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean EYQ(java.lang.String r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "\\."
            java.lang.String[] r7 = r7.split(r0)
            java.lang.String[] r6 = r6.split(r0)
            int r0 = r7.length
            int r1 = r6.length
            int r0 = java.lang.Math.min(r0, r1)
            r1 = 0
            r2 = r1
        L12:
            if (r2 >= r0) goto L42
            r3 = r7[r2]
            int r3 = r3.length()
            r4 = r6[r2]
            int r4 = r4.length()
            int r3 = r3 - r4
            r4 = 1
            if (r3 != 0) goto L3f
            r3 = r7[r2]
            r5 = r6[r2]
            int r3 = r3.compareTo(r5)
            if (r3 <= 0) goto L2f
            return r4
        L2f:
            if (r3 >= 0) goto L32
            return r1
        L32:
            int r3 = r0 + (-1)
            if (r2 != r3) goto L3c
            int r7 = r7.length
            int r6 = r6.length
            if (r7 <= r6) goto L3b
            return r4
        L3b:
            return r1
        L3c:
            int r2 = r2 + 1
            goto L12
        L3f:
            if (r3 <= 0) goto L42
            return r4
        L42:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.EYQ.mZx.Td.EYQ(java.lang.String, java.lang.String):boolean");
    }

    @Deprecated
    public static boolean EYQ(com.bytedance.sdk.component.adexpress.EYQ.Td.EYQ eyq, String str) {
        if (eyq == null) {
            return true;
        }
        try {
            if (TextUtils.isEmpty(eyq.Td())) {
                return true;
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return EYQ(eyq.Td(), str);
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void mZx(File file, com.bytedance.sdk.component.adexpress.EYQ.Td.EYQ eyq, String str) {
        if (eyq == null || file == null) {
            return;
        }
        try {
            new File(file, str).delete();
        } catch (Throwable unused) {
        }
        if (eyq.IPb() != null) {
            Iterator<EYQ.C0089EYQ> it = eyq.IPb().iterator();
            while (it.hasNext()) {
                try {
                    new File(file, com.bytedance.sdk.component.utils.Kbd.EYQ(it.next().EYQ())).delete();
                } catch (Throwable unused2) {
                }
            }
        }
    }
}
