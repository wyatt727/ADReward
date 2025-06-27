package org.objectweb.asm.tree.analysis;

import org.objectweb.asm.Type;

/* loaded from: classes5.dex */
public class BasicValue implements Value {
    private final Type type;
    public static final BasicValue UNINITIALIZED_VALUE = new BasicValue(null);
    public static final BasicValue INT_VALUE = new BasicValue(Type.INT_TYPE);
    public static final BasicValue FLOAT_VALUE = new BasicValue(Type.FLOAT_TYPE);
    public static final BasicValue LONG_VALUE = new BasicValue(Type.LONG_TYPE);
    public static final BasicValue DOUBLE_VALUE = new BasicValue(Type.DOUBLE_TYPE);
    public static final BasicValue REFERENCE_VALUE = new BasicValue(Type.getObjectType("java/lang/Object"));
    public static final BasicValue RETURNADDRESS_VALUE = new BasicValue(Type.VOID_TYPE);

    public BasicValue(Type type) {
        this.type = type;
    }

    public Type getType() {
        return this.type;
    }

    @Override // org.objectweb.asm.tree.analysis.Value
    public int getSize() {
        return (this.type == Type.LONG_TYPE || this.type == Type.DOUBLE_TYPE) ? 2 : 1;
    }

    public boolean isReference() {
        Type type = this.type;
        return type != null && (type.getSort() == 10 || this.type.getSort() == 9);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BasicValue)) {
            return false;
        }
        Type type = this.type;
        if (type == null) {
            return ((BasicValue) obj).type == null;
        }
        return type.equals(((BasicValue) obj).type);
    }

    public int hashCode() {
        Type type = this.type;
        if (type == null) {
            return 0;
        }
        return type.hashCode();
    }

    public String toString() {
        return this == UNINITIALIZED_VALUE ? "." : this == RETURNADDRESS_VALUE ? "A" : this == REFERENCE_VALUE ? "R" : this.type.getDescriptor();
    }
}
