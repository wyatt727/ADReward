package org.jacoco.core.runtime;

import org.jacoco.core.JaCoCo;
import org.jacoco.core.internal.instr.InstrSupport;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

/* loaded from: classes5.dex */
public class OfflineInstrumentationAccessGenerator implements IExecutionDataAccessorGenerator {
    private final String runtimeClassName;

    public OfflineInstrumentationAccessGenerator() {
        this(JaCoCo.RUNTIMEPACKAGE.replace('.', '/') + "/Offline");
    }

    OfflineInstrumentationAccessGenerator(String str) {
        this.runtimeClassName = str;
    }

    @Override // org.jacoco.core.runtime.IExecutionDataAccessorGenerator
    public int generateDataAccessor(long j, String str, int i, MethodVisitor methodVisitor) {
        methodVisitor.visitLdcInsn(Long.valueOf(j));
        methodVisitor.visitLdcInsn(str);
        InstrSupport.push(methodVisitor, i);
        methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, this.runtimeClassName, "getProbes", "(JLjava/lang/String;I)[Z", false);
        return 4;
    }
}
