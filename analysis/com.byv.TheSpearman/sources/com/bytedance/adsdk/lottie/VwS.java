package com.bytedance.adsdk.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import android.util.JsonReader;
import com.bytedance.adsdk.lottie.Kbd.NZ;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.objectweb.asm.Opcodes;

/* compiled from: LottieCompositionFactory.java */
/* loaded from: classes2.dex */
public class VwS {
    private static final Map<String, tsL<IPb>> EYQ = new HashMap();
    private static final Set<Object> mZx = new HashSet();
    private static final byte[] Td = {80, 75, 3, 4};

    public static tsL<IPb> EYQ(Context context, String str) {
        return EYQ(context, str, "url_".concat(String.valueOf(str)));
    }

    public static tsL<IPb> EYQ(final Context context, final String str, final String str2) {
        return EYQ(str2, new Callable<MxO<IPb>>() { // from class: com.bytedance.adsdk.lottie.VwS.1
            @Override // java.util.concurrent.Callable
            /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
            public MxO<IPb> call() throws Exception {
                MxO<IPb> mxOEYQ = Kbd.EYQ(context).EYQ(context, str, str2);
                if (str2 != null && mxOEYQ.EYQ() != null) {
                    com.bytedance.adsdk.lottie.Td.Kbd.EYQ().EYQ(str2, mxOEYQ.EYQ());
                }
                return mxOEYQ;
            }
        });
    }

    public static tsL<IPb> mZx(Context context, String str) {
        return mZx(context, str, "asset_".concat(String.valueOf(str)));
    }

    public static tsL<IPb> mZx(Context context, final String str, final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return EYQ(str2, new Callable<MxO<IPb>>() { // from class: com.bytedance.adsdk.lottie.VwS.4
            @Override // java.util.concurrent.Callable
            /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
            public MxO<IPb> call() throws Exception {
                return VwS.Td(applicationContext, str, str2);
            }
        });
    }

    public static MxO<IPb> Td(Context context, String str) {
        return Td(context, str, "asset_".concat(String.valueOf(str)));
    }

    public static MxO<IPb> Td(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return mZx(context.getAssets().open(str), str2);
            }
            return EYQ(context, new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e) {
            return new MxO<>((Throwable) e);
        }
    }

    public static tsL<IPb> EYQ(Context context, int i) {
        return EYQ(context, i, Td(context, i));
    }

    public static tsL<IPb> EYQ(Context context, final int i, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return EYQ(str, new Callable<MxO<IPb>>() { // from class: com.bytedance.adsdk.lottie.VwS.5
            @Override // java.util.concurrent.Callable
            /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
            public MxO<IPb> call() throws Exception {
                Context context2 = (Context) weakReference.get();
                if (context2 == null) {
                    context2 = applicationContext;
                }
                return VwS.mZx(context2, i, str);
            }
        });
    }

    public static MxO<IPb> mZx(Context context, int i) {
        return mZx(context, i, Td(context, i));
    }

    public static MxO<IPb> mZx(Context context, int i, String str) {
        try {
            return mZx(context.getResources().openRawResource(i), Td(context, i));
        } catch (Resources.NotFoundException e) {
            return new MxO<>((Throwable) e);
        }
    }

    private static String Td(Context context, int i) {
        StringBuilder sb = new StringBuilder("rawRes");
        sb.append(EYQ(context) ? "_night_" : "_day_");
        sb.append(i);
        return sb.toString();
    }

    private static boolean EYQ(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static tsL<IPb> EYQ(final InputStream inputStream, final String str) {
        return EYQ(str, new Callable<MxO<IPb>>() { // from class: com.bytedance.adsdk.lottie.VwS.6
            @Override // java.util.concurrent.Callable
            /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
            public MxO<IPb> call() throws Exception {
                return VwS.mZx(inputStream, str);
            }
        });
    }

    public static MxO<IPb> mZx(InputStream inputStream, String str) {
        return EYQ(inputStream, str, true);
    }

    private static MxO<IPb> EYQ(InputStream inputStream, String str, boolean z) throws IOException {
        try {
            return EYQ(new JsonReader(new InputStreamReader(inputStream)), str);
        } finally {
            if (z) {
                com.bytedance.adsdk.lottie.IPb.IPb.EYQ(inputStream);
            }
        }
    }

    public static MxO<IPb> EYQ(JsonReader jsonReader, String str) {
        return EYQ(jsonReader, str, true);
    }

    private static MxO<IPb> EYQ(JsonReader jsonReader, String str, boolean z) throws IOException {
        try {
            try {
                IPb iPbEYQ = NZ.EYQ(jsonReader);
                com.bytedance.adsdk.lottie.Td.Kbd.EYQ().EYQ(str, iPbEYQ);
                MxO<IPb> mxO = new MxO<>(iPbEYQ);
                if (z) {
                    EYQ(jsonReader);
                }
                return mxO;
            } catch (Exception e) {
                MxO<IPb> mxO2 = new MxO<>(e);
                if (z) {
                    EYQ(jsonReader);
                }
                return mxO2;
            }
        } catch (Throwable th) {
            if (z) {
                EYQ(jsonReader);
            }
            throw th;
        }
    }

    public static void EYQ(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static MxO<IPb> EYQ(Context context, ZipInputStream zipInputStream, String str) throws IOException {
        try {
            return mZx(context, zipInputStream, str);
        } finally {
            com.bytedance.adsdk.lottie.IPb.IPb.EYQ(zipInputStream);
        }
    }

    private static MxO<IPb> mZx(Context context, ZipInputStream zipInputStream, String str) throws IOException {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            IPb iPbEYQ = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().endsWith(".json")) {
                    iPbEYQ = EYQ(new JsonReader(new InputStreamReader(zipInputStream)), (String) null, false).EYQ();
                } else if (name.endsWith(".png") || name.endsWith(".webp") || name.endsWith(".jpg") || name.endsWith(".jpeg")) {
                    if (name.contains("../")) {
                        zipInputStream.closeEntry();
                        nextEntry = zipInputStream.getNextEntry();
                    } else {
                        String[] strArrSplit = name.split("/");
                        map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
                    }
                } else if (name.endsWith(".ttf") || name.endsWith(".otf")) {
                    if (name.contains("../")) {
                        zipInputStream.closeEntry();
                        nextEntry = zipInputStream.getNextEntry();
                    } else {
                        String[] strArrSplit2 = name.split("/");
                        String str2 = strArrSplit2[strArrSplit2.length - 1];
                        String str3 = str2.split("\\.")[0];
                        File file = new File(context.getCacheDir(), str2);
                        new FileOutputStream(file);
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            try {
                                byte[] bArr = new byte[4096];
                                while (true) {
                                    int i = zipInputStream.read(bArr);
                                    if (i == -1) {
                                        break;
                                    }
                                    fileOutputStream.write(bArr, 0, i);
                                }
                                fileOutputStream.flush();
                                fileOutputStream.close();
                            } finally {
                            }
                        } catch (Throwable unused) {
                        }
                        Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                        if (!file.delete()) {
                            file.getAbsolutePath();
                        }
                        map2.put(str3, typefaceCreateFromFile);
                    }
                } else {
                    zipInputStream.closeEntry();
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (iPbEYQ == null) {
                return new MxO<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : map.entrySet()) {
                HX hxEYQ = EYQ(iPbEYQ, (String) entry.getKey());
                if (hxEYQ != null) {
                    hxEYQ.EYQ(com.bytedance.adsdk.lottie.IPb.IPb.EYQ((Bitmap) entry.getValue(), hxEYQ.EYQ(), hxEYQ.mZx()));
                }
            }
            for (Map.Entry entry2 : map2.entrySet()) {
                boolean z = false;
                for (com.bytedance.adsdk.lottie.Td.Td td : iPbEYQ.MxO().values()) {
                    if (td.EYQ().equals(entry2.getKey())) {
                        td.EYQ((Typeface) entry2.getValue());
                        z = true;
                    }
                }
                if (!z) {
                }
            }
            if (map.isEmpty()) {
                Iterator<Map.Entry<String, HX>> it = iPbEYQ.tsL().entrySet().iterator();
                while (it.hasNext()) {
                    HX value = it.next().getValue();
                    if (value == null) {
                        return null;
                    }
                    String strPm = value.Pm();
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = Opcodes.IF_ICMPNE;
                    if (strPm.startsWith("data:") && strPm.indexOf("base64,") > 0) {
                        try {
                            byte[] bArrDecode = Base64.decode(strPm.substring(strPm.indexOf(44) + 1), 0);
                            value.EYQ(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options));
                        } catch (IllegalArgumentException unused2) {
                            return null;
                        }
                    }
                }
            }
            for (Map.Entry<String, HX> entry3 : iPbEYQ.tsL().entrySet()) {
                if (entry3.getValue().IPb() == null) {
                    return new MxO<>((Throwable) new IllegalStateException("There is no image for " + entry3.getValue().Pm()));
                }
            }
            if (str != null) {
                com.bytedance.adsdk.lottie.Td.Kbd.EYQ().EYQ(str, iPbEYQ);
            }
            return new MxO<>(iPbEYQ);
        } catch (IOException e) {
            return new MxO<>((Throwable) e);
        }
    }

    private static HX EYQ(IPb iPb, String str) {
        for (HX hx : iPb.tsL().values()) {
            if (hx.Pm().equals(str)) {
                return hx;
            }
        }
        return null;
    }

    private static tsL<IPb> EYQ(final String str, Callable<MxO<IPb>> callable) {
        final IPb iPbEYQ = str == null ? null : com.bytedance.adsdk.lottie.Td.Kbd.EYQ().EYQ(str);
        if (iPbEYQ != null) {
            return new tsL<>(new Callable<MxO<IPb>>() { // from class: com.bytedance.adsdk.lottie.VwS.7
                @Override // java.util.concurrent.Callable
                /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
                public MxO<IPb> call() throws Exception {
                    return new MxO<>(iPbEYQ);
                }
            });
        }
        if (str != null) {
            Map<String, tsL<IPb>> map = EYQ;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        tsL<IPb> tsl = new tsL<>(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            tsl.EYQ(new tp<IPb>() { // from class: com.bytedance.adsdk.lottie.VwS.2
                @Override // com.bytedance.adsdk.lottie.tp
                public void EYQ(IPb iPb) {
                    VwS.EYQ.remove(str);
                    atomicBoolean.set(true);
                    if (VwS.EYQ.size() == 0) {
                        VwS.mZx(true);
                    }
                }
            });
            tsl.Td(new tp<Throwable>() { // from class: com.bytedance.adsdk.lottie.VwS.3
                @Override // com.bytedance.adsdk.lottie.tp
                public void EYQ(Throwable th) {
                    VwS.EYQ.remove(str);
                    atomicBoolean.set(true);
                    if (VwS.EYQ.size() == 0) {
                        VwS.mZx(true);
                    }
                }
            });
            if (!atomicBoolean.get()) {
                Map<String, tsL<IPb>> map2 = EYQ;
                map2.put(str, tsl);
                if (map2.size() == 1) {
                    mZx(false);
                }
            }
        }
        return tsl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void mZx(boolean z) {
        ArrayList arrayList = new ArrayList(mZx);
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i);
        }
    }
}
