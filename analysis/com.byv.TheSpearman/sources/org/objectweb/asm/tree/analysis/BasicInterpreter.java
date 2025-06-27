package org.objectweb.asm.tree.analysis;

import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.InvokeDynamicInsnNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MultiANewArrayInsnNode;
import org.objectweb.asm.tree.TypeInsnNode;

/* loaded from: classes5.dex */
public class BasicInterpreter extends Interpreter<BasicValue> implements Opcodes {
    public static final Type NULL_TYPE = Type.getObjectType(AbstractJsonLexerKt.NULL);

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public BasicValue copyOperation(AbstractInsnNode abstractInsnNode, BasicValue basicValue) throws AnalyzerException {
        return basicValue;
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public void returnOperation(AbstractInsnNode abstractInsnNode, BasicValue basicValue, BasicValue basicValue2) throws AnalyzerException {
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public BasicValue ternaryOperation(AbstractInsnNode abstractInsnNode, BasicValue basicValue, BasicValue basicValue2, BasicValue basicValue3) throws AnalyzerException {
        return null;
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public /* bridge */ /* synthetic */ Value naryOperation(AbstractInsnNode abstractInsnNode, List list) throws AnalyzerException {
        return naryOperation(abstractInsnNode, (List<? extends BasicValue>) list);
    }

    public BasicInterpreter() {
        super(589824);
        if (getClass() != BasicInterpreter.class) {
            throw new IllegalStateException();
        }
    }

    protected BasicInterpreter(int i) {
        super(i);
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public BasicValue newValue(Type type) {
        if (type == null) {
            return BasicValue.UNINITIALIZED_VALUE;
        }
        switch (type.getSort()) {
            case 0:
                return null;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return BasicValue.INT_VALUE;
            case 6:
                return BasicValue.FLOAT_VALUE;
            case 7:
                return BasicValue.LONG_VALUE;
            case 8:
                return BasicValue.DOUBLE_VALUE;
            case 9:
            case 10:
                return BasicValue.REFERENCE_VALUE;
            default:
                throw new AssertionError();
        }
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public BasicValue newOperation(AbstractInsnNode abstractInsnNode) throws AnalyzerException {
        int opcode = abstractInsnNode.getOpcode();
        if (opcode == 168) {
            return BasicValue.RETURNADDRESS_VALUE;
        }
        if (opcode == 178) {
            return newValue(Type.getType(((FieldInsnNode) abstractInsnNode).desc));
        }
        if (opcode != 187) {
            switch (opcode) {
                case 1:
                    return newValue(NULL_TYPE);
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    return BasicValue.INT_VALUE;
                case 9:
                case 10:
                    return BasicValue.LONG_VALUE;
                case 11:
                case 12:
                case 13:
                    return BasicValue.FLOAT_VALUE;
                case 14:
                case 15:
                    return BasicValue.DOUBLE_VALUE;
                case 16:
                case 17:
                    return BasicValue.INT_VALUE;
                case 18:
                    Object obj = ((LdcInsnNode) abstractInsnNode).cst;
                    if (obj instanceof Integer) {
                        return BasicValue.INT_VALUE;
                    }
                    if (obj instanceof Float) {
                        return BasicValue.FLOAT_VALUE;
                    }
                    if (obj instanceof Long) {
                        return BasicValue.LONG_VALUE;
                    }
                    if (obj instanceof Double) {
                        return BasicValue.DOUBLE_VALUE;
                    }
                    if (obj instanceof String) {
                        return newValue(Type.getObjectType("java/lang/String"));
                    }
                    if (obj instanceof Type) {
                        int sort = ((Type) obj).getSort();
                        if (sort == 10 || sort == 9) {
                            return newValue(Type.getObjectType("java/lang/Class"));
                        }
                        if (sort == 11) {
                            return newValue(Type.getObjectType("java/lang/invoke/MethodType"));
                        }
                        throw new AnalyzerException(abstractInsnNode, "Illegal LDC value " + obj);
                    }
                    if (obj instanceof Handle) {
                        return newValue(Type.getObjectType("java/lang/invoke/MethodHandle"));
                    }
                    if (obj instanceof ConstantDynamic) {
                        return newValue(Type.getType(((ConstantDynamic) obj).getDescriptor()));
                    }
                    throw new AnalyzerException(abstractInsnNode, "Illegal LDC value " + obj);
                default:
                    throw new AssertionError();
            }
        }
        return newValue(Type.getObjectType(((TypeInsnNode) abstractInsnNode).desc));
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d1  */
    @Override // org.objectweb.asm.tree.analysis.Interpreter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.objectweb.asm.tree.analysis.BasicValue unaryOperation(org.objectweb.asm.tree.AbstractInsnNode r3, org.objectweb.asm.tree.analysis.BasicValue r4) throws org.objectweb.asm.tree.analysis.AnalyzerException {
        /*
            r2 = this;
            int r4 = r3.getOpcode()
            r0 = 179(0xb3, float:2.51E-43)
            r1 = 0
            if (r4 == r0) goto Le2
            r0 = 180(0xb4, float:2.52E-43)
            if (r4 == r0) goto Ld5
            r0 = 198(0xc6, float:2.77E-43)
            if (r4 == r0) goto Ld4
            r0 = 199(0xc7, float:2.79E-43)
            if (r4 == r0) goto Ld4
            switch(r4) {
                case 116: goto Ld1;
                case 117: goto Lce;
                case 118: goto Lcb;
                case 119: goto Lc8;
                default: goto L18;
            }
        L18:
            switch(r4) {
                case 132: goto Ld1;
                case 133: goto Lce;
                case 134: goto Lcb;
                case 135: goto Lc8;
                case 136: goto Ld1;
                case 137: goto Lcb;
                case 138: goto Lc8;
                case 139: goto Ld1;
                case 140: goto Lce;
                case 141: goto Lc8;
                case 142: goto Ld1;
                case 143: goto Lce;
                case 144: goto Lcb;
                case 145: goto Ld1;
                case 146: goto Ld1;
                case 147: goto Ld1;
                default: goto L1b;
            }
        L1b:
            switch(r4) {
                case 153: goto Le2;
                case 154: goto Le2;
                case 155: goto Le2;
                case 156: goto Le2;
                case 157: goto Le2;
                case 158: goto Le2;
                default: goto L1e;
            }
        L1e:
            switch(r4) {
                case 170: goto Le2;
                case 171: goto Le2;
                case 172: goto Le2;
                case 173: goto Le2;
                case 174: goto Le2;
                case 175: goto Le2;
                case 176: goto Le2;
                default: goto L21;
            }
        L21:
            switch(r4) {
                case 188: goto L60;
                case 189: goto L3e;
                case 190: goto L3b;
                case 191: goto L3a;
                case 192: goto L2d;
                case 193: goto L2a;
                case 194: goto Ld4;
                case 195: goto Ld4;
                default: goto L24;
            }
        L24:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            r3.<init>()
            throw r3
        L2a:
            org.objectweb.asm.tree.analysis.BasicValue r3 = org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE
            return r3
        L2d:
            org.objectweb.asm.tree.TypeInsnNode r3 = (org.objectweb.asm.tree.TypeInsnNode) r3
            java.lang.String r3 = r3.desc
            org.objectweb.asm.Type r3 = org.objectweb.asm.Type.getObjectType(r3)
            org.objectweb.asm.tree.analysis.BasicValue r3 = r2.newValue(r3)
            return r3
        L3a:
            return r1
        L3b:
            org.objectweb.asm.tree.analysis.BasicValue r3 = org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE
            return r3
        L3e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "["
            r4.append(r0)
            org.objectweb.asm.tree.TypeInsnNode r3 = (org.objectweb.asm.tree.TypeInsnNode) r3
            java.lang.String r3 = r3.desc
            org.objectweb.asm.Type r3 = org.objectweb.asm.Type.getObjectType(r3)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            org.objectweb.asm.Type r3 = org.objectweb.asm.Type.getType(r3)
            org.objectweb.asm.tree.analysis.BasicValue r3 = r2.newValue(r3)
            return r3
        L60:
            r4 = r3
            org.objectweb.asm.tree.IntInsnNode r4 = (org.objectweb.asm.tree.IntInsnNode) r4
            int r4 = r4.operand
            switch(r4) {
                case 4: goto Lbd;
                case 5: goto Lb2;
                case 6: goto La7;
                case 7: goto L9c;
                case 8: goto L91;
                case 9: goto L86;
                case 10: goto L7b;
                case 11: goto L70;
                default: goto L68;
            }
        L68:
            org.objectweb.asm.tree.analysis.AnalyzerException r4 = new org.objectweb.asm.tree.analysis.AnalyzerException
            java.lang.String r0 = "Invalid array type"
            r4.<init>(r3, r0)
            throw r4
        L70:
            java.lang.String r3 = "[J"
            org.objectweb.asm.Type r3 = org.objectweb.asm.Type.getType(r3)
            org.objectweb.asm.tree.analysis.BasicValue r3 = r2.newValue(r3)
            return r3
        L7b:
            java.lang.String r3 = "[I"
            org.objectweb.asm.Type r3 = org.objectweb.asm.Type.getType(r3)
            org.objectweb.asm.tree.analysis.BasicValue r3 = r2.newValue(r3)
            return r3
        L86:
            java.lang.String r3 = "[S"
            org.objectweb.asm.Type r3 = org.objectweb.asm.Type.getType(r3)
            org.objectweb.asm.tree.analysis.BasicValue r3 = r2.newValue(r3)
            return r3
        L91:
            java.lang.String r3 = "[B"
            org.objectweb.asm.Type r3 = org.objectweb.asm.Type.getType(r3)
            org.objectweb.asm.tree.analysis.BasicValue r3 = r2.newValue(r3)
            return r3
        L9c:
            java.lang.String r3 = "[D"
            org.objectweb.asm.Type r3 = org.objectweb.asm.Type.getType(r3)
            org.objectweb.asm.tree.analysis.BasicValue r3 = r2.newValue(r3)
            return r3
        La7:
            java.lang.String r3 = "[F"
            org.objectweb.asm.Type r3 = org.objectweb.asm.Type.getType(r3)
            org.objectweb.asm.tree.analysis.BasicValue r3 = r2.newValue(r3)
            return r3
        Lb2:
            java.lang.String r3 = "[C"
            org.objectweb.asm.Type r3 = org.objectweb.asm.Type.getType(r3)
            org.objectweb.asm.tree.analysis.BasicValue r3 = r2.newValue(r3)
            return r3
        Lbd:
            java.lang.String r3 = "[Z"
            org.objectweb.asm.Type r3 = org.objectweb.asm.Type.getType(r3)
            org.objectweb.asm.tree.analysis.BasicValue r3 = r2.newValue(r3)
            return r3
        Lc8:
            org.objectweb.asm.tree.analysis.BasicValue r3 = org.objectweb.asm.tree.analysis.BasicValue.DOUBLE_VALUE
            return r3
        Lcb:
            org.objectweb.asm.tree.analysis.BasicValue r3 = org.objectweb.asm.tree.analysis.BasicValue.FLOAT_VALUE
            return r3
        Lce:
            org.objectweb.asm.tree.analysis.BasicValue r3 = org.objectweb.asm.tree.analysis.BasicValue.LONG_VALUE
            return r3
        Ld1:
            org.objectweb.asm.tree.analysis.BasicValue r3 = org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE
            return r3
        Ld4:
            return r1
        Ld5:
            org.objectweb.asm.tree.FieldInsnNode r3 = (org.objectweb.asm.tree.FieldInsnNode) r3
            java.lang.String r3 = r3.desc
            org.objectweb.asm.Type r3 = org.objectweb.asm.Type.getType(r3)
            org.objectweb.asm.tree.analysis.BasicValue r3 = r2.newValue(r3)
            return r3
        Le2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.objectweb.asm.tree.analysis.BasicInterpreter.unaryOperation(org.objectweb.asm.tree.AbstractInsnNode, org.objectweb.asm.tree.analysis.BasicValue):org.objectweb.asm.tree.analysis.BasicValue");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002c  */
    @Override // org.objectweb.asm.tree.analysis.Interpreter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.objectweb.asm.tree.analysis.BasicValue binaryOperation(org.objectweb.asm.tree.AbstractInsnNode r1, org.objectweb.asm.tree.analysis.BasicValue r2, org.objectweb.asm.tree.analysis.BasicValue r3) throws org.objectweb.asm.tree.analysis.AnalyzerException {
        /*
            r0 = this;
            int r1 = r1.getOpcode()
            r2 = 181(0xb5, float:2.54E-43)
            if (r1 == r2) goto L2f
            switch(r1) {
                case 46: goto L2c;
                case 47: goto L29;
                case 48: goto L26;
                case 49: goto L23;
                case 50: goto L20;
                case 51: goto L2c;
                case 52: goto L2c;
                case 53: goto L2c;
                default: goto Lb;
            }
        Lb:
            switch(r1) {
                case 96: goto L2c;
                case 97: goto L29;
                case 98: goto L26;
                case 99: goto L23;
                case 100: goto L2c;
                case 101: goto L29;
                case 102: goto L26;
                case 103: goto L23;
                case 104: goto L2c;
                case 105: goto L29;
                case 106: goto L26;
                case 107: goto L23;
                case 108: goto L2c;
                case 109: goto L29;
                case 110: goto L26;
                case 111: goto L23;
                case 112: goto L2c;
                case 113: goto L29;
                case 114: goto L26;
                case 115: goto L23;
                default: goto Le;
            }
        Le:
            switch(r1) {
                case 120: goto L2c;
                case 121: goto L29;
                case 122: goto L2c;
                case 123: goto L29;
                case 124: goto L2c;
                case 125: goto L29;
                case 126: goto L2c;
                case 127: goto L29;
                case 128: goto L2c;
                case 129: goto L29;
                case 130: goto L2c;
                case 131: goto L29;
                default: goto L11;
            }
        L11:
            switch(r1) {
                case 148: goto L1d;
                case 149: goto L1d;
                case 150: goto L1d;
                case 151: goto L1d;
                case 152: goto L1d;
                default: goto L14;
            }
        L14:
            switch(r1) {
                case 159: goto L2f;
                case 160: goto L2f;
                case 161: goto L2f;
                case 162: goto L2f;
                case 163: goto L2f;
                case 164: goto L2f;
                case 165: goto L2f;
                case 166: goto L2f;
                default: goto L17;
            }
        L17:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L1d:
            org.objectweb.asm.tree.analysis.BasicValue r1 = org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE
            return r1
        L20:
            org.objectweb.asm.tree.analysis.BasicValue r1 = org.objectweb.asm.tree.analysis.BasicValue.REFERENCE_VALUE
            return r1
        L23:
            org.objectweb.asm.tree.analysis.BasicValue r1 = org.objectweb.asm.tree.analysis.BasicValue.DOUBLE_VALUE
            return r1
        L26:
            org.objectweb.asm.tree.analysis.BasicValue r1 = org.objectweb.asm.tree.analysis.BasicValue.FLOAT_VALUE
            return r1
        L29:
            org.objectweb.asm.tree.analysis.BasicValue r1 = org.objectweb.asm.tree.analysis.BasicValue.LONG_VALUE
            return r1
        L2c:
            org.objectweb.asm.tree.analysis.BasicValue r1 = org.objectweb.asm.tree.analysis.BasicValue.INT_VALUE
            return r1
        L2f:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.objectweb.asm.tree.analysis.BasicInterpreter.binaryOperation(org.objectweb.asm.tree.AbstractInsnNode, org.objectweb.asm.tree.analysis.BasicValue, org.objectweb.asm.tree.analysis.BasicValue):org.objectweb.asm.tree.analysis.BasicValue");
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public BasicValue naryOperation(AbstractInsnNode abstractInsnNode, List<? extends BasicValue> list) throws AnalyzerException {
        int opcode = abstractInsnNode.getOpcode();
        if (opcode == 197) {
            return newValue(Type.getType(((MultiANewArrayInsnNode) abstractInsnNode).desc));
        }
        if (opcode == 186) {
            return newValue(Type.getReturnType(((InvokeDynamicInsnNode) abstractInsnNode).desc));
        }
        return newValue(Type.getReturnType(((MethodInsnNode) abstractInsnNode).desc));
    }

    @Override // org.objectweb.asm.tree.analysis.Interpreter
    public BasicValue merge(BasicValue basicValue, BasicValue basicValue2) {
        return !basicValue.equals(basicValue2) ? BasicValue.UNINITIALIZED_VALUE : basicValue;
    }
}
