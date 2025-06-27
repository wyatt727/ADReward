package com.applovin.impl.sdk;

import android.content.Context;
import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import com.applovin.impl.aa;
import com.applovin.impl.kn;
import com.applovin.impl.oj;
import com.applovin.impl.s2;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.applovin.impl.xl;
import com.applovin.impl.zp;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class p {
    private final k b;
    private final t c;

    /* renamed from: a, reason: collision with root package name */
    private final String f977a = "FileManager";
    private final Object d = new Object();
    private final Set e = new HashSet();

    p(k kVar) {
        this.b = kVar;
        this.c = kVar.L();
    }

    private boolean f(File file) {
        if (t.a()) {
            this.c.a("FileManager", "Removing file " + file.getName() + " from filesystem...");
        }
        try {
            c(file);
            boolean zDelete = file.delete();
            if (!zDelete) {
                this.b.B().a(o.b.FILE_ERROR, "removeFile", (Map) CollectionUtils.hashMap("path", file.getAbsolutePath()));
            }
            return zDelete;
        } catch (Throwable th) {
            try {
                if (t.a()) {
                    this.c.a("FileManager", "Failed to remove file " + file.getName() + " from filesystem!", th);
                }
                this.b.B().a("FileManager", "removeFile", th);
                g(file);
                return false;
            } finally {
                g(file);
            }
        }
    }

    private void g(File file) {
        String absolutePath = file.getAbsolutePath();
        synchronized (this.d) {
            if (!this.e.remove(absolutePath)) {
                this.b.B().a(o.b.FILE_ERROR, "unlockFile", (Map) CollectionUtils.hashMap("path", absolutePath));
            }
            this.d.notifyAll();
        }
    }

    public void b(Context context) {
        if (this.b.A0()) {
            if (t.a()) {
                this.c.a("FileManager", "Compacting cache...");
            }
            a(a(context), context);
        }
    }

    public void c(final com.applovin.impl.sdk.ad.b bVar, final Context context) {
        this.b.l0().a((xl) new kn(this.b, false, "removeCachedResourcesForAd", new Runnable() { // from class: com.applovin.impl.sdk.p$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(bVar, context);
            }
        }), sm.b.CACHING);
    }

    public void d(final com.applovin.impl.sdk.ad.b bVar, final Context context) {
        this.b.l0().a((xl) new kn(this.b, false, "removeCachedVideoResourceForAd", new Runnable() { // from class: com.applovin.impl.sdk.p$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(bVar, context);
            }
        }), sm.b.CACHING);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [boolean, java.io.Closeable] */
    public String e(File file) throws Throwable {
        Throwable th;
        InputStream fileInputStream;
        IOException e;
        FileNotFoundException e2;
        if (file == null) {
            return null;
        }
        if (t.a()) {
            this.c.a("FileManager", "Reading resource from filesystem: " + file.getName());
        }
        ?? BooleanValue = ((Boolean) this.b.a(oj.M)).booleanValue();
        boolean z = true;
        try {
            try {
                try {
                    try {
                        if (BooleanValue != 0) {
                            try {
                                try {
                                    FileInputStream fileInputStream2 = new FileInputStream(file);
                                    try {
                                        c(file);
                                        String strA = a(fileInputStream2);
                                        z = strA == null;
                                        fileInputStream2.close();
                                        if (z && ((Boolean) this.b.a(oj.g1)).booleanValue()) {
                                            a(file, "removeFileAfterReadFail");
                                        }
                                        g(file);
                                        return strA;
                                    } catch (Throwable th2) {
                                        try {
                                            fileInputStream2.close();
                                        } catch (Throwable th3) {
                                            th2.addSuppressed(th3);
                                        }
                                        throw th2;
                                    }
                                } catch (Throwable th4) {
                                    if (t.a()) {
                                        this.c.a("FileManager", "Unknown failure to read file.", th4);
                                    }
                                    this.c.a("FileManager", th4);
                                    this.b.B().a("FileManager", "readFile", th4);
                                    if (((Boolean) this.b.a(oj.g1)).booleanValue()) {
                                        a(file, "removeFileAfterReadFail");
                                    }
                                    g(file);
                                    return null;
                                }
                            } catch (FileNotFoundException e3) {
                                if (t.a()) {
                                    this.c.d("FileManager", "File not found. " + e3);
                                }
                                this.c.a("FileManager", e3);
                                this.b.B().a("FileManager", "readFileNotFound", e3);
                                if (0 != 0 && ((Boolean) this.b.a(oj.g1)).booleanValue()) {
                                    a(file, "removeFileAfterReadFail");
                                }
                                g(file);
                                return null;
                            } catch (IOException e4) {
                                if (t.a()) {
                                    this.c.a("FileManager", "Failed to read file: " + file.getName() + e4);
                                }
                                this.c.a("FileManager", e4);
                                this.b.B().a("FileManager", "readFileIO", e4);
                                if (((Boolean) this.b.a(oj.g1)).booleanValue()) {
                                    a(file, "removeFileAfterReadFail");
                                }
                                g(file);
                                return null;
                            }
                        }
                        try {
                            c(file);
                            fileInputStream = new FileInputStream(file);
                        } catch (FileNotFoundException e5) {
                            e2 = e5;
                            fileInputStream = null;
                        } catch (IOException e6) {
                            e = e6;
                            fileInputStream = null;
                        } catch (Throwable th5) {
                            th = th5;
                            fileInputStream = null;
                        }
                        try {
                            String strA2 = a(fileInputStream);
                            z = strA2 == null;
                            zp.a((Closeable) fileInputStream, this.b);
                            if (z && ((Boolean) this.b.a(oj.g1)).booleanValue()) {
                                a(file, "removeFileAfterReadFail");
                            }
                            g(file);
                            return strA2;
                        } catch (FileNotFoundException e7) {
                            e2 = e7;
                            if (t.a()) {
                                this.c.d("FileManager", "File not found. " + e2);
                            }
                            this.b.B().a("FileManager", "readFileNotFound", e2);
                            zp.a((Closeable) fileInputStream, this.b);
                            g(file);
                            return null;
                        } catch (IOException e8) {
                            e = e8;
                            if (t.a()) {
                                this.c.a("FileManager", "Failed to read file: " + file.getName() + e);
                            }
                            this.b.B().a("FileManager", "readFileIO", e);
                            zp.a((Closeable) fileInputStream, this.b);
                            if (((Boolean) this.b.a(oj.g1)).booleanValue()) {
                                a(file, "removeFileAfterReadFail");
                            }
                            g(file);
                            return null;
                        } catch (Throwable th6) {
                            th = th6;
                            if (t.a()) {
                                this.c.a("FileManager", "Unknown failure to read file.", th);
                            }
                            this.b.B().a("FileManager", "readFile", th);
                            zp.a((Closeable) fileInputStream, this.b);
                            if (((Boolean) this.b.a(oj.g1)).booleanValue()) {
                                a(file, "removeFileAfterReadFail");
                            }
                            g(file);
                            return null;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        z = true;
                        zp.a((Closeable) BooleanValue, this.b);
                        if (z && ((Boolean) this.b.a(oj.g1)).booleanValue()) {
                            a(file, "removeFileAfterReadFail");
                        }
                        g(file);
                        throw th;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    if (z && ((Boolean) this.b.a(oj.g1)).booleanValue()) {
                        a(file, "removeFileAfterReadFail");
                    }
                    g(file);
                    throw th;
                }
            } catch (Throwable th9) {
                th = th9;
                zp.a((Closeable) BooleanValue, this.b);
                if (z) {
                    a(file, "removeFileAfterReadFail");
                }
                g(file);
                throw th;
            }
        } catch (Throwable th10) {
            th = th10;
            z = false;
            if (z) {
                a(file, "removeFileAfterReadFail");
            }
            g(file);
            throw th;
        }
    }

    private void c(File file) {
        String absolutePath = file.getAbsolutePath();
        synchronized (this.d) {
            boolean zAdd = this.e.add(absolutePath);
            while (!zAdd) {
                try {
                    this.d.wait();
                    zAdd = this.e.add(absolutePath);
                } catch (InterruptedException e) {
                    if (t.a()) {
                        this.c.a("FileManager", "Lock '" + absolutePath + "' interrupted", e);
                    }
                    throw new RuntimeException(e);
                }
            }
        }
    }

    private boolean d(File file) {
        if (file == null) {
            return false;
        }
        String absolutePath = file.getAbsolutePath();
        synchronized (this.d) {
            if (this.e.contains(absolutePath)) {
                return false;
            }
            c(file);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(com.applovin.impl.sdk.ad.b bVar, Context context) {
        f(a(bVar.s0().getLastPathSegment(), context));
    }

    private boolean b(File file) {
        boolean zContains;
        String absolutePath = file.getAbsolutePath();
        synchronized (this.d) {
            zContains = this.e.contains(absolutePath);
        }
        return zContains;
    }

    private File d(Context context) {
        return new File(context.getFilesDir(), CampaignEx.JSON_KEY_AD_AL);
    }

    public boolean b(String str, Context context) {
        return a(a(str, false, context));
    }

    private List c(Context context) {
        File[] fileArrListFiles;
        File fileD = d(context);
        if (fileD.isDirectory() && (fileArrListFiles = fileD.listFiles()) != null) {
            return Arrays.asList(fileArrListFiles);
        }
        return Collections.emptyList();
    }

    public boolean c(String str, Context context) {
        boolean z = false;
        File fileA = a(str, false, context);
        if (!d(fileA)) {
            return false;
        }
        if (fileA.exists() && !fileA.isDirectory()) {
            z = true;
        }
        g(fileA);
        return z;
    }

    public void e(Context context) {
        try {
            a(".nomedia", context);
            File file = new File(d(context), ".nomedia");
            if (a(file)) {
                return;
            }
            if (t.a()) {
                this.c.a("FileManager", "Creating .nomedia file at " + file.getAbsolutePath());
            }
            if (file.createNewFile()) {
                return;
            }
            if (t.a()) {
                this.c.b("FileManager", "Failed to create .nomedia file");
            }
            this.b.B().a(o.b.FILE_ERROR, "createNoMediaFile");
        } catch (IOException e) {
            if (t.a()) {
                this.c.a("FileManager", "Failed to create .nomedia file", e);
            }
        }
    }

    public String a(Context context, String str, String str2, List list, boolean z, s2 s2Var) {
        return a(context, str, str2, list, z, false, s2Var);
    }

    public String a(Context context, String str, String str2, List list, boolean z, boolean z2, s2 s2Var) {
        if (!StringUtils.isValidString(str)) {
            if (t.a()) {
                this.c.a("FileManager", "Nothing to cache, skipping...");
            }
            this.b.B().a(o.b.FILE_ERROR, "cacheResource");
            return null;
        }
        String strA = zp.a(Uri.parse(str), str2, this.b);
        File fileA = a(strA, context);
        if (!a(fileA, str, list, z, s2Var)) {
            return null;
        }
        if (t.a()) {
            this.c.a("FileManager", "Caching succeeded for file " + strA);
        }
        return z2 ? Uri.fromFile(fileA).toString() : strA;
    }

    public boolean a(File file, String str, List list, s2 s2Var) {
        return a(file, str, list, true, s2Var);
    }

    private boolean a(File file, String str, List list, boolean z, s2 s2Var) {
        if (a(file)) {
            if (t.a()) {
                this.c.a("FileManager", "File exists for " + str);
            }
            if (s2Var == null) {
                return true;
            }
            s2Var.a(file.length());
            return true;
        }
        if (((Boolean) this.b.a(oj.M)).booleanValue()) {
            try {
                InputStream inputStreamA = a(str, list, z, s2Var);
                try {
                    boolean zA = a(inputStreamA, file);
                    if (inputStreamA != null) {
                        inputStreamA.close();
                    }
                    return zA;
                } finally {
                }
            } catch (Throwable th) {
                this.c.a("FileManager", th);
                this.b.B().a("FileManager", "loadAndCacheResource", th);
                return false;
            }
        }
        InputStream inputStreamA2 = null;
        try {
            inputStreamA2 = a(str, list, z, s2Var);
            return a(inputStreamA2, file);
        } finally {
            zp.a((Closeable) inputStreamA2, this.b);
        }
    }

    public InputStream a(String str, List list, boolean z, s2 s2Var) {
        HttpURLConnection httpURLConnection;
        if (z && !zp.a(str, list)) {
            if (t.a()) {
                this.c.a("FileManager", "Domain is not whitelisted, skipping precache for url: " + str);
            }
            return null;
        }
        if (((Boolean) this.b.a(oj.d3)).booleanValue() && !str.contains("https://")) {
            if (t.a()) {
                this.c.k("FileManager", "Plaintext HTTP operation requested; upgrading to HTTPS due to universal SSL setting...");
            }
            str = str.replace("http://", "https://");
        }
        if (t.a()) {
            this.c.a("FileManager", "Loading " + str + "...");
        }
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setConnectTimeout(((Integer) this.b.a(oj.b3)).intValue());
                httpURLConnection.setReadTimeout(((Integer) this.b.a(oj.c3)).intValue());
                httpURLConnection.setDefaultUseCaches(true);
                httpURLConnection.setUseCaches(true);
                httpURLConnection.setAllowUserInteraction(false);
                httpURLConnection.setInstanceFollowRedirects(true);
                int responseCode = httpURLConnection.getResponseCode();
                s2Var.a(responseCode);
                this.b.B().a("loadResource", str, responseCode);
                if (responseCode >= 200 && responseCode < 300) {
                    if (t.a()) {
                        this.c.a("FileManager", "Opened stream to resource " + str);
                    }
                    return httpURLConnection.getInputStream();
                }
                if (((Boolean) this.b.a(oj.A3)).booleanValue()) {
                    zp.a(httpURLConnection, this.b);
                }
                return null;
            } catch (Throwable th) {
                th = th;
                try {
                    if (t.a()) {
                        this.c.a("FileManager", "Error loading " + str, th);
                    }
                    this.b.B().a("FileManager", "loadResource", th, CollectionUtils.hashMap("url", str));
                    s2Var.a(th);
                    if (((Boolean) this.b.a(oj.A3)).booleanValue()) {
                        zp.a(httpURLConnection, this.b);
                    }
                    return null;
                } finally {
                    if (((Boolean) this.b.a(oj.A3)).booleanValue()) {
                        zp.a(httpURLConnection, this.b);
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection = null;
        }
    }

    public File a(String str, Context context) {
        return a(str, true, context);
    }

    private File a(String str, boolean z, Context context) {
        if (!StringUtils.isValidString(str)) {
            if (t.a()) {
                this.c.a("FileManager", "Nothing to look up, skipping...");
            }
            return null;
        }
        if (t.a()) {
            this.c.a("FileManager", "Looking up cached resource: " + str);
        }
        String strReplace = str.contains("icon") ? str.replace("/", "_").replace(".", "_") : str;
        File fileD = d(context);
        File file = new File(fileD, strReplace);
        if (zp.a(oj.i1, this.b)) {
            boolean z2 = file.length() == 0;
            boolean zEquals = str.equals(".nomedia");
            if (file.exists() && z2 && !zEquals) {
                this.b.B().a(o.b.FILE_ERROR, "removeEmptyCachedResource", (Map) CollectionUtils.hashMap("path", file.getAbsolutePath()));
                f(file);
            }
        }
        if (z) {
            try {
                fileD.mkdirs();
            } catch (Throwable th) {
                if (t.a()) {
                    this.c.a("FileManager", "Unable to make cache directory at " + fileD, th);
                }
                this.b.B().a("FileManager", "createCacheDir", th);
                return null;
            }
        }
        return file;
    }

    public String a(InputStream inputStream) throws IOException {
        if (((Boolean) this.b.a(oj.M)).booleanValue()) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int i = inputStream.read(bArr, 0, 8192);
                        if (i >= 0) {
                            byteArrayOutputStream.write(bArr, 0, i);
                        } else {
                            String string = byteArrayOutputStream.toString(C.UTF8_NAME);
                            byteArrayOutputStream.close();
                            return string;
                        }
                    }
                } finally {
                }
            } catch (Throwable th) {
                this.c.a("FileManager", th);
                this.b.B().a("FileManager", "readInputStreamAsString", th);
                return null;
            }
        } else {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[8192];
            while (true) {
                int i2 = inputStream.read(bArr2, 0, 8192);
                if (i2 >= 0) {
                    try {
                        byteArrayOutputStream2.write(bArr2, 0, i2);
                    } catch (Throwable th2) {
                        zp.a((Closeable) byteArrayOutputStream2, this.b);
                        this.b.B().a("FileManager", "readInputStreamAsString", th2);
                        return null;
                    }
                } else {
                    return byteArrayOutputStream2.toString(C.UTF8_NAME);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x01eb A[Catch: all -> 0x0213, TRY_LEAVE, TryCatch #9 {all -> 0x0213, blocks: (B:118:0x01e5, B:120:0x01eb), top: B:155:0x01e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fb A[Catch: all -> 0x0122, TryCatch #2 {all -> 0x0122, blocks: (B:55:0x00f5, B:57:0x00fb, B:58:0x0100), top: B:142:0x00f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(java.io.InputStream r17, java.io.File r18, boolean r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.p.a(java.io.InputStream, java.io.File, boolean):boolean");
    }

    public boolean a(InputStream inputStream, File file) {
        if (file == null) {
            return false;
        }
        if (t.a()) {
            this.c.a("FileManager", "Caching " + file.getAbsolutePath() + "...");
        }
        if (!a(inputStream, file, false)) {
            if (t.a()) {
                this.c.b("FileManager", "Unable to cache " + file.getAbsolutePath());
            }
            return false;
        }
        if (!t.a()) {
            return true;
        }
        this.c.a("FileManager", "Caching completed for " + file);
        return true;
    }

    private long a(Context context) {
        long jA = a();
        boolean z = jA != -1;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        List listC = this.b.c(oj.a1);
        long length = 0;
        for (File file : c(context)) {
            if (z && !listC.contains(file.getName()) && !b(file) && seconds - TimeUnit.MILLISECONDS.toSeconds(file.lastModified()) > jA) {
                if (t.a()) {
                    this.c.a("FileManager", "File " + file.getName() + " has expired, removing...");
                }
                if (f(file)) {
                    this.b.F().c(aa.j);
                }
            }
            length += file.length();
        }
        return length;
    }

    private void a(long j, Context context) {
        long jIntValue = ((Integer) this.b.a(oj.W0)).intValue();
        if (jIntValue == -1) {
            if (t.a()) {
                this.c.a("FileManager", "Cache has no maximum size set; skipping drop...");
            }
        } else {
            if (a(j) > jIntValue) {
                if (t.a()) {
                    this.c.a("FileManager", "Cache has exceeded maximum size; dropping...");
                }
                Iterator it = c(context).iterator();
                while (it.hasNext()) {
                    f((File) it.next());
                }
                this.b.F().c(aa.k);
                return;
            }
            if (t.a()) {
                this.c.a("FileManager", "Cache is present but under size limit; not dropping...");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.sdk.ad.b bVar, Context context) {
        ArrayList arrayList = new ArrayList(bVar.i());
        arrayList.add(bVar.s0());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            f(a(((Uri) it.next()).getLastPathSegment(), context));
        }
    }

    public void a(File file, String str) {
        if (t.a()) {
            this.c.a("FileManager", "Removing file " + file.getName() + " for source " + str + ".");
        }
        try {
            if (file.delete()) {
                return;
            }
            this.b.B().a(o.b.FILE_ERROR, str, (Map) CollectionUtils.hashMap("path", file.getAbsolutePath()));
        } catch (Throwable th) {
            if (t.a()) {
                this.c.a("FileManager", "Failed to remove file " + file.getName() + " from filesystem after failed operation.", th);
            }
            this.b.B().a("FileManager", str, th);
        }
    }

    private long a() {
        long jLongValue = ((Long) this.b.a(oj.V0)).longValue();
        if (jLongValue >= 0) {
            return jLongValue;
        }
        return -1L;
    }

    private long a(long j) {
        return j / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
    }

    public boolean a(File file) {
        if (!zp.a(oj.l1, this.b)) {
            return (file == null || !file.exists() || file.isDirectory()) ? false : true;
        }
        if (file == null) {
            return false;
        }
        zp.a();
        c(file);
        boolean z = file.exists() && !file.isDirectory();
        g(file);
        return z;
    }
}
