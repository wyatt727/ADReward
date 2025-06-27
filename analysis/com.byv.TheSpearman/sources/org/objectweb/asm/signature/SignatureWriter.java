package org.objectweb.asm.signature;

import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes5.dex */
public class SignatureWriter extends SignatureVisitor {
    private int argumentStack;
    private boolean hasFormals;
    private boolean hasParameters;
    private final StringBuilder stringBuilder;

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public SignatureVisitor visitClassBound() {
        return this;
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public SignatureVisitor visitInterface() {
        return this;
    }

    public SignatureWriter() {
        super(589824);
        this.stringBuilder = new StringBuilder();
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public void visitFormalTypeParameter(String str) {
        if (!this.hasFormals) {
            this.hasFormals = true;
            this.stringBuilder.append(Typography.less);
        }
        this.stringBuilder.append(str);
        this.stringBuilder.append(AbstractJsonLexerKt.COLON);
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public SignatureVisitor visitInterfaceBound() {
        this.stringBuilder.append(AbstractJsonLexerKt.COLON);
        return this;
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public SignatureVisitor visitSuperclass() {
        endFormals();
        return this;
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public SignatureVisitor visitParameterType() {
        endFormals();
        if (!this.hasParameters) {
            this.hasParameters = true;
            this.stringBuilder.append('(');
        }
        return this;
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public SignatureVisitor visitReturnType() {
        endFormals();
        if (!this.hasParameters) {
            this.stringBuilder.append('(');
        }
        this.stringBuilder.append(')');
        return this;
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public SignatureVisitor visitExceptionType() {
        this.stringBuilder.append('^');
        return this;
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public void visitBaseType(char c) {
        this.stringBuilder.append(c);
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public void visitTypeVariable(String str) {
        this.stringBuilder.append('T');
        this.stringBuilder.append(str);
        this.stringBuilder.append(';');
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public SignatureVisitor visitArrayType() {
        this.stringBuilder.append(AbstractJsonLexerKt.BEGIN_LIST);
        return this;
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public void visitClassType(String str) {
        this.stringBuilder.append('L');
        this.stringBuilder.append(str);
        this.argumentStack *= 2;
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public void visitInnerClassType(String str) {
        endArguments();
        this.stringBuilder.append('.');
        this.stringBuilder.append(str);
        this.argumentStack *= 2;
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public void visitTypeArgument() {
        int i = this.argumentStack;
        if (i % 2 == 0) {
            this.argumentStack = i | 1;
            this.stringBuilder.append(Typography.less);
        }
        this.stringBuilder.append('*');
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public SignatureVisitor visitTypeArgument(char c) {
        int i = this.argumentStack;
        if (i % 2 == 0) {
            this.argumentStack = i | 1;
            this.stringBuilder.append(Typography.less);
        }
        if (c != '=') {
            this.stringBuilder.append(c);
        }
        return this;
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public void visitEnd() {
        endArguments();
        this.stringBuilder.append(';');
    }

    public String toString() {
        return this.stringBuilder.toString();
    }

    private void endFormals() {
        if (this.hasFormals) {
            this.hasFormals = false;
            this.stringBuilder.append(Typography.greater);
        }
    }

    private void endArguments() {
        if (this.argumentStack % 2 == 1) {
            this.stringBuilder.append(Typography.greater);
        }
        this.argumentStack /= 2;
    }
}
