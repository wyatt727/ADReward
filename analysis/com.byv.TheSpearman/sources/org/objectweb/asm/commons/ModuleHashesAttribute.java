package org.objectweb.asm.commons;

import java.util.ArrayList;
import java.util.List;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ByteVector;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Label;

/* loaded from: classes5.dex */
public final class ModuleHashesAttribute extends Attribute {
    public String algorithm;
    public List<byte[]> hashes;
    public List<String> modules;

    public ModuleHashesAttribute(String str, List<String> list, List<byte[]> list2) {
        super("ModuleHashes");
        this.algorithm = str;
        this.modules = list;
        this.hashes = list2;
    }

    public ModuleHashesAttribute() {
        this(null, null, null);
    }

    @Override // org.objectweb.asm.Attribute
    protected Attribute read(ClassReader classReader, int i, int i2, char[] cArr, int i3, Label[] labelArr) {
        String utf8 = classReader.readUTF8(i, cArr);
        int i4 = i + 2;
        int unsignedShort = classReader.readUnsignedShort(i4);
        int i5 = i4 + 2;
        ArrayList arrayList = new ArrayList(unsignedShort);
        ArrayList arrayList2 = new ArrayList(unsignedShort);
        for (int i6 = 0; i6 < unsignedShort; i6++) {
            String module = classReader.readModule(i5, cArr);
            int i7 = i5 + 2;
            arrayList.add(module);
            int unsignedShort2 = classReader.readUnsignedShort(i7);
            i5 = i7 + 2;
            byte[] bArr = new byte[unsignedShort2];
            for (int i8 = 0; i8 < unsignedShort2; i8++) {
                bArr[i8] = (byte) classReader.readByte(i5);
                i5++;
            }
            arrayList2.add(bArr);
        }
        return new ModuleHashesAttribute(utf8, arrayList, arrayList2);
    }

    @Override // org.objectweb.asm.Attribute
    protected ByteVector write(ClassWriter classWriter, byte[] bArr, int i, int i2, int i3) {
        ByteVector byteVector = new ByteVector();
        byteVector.putShort(classWriter.newUTF8(this.algorithm));
        List<String> list = this.modules;
        if (list == null) {
            byteVector.putShort(0);
        } else {
            int size = list.size();
            byteVector.putShort(size);
            for (int i4 = 0; i4 < size; i4++) {
                String str = this.modules.get(i4);
                byte[] bArr2 = this.hashes.get(i4);
                byteVector.putShort(classWriter.newModule(str)).putShort(bArr2.length).putByteArray(bArr2, 0, bArr2.length);
            }
        }
        return byteVector;
    }
}
