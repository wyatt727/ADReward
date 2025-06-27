package com.my.tracker.obfuscated;

import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
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
import android.text.TextUtils;
import com.json.p2;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes4.dex */
public final class o {
    public static int b = 5;

    /* renamed from: a, reason: collision with root package name */
    private volatile boolean f4244a = true;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(ScanResult scanResult, ScanResult scanResult2) {
        return Integer.compare(scanResult2.level, scanResult.level);
    }

    static void a(s0 s0Var, Context context) {
        List<CellInfo> allCellInfo;
        if (Build.VERSION.SDK_INT < 29) {
            if (!o0.a("android.permission.ACCESS_COARSE_LOCATION", context)) {
                z0.a("EnvironmentParamsDataProvider: can't access information");
                return;
            }
        } else if (!o0.a("android.permission.ACCESS_FINE_LOCATION", context)) {
            z0.a("EnvironmentParamsDataProvider: can't access information");
            return;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null && (allCellInfo = telephonyManager.getAllCellInfo()) != null && !allCellInfo.isEmpty()) {
                boolean z = true;
                for (CellInfo cellInfo : allCellInfo) {
                    if (cellInfo.isRegistered()) {
                        if (cellInfo instanceof CellInfoCdma) {
                            a(s0Var, (CellInfoCdma) cellInfo);
                        } else if (cellInfo instanceof CellInfoGsm) {
                            a(s0Var, (CellInfoGsm) cellInfo);
                        } else if (cellInfo instanceof CellInfoLte) {
                            a(s0Var, (CellInfoLte) cellInfo);
                        } else if (cellInfo instanceof CellInfoWcdma) {
                            a(s0Var, (CellInfoWcdma) cellInfo);
                        } else {
                            int i = Build.VERSION.SDK_INT;
                            if (i >= 29 && (cellInfo instanceof CellInfoTdscdma)) {
                                a(s0Var, (CellInfoTdscdma) cellInfo);
                            } else if (i >= 29 && (cellInfo instanceof CellInfoNr)) {
                                a(s0Var, (CellInfoNr) cellInfo);
                            }
                        }
                        z = false;
                    }
                }
                if (z) {
                    a(s0Var, telephonyManager);
                }
            }
        } catch (Throwable th) {
            z0.a("EnvironmentParamsDataProvider: exception during collecting c-info", th);
        }
    }

    static void a(s0 s0Var, CellInfoCdma cellInfoCdma) {
        CellIdentityCdma cellIdentity = cellInfoCdma.getCellIdentity();
        CellSignalStrengthCdma cellSignalStrength = cellInfoCdma.getCellSignalStrength();
        s0Var.a(cellIdentity.getNetworkId(), cellIdentity.getSystemId(), cellIdentity.getBasestationId(), cellIdentity.getLatitude(), cellIdentity.getLongitude(), cellSignalStrength.getCdmaLevel(), cellSignalStrength.getCdmaDbm(), cellSignalStrength.getCdmaEcio(), cellSignalStrength.getEvdoLevel(), cellSignalStrength.getEvdoDbm(), cellSignalStrength.getEvdoEcio(), cellSignalStrength.getEvdoSnr());
    }

    static void a(s0 s0Var, CellInfoGsm cellInfoGsm) {
        CellIdentityGsm cellIdentity = cellInfoGsm.getCellIdentity();
        CellSignalStrengthGsm cellSignalStrength = cellInfoGsm.getCellSignalStrength();
        int i = Build.VERSION.SDK_INT;
        s0Var.a(i >= 28 ? cellIdentity.getMccString() : String.valueOf(cellIdentity.getMcc()), i >= 28 ? cellIdentity.getMncString() : String.valueOf(cellIdentity.getMnc()), cellIdentity.getCid(), cellIdentity.getLac(), i >= 24 ? cellIdentity.getArfcn() : Integer.MAX_VALUE, i >= 24 ? cellIdentity.getBsic() : Integer.MAX_VALUE, cellSignalStrength.getLevel(), cellSignalStrength.getDbm(), cellSignalStrength.getAsuLevel(), i >= 26 ? cellSignalStrength.getTimingAdvance() : Integer.MAX_VALUE);
    }

    static void a(s0 s0Var, CellInfoLte cellInfoLte) {
        CellIdentityLte cellIdentity = cellInfoLte.getCellIdentity();
        CellSignalStrengthLte cellSignalStrength = cellInfoLte.getCellSignalStrength();
        int i = Build.VERSION.SDK_INT;
        s0Var.b(i >= 28 ? cellIdentity.getMccString() : String.valueOf(cellIdentity.getMcc()), i >= 28 ? cellIdentity.getMncString() : String.valueOf(cellIdentity.getMnc()), cellIdentity.getCi(), cellIdentity.getTac(), i >= 24 ? cellIdentity.getEarfcn() : Integer.MAX_VALUE, i >= 24 ? cellIdentity.getPci() : Integer.MAX_VALUE, cellSignalStrength.getLevel(), cellSignalStrength.getDbm(), cellSignalStrength.getAsuLevel(), i >= 26 ? cellSignalStrength.getTimingAdvance() : Integer.MAX_VALUE);
    }

    static void a(s0 s0Var, CellInfoNr cellInfoNr) {
        CellIdentityNr cellIdentityNr = (CellIdentityNr) cellInfoNr.getCellIdentity();
        CellSignalStrengthNr cellSignalStrengthNr = (CellSignalStrengthNr) cellInfoNr.getCellSignalStrength();
        s0Var.a(cellIdentityNr.getMccString(), cellIdentityNr.getMncString(), cellIdentityNr.getNci(), cellIdentityNr.getTac(), cellIdentityNr.getNrarfcn(), cellIdentityNr.getPci(), cellSignalStrengthNr.getLevel(), cellSignalStrengthNr.getDbm(), cellSignalStrengthNr.getAsuLevel());
    }

    static void a(s0 s0Var, CellInfoTdscdma cellInfoTdscdma) {
        CellIdentityTdscdma cellIdentity = cellInfoTdscdma.getCellIdentity();
        CellSignalStrengthTdscdma cellSignalStrength = cellInfoTdscdma.getCellSignalStrength();
        s0Var.a(cellIdentity.getMccString(), cellIdentity.getMncString(), cellIdentity.getCid(), cellIdentity.getLac(), cellIdentity.getUarfcn(), cellIdentity.getCpid(), cellSignalStrength.getLevel(), cellSignalStrength.getDbm(), cellSignalStrength.getAsuLevel());
    }

    static void a(s0 s0Var, CellInfoWcdma cellInfoWcdma) {
        CellIdentityWcdma cellIdentity = cellInfoWcdma.getCellIdentity();
        CellSignalStrengthWcdma cellSignalStrength = cellInfoWcdma.getCellSignalStrength();
        int i = Build.VERSION.SDK_INT;
        s0Var.b(i >= 28 ? cellIdentity.getMccString() : String.valueOf(cellIdentity.getMcc()), i >= 28 ? cellIdentity.getMncString() : String.valueOf(cellIdentity.getMnc()), cellIdentity.getCid(), cellIdentity.getLac(), i >= 24 ? cellIdentity.getUarfcn() : Integer.MAX_VALUE, i >= 24 ? cellIdentity.getPsc() : Integer.MAX_VALUE, cellSignalStrength.getLevel(), cellSignalStrength.getDbm(), cellSignalStrength.getAsuLevel());
    }

    static void a(s0 s0Var, TelephonyManager telephonyManager) {
        String str;
        String str2;
        String strSubstring;
        CellLocation cellLocation = telephonyManager.getCellLocation();
        if (cellLocation instanceof GsmCellLocation) {
            String networkOperator = telephonyManager.getNetworkOperator();
            String strSubstring2 = null;
            if (TextUtils.isEmpty(networkOperator)) {
                str = null;
                str2 = null;
            } else {
                try {
                    strSubstring = networkOperator.substring(0, 3);
                    try {
                        strSubstring2 = networkOperator.substring(3);
                    } catch (Throwable unused) {
                        z0.a("EnvironmentParamsDataProvider: unable to substring network operator " + networkOperator);
                        str = strSubstring;
                        str2 = strSubstring2;
                        GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
                        s0Var.a(str, str2, gsmCellLocation.getCid(), gsmCellLocation.getLac(), Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
                    }
                } catch (Throwable unused2) {
                    strSubstring = null;
                }
                str = strSubstring;
                str2 = strSubstring2;
            }
            GsmCellLocation gsmCellLocation2 = (GsmCellLocation) cellLocation;
            s0Var.a(str, str2, gsmCellLocation2.getCid(), gsmCellLocation2.getLac(), Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
    }

    public static boolean a(int i) {
        return Integer.MAX_VALUE != i;
    }

    public static boolean a(long j) {
        return Long.MAX_VALUE != j;
    }

    static void b(s0 s0Var, Context context) {
        List<ScanResult> scanResults;
        if (o0.a("android.permission.ACCESS_WIFI_STATE", context)) {
            try {
                WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService(p2.b);
                if (wifiManager != null && wifiManager.isWifiEnabled()) {
                    WifiInfo connectionInfo = wifiManager.getConnectionInfo();
                    if (connectionInfo != null) {
                        s0Var.a(connectionInfo.getSSID(), connectionInfo.getBSSID(), connectionInfo.getRssi(), connectionInfo.getNetworkId(), connectionInfo.getLinkSpeed());
                    }
                    if ((Build.VERSION.SDK_INT < 24 || o0.a("android.permission.ACCESS_FINE_LOCATION", context) || o0.a("android.permission.ACCESS_COARSE_LOCATION", context)) && (scanResults = wifiManager.getScanResults()) != null && !scanResults.isEmpty()) {
                        Collections.sort(scanResults, new Comparator() { // from class: com.my.tracker.obfuscated.o$$ExternalSyntheticLambda0
                            @Override // java.util.Comparator
                            public final int compare(Object obj, Object obj2) {
                                return o.a((ScanResult) obj, (ScanResult) obj2);
                            }
                        });
                        int iMin = Math.min(scanResults.size(), b);
                        for (int i = 0; i < iMin; i++) {
                            ScanResult scanResult = scanResults.get(i);
                            s0Var.a(scanResult.SSID, scanResult.BSSID, scanResult.level);
                        }
                    }
                }
            } catch (Throwable th) {
                z0.a("EnvironmentParamsDataProvider: exception during collecting w-info", th);
            }
        }
    }

    public void a(Context context) {
    }

    public void a(boolean z) {
        this.f4244a = z;
    }

    public void b(Context context) {
    }

    public void c(s0 s0Var, Context context) {
        if (this.f4244a) {
            a(s0Var, context);
            b(s0Var, context);
        }
    }
}
