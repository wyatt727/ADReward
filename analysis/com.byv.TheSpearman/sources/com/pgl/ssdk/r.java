package com.pgl.ssdk;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private static volatile String f4320a = null;
    private static String b = null;
    private static String c = null;
    private static String d = null;
    private static int e = -1;
    private static long f = 0;
    private static long g = 0;
    private static volatile long h = -1;

    public static String a(RandomAccessFile randomAccessFile) throws NoSuchAlgorithmException, IOException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            byte[] bArr = new byte[1048576];
            while (true) {
                int i = randomAccessFile.read(bArr);
                if (i == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, i);
            }
            String string = new BigInteger(1, messageDigest.digest()).toString(16);
            while (string.length() < 32) {
                string = "0".concat(String.valueOf(string));
            }
            return string;
        } catch (FileNotFoundException | IOException | NoSuchAlgorithmException unused) {
            return "";
        }
    }

    private static Certificate a(File file) throws Throwable {
        List listA;
        CertificateFactory certificateFactory;
        FileInputStream fileInputStream;
        ZipInputStream zipInputStream;
        ZipInputStream zipInputStream2 = null;
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            long length = randomAccessFile.length();
            FileChannel channel = randomAccessFile.getChannel();
            Objects.requireNonNull(channel);
            C1410k c1410k = new C1410k(channel, 0L, length);
            listA = C1409j.a(c1410k, AbstractC1403d.a(c1410k));
        } catch (Throwable unused) {
            listA = null;
        }
        if (listA == null || listA.isEmpty()) {
            try {
                certificateFactory = CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
            } catch (CertificateException unused2) {
                certificateFactory = null;
            }
            if (certificateFactory == null) {
                listA = null;
            } else {
                try {
                    fileInputStream = new FileInputStream(file);
                    try {
                        zipInputStream = new ZipInputStream(fileInputStream);
                        try {
                            try {
                                ArrayList arrayList = new ArrayList();
                                while (true) {
                                    try {
                                        ZipEntry nextEntry = zipInputStream.getNextEntry();
                                        if (nextEntry == null) {
                                            break;
                                        }
                                        String name = nextEntry.getName();
                                        if (name.startsWith("META-INF/")) {
                                            if (name.endsWith(".RSA") || name.endsWith(".DSA") || name.endsWith(".EC")) {
                                                try {
                                                    arrayList.addAll(certificateFactory.generateCertificates(zipInputStream));
                                                } catch (CertificateException unused3) {
                                                }
                                            } else {
                                                zipInputStream.closeEntry();
                                            }
                                        }
                                    } catch (IOException unused4) {
                                        listA = arrayList;
                                        if (zipInputStream != null) {
                                            try {
                                                zipInputStream.close();
                                            } catch (IOException unused5) {
                                            }
                                        }
                                        if (fileInputStream != null) {
                                            fileInputStream.close();
                                        }
                                        if (listA != null) {
                                        }
                                        return null;
                                    }
                                }
                                zipInputStream.close();
                                try {
                                    zipInputStream.close();
                                } catch (IOException unused6) {
                                }
                                listA = arrayList;
                            } catch (IOException unused7) {
                                listA = null;
                            }
                        } catch (Throwable th) {
                            zipInputStream2 = zipInputStream;
                            th = th;
                            if (zipInputStream2 != null) {
                                try {
                                    zipInputStream2.close();
                                } catch (IOException unused8) {
                                }
                            }
                            if (fileInputStream == null) {
                                throw th;
                            }
                            try {
                                fileInputStream.close();
                                throw th;
                            } catch (IOException unused9) {
                                throw th;
                            }
                        }
                    } catch (IOException unused10) {
                        zipInputStream = null;
                        listA = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (IOException unused11) {
                    zipInputStream = null;
                    listA = null;
                    fileInputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    fileInputStream = null;
                }
                try {
                    fileInputStream.close();
                } catch (IOException unused12) {
                }
            }
        }
        if (listA != null || listA.isEmpty()) {
            return null;
        }
        return (Certificate) listA.get(0);
    }

    public static void a() {
        SharedPreferences sharedPreferencesA = T.a(C1423y.b());
        if (sharedPreferencesA != null) {
            if (!TextUtils.isEmpty(f4320a)) {
                sharedPreferencesA.edit().putString("sa", f4320a).apply();
            }
            if (!TextUtils.isEmpty(c)) {
                sharedPreferencesA.edit().putString("md5", c).apply();
            }
            if (!TextUtils.isEmpty(b)) {
                sharedPreferencesA.edit().putString("sj", b).apply();
            }
            if (f != 0) {
                sharedPreferencesA.edit().putLong("as", f).apply();
            }
            if (g != 0) {
                sharedPreferencesA.edit().putLong("ds", g).apply();
            }
            if (h != -1) {
                sharedPreferencesA.edit().putLong("mt", h).apply();
            }
            if (e != -1) {
                sharedPreferencesA.edit().putInt("cpc", e).apply();
            }
            if (TextUtils.isEmpty(d)) {
                return;
            }
            sharedPreferencesA.edit().putString("ap", d).apply();
        }
    }

    public static void a(File file, boolean z) throws Throwable {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2 = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "r");
        } catch (FileNotFoundException unused) {
        } catch (IOException unused2) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            try {
                if (TextUtils.isEmpty(f4320a)) {
                    a(a(file));
                    if (z) {
                        a();
                        try {
                            randomAccessFile.close();
                            return;
                        } catch (IOException unused3) {
                            return;
                        }
                    }
                }
                if (TextUtils.isEmpty(c)) {
                    c = a(randomAccessFile);
                }
                if (f == 0) {
                    f = randomAccessFile.length() / 1024;
                }
                if (g == 0) {
                    g = b(file);
                }
            } catch (FileNotFoundException unused4) {
                randomAccessFile2 = randomAccessFile;
                if (randomAccessFile2 == null) {
                    return;
                }
                randomAccessFile = randomAccessFile2;
                randomAccessFile.close();
            } catch (IOException unused5) {
                randomAccessFile2 = randomAccessFile;
                if (randomAccessFile2 == null) {
                    return;
                }
                randomAccessFile = randomAccessFile2;
                randomAccessFile.close();
            } catch (Throwable th2) {
                th = th2;
                randomAccessFile2 = randomAccessFile;
                if (randomAccessFile2 != null) {
                    try {
                        randomAccessFile2.close();
                    } catch (IOException unused6) {
                    }
                }
                throw th;
            }
            randomAccessFile.close();
        } catch (IOException unused7) {
        }
    }

    private static void a(Certificate certificate) throws CertificateEncodingException {
        if (certificate != null) {
            try {
                byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(certificate.getEncoded());
                StringBuilder sb = new StringBuilder();
                for (byte b2 : bArrDigest) {
                    sb.append(Integer.toHexString((b2 & 255) | 256).substring(1, 3).toUpperCase());
                    sb.append(":");
                }
                f4320a = sb.substring(0, sb.length() - 1);
            } catch (NoSuchAlgorithmException | CertificateEncodingException unused) {
            }
            if (certificate instanceof X509Certificate) {
                b = String.valueOf(((X509Certificate) certificate).getSubjectDN());
            }
        }
    }

    public static long b(File file) throws Throwable {
        String str;
        ZipFile zipFile = null;
        try {
            ZipFile zipFile2 = new ZipFile(file);
            try {
                new ZipInputStream(new FileInputStream(file));
                int i = 0;
                int size = 0;
                while (true) {
                    if (i == 0) {
                        str = "classes.dex";
                    } else {
                        str = String.format(Locale.getDefault(), "classes%d.dex", Integer.valueOf(i));
                    }
                    ZipEntry entry = zipFile2.getEntry(str);
                    if (entry == null) {
                        break;
                    }
                    size = (int) (size + entry.getSize());
                    i++;
                }
                long j = size / 1000;
                try {
                    zipFile2.close();
                } catch (IOException unused) {
                }
                return j;
            } catch (ZipException unused2) {
                zipFile = zipFile2;
                if (zipFile == null) {
                    return 0L;
                }
                try {
                    zipFile.close();
                    return 0L;
                } catch (IOException unused3) {
                    return 0L;
                }
            } catch (IOException unused4) {
                zipFile = zipFile2;
                if (zipFile == null) {
                    return 0L;
                }
                zipFile.close();
                return 0L;
            } catch (Throwable th) {
                th = th;
                zipFile = zipFile2;
                if (zipFile != null) {
                    try {
                        zipFile.close();
                    } catch (IOException unused5) {
                    }
                }
                throw th;
            }
        } catch (ZipException unused6) {
        } catch (IOException unused7) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String b() throws Throwable {
        String string;
        String string2;
        String string3;
        String string4;
        int i;
        long j;
        long j2;
        if (TextUtils.isEmpty(f4320a) || TextUtils.isEmpty(c) || e == -1) {
            SharedPreferences sharedPreferencesA = T.a(C1423y.b());
            long j3 = -1;
            if (sharedPreferencesA != null) {
                j3 = sharedPreferencesA.getLong("mt", -1L);
                string2 = sharedPreferencesA.getString("sa", null);
                string3 = sharedPreferencesA.getString("sj", null);
                string4 = sharedPreferencesA.getString("md5", null);
                j = sharedPreferencesA.getLong("as", 0L);
                j2 = sharedPreferencesA.getLong("ds", 0L);
                i = sharedPreferencesA.getInt("cpc", -1);
                string = sharedPreferencesA.getString("ap", null);
            } else {
                string = null;
                string2 = null;
                string3 = null;
                string4 = null;
                i = 0;
                j = 0;
                j2 = 0;
            }
            String strC = c();
            if (strC == null) {
                return null;
            }
            File file = new File(strC);
            Object[] objArr = (Object[]) com.pgl.ssdk.ces.a.meta(158, C1423y.b(), strC);
            Integer num = (Integer) objArr[0];
            String str = (String) objArr[1];
            long jLastModified = file.lastModified();
            if (jLastModified != j3 || string2 == null || i == -1) {
                h = jLastModified;
                if (str != null) {
                    d = str;
                }
                if (num != null) {
                    e = num.intValue();
                }
                a(file, false);
                a();
            } else {
                f4320a = string2;
                b = string3;
                f = j;
                g = j2;
                c = string4;
                e = i;
                d = string;
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(f4320a)) {
                jSONObject.put("sign", f4320a);
            }
            if (!TextUtils.isEmpty(b)) {
                jSONObject.put("subject", b);
            }
            if (!TextUtils.isEmpty(c)) {
                jSONObject.put("md5", c);
            }
            if (!TextUtils.isEmpty(d)) {
                jSONObject.put("path", d);
            }
            long j4 = f;
            if (j4 != 0) {
                jSONObject.put("apkSize", j4);
            }
            long j5 = g;
            if (j5 != 0) {
                jSONObject.put("dexSize", j5);
            }
            int i2 = e;
            if (i2 != -1) {
                jSONObject.put("code", i2);
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return null;
        }
    }

    public static String c() {
        if (C1423y.b() == null) {
            return null;
        }
        String packageCodePath = C1423y.b().getPackageCodePath();
        if (TextUtils.isEmpty(packageCodePath)) {
            return null;
        }
        File file = new File(packageCodePath);
        if (file.exists() && file.canRead()) {
            return packageCodePath;
        }
        return null;
    }

    public static String d() throws Throwable {
        String string;
        if (!TextUtils.isEmpty(f4320a)) {
            return f4320a;
        }
        SharedPreferences sharedPreferencesA = T.a(C1423y.b());
        long j = -1;
        if (sharedPreferencesA != null) {
            j = sharedPreferencesA.getLong("mt", -1L);
            string = sharedPreferencesA.getString("sa", null);
        } else {
            string = null;
        }
        String strC = c();
        if (TextUtils.isEmpty(strC)) {
            return null;
        }
        File file = new File(strC);
        long jLastModified = file.lastModified();
        if (jLastModified == j && string != null) {
            f4320a = string;
            return string;
        }
        h = jLastModified;
        a(file, true);
        a();
        return f4320a;
    }
}
