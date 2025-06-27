package org.jacoco.core.internal.data;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class CompactDataInput extends DataInputStream {
    public CompactDataInput(InputStream inputStream) {
        super(inputStream);
    }

    public int readVarInt() throws IOException {
        int i = readByte() & 255;
        return (i & 128) == 0 ? i : (i & 127) | (readVarInt() << 7);
    }

    public boolean[] readBooleanArray() throws IOException {
        int varInt = readVarInt();
        boolean[] zArr = new boolean[varInt];
        int i = 0;
        for (int i2 = 0; i2 < varInt; i2++) {
            if (i2 % 8 == 0) {
                i = readByte();
            }
            zArr[i2] = (i & 1) != 0;
            i >>>= 1;
        }
        return zArr;
    }
}
