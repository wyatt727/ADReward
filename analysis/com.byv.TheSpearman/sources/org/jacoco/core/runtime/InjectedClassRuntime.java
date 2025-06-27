package org.jacoco.core.runtime;

import androidx.fragment.app.FragmentTransaction;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

/* loaded from: classes5.dex */
public class InjectedClassRuntime extends AbstractRuntime {
    private static final String FIELD_NAME = "data";
    private static final String FIELD_TYPE = "Ljava/lang/Object;";
    private final String injectedClassName;
    private final Class<?> locator;

    @Override // org.jacoco.core.runtime.IRuntime
    public void shutdown() {
    }

    public InjectedClassRuntime(Class<?> cls, String str) {
        this.locator = cls;
        this.injectedClassName = cls.getPackage().getName().replace('.', '/') + '/' + str;
    }

    @Override // org.jacoco.core.runtime.AbstractRuntime, org.jacoco.core.runtime.IRuntime
    public void startup(RuntimeData runtimeData) throws Exception {
        super.startup(runtimeData);
        Lookup.privateLookupIn(this.locator, Lookup.lookup()).defineClass(createClass(this.injectedClassName)).getField("data").set(null, runtimeData);
    }

    @Override // org.jacoco.core.runtime.IExecutionDataAccessorGenerator
    public int generateDataAccessor(long j, String str, int i, MethodVisitor methodVisitor) {
        methodVisitor.visitFieldInsn(Opcodes.GETSTATIC, this.injectedClassName, "data", FIELD_TYPE);
        RuntimeData.generateAccessCall(j, str, i, methodVisitor);
        return 6;
    }

    private static byte[] createClass(String str) {
        ClassWriter classWriter = new ClassWriter(0);
        classWriter.visit(53, FragmentTransaction.TRANSIT_FRAGMENT_OPEN, str.replace('.', '/'), null, "java/lang/Object", null);
        classWriter.visitField(9, "data", FIELD_TYPE, null, null);
        classWriter.visitEnd();
        return classWriter.toByteArray();
    }

    private static class Lookup {
        private final Object instance;

        private Lookup(Object obj) {
            this.instance = obj;
        }

        static Lookup lookup() throws Exception {
            return new Lookup(Class.forName("java.lang.invoke.MethodHandles").getMethod("lookup", new Class[0]).invoke(null, new Object[0]));
        }

        static Lookup privateLookupIn(Class<?> cls, Lookup lookup) throws Exception {
            return new Lookup(Class.forName("java.lang.invoke.MethodHandles").getMethod("privateLookupIn", Class.class, Class.forName("java.lang.invoke.MethodHandles$Lookup")).invoke(null, cls, lookup.instance));
        }

        Class<?> defineClass(byte[] bArr) throws Exception {
            return (Class) Class.forName("java.lang.invoke.MethodHandles$Lookup").getMethod("defineClass", byte[].class).invoke(this.instance, bArr);
        }
    }
}
