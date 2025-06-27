package com.bykv.vk.openvk.preload.geckox.f;

import com.bykv.vk.openvk.preload.geckox.f.a.c;
import com.bykv.vk.openvk.preload.geckox.utils.j;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: ChannelVerLoader.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public String f1410a;
    public String b;
    public volatile File c;
    volatile Long d;
    public AtomicBoolean e = new AtomicBoolean(false);
    private volatile com.bykv.vk.openvk.preload.geckox.f.a.a f;

    a(String str, String str2) {
        this.f1410a = str;
        this.b = str2;
    }

    public final synchronized com.bykv.vk.openvk.preload.geckox.f.a.a a(String str) throws Exception {
        if (this.f != null) {
            return this.f;
        }
        File fileC = c(str);
        if (fileC == null) {
            throw new FileNotFoundException("channel no exist，channel:".concat(String.valueOf(str)));
        }
        File file = new File(fileC, "res.macv");
        File file2 = new File(fileC, "res");
        if (file2.exists() && file2.isDirectory()) {
            this.f = new c(fileC);
        } else if (file.exists() && file.isFile()) {
            this.f = new com.bykv.vk.openvk.preload.geckox.f.a.b(fileC);
        } else {
            throw new RuntimeException("can not find res, dir:" + fileC.getAbsolutePath());
        }
        return this.f;
    }

    public static String a(String str, String str2) {
        return str2.substring(str.length() + 1);
    }

    private synchronized File c(String str) throws Exception {
        if (this.c != null) {
            return this.c;
        }
        if (this.d != null && this.d.longValue() == -1) {
            return null;
        }
        com.bykv.vk.openvk.preload.geckox.g.b bVarA = com.bykv.vk.openvk.preload.geckox.g.b.a(this.f1410a + File.separator + str + File.separator + "select.lock");
        try {
            if (this.d == null) {
                this.d = j.a(new File(this.f1410a, str));
            }
            if (this.d == null) {
                this.d = -1L;
                return null;
            }
            File file = new File(this.f1410a, File.separator + str + File.separator + this.d + File.separator + "using.lock");
            this.c = file.getParentFile();
            com.bykv.vk.openvk.preload.geckox.g.c.a(file.getAbsolutePath());
            return this.c;
        } finally {
            bVarA.a();
        }
    }

    public final int b(String str) {
        try {
            File file = new File(c(str), "res");
            if (!file.exists() || !file.isDirectory()) {
                return 0;
            }
            int length = file.listFiles().length;
            if (length > 0) {
                return length - 1;
            }
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
