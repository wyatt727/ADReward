package com.applovin.impl.sdk;

import android.location.Location;
import android.location.LocationManager;
import android.provider.Settings;
import com.applovin.impl.oj;
import com.applovin.impl.x3;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    private final k f981a;
    private final LocationManager b = (LocationManager) k.k().getSystemService(FirebaseAnalytics.Param.LOCATION);
    private double c;
    private double d;
    private long e;

    s(k kVar) {
        this.f981a = kVar;
    }

    private boolean f() {
        long millis = TimeUnit.MINUTES.toMillis(((Long) this.f981a.a(oj.J4)).longValue());
        if (this.e != 0 && System.currentTimeMillis() - this.e < millis) {
            return false;
        }
        Location locationA = a("gps", "android.permission.ACCESS_FINE_LOCATION");
        if (locationA == null) {
            locationA = a("network", "android.permission.ACCESS_COARSE_LOCATION");
        }
        if (locationA == null) {
            return false;
        }
        this.c = locationA.getLatitude();
        this.d = locationA.getLongitude();
        this.e = System.currentTimeMillis();
        return true;
    }

    public double a() {
        return this.c;
    }

    public double b() {
        return this.d;
    }

    public boolean c() {
        return x3.a("android.permission.ACCESS_COARSE_LOCATION", k.k());
    }

    public boolean d() {
        if (this.f981a.g0().isLocationCollectionEnabled() && ((Boolean) this.f981a.a(oj.I4)).booleanValue() && c()) {
            return f() || this.e != 0;
        }
        return false;
    }

    public boolean e() {
        return x3.j() ? this.b.isLocationEnabled() : (x3.e() && Settings.Secure.getInt(k.k().getContentResolver(), "location_mode", 0) == 0) ? false : true;
    }

    private Location a(String str, String str2) {
        if (!x3.a(str2, k.k())) {
            return null;
        }
        try {
            return this.b.getLastKnownLocation(str);
        } catch (IllegalArgumentException e) {
            this.f981a.L();
            if (t.a()) {
                this.f981a.L().a("LocationManager", "Failed to retrieve location from " + str + ": device does not support this location provider.", e);
            }
            return null;
        } catch (NullPointerException e2) {
            this.f981a.L();
            if (t.a()) {
                this.f981a.L().a("LocationManager", "Failed to retrieve location from " + str + ": location provider is not available.", e2);
            }
            return null;
        } catch (SecurityException e3) {
            this.f981a.L();
            if (t.a()) {
                this.f981a.L().a("LocationManager", "Failed to retrieve location from " + str + ": access denied.", e3);
            }
            return null;
        } catch (Throwable th) {
            this.f981a.L();
            if (t.a()) {
                this.f981a.L().a("LocationManager", "Failed to retrieve location from " + str + ".", th);
            }
            return null;
        }
    }
}
