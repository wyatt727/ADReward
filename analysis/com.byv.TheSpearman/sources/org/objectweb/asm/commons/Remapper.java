package org.objectweb.asm.commons;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Type;
import org.objectweb.asm.signature.SignatureReader;
import org.objectweb.asm.signature.SignatureVisitor;
import org.objectweb.asm.signature.SignatureWriter;

/* loaded from: classes5.dex */
public abstract class Remapper {
    public String map(String str) {
        return str;
    }

    public String mapAnnotationAttributeName(String str, String str2) {
        return str2;
    }

    public String mapFieldName(String str, String str2, String str3) {
        return str2;
    }

    public String mapInvokeDynamicMethodName(String str, String str2) {
        return str;
    }

    public String mapMethodName(String str, String str2, String str3) {
        return str2;
    }

    public String mapModuleName(String str) {
        return str;
    }

    public String mapPackageName(String str) {
        return str;
    }

    public String mapRecordComponentName(String str, String str2, String str3) {
        return str2;
    }

    public String mapDesc(String str) {
        return mapType(Type.getType(str)).getDescriptor();
    }

    private Type mapType(Type type) {
        switch (type.getSort()) {
            case 9:
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < type.getDimensions(); i++) {
                    sb.append(AbstractJsonLexerKt.BEGIN_LIST);
                }
                sb.append(mapType(type.getElementType()).getDescriptor());
                return Type.getType(sb.toString());
            case 10:
                String map = map(type.getInternalName());
                return map != null ? Type.getObjectType(map) : type;
            case 11:
                return Type.getMethodType(mapMethodDesc(type.getDescriptor()));
            default:
                return type;
        }
    }

    public String mapType(String str) {
        if (str == null) {
            return null;
        }
        return mapType(Type.getObjectType(str)).getInternalName();
    }

    public String[] mapTypes(String[] strArr) {
        String[] strArr2 = null;
        for (int i = 0; i < strArr.length; i++) {
            String strMapType = mapType(strArr[i]);
            if (strMapType != null) {
                if (strArr2 == null) {
                    strArr2 = (String[]) strArr.clone();
                }
                strArr2[i] = strMapType;
            }
        }
        return strArr2 != null ? strArr2 : strArr;
    }

    public String mapMethodDesc(String str) {
        if ("()V".equals(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder("(");
        for (Type type : Type.getArgumentTypes(str)) {
            sb.append(mapType(type).getDescriptor());
        }
        Type returnType = Type.getReturnType(str);
        if (returnType == Type.VOID_TYPE) {
            sb.append(")V");
        } else {
            sb.append(')');
            sb.append(mapType(returnType).getDescriptor());
        }
        return sb.toString();
    }

    public Object mapValue(Object obj) {
        String strMapMethodDesc;
        if (obj instanceof Type) {
            return mapType((Type) obj);
        }
        if (obj instanceof Handle) {
            Handle handle = (Handle) obj;
            int tag = handle.getTag();
            String strMapType = mapType(handle.getOwner());
            String strMapMethodName = mapMethodName(handle.getOwner(), handle.getName(), handle.getDesc());
            if (handle.getTag() <= 4) {
                strMapMethodDesc = mapDesc(handle.getDesc());
            } else {
                strMapMethodDesc = mapMethodDesc(handle.getDesc());
            }
            return new Handle(tag, strMapType, strMapMethodName, strMapMethodDesc, handle.isInterface());
        }
        if (!(obj instanceof ConstantDynamic)) {
            return obj;
        }
        ConstantDynamic constantDynamic = (ConstantDynamic) obj;
        int bootstrapMethodArgumentCount = constantDynamic.getBootstrapMethodArgumentCount();
        Object[] objArr = new Object[bootstrapMethodArgumentCount];
        for (int i = 0; i < bootstrapMethodArgumentCount; i++) {
            objArr[i] = mapValue(constantDynamic.getBootstrapMethodArgument(i));
        }
        String descriptor = constantDynamic.getDescriptor();
        return new ConstantDynamic(mapInvokeDynamicMethodName(constantDynamic.getName(), descriptor), mapDesc(descriptor), (Handle) mapValue(constantDynamic.getBootstrapMethod()), objArr);
    }

    public String mapSignature(String str, boolean z) {
        if (str == null) {
            return null;
        }
        SignatureReader signatureReader = new SignatureReader(str);
        SignatureWriter signatureWriter = new SignatureWriter();
        SignatureVisitor signatureVisitorCreateSignatureRemapper = createSignatureRemapper(signatureWriter);
        if (z) {
            signatureReader.acceptType(signatureVisitorCreateSignatureRemapper);
        } else {
            signatureReader.accept(signatureVisitorCreateSignatureRemapper);
        }
        return signatureWriter.toString();
    }

    @Deprecated
    protected SignatureVisitor createRemappingSignatureAdapter(SignatureVisitor signatureVisitor) {
        return createSignatureRemapper(signatureVisitor);
    }

    protected SignatureVisitor createSignatureRemapper(SignatureVisitor signatureVisitor) {
        return new SignatureRemapper(signatureVisitor, this);
    }

    public String mapInnerClassName(String str, String str2, String str3) {
        String strMapType = mapType(str);
        if (!strMapType.contains("$")) {
            return str3;
        }
        int iLastIndexOf = strMapType.lastIndexOf(36);
        do {
            iLastIndexOf++;
            if (iLastIndexOf >= strMapType.length()) {
                break;
            }
        } while (Character.isDigit(strMapType.charAt(iLastIndexOf)));
        return strMapType.substring(iLastIndexOf);
    }
}
