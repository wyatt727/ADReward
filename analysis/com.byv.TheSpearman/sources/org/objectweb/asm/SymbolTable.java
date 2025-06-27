package org.objectweb.asm;

/* loaded from: classes5.dex */
final class SymbolTable {
    private int bootstrapMethodCount;
    private ByteVector bootstrapMethods;
    private String className;
    final ClassWriter classWriter;
    private ByteVector constantPool;
    private int constantPoolCount;
    private Entry[] entries;
    private int entryCount;
    private int majorVersion;
    private final ClassReader sourceClassReader;
    private int typeCount;
    private Entry[] typeTable;

    private static int hash(int i, int i2) {
        return (i + i2) & Integer.MAX_VALUE;
    }

    private static int hash(int i, long j) {
        return (i + ((int) j) + ((int) (j >>> 32))) & Integer.MAX_VALUE;
    }

    SymbolTable(ClassWriter classWriter) {
        this.classWriter = classWriter;
        this.sourceClassReader = null;
        this.entries = new Entry[256];
        this.constantPoolCount = 1;
        this.constantPool = new ByteVector();
    }

    SymbolTable(ClassWriter classWriter, ClassReader classReader) {
        this.classWriter = classWriter;
        this.sourceClassReader = classReader;
        byte[] bArr = classReader.classFileBuffer;
        int item = classReader.getItem(1) - 1;
        int i = classReader.header - item;
        this.constantPoolCount = classReader.getItemCount();
        ByteVector byteVector = new ByteVector(i);
        this.constantPool = byteVector;
        byteVector.putByteArray(bArr, item, i);
        this.entries = new Entry[this.constantPoolCount * 2];
        char[] cArr = new char[classReader.getMaxStringLength()];
        boolean z = false;
        int i2 = 1;
        while (i2 < this.constantPoolCount) {
            int item2 = classReader.getItem(i2);
            byte b = bArr[item2 - 1];
            switch (b) {
                case 1:
                    addConstantUtf8(i2, classReader.readUtf(i2, cArr));
                    break;
                case 2:
                case 13:
                case 14:
                default:
                    throw new IllegalArgumentException();
                case 3:
                case 4:
                    addConstantIntegerOrFloat(i2, b, classReader.readInt(item2));
                    break;
                case 5:
                case 6:
                    addConstantLongOrDouble(i2, b, classReader.readLong(item2));
                    break;
                case 7:
                case 8:
                case 16:
                case 19:
                case 20:
                    addConstantUtf8Reference(i2, b, classReader.readUTF8(item2, cArr));
                    break;
                case 9:
                case 10:
                case 11:
                    int item3 = classReader.getItem(classReader.readUnsignedShort(item2 + 2));
                    addConstantMemberReference(i2, b, classReader.readClass(item2, cArr), classReader.readUTF8(item3, cArr), classReader.readUTF8(item3 + 2, cArr));
                    break;
                case 12:
                    addConstantNameAndType(i2, classReader.readUTF8(item2, cArr), classReader.readUTF8(item2 + 2, cArr));
                    break;
                case 15:
                    int item4 = classReader.getItem(classReader.readUnsignedShort(item2 + 1));
                    int item5 = classReader.getItem(classReader.readUnsignedShort(item4 + 2));
                    addConstantMethodHandle(i2, classReader.readByte(item2), classReader.readClass(item4, cArr), classReader.readUTF8(item5, cArr), classReader.readUTF8(item5 + 2, cArr));
                    break;
                case 17:
                case 18:
                    int item6 = classReader.getItem(classReader.readUnsignedShort(item2 + 2));
                    addConstantDynamicOrInvokeDynamicReference(b, i2, classReader.readUTF8(item6, cArr), classReader.readUTF8(item6 + 2, cArr), classReader.readUnsignedShort(item2));
                    z = true;
                    break;
            }
            i2 += (b == 5 || b == 6) ? 2 : 1;
        }
        if (z) {
            copyBootstrapMethods(classReader, cArr);
        }
    }

    private void copyBootstrapMethods(ClassReader classReader, char[] cArr) {
        byte[] bArr = classReader.classFileBuffer;
        int firstAttributeOffset = classReader.getFirstAttributeOffset();
        int unsignedShort = classReader.readUnsignedShort(firstAttributeOffset - 2);
        while (true) {
            if (unsignedShort <= 0) {
                break;
            }
            if ("BootstrapMethods".equals(classReader.readUTF8(firstAttributeOffset, cArr))) {
                this.bootstrapMethodCount = classReader.readUnsignedShort(firstAttributeOffset + 6);
                break;
            } else {
                firstAttributeOffset += classReader.readInt(firstAttributeOffset + 2) + 6;
                unsignedShort--;
            }
        }
        if (this.bootstrapMethodCount > 0) {
            int i = firstAttributeOffset + 8;
            int i2 = classReader.readInt(firstAttributeOffset + 2) - 2;
            ByteVector byteVector = new ByteVector(i2);
            this.bootstrapMethods = byteVector;
            byteVector.putByteArray(bArr, i, i2);
            int i3 = i;
            for (int i4 = 0; i4 < this.bootstrapMethodCount; i4++) {
                int i5 = i3 - i;
                int unsignedShort2 = classReader.readUnsignedShort(i3);
                int i6 = i3 + 2;
                int unsignedShort3 = classReader.readUnsignedShort(i6);
                i3 = i6 + 2;
                int iHashCode = classReader.readConst(unsignedShort2, cArr).hashCode();
                while (true) {
                    int i7 = unsignedShort3 - 1;
                    if (unsignedShort3 > 0) {
                        int unsignedShort4 = classReader.readUnsignedShort(i3);
                        i3 += 2;
                        iHashCode ^= classReader.readConst(unsignedShort4, cArr).hashCode();
                        unsignedShort3 = i7;
                    }
                }
                add(new Entry(i4, 64, i5, iHashCode & Integer.MAX_VALUE));
            }
        }
    }

    ClassReader getSource() {
        return this.sourceClassReader;
    }

    int getMajorVersion() {
        return this.majorVersion;
    }

    String getClassName() {
        return this.className;
    }

    int setMajorVersionAndClassName(int i, String str) {
        this.majorVersion = i;
        this.className = str;
        return addConstantClass(str).index;
    }

    int getConstantPoolCount() {
        return this.constantPoolCount;
    }

    int getConstantPoolLength() {
        return this.constantPool.length;
    }

    void putConstantPool(ByteVector byteVector) {
        byteVector.putShort(this.constantPoolCount).putByteArray(this.constantPool.data, 0, this.constantPool.length);
    }

    int computeBootstrapMethodsSize() {
        if (this.bootstrapMethods == null) {
            return 0;
        }
        addConstantUtf8("BootstrapMethods");
        return this.bootstrapMethods.length + 8;
    }

    void putBootstrapMethods(ByteVector byteVector) {
        if (this.bootstrapMethods != null) {
            byteVector.putShort(addConstantUtf8("BootstrapMethods")).putInt(this.bootstrapMethods.length + 2).putShort(this.bootstrapMethodCount).putByteArray(this.bootstrapMethods.data, 0, this.bootstrapMethods.length);
        }
    }

    private Entry get(int i) {
        Entry[] entryArr = this.entries;
        return entryArr[i % entryArr.length];
    }

    private Entry put(Entry entry) {
        int i = this.entryCount;
        Entry[] entryArr = this.entries;
        if (i > (entryArr.length * 3) / 4) {
            int length = entryArr.length;
            int i2 = (length * 2) + 1;
            Entry[] entryArr2 = new Entry[i2];
            for (int i3 = length - 1; i3 >= 0; i3--) {
                Entry entry2 = this.entries[i3];
                while (entry2 != null) {
                    int i4 = entry2.hashCode % i2;
                    Entry entry3 = entry2.next;
                    entry2.next = entryArr2[i4];
                    entryArr2[i4] = entry2;
                    entry2 = entry3;
                }
            }
            this.entries = entryArr2;
        }
        this.entryCount++;
        int i5 = entry.hashCode;
        Entry[] entryArr3 = this.entries;
        int length2 = i5 % entryArr3.length;
        entry.next = entryArr3[length2];
        this.entries[length2] = entry;
        return entry;
    }

    private void add(Entry entry) {
        this.entryCount++;
        int i = entry.hashCode;
        Entry[] entryArr = this.entries;
        int length = i % entryArr.length;
        entry.next = entryArr[length];
        this.entries[length] = entry;
    }

    Symbol addConstant(Object obj) {
        if (obj instanceof Integer) {
            return addConstantInteger(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return addConstantInteger(((Byte) obj).intValue());
        }
        if (obj instanceof Character) {
            return addConstantInteger(((Character) obj).charValue());
        }
        if (obj instanceof Short) {
            return addConstantInteger(((Short) obj).intValue());
        }
        if (obj instanceof Boolean) {
            return addConstantInteger(((Boolean) obj).booleanValue() ? 1 : 0);
        }
        if (obj instanceof Float) {
            return addConstantFloat(((Float) obj).floatValue());
        }
        if (obj instanceof Long) {
            return addConstantLong(((Long) obj).longValue());
        }
        if (obj instanceof Double) {
            return addConstantDouble(((Double) obj).doubleValue());
        }
        if (obj instanceof String) {
            return addConstantString((String) obj);
        }
        if (obj instanceof Type) {
            Type type = (Type) obj;
            int sort = type.getSort();
            if (sort == 10) {
                return addConstantClass(type.getInternalName());
            }
            if (sort == 11) {
                return addConstantMethodType(type.getDescriptor());
            }
            return addConstantClass(type.getDescriptor());
        }
        if (obj instanceof Handle) {
            Handle handle = (Handle) obj;
            return addConstantMethodHandle(handle.getTag(), handle.getOwner(), handle.getName(), handle.getDesc(), handle.isInterface());
        }
        if (obj instanceof ConstantDynamic) {
            ConstantDynamic constantDynamic = (ConstantDynamic) obj;
            return addConstantDynamic(constantDynamic.getName(), constantDynamic.getDescriptor(), constantDynamic.getBootstrapMethod(), constantDynamic.getBootstrapMethodArgumentsUnsafe());
        }
        throw new IllegalArgumentException("value " + obj);
    }

    Symbol addConstantClass(String str) {
        return addConstantUtf8Reference(7, str);
    }

    Symbol addConstantFieldref(String str, String str2, String str3) {
        return addConstantMemberReference(9, str, str2, str3);
    }

    Symbol addConstantMethodref(String str, String str2, String str3, boolean z) {
        return addConstantMemberReference(z ? 11 : 10, str, str2, str3);
    }

    private Entry addConstantMemberReference(int i, String str, String str2, String str3) {
        int iHash = hash(i, str, str2, str3);
        for (Entry entry = get(iHash); entry != null; entry = entry.next) {
            if (entry.tag == i && entry.hashCode == iHash && entry.owner.equals(str) && entry.name.equals(str2) && entry.value.equals(str3)) {
                return entry;
            }
        }
        this.constantPool.put122(i, addConstantClass(str).index, addConstantNameAndType(str2, str3));
        int i2 = this.constantPoolCount;
        this.constantPoolCount = i2 + 1;
        return put(new Entry(i2, i, str, str2, str3, 0L, iHash));
    }

    private void addConstantMemberReference(int i, int i2, String str, String str2, String str3) {
        add(new Entry(i, i2, str, str2, str3, 0L, hash(i2, str, str2, str3)));
    }

    Symbol addConstantString(String str) {
        return addConstantUtf8Reference(8, str);
    }

    Symbol addConstantInteger(int i) {
        return addConstantIntegerOrFloat(3, i);
    }

    Symbol addConstantFloat(float f) {
        return addConstantIntegerOrFloat(4, Float.floatToRawIntBits(f));
    }

    private Symbol addConstantIntegerOrFloat(int i, int i2) {
        int iHash = hash(i, i2);
        for (Entry entry = get(iHash); entry != null; entry = entry.next) {
            if (entry.tag == i && entry.hashCode == iHash && entry.data == i2) {
                return entry;
            }
        }
        this.constantPool.putByte(i).putInt(i2);
        int i3 = this.constantPoolCount;
        this.constantPoolCount = i3 + 1;
        return put(new Entry(i3, i, i2, iHash));
    }

    private void addConstantIntegerOrFloat(int i, int i2, int i3) {
        add(new Entry(i, i2, i3, hash(i2, i3)));
    }

    Symbol addConstantLong(long j) {
        return addConstantLongOrDouble(5, j);
    }

    Symbol addConstantDouble(double d) {
        return addConstantLongOrDouble(6, Double.doubleToRawLongBits(d));
    }

    private Symbol addConstantLongOrDouble(int i, long j) {
        int iHash = hash(i, j);
        for (Entry entry = get(iHash); entry != null; entry = entry.next) {
            if (entry.tag == i && entry.hashCode == iHash && entry.data == j) {
                return entry;
            }
        }
        int i2 = this.constantPoolCount;
        this.constantPool.putByte(i).putLong(j);
        this.constantPoolCount += 2;
        return put(new Entry(i2, i, j, iHash));
    }

    private void addConstantLongOrDouble(int i, int i2, long j) {
        add(new Entry(i, i2, j, hash(i2, j)));
    }

    int addConstantNameAndType(String str, String str2) {
        int iHash = hash(12, str, str2);
        for (Entry entry = get(iHash); entry != null; entry = entry.next) {
            if (entry.tag == 12 && entry.hashCode == iHash && entry.name.equals(str) && entry.value.equals(str2)) {
                return entry.index;
            }
        }
        this.constantPool.put122(12, addConstantUtf8(str), addConstantUtf8(str2));
        int i = this.constantPoolCount;
        this.constantPoolCount = i + 1;
        return put(new Entry(i, 12, str, str2, iHash)).index;
    }

    private void addConstantNameAndType(int i, String str, String str2) {
        add(new Entry(i, 12, str, str2, hash(12, str, str2)));
    }

    int addConstantUtf8(String str) {
        int iHash = hash(1, str);
        for (Entry entry = get(iHash); entry != null; entry = entry.next) {
            if (entry.tag == 1 && entry.hashCode == iHash && entry.value.equals(str)) {
                return entry.index;
            }
        }
        this.constantPool.putByte(1).putUTF8(str);
        int i = this.constantPoolCount;
        this.constantPoolCount = i + 1;
        return put(new Entry(i, 1, str, iHash)).index;
    }

    private void addConstantUtf8(int i, String str) {
        add(new Entry(i, 1, str, hash(1, str)));
    }

    Symbol addConstantMethodHandle(int i, String str, String str2, String str3, boolean z) {
        int iHash = hash(15, str, str2, str3, i);
        for (Entry entry = get(iHash); entry != null; entry = entry.next) {
            if (entry.tag == 15 && entry.hashCode == iHash && entry.data == i && entry.owner.equals(str) && entry.name.equals(str2) && entry.value.equals(str3)) {
                return entry;
            }
        }
        if (i <= 4) {
            this.constantPool.put112(15, i, addConstantFieldref(str, str2, str3).index);
        } else {
            this.constantPool.put112(15, i, addConstantMethodref(str, str2, str3, z).index);
        }
        int i2 = this.constantPoolCount;
        this.constantPoolCount = i2 + 1;
        return put(new Entry(i2, 15, str, str2, str3, i, iHash));
    }

    private void addConstantMethodHandle(int i, int i2, String str, String str2, String str3) {
        add(new Entry(i, 15, str, str2, str3, i2, hash(15, str, str2, str3, i2)));
    }

    Symbol addConstantMethodType(String str) {
        return addConstantUtf8Reference(16, str);
    }

    Symbol addConstantDynamic(String str, String str2, Handle handle, Object... objArr) {
        return addConstantDynamicOrInvokeDynamicReference(17, str, str2, addBootstrapMethod(handle, objArr).index);
    }

    Symbol addConstantInvokeDynamic(String str, String str2, Handle handle, Object... objArr) {
        return addConstantDynamicOrInvokeDynamicReference(18, str, str2, addBootstrapMethod(handle, objArr).index);
    }

    private Symbol addConstantDynamicOrInvokeDynamicReference(int i, String str, String str2, int i2) {
        int iHash = hash(i, str, str2, i2);
        for (Entry entry = get(iHash); entry != null; entry = entry.next) {
            if (entry.tag == i && entry.hashCode == iHash && entry.data == i2 && entry.name.equals(str) && entry.value.equals(str2)) {
                return entry;
            }
        }
        this.constantPool.put122(i, i2, addConstantNameAndType(str, str2));
        int i3 = this.constantPoolCount;
        this.constantPoolCount = i3 + 1;
        return put(new Entry(i3, i, null, str, str2, i2, iHash));
    }

    private void addConstantDynamicOrInvokeDynamicReference(int i, int i2, String str, String str2, int i3) {
        add(new Entry(i2, i, null, str, str2, i3, hash(i, str, str2, i3)));
    }

    Symbol addConstantModule(String str) {
        return addConstantUtf8Reference(19, str);
    }

    Symbol addConstantPackage(String str) {
        return addConstantUtf8Reference(20, str);
    }

    private Symbol addConstantUtf8Reference(int i, String str) {
        int iHash = hash(i, str);
        for (Entry entry = get(iHash); entry != null; entry = entry.next) {
            if (entry.tag == i && entry.hashCode == iHash && entry.value.equals(str)) {
                return entry;
            }
        }
        this.constantPool.put12(i, addConstantUtf8(str));
        int i2 = this.constantPoolCount;
        this.constantPoolCount = i2 + 1;
        return put(new Entry(i2, i, str, iHash));
    }

    private void addConstantUtf8Reference(int i, int i2, String str) {
        add(new Entry(i, i2, str, hash(i2, str)));
    }

    Symbol addBootstrapMethod(Handle handle, Object... objArr) {
        ByteVector byteVector = this.bootstrapMethods;
        if (byteVector == null) {
            byteVector = new ByteVector();
            this.bootstrapMethods = byteVector;
        }
        int length = objArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = addConstant(objArr[i]).index;
        }
        int i2 = byteVector.length;
        byteVector.putShort(addConstantMethodHandle(handle.getTag(), handle.getOwner(), handle.getName(), handle.getDesc(), handle.isInterface()).index);
        byteVector.putShort(length);
        for (int i3 = 0; i3 < length; i3++) {
            byteVector.putShort(iArr[i3]);
        }
        int i4 = byteVector.length - i2;
        int iHashCode = handle.hashCode();
        for (Object obj : objArr) {
            iHashCode ^= obj.hashCode();
        }
        return addBootstrapMethod(i2, i4, iHashCode & Integer.MAX_VALUE);
    }

    private Symbol addBootstrapMethod(int i, int i2, int i3) {
        byte[] bArr = this.bootstrapMethods.data;
        for (Entry entry = get(i3); entry != null; entry = entry.next) {
            if (entry.tag == 64 && entry.hashCode == i3) {
                int i4 = (int) entry.data;
                boolean z = false;
                int i5 = 0;
                while (true) {
                    if (i5 >= i2) {
                        z = true;
                        break;
                    }
                    if (bArr[i + i5] != bArr[i4 + i5]) {
                        break;
                    }
                    i5++;
                }
                if (z) {
                    this.bootstrapMethods.length = i;
                    return entry;
                }
            }
        }
        int i6 = this.bootstrapMethodCount;
        this.bootstrapMethodCount = i6 + 1;
        return put(new Entry(i6, 64, i, i3));
    }

    Symbol getType(int i) {
        return this.typeTable[i];
    }

    int addType(String str) {
        int iHash = hash(128, str);
        for (Entry entry = get(iHash); entry != null; entry = entry.next) {
            if (entry.tag == 128 && entry.hashCode == iHash && entry.value.equals(str)) {
                return entry.index;
            }
        }
        return addTypeInternal(new Entry(this.typeCount, 128, str, iHash));
    }

    int addUninitializedType(String str, int i) {
        int iHash = hash(129, str, i);
        for (Entry entry = get(iHash); entry != null; entry = entry.next) {
            if (entry.tag == 129 && entry.hashCode == iHash && entry.data == i && entry.value.equals(str)) {
                return entry.index;
            }
        }
        return addTypeInternal(new Entry(this.typeCount, 129, str, i, iHash));
    }

    int addMergedType(int i, int i2) {
        long j;
        long j2;
        if (i < i2) {
            j = i;
            j2 = i2;
        } else {
            j = i2;
            j2 = i;
        }
        long j3 = j | (j2 << 32);
        int iHash = hash(130, i + i2);
        for (Entry entry = get(iHash); entry != null; entry = entry.next) {
            if (entry.tag == 130 && entry.hashCode == iHash && entry.data == j3) {
                return entry.info;
            }
        }
        int iAddType = addType(this.classWriter.getCommonSuperClass(this.typeTable[i].value, this.typeTable[i2].value));
        put(new Entry(this.typeCount, 130, j3, iHash)).info = iAddType;
        return iAddType;
    }

    private int addTypeInternal(Entry entry) {
        if (this.typeTable == null) {
            this.typeTable = new Entry[16];
        }
        int i = this.typeCount;
        Entry[] entryArr = this.typeTable;
        if (i == entryArr.length) {
            Entry[] entryArr2 = new Entry[entryArr.length * 2];
            System.arraycopy(entryArr, 0, entryArr2, 0, entryArr.length);
            this.typeTable = entryArr2;
        }
        Entry[] entryArr3 = this.typeTable;
        int i2 = this.typeCount;
        this.typeCount = i2 + 1;
        entryArr3[i2] = entry;
        return put(entry).index;
    }

    private static int hash(int i, String str) {
        return (i + str.hashCode()) & Integer.MAX_VALUE;
    }

    private static int hash(int i, String str, int i2) {
        return (i + str.hashCode() + i2) & Integer.MAX_VALUE;
    }

    private static int hash(int i, String str, String str2) {
        return (i + (str.hashCode() * str2.hashCode())) & Integer.MAX_VALUE;
    }

    private static int hash(int i, String str, String str2, int i2) {
        return (i + (str.hashCode() * str2.hashCode() * (i2 + 1))) & Integer.MAX_VALUE;
    }

    private static int hash(int i, String str, String str2, String str3) {
        return (i + (str.hashCode() * str2.hashCode() * str3.hashCode())) & Integer.MAX_VALUE;
    }

    private static int hash(int i, String str, String str2, String str3, int i2) {
        return (i + (str.hashCode() * str2.hashCode() * str3.hashCode() * i2)) & Integer.MAX_VALUE;
    }

    private static class Entry extends Symbol {
        final int hashCode;
        Entry next;

        Entry(int i, int i2, String str, String str2, String str3, long j, int i3) {
            super(i, i2, str, str2, str3, j);
            this.hashCode = i3;
        }

        Entry(int i, int i2, String str, int i3) {
            super(i, i2, null, null, str, 0L);
            this.hashCode = i3;
        }

        Entry(int i, int i2, String str, long j, int i3) {
            super(i, i2, null, null, str, j);
            this.hashCode = i3;
        }

        Entry(int i, int i2, String str, String str2, int i3) {
            super(i, i2, null, str, str2, 0L);
            this.hashCode = i3;
        }

        Entry(int i, int i2, long j, int i3) {
            super(i, i2, null, null, null, j);
            this.hashCode = i3;
        }
    }
}
