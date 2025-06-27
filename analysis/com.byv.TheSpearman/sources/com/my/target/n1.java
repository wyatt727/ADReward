package com.my.target;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.SystemClock;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityNr;
import android.telephony.CellIdentityTdscdma;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoNr;
import android.telephony.CellInfoTdscdma;
import android.telephony.CellInfoWcdma;
import android.telephony.CellLocation;
import android.telephony.CellSignalStrengthCdma;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthNr;
import android.telephony.CellSignalStrengthTdscdma;
import android.telephony.CellSignalStrengthWcdma;
import android.telephony.TelephonyManager;
import android.telephony.gsm.GsmCellLocation;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.my.target.common.MyTargetConfig;
import com.my.target.n1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class n1 extends p1 {

    /* renamed from: a, reason: collision with root package name */
    public d f4059a = new d(new HashMap(), 0);

    public static class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final String f4060a = "cdma";
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;
        public final int j;
        public final int k;
        public final int l;
        public final int m;
        public final int n;
        public final int o;
        public final int p;

        public a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = i5;
            this.g = i6;
            this.h = i7;
            this.i = i8;
            this.j = i9;
            this.k = i10;
            this.l = i11;
            this.m = i12;
            this.n = i13;
            this.o = i14;
            this.p = i15;
        }

        @Override // com.my.target.n1.b
        public String a() {
            return this.f4060a + "," + this.b + "," + this.c + "," + this.d + "," + this.e + "," + this.f + "," + this.g + "," + this.h + "," + this.i + "," + this.j + "," + this.k + "," + this.l + "," + this.m + "," + this.n + "," + this.o + "," + this.p;
        }
    }

    public interface b {
        String a();
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public List<b> f4061a;

        public c(Context context) {
            b bVarB;
            this.f4061a = null;
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                return;
            }
            try {
                boolean z = Build.VERSION.SDK_INT < 29 && p1.a("android.permission.ACCESS_COARSE_LOCATION", context);
                boolean zA = p1.a("android.permission.ACCESS_FINE_LOCATION", context);
                if (z || zA) {
                    List<b> listA = a(telephonyManager);
                    this.f4061a = listA;
                    if ((listA == null || listA.isEmpty()) && (bVarB = b(telephonyManager)) != null) {
                        ArrayList arrayList = new ArrayList();
                        this.f4061a = arrayList;
                        arrayList.add(bVarB);
                    }
                }
            } catch (Throwable th) {
                ba.a("EnvironmentParamsDataProvider$CellEnvironment: Environment provider error - " + th.getMessage());
            }
        }

        public static List<b> a(TelephonyManager telephonyManager) {
            b eVar;
            List<CellInfo> allCellInfo = telephonyManager.getAllCellInfo();
            if (allCellInfo == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (CellInfo cellInfo : allCellInfo) {
                if (cellInfo.isRegistered()) {
                    if (cellInfo instanceof CellInfoLte) {
                        CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
                        CellIdentityLte cellIdentity = cellInfoLte.getCellIdentity();
                        CellSignalStrengthLte cellSignalStrength = cellInfoLte.getCellSignalStrength();
                        long ci = cellIdentity.getCi();
                        int i = Build.VERSION.SDK_INT;
                        eVar = new e("lte", ci, Integer.MAX_VALUE, i >= 28 ? cellIdentity.getMccString() : String.valueOf(cellIdentity.getMcc()), i >= 28 ? cellIdentity.getMncString() : String.valueOf(cellIdentity.getMnc()), cellSignalStrength.getLevel(), cellSignalStrength.getDbm(), cellSignalStrength.getAsuLevel(), cellSignalStrength.getTimingAdvance(), i >= 24 ? cellIdentity.getEarfcn() : Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, cellIdentity.getTac());
                    } else if (cellInfo instanceof CellInfoGsm) {
                        CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
                        CellIdentityGsm cellIdentity2 = cellInfoGsm.getCellIdentity();
                        CellSignalStrengthGsm cellSignalStrength2 = cellInfoGsm.getCellSignalStrength();
                        long cid = cellIdentity2.getCid();
                        int lac = cellIdentity2.getLac();
                        int i2 = Build.VERSION.SDK_INT;
                        eVar = new e("gsm", cid, lac, i2 >= 28 ? cellIdentity2.getMccString() : String.valueOf(cellIdentity2.getMcc()), i2 >= 28 ? cellIdentity2.getMncString() : String.valueOf(cellIdentity2.getMnc()), cellSignalStrength2.getLevel(), cellSignalStrength2.getDbm(), cellSignalStrength2.getAsuLevel(), i2 >= 26 ? cellSignalStrength2.getTimingAdvance() : Integer.MAX_VALUE, Integer.MAX_VALUE, i2 >= 24 ? cellIdentity2.getBsic() : Integer.MAX_VALUE, cellIdentity2.getPsc(), Integer.MAX_VALUE);
                    } else if (cellInfo instanceof CellInfoWcdma) {
                        CellInfoWcdma cellInfoWcdma = (CellInfoWcdma) cellInfo;
                        CellIdentityWcdma cellIdentity3 = cellInfoWcdma.getCellIdentity();
                        CellSignalStrengthWcdma cellSignalStrength3 = cellInfoWcdma.getCellSignalStrength();
                        long cid2 = cellIdentity3.getCid();
                        int lac2 = cellIdentity3.getLac();
                        int i3 = Build.VERSION.SDK_INT;
                        eVar = new e("wcdma", cid2, lac2, i3 >= 28 ? cellIdentity3.getMccString() : String.valueOf(cellIdentity3.getMcc()), i3 >= 28 ? cellIdentity3.getMncString() : String.valueOf(cellIdentity3.getMnc()), cellSignalStrength3.getLevel(), cellSignalStrength3.getDbm(), cellSignalStrength3.getAsuLevel(), Integer.MAX_VALUE, i3 >= 24 ? cellIdentity3.getUarfcn() : Integer.MAX_VALUE, Integer.MAX_VALUE, cellIdentity3.getPsc(), Integer.MAX_VALUE);
                    } else if (cellInfo instanceof CellInfoCdma) {
                        CellInfoCdma cellInfoCdma = (CellInfoCdma) cellInfo;
                        CellIdentityCdma cellIdentity4 = cellInfoCdma.getCellIdentity();
                        CellSignalStrengthCdma cellSignalStrength4 = cellInfoCdma.getCellSignalStrength();
                        eVar = new a(cellIdentity4.getNetworkId(), cellIdentity4.getSystemId(), cellIdentity4.getBasestationId(), cellIdentity4.getLatitude(), cellIdentity4.getLongitude(), cellSignalStrength4.getCdmaLevel(), cellSignalStrength4.getLevel(), cellSignalStrength4.getEvdoLevel(), cellSignalStrength4.getAsuLevel(), cellSignalStrength4.getCdmaDbm(), cellSignalStrength4.getDbm(), cellSignalStrength4.getEvdoDbm(), cellSignalStrength4.getEvdoEcio(), cellSignalStrength4.getCdmaEcio(), cellSignalStrength4.getEvdoSnr());
                    } else {
                        int i4 = Build.VERSION.SDK_INT;
                        if (i4 >= 29 && (cellInfo instanceof CellInfoNr)) {
                            CellInfoNr cellInfoNr = (CellInfoNr) cellInfo;
                            CellIdentityNr cellIdentityNr = (CellIdentityNr) cellInfoNr.getCellIdentity();
                            CellSignalStrengthNr cellSignalStrengthNr = (CellSignalStrengthNr) cellInfoNr.getCellSignalStrength();
                            eVar = new e("nr", cellIdentityNr.getNci(), Integer.MAX_VALUE, cellIdentityNr.getMccString(), cellIdentityNr.getMncString(), cellSignalStrengthNr.getLevel(), cellSignalStrengthNr.getDbm(), cellSignalStrengthNr.getAsuLevel(), Integer.MAX_VALUE, cellIdentityNr.getNrarfcn(), Integer.MAX_VALUE, Integer.MAX_VALUE, cellIdentityNr.getTac());
                        } else if (i4 >= 30 && (cellInfo instanceof CellInfoTdscdma)) {
                            CellIdentityTdscdma cellIdentity5 = ((CellInfoTdscdma) cellInfo).getCellIdentity();
                            CellSignalStrengthTdscdma cellSignalStrengthTdscdma = (CellSignalStrengthTdscdma) cellInfo.getCellSignalStrength();
                            eVar = new e("tdscdma", cellIdentity5.getCid(), cellIdentity5.getLac(), cellIdentity5.getMccString(), cellIdentity5.getMncString(), cellSignalStrengthTdscdma.getLevel(), cellSignalStrengthTdscdma.getDbm(), cellSignalStrengthTdscdma.getAsuLevel(), Integer.MAX_VALUE, cellIdentity5.getUarfcn(), Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
                        }
                    }
                    arrayList.add(eVar);
                }
            }
            return arrayList;
        }

        public static b b(TelephonyManager telephonyManager) {
            String str;
            String str2;
            String strSubstring;
            CellLocation cellLocation = telephonyManager.getCellLocation();
            String strSubstring2 = null;
            if (!(cellLocation instanceof GsmCellLocation)) {
                return null;
            }
            GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
            String networkOperator = telephonyManager.getNetworkOperator();
            if (networkOperator == null || networkOperator.length() == 0) {
                str = null;
                str2 = null;
            } else {
                try {
                    strSubstring = networkOperator.substring(0, 3);
                } catch (Throwable unused) {
                    strSubstring = null;
                }
                try {
                    strSubstring2 = networkOperator.substring(3);
                } catch (Throwable unused2) {
                    ba.a("EnvironmentParamsDataProvider$CellEnvironment: Unable to substring network operator " + networkOperator);
                    str2 = strSubstring2;
                    str = strSubstring;
                    return new e("gsm", gsmCellLocation.getCid(), gsmCellLocation.getLac(), str, str2, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
                }
                str2 = strSubstring2;
                str = strSubstring;
            }
            return new e("gsm", gsmCellLocation.getCid(), gsmCellLocation.getLac(), str, str2, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final Map<String, String> f4062a;
        public final long b;

        public d(Map<String, String> map, long j) {
            this.f4062a = map;
            this.b = j;
        }

        public long a() {
            return this.b;
        }

        public Map<String, String> b() {
            return new HashMap(this.f4062a);
        }
    }

    public static class e implements b {

        /* renamed from: a, reason: collision with root package name */
        public final String f4063a;
        public final String b;
        public final String c;
        public final long d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;
        public final int j;
        public final int k;
        public final int l;
        public final int m;

        public e(String str, long j, int i, String str2, String str3, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            this.f4063a = str;
            this.d = j;
            this.e = i;
            this.b = str2 == null ? String.valueOf(Integer.MAX_VALUE) : str2;
            this.c = str3 == null ? String.valueOf(Integer.MAX_VALUE) : str3;
            this.f = i2;
            this.g = i3;
            this.h = i4;
            this.i = i5;
            this.j = i6;
            this.k = i7;
            this.l = i8;
            this.m = i9;
        }

        @Override // com.my.target.n1.b
        public String a() {
            return this.f4063a + "," + this.d + "," + this.e + "," + this.b + "," + this.c + "," + this.f + "," + this.g + "," + this.h + "," + this.i + "," + this.j + "," + this.k + "," + this.l + "," + this.m;
        }
    }

    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public WifiInfo f4064a;
        public List<ScanResult> b;

        public f(Context context) {
            try {
                WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService(com.json.p2.b);
                if (wifiManager != null && wifiManager.isWifiEnabled()) {
                    this.f4064a = wifiManager.getConnectionInfo();
                    if (Build.VERSION.SDK_INT < 24 || n1.a(context)) {
                        this.b = wifiManager.getScanResults();
                    }
                    List<ScanResult> list = this.b;
                    if (list == null) {
                        return;
                    }
                    Collections.sort(list, new Comparator() { // from class: com.my.target.n1$f$$ExternalSyntheticLambda0
                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            return n1.f.a((ScanResult) obj, (ScanResult) obj2);
                        }
                    });
                }
            } catch (Throwable unused) {
                ba.a("EnvironmentParamsDataProvider$WiFiEnvironment: No permissions for access to wifi state");
            }
        }

        public static /* synthetic */ int a(ScanResult scanResult, ScanResult scanResult2) {
            return scanResult2.level - scanResult.level;
        }
    }

    public static boolean a(Context context) {
        return p1.a("android.permission.ACCESS_FINE_LOCATION", context) || p1.a("android.permission.ACCESS_COARSE_LOCATION", context);
    }

    public static void b(Map<String, String> map, Context context) {
        LocationManager locationManager;
        if (a(context) && (locationManager = (LocationManager) context.getSystemService(FirebaseAnalytics.Param.LOCATION)) != null) {
            float f2 = Float.MAX_VALUE;
            long j = 0;
            Location location = null;
            String str = null;
            for (String str2 : locationManager.getAllProviders()) {
                try {
                    Location lastKnownLocation = locationManager.getLastKnownLocation(str2);
                    if (lastKnownLocation != null) {
                        ba.a("EnvironmentParamsDataProvider: LocationProvider - " + str2);
                        float accuracy = lastKnownLocation.getAccuracy();
                        long time = lastKnownLocation.getTime();
                        if (location == null || (time > j && accuracy < f2)) {
                            str = str2;
                            location = lastKnownLocation;
                            f2 = accuracy;
                            j = time;
                        }
                    }
                } catch (Throwable unused) {
                    ba.a("EnvironmentParamsDataProvider: No permissions for get geo data");
                }
            }
            if (location == null) {
                return;
            }
            String str3 = location.getLatitude() + "," + location.getLongitude() + "," + location.getAccuracy() + "," + location.getSpeed() + "," + (j / 1000);
            map.put(FirebaseAnalytics.Param.LOCATION, str3);
            ba.a("EnvironmentParamsDataProvider: Location - " + str3);
            map.put("location_provider", str);
        }
    }

    public synchronized d a() {
        return this.f4059a;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void c(MyTargetConfig myTargetConfig, Context context) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (!myTargetConfig.isTrackingLocationEnabled) {
            synchronized (this) {
                this.f4059a = new d(new HashMap(), SystemClock.uptimeMillis() - jUptimeMillis);
            }
            return;
        }
        HashMap map = new HashMap();
        b(map, context);
        if (myTargetConfig.isTrackingEnvironmentEnabled) {
            c(map, context);
            a(map, context);
        }
        synchronized (this) {
            this.f4059a = new d(map, SystemClock.uptimeMillis() - jUptimeMillis);
        }
    }

    public final void a(Map<String, String> map, Context context) {
        List<b> list;
        if (p1.a("android.permission.ACCESS_COARSE_LOCATION", context) && (list = new c(context).f4061a) != null) {
            int i = 0;
            while (i < list.size()) {
                StringBuilder sb = new StringBuilder();
                sb.append("cell");
                sb.append(i != 0 ? Integer.valueOf(i) : "");
                map.put(sb.toString(), list.get(i).a());
                i++;
            }
        }
    }

    public synchronized Map<String, String> b(final MyTargetConfig myTargetConfig, final Context context) {
        d dVarA;
        dVarA = a();
        c0.c(new Runnable() { // from class: com.my.target.n1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.c(myTargetConfig, context);
            }
        });
        return dVarA.b();
    }

    public final void c(Map<String, String> map, Context context) {
        if (p1.a("android.permission.ACCESS_WIFI_STATE", context)) {
            f fVar = new f(context);
            WifiInfo wifiInfo = fVar.f4064a;
            if (wifiInfo != null) {
                String bssid = wifiInfo.getBSSID();
                if (bssid == null) {
                    bssid = "";
                }
                int linkSpeed = wifiInfo.getLinkSpeed();
                int networkId = wifiInfo.getNetworkId();
                int rssi = wifiInfo.getRssi();
                String ssid = wifiInfo.getSSID();
                if (ssid == null) {
                    ssid = "";
                }
                String str = bssid + "," + ssid + "," + rssi + "," + networkId + "," + linkSpeed;
                map.put(com.json.p2.b, str);
                ba.a("EnvironmentParamsDataProvider: ip - " + wifiInfo.getIpAddress());
                ba.a("EnvironmentParamsDataProvider: wifi - " + str);
            }
            List<ScanResult> list = fVar.b;
            if (list == null) {
                return;
            }
            int i = 0;
            int iMin = Math.min(list.size(), 5);
            while (i < iMin) {
                ScanResult scanResult = list.get(i);
                ba.a(scanResult.level + "");
                String str2 = scanResult.BSSID;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = scanResult.SSID;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = str2 + "," + str3 + "," + scanResult.level;
                StringBuilder sb = new StringBuilder();
                sb.append(com.json.p2.b);
                i++;
                sb.append(i);
                map.put(sb.toString(), str4);
                ba.a("EnvironmentParamsDataProvider: wifi" + i + " - " + str4);
            }
        }
    }
}
