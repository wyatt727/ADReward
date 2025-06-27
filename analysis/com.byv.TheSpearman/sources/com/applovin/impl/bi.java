package com.applovin.impl;

import android.opengl.GLES20;
import com.applovin.impl.zh;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* loaded from: classes.dex */
final class bi {
    private static final String[] j = {"uniform mat4 uMvpMatrix;", "uniform mat3 uTexMatrix;", "attribute vec4 aPosition;", "attribute vec2 aTexCoords;", "varying vec2 vTexCoords;", "void main() {", "  gl_Position = uMvpMatrix * aPosition;", "  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;", "}"};
    private static final String[] k = {"#extension GL_OES_EGL_image_external : require", "precision mediump float;", "uniform samplerExternalOES uTexture;", "varying vec2 vTexCoords;", "void main() {", "  gl_FragColor = texture2D(uTexture, vTexCoords);", "}"};
    private static final float[] l = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    private static final float[] m = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};
    private static final float[] n = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};
    private static final float[] o = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    private static final float[] p = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    private int f294a;
    private a b;
    private a c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;

    bi() {
    }

    public void b(zh zhVar) {
        if (a(zhVar)) {
            this.f294a = zhVar.c;
            a aVar = new a(zhVar.f1244a.a(0));
            this.b = aVar;
            if (!zhVar.d) {
                aVar = new a(zhVar.b.a(0));
            }
            this.c = aVar;
        }
    }

    void a(int i, float[] fArr, boolean z) {
        float[] fArr2;
        a aVar = z ? this.c : this.b;
        if (aVar == null) {
            return;
        }
        GLES20.glUseProgram(this.d);
        z9.a();
        GLES20.glEnableVertexAttribArray(this.g);
        GLES20.glEnableVertexAttribArray(this.h);
        z9.a();
        int i2 = this.f294a;
        if (i2 == 1) {
            fArr2 = z ? n : m;
        } else if (i2 == 2) {
            fArr2 = z ? p : o;
        } else {
            fArr2 = l;
        }
        GLES20.glUniformMatrix3fv(this.f, 1, false, fArr2, 0);
        GLES20.glUniformMatrix4fv(this.e, 1, false, fArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        GLES20.glUniform1i(this.i, 0);
        z9.a();
        GLES20.glVertexAttribPointer(this.g, 3, 5126, false, 12, (Buffer) aVar.b);
        z9.a();
        GLES20.glVertexAttribPointer(this.h, 2, 5126, false, 8, (Buffer) aVar.c);
        z9.a();
        GLES20.glDrawArrays(aVar.d, 0, aVar.f295a);
        z9.a();
        GLES20.glDisableVertexAttribArray(this.g);
        GLES20.glDisableVertexAttribArray(this.h);
    }

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f295a;
        private final FloatBuffer b;
        private final FloatBuffer c;
        private final int d;

        public a(zh.b bVar) {
            this.f295a = bVar.a();
            this.b = z9.a(bVar.c);
            this.c = z9.a(bVar.d);
            int i = bVar.b;
            if (i == 1) {
                this.d = 5;
            } else if (i != 2) {
                this.d = 4;
            } else {
                this.d = 6;
            }
        }
    }

    void a() {
        int iA = z9.a(j, k);
        this.d = iA;
        this.e = GLES20.glGetUniformLocation(iA, "uMvpMatrix");
        this.f = GLES20.glGetUniformLocation(this.d, "uTexMatrix");
        this.g = GLES20.glGetAttribLocation(this.d, "aPosition");
        this.h = GLES20.glGetAttribLocation(this.d, "aTexCoords");
        this.i = GLES20.glGetUniformLocation(this.d, "uTexture");
    }

    public static boolean a(zh zhVar) {
        zh.a aVar = zhVar.f1244a;
        zh.a aVar2 = zhVar.b;
        return aVar.a() == 1 && aVar.a(0).f1246a == 0 && aVar2.a() == 1 && aVar2.a(0).f1246a == 0;
    }
}
