package com.google.android.gms.internal.ads;

import com.json.t2;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public class zzhig implements Iterator, Closeable, zzasd {
    private static final zzasc zza = new zzhif("eof ");
    private static final zzhin zzb = zzhin.zzb(zzhig.class);
    protected zzarz zzc;
    protected zzhih zzd;
    zzasc zze = null;
    long zzf = 0;
    long zzg = 0;
    private final List zzh = new ArrayList();

    public void close() throws IOException {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zzasc zzascVar = this.zze;
        if (zzascVar == zza) {
            return false;
        }
        if (zzascVar != null) {
            return true;
        }
        try {
            this.zze = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.zze = zza;
            return false;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(t2.i.d);
        for (int i = 0; i < this.zzh.size(); i++) {
            if (i > 0) {
                sb.append(";");
            }
            sb.append(((zzasc) this.zzh.get(i)).toString());
        }
        sb.append(t2.i.e);
        return sb.toString();
    }

    @Override // java.util.Iterator
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzasc next() {
        zzasc zzascVarZzb;
        zzasc zzascVar = this.zze;
        if (zzascVar != null && zzascVar != zza) {
            this.zze = null;
            return zzascVar;
        }
        zzhih zzhihVar = this.zzd;
        if (zzhihVar == null || this.zzf >= this.zzg) {
            this.zze = zza;
            throw new NoSuchElementException();
        }
        try {
            synchronized (zzhihVar) {
                this.zzd.zze(this.zzf);
                zzascVarZzb = this.zzc.zzb(this.zzd, this);
                this.zzf = this.zzd.zzb();
            }
            return zzascVarZzb;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }

    public final List zze() {
        return (this.zzd == null || this.zze == zza) ? this.zzh : new zzhim(this.zzh, this);
    }

    public final void zzf(zzhih zzhihVar, long j, zzarz zzarzVar) throws IOException {
        this.zzd = zzhihVar;
        this.zzf = zzhihVar.zzb();
        zzhihVar.zze(zzhihVar.zzb() + j);
        this.zzg = zzhihVar.zzb();
        this.zzc = zzarzVar;
    }
}
