package org.objectweb.asm.commons;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

/* loaded from: classes5.dex */
public class AnalyzerAdapter extends MethodVisitor {
    private List<Label> labels;
    public List<Object> locals;
    private int maxLocals;
    private int maxStack;
    private String owner;
    public List<Object> stack;
    public Map<Object, Object> uninitializedTypes;

    public AnalyzerAdapter(String str, int i, String str2, String str3, MethodVisitor methodVisitor) {
        this(589824, str, i, str2, str3, methodVisitor);
        if (getClass() != AnalyzerAdapter.class) {
            throw new IllegalStateException();
        }
    }

    protected AnalyzerAdapter(int i, String str, int i2, String str2, String str3, MethodVisitor methodVisitor) {
        super(i, methodVisitor);
        this.owner = str;
        this.locals = new ArrayList();
        this.stack = new ArrayList();
        this.uninitializedTypes = new HashMap();
        if ((i2 & 8) == 0) {
            if ("<init>".equals(str2)) {
                this.locals.add(Opcodes.UNINITIALIZED_THIS);
            } else {
                this.locals.add(str);
            }
        }
        for (Type type : Type.getArgumentTypes(str3)) {
            switch (type.getSort()) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    this.locals.add(Opcodes.INTEGER);
                    break;
                case 6:
                    this.locals.add(Opcodes.FLOAT);
                    break;
                case 7:
                    this.locals.add(Opcodes.LONG);
                    this.locals.add(Opcodes.TOP);
                    break;
                case 8:
                    this.locals.add(Opcodes.DOUBLE);
                    this.locals.add(Opcodes.TOP);
                    break;
                case 9:
                    this.locals.add(type.getDescriptor());
                    break;
                case 10:
                    this.locals.add(type.getInternalName());
                    break;
                default:
                    throw new AssertionError();
            }
        }
        this.maxLocals = this.locals.size();
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFrame(int i, int i2, Object[] objArr, int i3, Object[] objArr2) {
        if (i != -1) {
            throw new IllegalArgumentException("AnalyzerAdapter only accepts expanded frames (see ClassReader.EXPAND_FRAMES)");
        }
        super.visitFrame(i, i2, objArr, i3, objArr2);
        List<Object> list = this.locals;
        if (list != null) {
            list.clear();
            this.stack.clear();
        } else {
            this.locals = new ArrayList();
            this.stack = new ArrayList();
        }
        visitFrameTypes(i2, objArr, this.locals);
        visitFrameTypes(i3, objArr2, this.stack);
        this.maxLocals = Math.max(this.maxLocals, this.locals.size());
        this.maxStack = Math.max(this.maxStack, this.stack.size());
    }

    private static void visitFrameTypes(int i, Object[] objArr, List<Object> list) {
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            list.add(obj);
            if (obj == Opcodes.LONG || obj == Opcodes.DOUBLE) {
                list.add(Opcodes.TOP);
            }
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInsn(int i) {
        super.visitInsn(i);
        execute(i, 0, null);
        if ((i < 172 || i > 177) && i != 191) {
            return;
        }
        this.locals = null;
        this.stack = null;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIntInsn(int i, int i2) {
        super.visitIntInsn(i, i2);
        execute(i, i2, null);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitVarInsn(int i, int i2) {
        super.visitVarInsn(i, i2);
        this.maxLocals = Math.max(this.maxLocals, (i == 22 || i == 24 || i == 55 || i == 57 ? 2 : 1) + i2);
        execute(i, i2, null);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTypeInsn(int i, String str) {
        if (i == 187) {
            if (this.labels == null) {
                Label label = new Label();
                ArrayList arrayList = new ArrayList(3);
                this.labels = arrayList;
                arrayList.add(label);
                if (this.mv != null) {
                    this.mv.visitLabel(label);
                }
            }
            Iterator<Label> it = this.labels.iterator();
            while (it.hasNext()) {
                this.uninitializedTypes.put(it.next(), str);
            }
        }
        super.visitTypeInsn(i, str);
        execute(i, 0, str);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFieldInsn(int i, String str, String str2, String str3) {
        super.visitFieldInsn(i, str, str2, str3);
        execute(i, 0, str3);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMethodInsn(int i, String str, String str2, String str3, boolean z) {
        Object obj;
        if (this.api < 327680 && (i & 256) == 0) {
            super.visitMethodInsn(i, str, str2, str3, z);
            return;
        }
        super.visitMethodInsn(i, str, str2, str3, z);
        int i2 = i & (-257);
        if (this.locals == null) {
            this.labels = null;
            return;
        }
        pop(str3);
        if (i2 != 184) {
            Object objPop = pop();
            if (i2 == 183 && str2.equals("<init>")) {
                if (objPop == Opcodes.UNINITIALIZED_THIS) {
                    obj = this.owner;
                } else {
                    obj = this.uninitializedTypes.get(objPop);
                }
                for (int i3 = 0; i3 < this.locals.size(); i3++) {
                    if (this.locals.get(i3) == objPop) {
                        this.locals.set(i3, obj);
                    }
                }
                for (int i4 = 0; i4 < this.stack.size(); i4++) {
                    if (this.stack.get(i4) == objPop) {
                        this.stack.set(i4, obj);
                    }
                }
            }
        }
        pushDescriptor(str3);
        this.labels = null;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInvokeDynamicInsn(String str, String str2, Handle handle, Object... objArr) {
        super.visitInvokeDynamicInsn(str, str2, handle, objArr);
        if (this.locals == null) {
            this.labels = null;
            return;
        }
        pop(str2);
        pushDescriptor(str2);
        this.labels = null;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitJumpInsn(int i, Label label) {
        super.visitJumpInsn(i, label);
        execute(i, 0, null);
        if (i == 167) {
            this.locals = null;
            this.stack = null;
        }
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLabel(Label label) {
        super.visitLabel(label);
        if (this.labels == null) {
            this.labels = new ArrayList(3);
        }
        this.labels.add(label);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLdcInsn(Object obj) {
        super.visitLdcInsn(obj);
        if (this.locals == null) {
            this.labels = null;
            return;
        }
        if (obj instanceof Integer) {
            push(Opcodes.INTEGER);
        } else if (obj instanceof Long) {
            push(Opcodes.LONG);
            push(Opcodes.TOP);
        } else if (obj instanceof Float) {
            push(Opcodes.FLOAT);
        } else if (obj instanceof Double) {
            push(Opcodes.DOUBLE);
            push(Opcodes.TOP);
        } else if (obj instanceof String) {
            push("java/lang/String");
        } else if (obj instanceof Type) {
            int sort = ((Type) obj).getSort();
            if (sort == 10 || sort == 9) {
                push("java/lang/Class");
            } else if (sort == 11) {
                push("java/lang/invoke/MethodType");
            } else {
                throw new IllegalArgumentException();
            }
        } else if (obj instanceof Handle) {
            push("java/lang/invoke/MethodHandle");
        } else if (obj instanceof ConstantDynamic) {
            pushDescriptor(((ConstantDynamic) obj).getDescriptor());
        } else {
            throw new IllegalArgumentException();
        }
        this.labels = null;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIincInsn(int i, int i2) {
        super.visitIincInsn(i, i2);
        this.maxLocals = Math.max(this.maxLocals, i + 1);
        execute(132, i, null);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTableSwitchInsn(int i, int i2, Label label, Label... labelArr) {
        super.visitTableSwitchInsn(i, i2, label, labelArr);
        execute(Opcodes.TABLESWITCH, 0, null);
        this.locals = null;
        this.stack = null;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLookupSwitchInsn(Label label, int[] iArr, Label[] labelArr) {
        super.visitLookupSwitchInsn(label, iArr, labelArr);
        execute(Opcodes.LOOKUPSWITCH, 0, null);
        this.locals = null;
        this.stack = null;
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMultiANewArrayInsn(String str, int i) {
        super.visitMultiANewArrayInsn(str, i);
        execute(Opcodes.MULTIANEWARRAY, i, str);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLocalVariable(String str, String str2, String str3, Label label, Label label2, int i) {
        char cCharAt = str2.charAt(0);
        this.maxLocals = Math.max(this.maxLocals, ((cCharAt == 'J' || cCharAt == 'D') ? 2 : 1) + i);
        super.visitLocalVariable(str, str2, str3, label, label2, i);
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMaxs(int i, int i2) {
        if (this.mv != null) {
            this.maxStack = Math.max(this.maxStack, i);
            this.maxLocals = Math.max(this.maxLocals, i2);
            this.mv.visitMaxs(this.maxStack, this.maxLocals);
        }
    }

    private Object get(int i) {
        this.maxLocals = Math.max(this.maxLocals, i + 1);
        return i < this.locals.size() ? this.locals.get(i) : Opcodes.TOP;
    }

    private void set(int i, Object obj) {
        this.maxLocals = Math.max(this.maxLocals, i + 1);
        while (i >= this.locals.size()) {
            this.locals.add(Opcodes.TOP);
        }
        this.locals.set(i, obj);
    }

    private void push(Object obj) {
        this.stack.add(obj);
        this.maxStack = Math.max(this.maxStack, this.stack.size());
    }

    private void pushDescriptor(String str) {
        if (str.charAt(0) == '(') {
            str = Type.getReturnType(str).getDescriptor();
        }
        char cCharAt = str.charAt(0);
        if (cCharAt == 'F') {
            push(Opcodes.FLOAT);
            return;
        }
        if (cCharAt != 'L') {
            if (cCharAt != 'S') {
                if (cCharAt == 'V') {
                    return;
                }
                if (cCharAt != 'I') {
                    if (cCharAt == 'J') {
                        push(Opcodes.LONG);
                        push(Opcodes.TOP);
                        return;
                    } else if (cCharAt != 'Z') {
                        if (cCharAt != '[') {
                            switch (cCharAt) {
                                case 'B':
                                case 'C':
                                    break;
                                case 'D':
                                    push(Opcodes.DOUBLE);
                                    push(Opcodes.TOP);
                                    return;
                                default:
                                    throw new AssertionError();
                            }
                        } else {
                            push(str);
                            return;
                        }
                    }
                }
            }
            push(Opcodes.INTEGER);
            return;
        }
        push(str.substring(1, str.length() - 1));
    }

    private Object pop() {
        return this.stack.remove(r0.size() - 1);
    }

    private void pop(int i) {
        int size = this.stack.size();
        int i2 = size - i;
        for (int i3 = size - 1; i3 >= i2; i3--) {
            this.stack.remove(i3);
        }
    }

    private void pop(String str) {
        char cCharAt = str.charAt(0);
        if (cCharAt != '(') {
            if (cCharAt == 'J' || cCharAt == 'D') {
                pop(2);
                return;
            } else {
                pop(1);
                return;
            }
        }
        int size = 0;
        for (Type type : Type.getArgumentTypes(str)) {
            size += type.getSize();
        }
        pop(size);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void execute(int r6, int r7, java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 1102
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.objectweb.asm.commons.AnalyzerAdapter.execute(int, int, java.lang.String):void");
    }
}
