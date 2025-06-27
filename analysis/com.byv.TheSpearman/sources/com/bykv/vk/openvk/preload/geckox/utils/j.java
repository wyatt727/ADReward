package com.bykv.vk.openvk.preload.geckox.utils;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ResVersionUtils.java */
/* loaded from: classes2.dex */
public final class j {
    public static Long a(File file) {
        File[] fileArrListFiles = file.listFiles(new FileFilter() { // from class: com.bykv.vk.openvk.preload.geckox.utils.j.1
            @Override // java.io.FileFilter
            public final boolean accept(File file2) {
                return file2.isDirectory();
            }
        });
        Long lValueOf = null;
        if (fileArrListFiles != null && fileArrListFiles.length != 0) {
            for (File file2 : fileArrListFiles) {
                try {
                    long jLongValue = Long.valueOf(file2.getName()).longValue();
                    if (lValueOf == null) {
                        lValueOf = Long.valueOf(jLongValue);
                    } else if (jLongValue > lValueOf.longValue()) {
                        lValueOf = Long.valueOf(jLongValue);
                    }
                } catch (Exception unused) {
                }
            }
        }
        return lValueOf;
    }

    public static List<Long> b(File file) {
        File[] fileArrListFiles = file.listFiles(new FileFilter() { // from class: com.bykv.vk.openvk.preload.geckox.utils.j.2
            @Override // java.io.FileFilter
            public final boolean accept(File file2) {
                return file2.isDirectory();
            }
        });
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (File file2 : fileArrListFiles) {
            try {
                arrayList.add(Long.valueOf(Long.valueOf(file2.getName()).longValue()));
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }
}
