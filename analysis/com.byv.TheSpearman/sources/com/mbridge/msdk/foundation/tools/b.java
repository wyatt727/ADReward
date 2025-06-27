package com.mbridge.msdk.foundation.tools;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: AdvertisingIdClient.java */
/* loaded from: classes4.dex */
public final class b {
    public final a a(Context context) throws Exception {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            ServiceConnectionC0272b serviceConnectionC0272b = new ServiceConnectionC0272b();
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            if (context.bindService(intent, serviceConnectionC0272b, 1)) {
                try {
                    try {
                        c cVar = new c(serviceConnectionC0272b.a());
                        return new a(cVar.a(), cVar.a(true));
                    } catch (Exception e) {
                        throw e;
                    }
                } finally {
                    context.unbindService(serviceConnectionC0272b);
                }
            }
            throw new IOException("Google Play connection failed");
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* compiled from: AdvertisingIdClient.java */
    public final class a {
        private final String b;
        private final boolean c;

        a(String str, boolean z) {
            this.b = str;
            this.c = z;
        }

        public final String a() {
            return this.b;
        }

        public final boolean b() {
            return this.c;
        }
    }

    /* compiled from: AdvertisingIdClient.java */
    /* renamed from: com.mbridge.msdk.foundation.tools.b$b, reason: collision with other inner class name */
    private final class ServiceConnectionC0272b implements ServiceConnection {

        /* renamed from: a, reason: collision with root package name */
        boolean f2983a;
        private final LinkedBlockingQueue<IBinder> c;

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }

        private ServiceConnectionC0272b() {
            this.c = new LinkedBlockingQueue<>(1);
            this.f2983a = false;
        }

        public final IBinder a() throws InterruptedException {
            if (this.f2983a) {
                throw new IllegalStateException();
            }
            this.f2983a = true;
            return this.c.take();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) throws InterruptedException {
            try {
                this.c.put(iBinder);
            } catch (InterruptedException e) {
                ad.b("AdvertisingIdClient", e.getMessage());
            }
        }
    }

    /* compiled from: AdvertisingIdClient.java */
    private final class c implements IInterface {
        private IBinder b;

        public c(IBinder iBinder) {
            this.b = iBinder;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.b;
        }

        public final String a() throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.b.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } catch (Throwable th) {
                try {
                    ad.b("AdvertisingIdClient", th.getMessage());
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public final boolean a(boolean z) throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            boolean z2 = false;
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                parcelObtain.writeInt(z ? 1 : 0);
                this.b.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                if (parcelObtain2.readInt() != 0) {
                    z2 = true;
                }
            } finally {
                try {
                    return z2;
                } finally {
                }
            }
            return z2;
        }
    }
}
