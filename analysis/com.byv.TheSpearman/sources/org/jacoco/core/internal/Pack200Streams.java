package org.jacoco.core.internal;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.jar.JarInputStream;
import java.util.jar.JarOutputStream;

/* loaded from: classes5.dex */
public final class Pack200Streams {
    public static InputStream unpack(InputStream inputStream) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        JarOutputStream jarOutputStream = new JarOutputStream(byteArrayOutputStream);
        try {
            Class.forName("java.util.jar.Pack200$Unpacker").getMethod("unpack", InputStream.class, JarOutputStream.class).invoke(Class.forName("java.util.jar.Pack200").getMethod("newUnpacker", new Class[0]).invoke(null, new Object[0]), new NoCloseInput(inputStream), jarOutputStream);
            jarOutputStream.finish();
            return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        } catch (ClassNotFoundException e) {
            throw newIOException(e);
        } catch (IllegalAccessException e2) {
            throw newIOException(e2);
        } catch (NoSuchMethodException e3) {
            throw newIOException(e3);
        } catch (InvocationTargetException e4) {
            throw newIOException(e4.getCause());
        }
    }

    public static void pack(byte[] bArr, OutputStream outputStream) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        JarInputStream jarInputStream = new JarInputStream(new ByteArrayInputStream(bArr));
        try {
            Class.forName("java.util.jar.Pack200$Packer").getMethod("pack", JarInputStream.class, OutputStream.class).invoke(Class.forName("java.util.jar.Pack200").getMethod("newPacker", new Class[0]).invoke(null, new Object[0]), jarInputStream, outputStream);
        } catch (ClassNotFoundException e) {
            throw newIOException(e);
        } catch (IllegalAccessException e2) {
            throw newIOException(e2);
        } catch (NoSuchMethodException e3) {
            throw newIOException(e3);
        } catch (InvocationTargetException e4) {
            throw newIOException(e4.getCause());
        }
    }

    private static IOException newIOException(Throwable th) {
        IOException iOException = new IOException();
        iOException.initCause(th);
        return iOException;
    }

    private static class NoCloseInput extends FilterInputStream {
        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        protected NoCloseInput(InputStream inputStream) {
            super(inputStream);
        }
    }

    private Pack200Streams() {
    }
}
