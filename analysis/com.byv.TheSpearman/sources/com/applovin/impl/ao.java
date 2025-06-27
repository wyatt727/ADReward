package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.qd;
import com.json.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class ao extends ua {
    public static final Parcelable.Creator<ao> CREATOR = new a();
    public final String b;
    public final String c;

    @Override // com.applovin.impl.ua
    public String toString() {
        return this.f1060a + ": description=" + this.b + ": value=" + this.c;
    }

    ao(Parcel parcel) {
        super((String) yp.a((Object) parcel.readString()));
        this.b = parcel.readString();
        this.c = (String) yp.a((Object) parcel.readString());
    }

    public ao(String str, String str2, String str3) {
        super(str);
        this.b = str2;
        this.c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ao.class != obj.getClass()) {
            return false;
        }
        ao aoVar = (ao) obj;
        return yp.a((Object) this.f1060a, (Object) aoVar.f1060a) && yp.a((Object) this.b, (Object) aoVar.b) && yp.a((Object) this.c, (Object) aoVar.c);
    }

    public int hashCode() {
        int iHashCode = (this.f1060a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1060a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ao[] newArray(int i) {
            return new ao[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ao createFromParcel(Parcel parcel) {
            return new ao(parcel);
        }
    }

    private static List a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.applovin.impl.ua, com.applovin.impl.we.b
    public void a(qd.b bVar) throws NumberFormatException {
        String str = this.f1060a;
        str.hashCode();
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c = 0;
                    break;
                }
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c = 1;
                    break;
                }
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c = 2;
                    break;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c = 3;
                    break;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c = 4;
                    break;
                }
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c = 5;
                    break;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c = 6;
                    break;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c = 7;
                    break;
                }
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c = '\b';
                    break;
                }
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c = '\t';
                    break;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c = '\n';
                    break;
                }
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c = 11;
                    break;
                }
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c = '\f';
                    break;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c = '\r';
                    break;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c = 14;
                    break;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c = 15;
                    break;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c = 16;
                    break;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c = 17;
                    break;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c = 18;
                    break;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c = 19;
                    break;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c = 20;
                    break;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c = 21;
                    break;
                }
                break;
        }
        try {
            switch (c) {
                case 0:
                case '\n':
                    bVar.b(this.c);
                    break;
                case 1:
                case 11:
                    bVar.e(this.c);
                    break;
                case 2:
                case '\f':
                    bVar.d(Integer.valueOf(Integer.parseInt(this.c.substring(2, 4)))).c(Integer.valueOf(Integer.parseInt(this.c.substring(0, 2))));
                    break;
                case 3:
                case 17:
                    bVar.c(this.c);
                    break;
                case 4:
                case 18:
                    bVar.a(this.c);
                    break;
                case 5:
                case 19:
                    bVar.f(this.c);
                    break;
                case 6:
                case 20:
                    String[] strArrA = yp.a(this.c, "/");
                    bVar.k(Integer.valueOf(Integer.parseInt(strArrA[0]))).j(strArrA.length > 1 ? Integer.valueOf(Integer.parseInt(strArrA[1])) : null);
                    break;
                case 7:
                case 16:
                    bVar.k(this.c);
                    break;
                case '\b':
                case 15:
                    bVar.l(this.c);
                    break;
                case '\t':
                case 21:
                    bVar.e(Integer.valueOf(Integer.parseInt(this.c)));
                    break;
                case '\r':
                    List listA = a(this.c);
                    int size = listA.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                bVar.c((Integer) listA.get(2));
                            }
                        }
                        bVar.d((Integer) listA.get(1));
                    }
                    bVar.e((Integer) listA.get(0));
                    break;
                case 14:
                    List listA2 = a(this.c);
                    int size2 = listA2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                bVar.f((Integer) listA2.get(2));
                            }
                        }
                        bVar.g((Integer) listA2.get(1));
                    }
                    bVar.h((Integer) listA2.get(0));
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }
}
