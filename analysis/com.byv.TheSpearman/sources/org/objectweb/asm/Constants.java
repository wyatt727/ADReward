package org.objectweb.asm;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
final class Constants {
    static final int ACC_CONSTRUCTOR = 262144;
    static final int ALOAD_0 = 42;
    static final int ALOAD_1 = 43;
    static final int ALOAD_2 = 44;
    static final int ALOAD_3 = 45;
    static final String ANNOTATION_DEFAULT = "AnnotationDefault";
    static final int ASM_GOTO = 216;
    static final int ASM_GOTO_W = 220;
    static final int ASM_IFEQ = 202;
    static final int ASM_IFGE = 205;
    static final int ASM_IFGT = 206;
    static final int ASM_IFLE = 207;
    static final int ASM_IFLT = 204;
    static final int ASM_IFNE = 203;
    static final int ASM_IFNONNULL = 219;
    static final int ASM_IFNULL = 218;
    static final int ASM_IFNULL_OPCODE_DELTA = 20;
    static final int ASM_IF_ACMPEQ = 214;
    static final int ASM_IF_ACMPNE = 215;
    static final int ASM_IF_ICMPEQ = 208;
    static final int ASM_IF_ICMPGE = 211;
    static final int ASM_IF_ICMPGT = 212;
    static final int ASM_IF_ICMPLE = 213;
    static final int ASM_IF_ICMPLT = 210;
    static final int ASM_IF_ICMPNE = 209;
    static final int ASM_JSR = 217;
    static final int ASM_OPCODE_DELTA = 49;
    static final int ASTORE_0 = 75;
    static final int ASTORE_1 = 76;
    static final int ASTORE_2 = 77;
    static final int ASTORE_3 = 78;
    static final String BOOTSTRAP_METHODS = "BootstrapMethods";
    static final String CODE = "Code";
    static final String CONSTANT_VALUE = "ConstantValue";
    static final String DEPRECATED = "Deprecated";
    static final int DLOAD_0 = 38;
    static final int DLOAD_1 = 39;
    static final int DLOAD_2 = 40;
    static final int DLOAD_3 = 41;
    static final int DSTORE_0 = 71;
    static final int DSTORE_1 = 72;
    static final int DSTORE_2 = 73;
    static final int DSTORE_3 = 74;
    static final String ENCLOSING_METHOD = "EnclosingMethod";
    static final String EXCEPTIONS = "Exceptions";
    static final int FLOAD_0 = 34;
    static final int FLOAD_1 = 35;
    static final int FLOAD_2 = 36;
    static final int FLOAD_3 = 37;
    static final int FSTORE_0 = 67;
    static final int FSTORE_1 = 68;
    static final int FSTORE_2 = 69;
    static final int FSTORE_3 = 70;
    static final int F_INSERT = 256;
    static final int GOTO_W = 200;
    static final int ILOAD_0 = 26;
    static final int ILOAD_1 = 27;
    static final int ILOAD_2 = 28;
    static final int ILOAD_3 = 29;
    static final String INNER_CLASSES = "InnerClasses";
    static final int ISTORE_0 = 59;
    static final int ISTORE_1 = 60;
    static final int ISTORE_2 = 61;
    static final int ISTORE_3 = 62;
    static final int JSR_W = 201;
    static final int LDC2_W = 20;
    static final int LDC_W = 19;
    static final String LINE_NUMBER_TABLE = "LineNumberTable";
    static final int LLOAD_0 = 30;
    static final int LLOAD_1 = 31;
    static final int LLOAD_2 = 32;
    static final int LLOAD_3 = 33;
    static final String LOCAL_VARIABLE_TABLE = "LocalVariableTable";
    static final String LOCAL_VARIABLE_TYPE_TABLE = "LocalVariableTypeTable";
    static final int LSTORE_0 = 63;
    static final int LSTORE_1 = 64;
    static final int LSTORE_2 = 65;
    static final int LSTORE_3 = 66;
    static final String METHOD_PARAMETERS = "MethodParameters";
    static final String MODULE = "Module";
    static final String MODULE_MAIN_CLASS = "ModuleMainClass";
    static final String MODULE_PACKAGES = "ModulePackages";
    static final String NEST_HOST = "NestHost";
    static final String NEST_MEMBERS = "NestMembers";
    static final String PERMITTED_SUBCLASSES = "PermittedSubclasses";
    static final String RECORD = "Record";
    static final String RUNTIME_INVISIBLE_ANNOTATIONS = "RuntimeInvisibleAnnotations";
    static final String RUNTIME_INVISIBLE_PARAMETER_ANNOTATIONS = "RuntimeInvisibleParameterAnnotations";
    static final String RUNTIME_INVISIBLE_TYPE_ANNOTATIONS = "RuntimeInvisibleTypeAnnotations";
    static final String RUNTIME_VISIBLE_ANNOTATIONS = "RuntimeVisibleAnnotations";
    static final String RUNTIME_VISIBLE_PARAMETER_ANNOTATIONS = "RuntimeVisibleParameterAnnotations";
    static final String RUNTIME_VISIBLE_TYPE_ANNOTATIONS = "RuntimeVisibleTypeAnnotations";
    static final String SIGNATURE = "Signature";
    static final String SOURCE_DEBUG_EXTENSION = "SourceDebugExtension";
    static final String SOURCE_FILE = "SourceFile";
    static final String STACK_MAP_TABLE = "StackMapTable";
    static final String SYNTHETIC = "Synthetic";
    static final int WIDE = 196;
    static final int WIDE_JUMP_OPCODE_DELTA = 33;

    private Constants() {
    }

    static void checkAsmExperimental(Object obj) {
        Class<?> cls = obj.getClass();
        String strReplace = cls.getName().replace('.', '/');
        if (isWhitelisted(strReplace)) {
            return;
        }
        checkIsPreview(cls.getClassLoader().getResourceAsStream(strReplace + ".class"));
    }

    static boolean isWhitelisted(String str) {
        if (!str.startsWith("org/objectweb/asm/")) {
            return false;
        }
        if (!str.contains("Test$")) {
            if (!Pattern.matches("org/objectweb/asm/util/Trace(Annotation|Class|Field|Method|Module|RecordComponent|Signature)Visitor(\\$.*)?", str)) {
                if (!Pattern.matches("org/objectweb/asm/util/Check(Annotation|Class|Field|Method|Module|RecordComponent|Signature)Adapter(\\$.*)?", str)) {
                    return false;
                }
            }
        }
        return true;
    }

    static void checkIsPreview(InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalStateException("Bytecode not available, can't check class version");
        }
        try {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            try {
                dataInputStream.readInt();
                int unsignedShort = dataInputStream.readUnsignedShort();
                dataInputStream.close();
                if (unsignedShort != 65535) {
                    throw new IllegalStateException("ASM9_EXPERIMENTAL can only be used by classes compiled with --enable-preview");
                }
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (IOException e) {
            throw new IllegalStateException("I/O error, can't check class version", e);
        }
    }
}
