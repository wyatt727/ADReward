package com.my.tracker.obfuscated;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes4.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    Location f4224a;
    int b = -1;
    private volatile boolean c = true;

    f0() {
    }

    public void a(Context context) {
        LocationManager locationManager;
        int i;
        Location location = null;
        this.f4224a = null;
        this.b = -1;
        if (this.c && o0.a("android.permission.ACCESS_FINE_LOCATION", context) && o0.a("android.permission.ACCESS_COARSE_LOCATION", context) && !o0.a() && (locationManager = (LocationManager) context.getSystemService(FirebaseAnalytics.Param.LOCATION)) != null) {
            long j = 0;
            float f = Float.MAX_VALUE;
            String str = null;
            for (String str2 : locationManager.getAllProviders()) {
                try {
                    Location lastKnownLocation = locationManager.getLastKnownLocation(str2);
                    if (lastKnownLocation != null) {
                        float accuracy = lastKnownLocation.getAccuracy();
                        long time = lastKnownLocation.getTime();
                        if (location == null || (time > j && accuracy < f)) {
                            str = str2;
                            location = lastKnownLocation;
                            f = accuracy;
                            j = time;
                        }
                    }
                } catch (SecurityException unused) {
                    z0.a("Permission android.permission.ACCESS_COARSE_LOCATION or android.permission.ACCESS_FINE_LOCATION check was positive, but still got security exception on the location provider");
                }
            }
            if (location != null) {
                this.f4224a = location;
                str.hashCode();
                str.hashCode();
                switch (str) {
                    case "passive":
                        i = 4;
                        break;
                    case "gps":
                        this.b = 2;
                        return;
                    case "network":
                        i = 3;
                        break;
                    default:
                        this.b = 1;
                        return;
                }
                this.b = i;
            }
        }
    }

    public void a(s0 s0Var, Context context) {
        Location location = this.f4224a;
        if (location != null) {
            s0Var.a(location, this.b);
        }
    }

    public void a(boolean z) {
        this.c = z;
    }

    public void b(Context context) {
    }
}
