package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.impl.gk;
import com.applovin.impl.qd;
import com.applovin.impl.we;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public final class gk implements we.b {
    public static final Parcelable.Creator<gk> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final List f463a;

    @Override // com.applovin.impl.we.b
    public /* synthetic */ void a(qd.b bVar) {
        we.b.CC.$default$a(this, bVar);
    }

    @Override // com.applovin.impl.we.b
    public /* synthetic */ byte[] a() {
        return we.b.CC.$default$a(this);
    }

    @Override // com.applovin.impl.we.b
    public /* synthetic */ d9 b() {
        return we.b.CC.$default$b(this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "SlowMotion: segments=" + this.f463a;
    }

    public static final class b implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        public final long f464a;
        public final long b;
        public final int c;
        public static final Comparator d = new Comparator() { // from class: com.applovin.impl.gk$b$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return gk.b.a((gk.b) obj, (gk.b) obj2);
            }
        };
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int a(b bVar, b bVar2) {
            return w3.e().a(bVar.f464a, bVar2.f464a).a(bVar.b, bVar2.b).a(bVar.c, bVar2.c).d();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public b(long j, long j2, int i) {
            a1.a(j < j2);
            this.f464a = j;
            this.b = j2;
            this.c = i;
        }

        public String toString() {
            return yp.a("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f464a), Long.valueOf(this.b), Integer.valueOf(this.c));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f464a == bVar.f464a && this.b == bVar.b && this.c == bVar.c;
        }

        public int hashCode() {
            return Objects.hashCode(Long.valueOf(this.f464a), Long.valueOf(this.b), Integer.valueOf(this.c));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f464a);
            parcel.writeLong(this.b);
            parcel.writeInt(this.c);
        }

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i) {
                return new b[i];
            }
        }
    }

    public gk(List list) {
        this.f463a = list;
        a1.a(!a(list));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gk.class != obj.getClass()) {
            return false;
        }
        return this.f463a.equals(((gk) obj).f463a);
    }

    public int hashCode() {
        return this.f463a.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f463a);
    }

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public gk createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, b.class.getClassLoader());
            return new gk(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public gk[] newArray(int i) {
            return new gk[i];
        }
    }

    private static boolean a(List list) {
        if (list.isEmpty()) {
            return false;
        }
        long j = ((b) list.get(0)).b;
        for (int i = 1; i < list.size(); i++) {
            if (((b) list.get(i)).f464a < j) {
                return true;
            }
            j = ((b) list.get(i)).b;
        }
        return false;
    }
}
