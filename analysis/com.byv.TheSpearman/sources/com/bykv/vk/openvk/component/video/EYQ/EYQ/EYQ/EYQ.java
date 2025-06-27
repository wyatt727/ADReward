package com.bykv.vk.openvk.component.video.EYQ.EYQ.EYQ;

import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: MediaCacheDirImpl.java */
/* loaded from: classes.dex */
public class EYQ implements com.bykv.vk.openvk.component.video.api.EYQ.mZx {
    private String EYQ = "video_reward_full";
    private String mZx = "video_brand";
    private String Td = "video_splash";
    private String Pm = "video_default";
    private String Kbd = null;
    private String IPb = null;
    private String VwS = null;
    private String QQ = null;
    private String HX = null;

    @Override // com.bykv.vk.openvk.component.video.api.EYQ.mZx
    public void EYQ(String str) {
        this.Kbd = str;
    }

    @Override // com.bykv.vk.openvk.component.video.api.EYQ.mZx
    public String Td() {
        if (this.HX == null) {
            this.HX = this.Kbd + File.separator + this.Pm;
            File file = new File(this.HX);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.HX;
    }

    @Override // com.bykv.vk.openvk.component.video.api.EYQ.mZx
    public String EYQ() {
        if (this.IPb == null) {
            this.IPb = this.Kbd + File.separator + this.EYQ;
            File file = new File(this.IPb);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.IPb;
    }

    public String Kbd() {
        if (this.VwS == null) {
            this.VwS = this.Kbd + File.separator + this.mZx;
            File file = new File(this.VwS);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.VwS;
    }

    @Override // com.bykv.vk.openvk.component.video.api.EYQ.mZx
    public String mZx() {
        if (this.QQ == null) {
            this.QQ = this.Kbd + File.separator + this.Td;
            File file = new File(this.QQ);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.QQ;
    }

    @Override // com.bykv.vk.openvk.component.video.api.EYQ.mZx
    public synchronized void Pm() {
        List<com.bykv.vk.openvk.component.video.api.EYQ.EYQ> listIPb = IPb();
        if (Build.VERSION.SDK_INT >= 23) {
            Set<String> setVwS = null;
            for (com.bykv.vk.openvk.component.video.api.EYQ.EYQ eyq : listIPb) {
                File[] fileArrEYQ = eyq.EYQ();
                if (fileArrEYQ != null && fileArrEYQ.length >= eyq.mZx()) {
                    if (setVwS == null) {
                        setVwS = VwS();
                    }
                    int iMZx = eyq.mZx() - 2;
                    if (iMZx < 0) {
                        iMZx = 0;
                    }
                    EYQ(eyq.EYQ(), iMZx, setVwS);
                }
            }
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.EYQ.mZx
    public boolean EYQ(com.bykv.vk.openvk.component.video.api.Td.Td td) {
        if (TextUtils.isEmpty(td.mZx()) || TextUtils.isEmpty(td.nWX())) {
            return false;
        }
        return new File(td.mZx(), td.nWX()).exists();
    }

    @Override // com.bykv.vk.openvk.component.video.api.EYQ.mZx
    public long mZx(com.bykv.vk.openvk.component.video.api.Td.Td td) {
        if (TextUtils.isEmpty(td.mZx()) || TextUtils.isEmpty(td.nWX())) {
            return 0L;
        }
        return com.bykv.vk.openvk.component.video.EYQ.Kbd.mZx.EYQ(td.mZx(), td.nWX());
    }

    private static void EYQ(File[] fileArr, int i, Set<String> set) {
        if (i >= 0 && fileArr != null) {
            try {
                if (fileArr.length > i) {
                    List listAsList = Arrays.asList(fileArr);
                    Collections.sort(listAsList, new Comparator<File>() { // from class: com.bykv.vk.openvk.component.video.EYQ.EYQ.EYQ.EYQ.1
                        @Override // java.util.Comparator
                        /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
                        public int compare(File file, File file2) {
                            long jLastModified = file2.lastModified() - file.lastModified();
                            if (jLastModified == 0) {
                                return 0;
                            }
                            return jLastModified < 0 ? -1 : 1;
                        }
                    });
                    while (i < listAsList.size()) {
                        File file = (File) listAsList.get(i);
                        if (set != null && !set.contains(file.getAbsolutePath())) {
                            ((File) listAsList.get(i)).delete();
                        }
                        i++;
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    private List<com.bykv.vk.openvk.component.video.api.EYQ.EYQ> IPb() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.bykv.vk.openvk.component.video.api.EYQ.EYQ(new File(EYQ()).listFiles(), com.bykv.vk.openvk.component.video.EYQ.EYQ.Td()));
        arrayList.add(new com.bykv.vk.openvk.component.video.api.EYQ.EYQ(new File(mZx()).listFiles(), com.bykv.vk.openvk.component.video.EYQ.EYQ.mZx()));
        arrayList.add(new com.bykv.vk.openvk.component.video.api.EYQ.EYQ(new File(Kbd()).listFiles(), com.bykv.vk.openvk.component.video.EYQ.EYQ.Pm()));
        arrayList.add(new com.bykv.vk.openvk.component.video.api.EYQ.EYQ(new File(Td()).listFiles(), com.bykv.vk.openvk.component.video.EYQ.EYQ.Kbd()));
        return arrayList;
    }

    private Set<String> VwS() {
        HashSet hashSet = new HashSet();
        for (com.bykv.vk.openvk.component.video.EYQ.EYQ.EYQ eyq : com.bykv.vk.openvk.component.video.EYQ.EYQ.EYQ.EYQ.values()) {
            if (eyq != null && eyq.EYQ() != null) {
                com.bykv.vk.openvk.component.video.api.Td.Td tdEYQ = eyq.EYQ();
                hashSet.add(com.bykv.vk.openvk.component.video.EYQ.Kbd.mZx.mZx(tdEYQ.mZx(), tdEYQ.nWX()).getAbsolutePath());
                hashSet.add(com.bykv.vk.openvk.component.video.EYQ.Kbd.mZx.Td(tdEYQ.mZx(), tdEYQ.nWX()).getAbsolutePath());
            }
        }
        for (com.bykv.vk.openvk.component.video.EYQ.EYQ.mZx.mZx mzx : com.bykv.vk.openvk.component.video.EYQ.EYQ.mZx.Td.EYQ.values()) {
            if (mzx != null && mzx.EYQ() != null) {
                com.bykv.vk.openvk.component.video.api.Td.Td tdEYQ2 = mzx.EYQ();
                hashSet.add(com.bykv.vk.openvk.component.video.EYQ.Kbd.mZx.mZx(tdEYQ2.mZx(), tdEYQ2.nWX()).getAbsolutePath());
                hashSet.add(com.bykv.vk.openvk.component.video.EYQ.Kbd.mZx.Td(tdEYQ2.mZx(), tdEYQ2.nWX()).getAbsolutePath());
            }
        }
        return hashSet;
    }
}
