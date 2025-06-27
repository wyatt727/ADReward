package com.facebook.ads.redexgen.uinode;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;

/* JADX WARN: Unexpected interfaces in signature: [kotlin.jvm.internal.markers.KMappedMarker] */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\b\b'\u0018\u0000 \u001c*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0004\u001c\u001d\u001e\u001fB\u0007\b\u0004¢\u0006\u0002\u0010\u0004J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0096\u0002J\u0016\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u0006H¦\u0002¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0006H\u0016J\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0013J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0096\u0002J\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0013J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0016R\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006 "}, d2 = {"Lkotlin/collections/AbstractList;", "E", "Lkotlin/collections/AbstractCollection;", "", "()V", "size", "", "getSize", "()I", "equals", "", "other", "", "get", FirebaseAnalytics.Param.INDEX, "(I)Ljava/lang/Object;", "hashCode", "indexOf", "element", "(Ljava/lang/Object;)I", "iterator", "", "lastIndexOf", "listIterator", "", "subList", "fromIndex", "toIndex", "Companion", "IteratorImpl", "ListIteratorImpl", "SubList", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.facebook.ads.redexgen.X.6u, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC05256u<E> extends H0<E> implements List<E> {
    public static byte[] A00;
    public static String[] A01 = {"8MJW7qL63X9", "G9aG2oIn1Y4", "HqPOsgzYagb9l4J9VzVkZ8o4DQz4V9lO", "xJmplYEd", "tRQ4jDSCys0NBNjWiBDDhKLDNc3mQFOg", "4p2K0RIvYgiFEE4cJyGXuzJhjREv5DiA", "7kO1qpo2YPdStit", "T7n9PzVqaAEs33V"};
    public static final C1367c1 A02;

    public static String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A01[4].charAt(17) != 'B') {
                throw new RuntimeException();
            }
            A01[5] = "g090LmixS2shdtXN00k1fUpYmTec5Rl3";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 118);
            i4++;
        }
    }

    public static void A07() {
        byte[] bArr = {-21, 12, 1, 14, -3, 16, 5, 11, 10, -68, 5, 15, -68, 10, 11, 16, -68, 15, 17, 12, 12, 11, 14, 16, 1, 0, -68, 2, 11, 14, -68, 14, 1, -3, 0, -55, 11, 10, 8, 21, -68, -1, 11, 8, 8, 1, -1, 16, 5, 11, 10};
        if (A01[3].length() == 24) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[0] = "JUfY89Gw2s4";
        strArr[1] = "2A8vB3DQCih";
        A00 = bArr;
    }

    @Override // java.util.List
    public final void add(int i, E e) {
        throw new UnsupportedOperationException(A06(0, 51, 38));
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException(A06(0, 51, 38));
    }

    public abstract E get(int index);

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public int indexOf(E element) {
        int i = 0;
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (C1361bu.A0A(it.next(), element)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public int lastIndexOf(E element) {
        AbstractC05256u<E> abstractC05256u = this;
        ListIterator<E> listIterator = abstractC05256u.listIterator(abstractC05256u.size());
        while (listIterator.hasPrevious()) {
            if (C1361bu.A0A(listIterator.previous(), element)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final E remove(int i) {
        throw new UnsupportedOperationException(A06(0, 51, 38));
    }

    @Override // java.util.List
    public final E set(int i, E e) {
        throw new UnsupportedOperationException(A06(0, 51, 38));
    }

    static {
        A07();
        A02 = new C1367c1(null);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (other instanceof List) {
            return A02.A06(this, (Collection) other);
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        return A02.A02(this);
    }

    @Override // com.facebook.ads.redexgen.uinode.H0, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new C0761Gx(this);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return new C05266v(this, 0);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int index) {
        return new C05266v(this, index);
    }

    @Override // java.util.List
    public final List<E> subList(int fromIndex, int toIndex) {
        return new C3N(this, fromIndex, toIndex);
    }
}
