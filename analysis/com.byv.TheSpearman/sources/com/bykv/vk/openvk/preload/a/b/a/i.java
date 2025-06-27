package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.r;
import com.bykv.vk.openvk.preload.a.t;
import com.bykv.vk.openvk.preload.a.u;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ReflectiveTypeAdapterFactory.java */
/* loaded from: classes.dex */
public final class i implements u {

    /* renamed from: a, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.a.b.c f1300a;
    private final com.bykv.vk.openvk.preload.a.e b;
    private final com.bykv.vk.openvk.preload.a.b.d c;
    private final d d;
    private final com.bykv.vk.openvk.preload.a.b.b.b e = com.bykv.vk.openvk.preload.a.b.b.b.a();

    public i(com.bykv.vk.openvk.preload.a.b.c cVar, com.bykv.vk.openvk.preload.a.e eVar, com.bykv.vk.openvk.preload.a.b.d dVar, d dVar2) {
        this.f1300a = cVar;
        this.b = eVar;
        this.c = dVar;
        this.d = dVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023 A[EDGE_INSN: B:12:0x0023->B:52:0x00af BREAK  A[LOOP:0: B:46:0x009a->B:57:?]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b1 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(java.lang.reflect.Field r9, boolean r10) {
        /*
            r8 = this;
            com.bykv.vk.openvk.preload.a.b.d r0 = r8.c
            java.lang.Class r1 = r9.getType()
            boolean r1 = r0.a(r1)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L17
            boolean r1 = r0.a(r10)
            if (r1 == 0) goto L15
            goto L17
        L15:
            r1 = r2
            goto L18
        L17:
            r1 = r3
        L18:
            if (r1 != 0) goto Lb2
            int r1 = r0.c
            int r4 = r9.getModifiers()
            r1 = r1 & r4
            if (r1 == 0) goto L26
        L23:
            r9 = r3
            goto Laf
        L26:
            double r4 = r0.b
            r6 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L45
            java.lang.Class<com.bykv.vk.openvk.preload.a.a.d> r1 = com.bykv.vk.openvk.preload.a.a.d.class
            java.lang.annotation.Annotation r1 = r9.getAnnotation(r1)
            com.bykv.vk.openvk.preload.a.a.d r1 = (com.bykv.vk.openvk.preload.a.a.d) r1
            java.lang.Class<com.bykv.vk.openvk.preload.a.a.e> r4 = com.bykv.vk.openvk.preload.a.a.e.class
            java.lang.annotation.Annotation r4 = r9.getAnnotation(r4)
            com.bykv.vk.openvk.preload.a.a.e r4 = (com.bykv.vk.openvk.preload.a.a.e) r4
            boolean r1 = r0.a(r1, r4)
            if (r1 != 0) goto L45
            goto L23
        L45:
            boolean r1 = r9.isSynthetic()
            if (r1 == 0) goto L4c
            goto L23
        L4c:
            boolean r1 = r0.e
            if (r1 == 0) goto L6a
            java.lang.Class<com.bykv.vk.openvk.preload.a.a.a> r1 = com.bykv.vk.openvk.preload.a.a.a.class
            java.lang.annotation.Annotation r1 = r9.getAnnotation(r1)
            com.bykv.vk.openvk.preload.a.a.a r1 = (com.bykv.vk.openvk.preload.a.a.a) r1
            if (r1 == 0) goto L23
            if (r10 == 0) goto L63
            boolean r1 = r1.a()
            if (r1 != 0) goto L6a
            goto L69
        L63:
            boolean r1 = r1.b()
            if (r1 != 0) goto L6a
        L69:
            goto L23
        L6a:
            boolean r1 = r0.d
            if (r1 != 0) goto L79
            java.lang.Class r1 = r9.getType()
            boolean r1 = com.bykv.vk.openvk.preload.a.b.d.c(r1)
            if (r1 == 0) goto L79
            goto L23
        L79:
            java.lang.Class r1 = r9.getType()
            boolean r1 = com.bykv.vk.openvk.preload.a.b.d.b(r1)
            if (r1 == 0) goto L84
            goto L23
        L84:
            if (r10 == 0) goto L89
            java.util.List<com.bykv.vk.openvk.preload.a.b> r10 = r0.f
            goto L8b
        L89:
            java.util.List<com.bykv.vk.openvk.preload.a.b> r10 = r0.g
        L8b:
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto Lae
            com.bykv.vk.openvk.preload.a.c r0 = new com.bykv.vk.openvk.preload.a.c
            r0.<init>(r9)
            java.util.Iterator r9 = r10.iterator()
        L9a:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto Lae
            java.lang.Object r10 = r9.next()
            com.bykv.vk.openvk.preload.a.b r10 = (com.bykv.vk.openvk.preload.a.b) r10
            boolean r10 = r10.a()
            if (r10 == 0) goto L9a
            goto L23
        Lae:
            r9 = r2
        Laf:
            if (r9 != 0) goto Lb2
            return r3
        Lb2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.preload.a.b.a.i.a(java.lang.reflect.Field, boolean):boolean");
    }

    private List<String> a(Field field) {
        com.bykv.vk.openvk.preload.a.a.c cVar = (com.bykv.vk.openvk.preload.a.a.c) field.getAnnotation(com.bykv.vk.openvk.preload.a.a.c.class);
        if (cVar == null) {
            return Collections.singletonList(this.b.a(field));
        }
        String strA = cVar.a();
        String[] strArrB = cVar.b();
        if (strArrB.length == 0) {
            return Collections.singletonList(strA);
        }
        ArrayList arrayList = new ArrayList(strArrB.length + 1);
        arrayList.add(strA);
        for (String str : strArrB) {
            arrayList.add(str);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    private Map<String, b> a(final com.bykv.vk.openvk.preload.a.f fVar, com.bykv.vk.openvk.preload.a.c.a<?> aVar, Class<?> cls) {
        com.bykv.vk.openvk.preload.a.c.a<?> aVar2;
        int i;
        boolean z;
        int i2;
        Field[] fieldArr;
        Class<?> cls2;
        Type type;
        i iVar = this;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type type2 = aVar.c;
        Class<?> cls3 = cls;
        com.bykv.vk.openvk.preload.a.c.a<?> aVarA = aVar;
        while (cls3 != Object.class) {
            Field[] declaredFields = cls3.getDeclaredFields();
            int length = declaredFields.length;
            boolean z2 = false;
            int i3 = 0;
            while (i3 < length) {
                final Field field = declaredFields[i3];
                boolean zA = iVar.a(field, true);
                boolean zA2 = iVar.a(field, z2);
                if (zA || zA2) {
                    iVar.e.a(field);
                    Type typeA = com.bykv.vk.openvk.preload.a.b.b.a(aVarA.c, cls3, field.getGenericType());
                    List<String> listA = iVar.a(field);
                    int size = listA.size();
                    ?? r1 = z2;
                    aVar2 = aVarA;
                    b bVar = null;
                    while (r1 < size) {
                        Type type3 = type2;
                        String str = listA.get(r1);
                        boolean z3 = r1 != 0 ? z2 : zA;
                        final com.bykv.vk.openvk.preload.a.c.a<?> aVarA2 = com.bykv.vk.openvk.preload.a.c.a.a(typeA);
                        Class<? super Object> cls4 = aVarA2.b;
                        boolean z4 = (cls4 instanceof Class) && cls4.isPrimitive();
                        com.bykv.vk.openvk.preload.a.a.b bVar2 = (com.bykv.vk.openvk.preload.a.a.b) field.getAnnotation(com.bykv.vk.openvk.preload.a.a.b.class);
                        t<?> tVarA = bVar2 != null ? d.a(iVar.f1300a, fVar, aVarA2, bVar2) : null;
                        boolean z5 = tVarA != null;
                        if (tVarA == null) {
                            tVarA = fVar.a((com.bykv.vk.openvk.preload.a.c.a) aVarA2);
                        }
                        final t<?> tVar = tVarA;
                        int i4 = r1;
                        int i5 = size;
                        List<String> list = listA;
                        Field field2 = field;
                        int i6 = i3;
                        final boolean z6 = z5;
                        int i7 = length;
                        Field[] fieldArr2 = declaredFields;
                        Class<?> cls5 = cls3;
                        final boolean z7 = z4;
                        b bVar3 = (b) linkedHashMap.put(str, new b(str, z3, zA2) { // from class: com.bykv.vk.openvk.preload.a.b.a.i.1
                            @Override // com.bykv.vk.openvk.preload.a.b.a.i.b
                            final void a(com.bykv.vk.openvk.preload.a.d.c cVar, Object obj) throws IllegalAccessException, IOException, IllegalArgumentException {
                                (z6 ? tVar : new m(fVar, tVar, aVarA2.c)).a(cVar, field.get(obj));
                            }

                            @Override // com.bykv.vk.openvk.preload.a.b.a.i.b
                            final void a(com.bykv.vk.openvk.preload.a.d.a aVar3, Object obj) throws IllegalAccessException, IOException, IllegalArgumentException {
                                Object objA = tVar.a(aVar3);
                                if (objA == null && z7) {
                                    return;
                                }
                                field.set(obj, objA);
                            }

                            @Override // com.bykv.vk.openvk.preload.a.b.a.i.b
                            public final boolean a(Object obj) throws IllegalAccessException, IOException {
                                return this.i && field.get(obj) != obj;
                            }
                        });
                        if (bVar == null) {
                            bVar = bVar3;
                        }
                        iVar = this;
                        cls3 = cls5;
                        zA = z3;
                        type2 = type3;
                        z2 = false;
                        length = i7;
                        size = i5;
                        listA = list;
                        field = field2;
                        i3 = i6;
                        declaredFields = fieldArr2;
                        r1 = i4 + 1;
                    }
                    i = i3;
                    z = z2;
                    i2 = length;
                    fieldArr = declaredFields;
                    cls2 = cls3;
                    type = type2;
                    if (bVar != null) {
                        throw new IllegalArgumentException(type + " declares multiple JSON fields named " + bVar.h);
                    }
                } else {
                    i = i3;
                    z = z2;
                    i2 = length;
                    fieldArr = declaredFields;
                    cls2 = cls3;
                    type = type2;
                    aVar2 = aVarA;
                }
                i3 = i + 1;
                iVar = this;
                aVarA = aVar2;
                cls3 = cls2;
                type2 = type;
                z2 = z;
                length = i2;
                declaredFields = fieldArr;
            }
            Class<?> cls6 = cls3;
            aVarA = com.bykv.vk.openvk.preload.a.c.a.a(com.bykv.vk.openvk.preload.a.b.b.a(aVarA.c, cls6, cls6.getGenericSuperclass()));
            cls3 = aVarA.b;
            iVar = this;
        }
        return linkedHashMap;
    }

    /* compiled from: ReflectiveTypeAdapterFactory.java */
    static abstract class b {
        final String h;
        final boolean i;
        final boolean j;

        abstract void a(com.bykv.vk.openvk.preload.a.d.a aVar, Object obj) throws IllegalAccessException, IOException;

        abstract void a(com.bykv.vk.openvk.preload.a.d.c cVar, Object obj) throws IllegalAccessException, IOException;

        abstract boolean a(Object obj) throws IllegalAccessException, IOException;

        protected b(String str, boolean z, boolean z2) {
            this.h = str;
            this.i = z;
            this.j = z2;
        }
    }

    /* compiled from: ReflectiveTypeAdapterFactory.java */
    public static final class a<T> extends t<T> {

        /* renamed from: a, reason: collision with root package name */
        private final com.bykv.vk.openvk.preload.a.b.i<T> f1302a;
        private final Map<String, b> b;

        a(com.bykv.vk.openvk.preload.a.b.i<T> iVar, Map<String, b> map) {
            this.f1302a = iVar;
            this.b = map;
        }

        @Override // com.bykv.vk.openvk.preload.a.t
        public final T a(com.bykv.vk.openvk.preload.a.d.a aVar) throws IOException {
            if (aVar.f() == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                aVar.k();
                return null;
            }
            T tA = this.f1302a.a();
            try {
                aVar.c();
                while (aVar.e()) {
                    b bVar = this.b.get(aVar.h());
                    if (bVar == null || !bVar.j) {
                        aVar.o();
                    } else {
                        bVar.a(aVar, tA);
                    }
                }
                aVar.d();
                return tA;
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (IllegalStateException e2) {
                throw new r(e2);
            }
        }

        @Override // com.bykv.vk.openvk.preload.a.t
        public final void a(com.bykv.vk.openvk.preload.a.d.c cVar, T t) throws IOException {
            if (t == null) {
                cVar.e();
                return;
            }
            cVar.c();
            try {
                for (b bVar : this.b.values()) {
                    if (bVar.a(t)) {
                        cVar.a(bVar.h);
                        bVar.a(cVar, t);
                    }
                }
                cVar.d();
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.u
    public final <T> t<T> a(com.bykv.vk.openvk.preload.a.f fVar, com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
        Class<? super T> cls = aVar.b;
        if (Object.class.isAssignableFrom(cls)) {
            return new a(this.f1300a.a(aVar), a(fVar, aVar, cls));
        }
        return null;
    }
}
