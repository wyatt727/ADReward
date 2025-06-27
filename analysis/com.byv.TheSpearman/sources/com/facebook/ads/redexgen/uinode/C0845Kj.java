package com.facebook.ads.redexgen.uinode;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.Kj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0845Kj {
    public static byte[] A00;
    public static String[] A01 = {"R2O7PMYP6nkOeNui3I4WlXx4fu7rpRKA", "y", "n9RLgUbY6qPVyxnn4C2MCNq6tOX6tKMu", "KtI8XvYnNiAs4lVQz", "VIjGruAAxxfbDEfj8", "jnPluIPOifq7BY1vqnqKLiUetY3DHsfM", "J5aiTqmsNT2689NKU", "zCaDldCe0EtEl2h3W"};
    public static final Package A02;
    public static final String A03;
    public static final String A04;
    public static final String A05;
    public static final Set<C1207Yn> A06;
    public static final AtomicReference<InterfaceC0852Ks> A07;
    public static final AtomicReference<InterfaceC0854Ku> A08;

    public static String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 18);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{-111, -92, -89, -79, -70, -62, -92, -89, -62, -78, -91, -83, -62, -84, -89, -62, -82, -88, -68, -68, -49, -46, -36, -27, -19, -35, -32, -41, -43, -41, -36, -49, -38, -19, -45, -26, -30, -32, -49, -31, 102, 121, 124, -122, -113, -105, -117, 121, -114, 125, 124, -105, -117, -116, 121, -116, 125, -105, 124, 121, -116, 121, -57, -43, -22, -39, -40, -108, -25, -24, -43, -24, -39, -108, -42, -23, -30, -40, -32, -39, -108, -35, -25, -108, -39, -31, -28, -24, -19, -107, -19, -17, 0, -21, 1, 0, -11, -8, -77, -64, -79, -75, -66, -69, -73, -64, -58, -79, -58, -63, -67, -73, -64, -80, -68, -70, 123, -77, -82, -80, -78, -81, -68, -68, -72, 123, -82, -79, -64, 123, -74, -69, -63, -78, -65, -69, -82, -71, 123, -74, -67, -80, 123, -114, -62, -79, -74, -78, -69, -80, -78, -101, -78, -63, -60, -68, -65, -72, -97, -78, -70, -68, -63, -78, -114, -80, -63, -74, -61, -74, -63, -58, -30, -37, -24, -34, -26, -33, -49, -20, -29, -64, -23, -20, -52, -33, -19, -17, -26, -18, -92, -91, -110, -93, -91, 114, -108, -91, -102, -89, -102, -91, -86, -53, -52, -71, -54, -52, -103, -69, -52, -63, -50, -63, -52, -47, -98, -57, -54, -86, -67, -53, -51, -60, -52};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static boolean A0B(Intent intent, Set<String> set) {
        Uri data = intent.getData();
        if (data == null) {
            return false;
        }
        String string = data.toString();
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            if (string.startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    static {
        A07();
        Package r4 = C0845Kj.class.getPackage();
        A02 = r4;
        A04 = r4 + A06(40, 22, 38);
        A03 = r4 + A06(0, 19, 81);
        A05 = r4 + A06(19, 21, 124);
        A06 = Collections.newSetFromMap(new WeakHashMap());
        A07 = new AtomicReference<>();
        A08 = new AtomicReference<>();
    }

    public static Intent A00(Intent intent) {
        Intent intentCloneFilter = intent.cloneFilter();
        intentCloneFilter.setFlags(intent.getFlags());
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(intent.getExtras());
        intentCloneFilter.putExtra(A05, parcelObtain.marshall());
        parcelObtain.recycle();
        return intentCloneFilter;
    }

    public static Intent A01(Intent intent, ClassLoader classLoader) {
        Intent intentCloneFilter = intent.cloneFilter();
        intentCloneFilter.setFlags(intent.getFlags());
        Bundle audienceNetworkActivityBundle = new Bundle();
        Parcel parcelObtain = Parcel.obtain();
        byte[] byteArrayExtra = intent.getByteArrayExtra(A05);
        if (byteArrayExtra != null) {
            parcelObtain.unmarshall(byteArrayExtra, 0, byteArrayExtra.length);
            parcelObtain.setDataPosition(0);
            audienceNetworkActivityBundle = parcelObtain.readBundle(classLoader);
            parcelObtain.recycle();
        }
        intentCloneFilter.putExtras(audienceNetworkActivityBundle);
        return intentCloneFilter;
    }

    public static Bundle A02(Bundle bundle, ClassLoader classLoader) {
        Parcel parcelObtain = Parcel.obtain();
        byte[] byteArray = bundle.getByteArray(A04);
        if (byteArray != null) {
            parcelObtain.unmarshall(byteArray, 0, byteArray.length);
            parcelObtain.setDataPosition(0);
            Bundle bundle2 = parcelObtain.readBundle(classLoader);
            parcelObtain.recycle();
            String[] strArr = A01;
            if (strArr[6].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "08vXapB5qdF8q1e2g";
            strArr2[3] = "bPV7EQI3jYdBWJzP2";
            return bundle2;
        }
        throw new IllegalStateException(A06(62, 28, 98));
    }

    public static C1207Yn A03(Intent intent) {
        String stringExtra = intent.getStringExtra(A03);
        if (stringExtra != null) {
            for (C1207Yn c1207Yn : A06) {
                String adId = c1207Yn.A0E().getId();
                if (stringExtra.equals(adId)) {
                    return c1207Yn;
                }
            }
            return null;
        }
        return null;
    }

    public static AdActivityIntent A04(C1207Yn c1207Yn) {
        AdActivityIntent adActivityIntent = new AdActivityIntent(c1207Yn.getApplicationContext(), A05());
        adActivityIntent.putExtra(A03, c1207Yn.A0E().getId());
        A06.add(c1207Yn);
        return adActivityIntent;
    }

    public static Class A05() {
        boolean zIsRemoteRenderingProcess = ProcessUtils.isRemoteRenderingProcess();
        if (A01[1].length() != 1) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[4] = "4NnM5dRGBMW0KGxzs";
        strArr[3] = "N6FCbEqQMIqNBYuck";
        if (zIsRemoteRenderingProcess) {
            try {
                return Class.forName(A06(113, 59, 59));
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        return AudienceNetworkActivity.class;
    }

    public static void A08(Activity activity, Intent intent) throws C0843Kh {
        try {
            activity.startActivityForResult(intent, 0);
        } catch (ActivityNotFoundException e) {
            throw new C0843Kh(e);
        }
    }

    public static void A09(Bundle bundle, Bundle bundle2) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle2);
        bundle.putByteArray(A04, parcelObtain.marshall());
        parcelObtain.recycle();
    }

    public static void A0A(C1207Yn c1207Yn, AdActivityIntent adActivityIntent) throws C0843Kh {
        Context launchContext;
        Context applicationContext = c1207Yn.getApplicationContext();
        if (C0796Ih.A25(c1207Yn) && (launchContext = c1207Yn.A0D()) != null) {
            applicationContext = launchContext;
            if ((adActivityIntent.getFlags() & 268435456) == 268435456) {
                adActivityIntent.setFlags(adActivityIntent.getFlags() ^ 268435456);
            }
        }
        try {
            if (ProcessUtils.isRemoteRenderingProcess()) {
                if (!A0J(c1207Yn, adActivityIntent)) {
                    c1207Yn.A0E().AF0();
                    return;
                }
                return;
            }
            applicationContext.startActivity(A00(adActivityIntent));
        } catch (ActivityNotFoundException e) {
            throw new C0843Kh(e);
        }
    }

    public static boolean A0C(C1207Yn c1207Yn, Intent intent) throws C0843Kh {
        A07.get();
        return A0G(c1207Yn, intent, null);
    }

    public static boolean A0D(C1207Yn c1207Yn, Intent intent) throws C0843Kh {
        A07.get();
        if (0 == 0 || c1207Yn.A0D() == null) {
            return false;
        }
        c1207Yn.A0B();
        try {
            c1207Yn.A0D();
            throw new NullPointerException(A06(203, 22, 70));
        } catch (ActivityNotFoundException e) {
            throw new C0843Kh(e);
        } catch (Exception e2) {
            c1207Yn.A07().A9a(A06(90, 8, 122), C8A.A07, new C8B(e2));
            return false;
        }
    }

    public static boolean A0E(C1207Yn c1207Yn, Intent intent) throws C0843Kh {
        return A0F(c1207Yn, A00(intent), -1);
    }

    public static boolean A0F(C1207Yn c1207Yn, Intent intent, int i) throws C0843Kh {
        try {
            Activity currentActivity = ActivityUtils.A00();
            if (currentActivity == null) {
                currentActivity = c1207Yn.A0D();
            }
            if (currentActivity != null) {
                if (i >= 0) {
                    currentActivity.startActivityForResult(intent, i);
                    return true;
                }
                currentActivity.startActivity(intent);
                return true;
            }
            return false;
        } catch (ActivityNotFoundException e) {
            throw new C0843Kh(e);
        }
    }

    public static boolean A0G(C1207Yn c1207Yn, Intent intent, InterfaceC0852Ks interfaceC0852Ks) throws C0843Kh {
        if (A0B(intent, C0796Ih.A0V(c1207Yn))) {
            return false;
        }
        Context context = c1207Yn;
        String[] strArr = A01;
        if (strArr[6].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        A01[1] = "W";
        Context startContext = c1207Yn.A0D();
        if (startContext != null) {
            context = startContext;
        } else {
            intent.addFlags(268435456);
        }
        if (interfaceC0852Ks != null && !A0B(intent, C0796Ih.A0X(c1207Yn))) {
            c1207Yn.A0B();
            try {
                throw new NullPointerException(A06(Opcodes.ARRAYLENGTH, 13, 31));
            } catch (ActivityNotFoundException e) {
                throw new C0843Kh(e);
            } catch (Exception e2) {
                c1207Yn.A07().A9a(A06(90, 8, 122), C8A.A08, new C8B(e2));
                return false;
            }
        }
        try {
            context.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException e3) {
            throw new C0843Kh(e3);
        }
    }

    public static boolean A0H(C1207Yn c1207Yn, Uri uri, String str) throws ActivityNotFoundException {
        A08.get();
        return A0I(c1207Yn, uri, str, null);
    }

    public static boolean A0I(C1207Yn c1207Yn, Uri uri, String str, InterfaceC0854Ku interfaceC0854Ku) throws ActivityNotFoundException {
        if (interfaceC0854Ku == null || c1207Yn.A0D() == null) {
            return false;
        }
        new Bundle().putString(A06(98, 15, 64), str);
        uri.toString();
        c1207Yn.A0D();
        throw new NullPointerException(A06(172, 18, 104));
    }

    public static boolean A0J(C1207Yn c1207Yn, AdActivityIntent adActivityIntent) throws C0843Kh {
        return A0F(c1207Yn, A00(adActivityIntent), 0);
    }
}
