package com.unity.androidnotifications;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/* loaded from: classes4.dex */
class UnityNotificationUtilities {
    private static final int INTENT_SERIALIZATION_VERSION = 0;
    private static final int NOTIFICATION_SERIALIZATION_VERSION = 3;
    static final String SAVED_NOTIFICATION_FALLBACK_KEY = "fallback.data";
    static final String SAVED_NOTIFICATION_PRIMARY_KEY = "data";
    static final byte[] UNITY_MAGIC_NUMBER = {85, 77, 78, 78};
    private static final byte[] UNITY_MAGIC_NUMBER_PARCELLED = {85, 77, 78, 80};

    UnityNotificationUtilities() {
    }

    protected static int findResourceIdInContextByName(Context context, String str) {
        if (str == null) {
            return 0;
        }
        try {
            Resources resources = context.getResources();
            if (resources != null) {
                int identifier = resources.getIdentifier(str, "mipmap", context.getPackageName());
                return identifier == 0 ? resources.getIdentifier(str, "drawable", context.getPackageName()) : identifier;
            }
        } catch (Resources.NotFoundException unused) {
        }
        return 0;
    }

    protected static void serializeNotification(SharedPreferences sharedPreferences, Notification notification, boolean z) throws IOException {
        String strEncodeToString;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            if (z) {
                Intent intent = new Intent();
                intent.putExtra(UnityNotificationManager.KEY_NOTIFICATION, notification);
                if (!serializeNotificationParcel(intent, dataOutputStream)) {
                    return;
                }
                dataOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                strEncodeToString = Base64.encodeToString(byteArray, 0, byteArray.length, 0);
            } else {
                if (!serializeNotificationCustom(notification, dataOutputStream)) {
                    return;
                }
                dataOutputStream.flush();
                byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                strEncodeToString = Base64.encodeToString(byteArray2, 0, byteArray2.length, 0);
            }
            SharedPreferences.Editor editorClear = sharedPreferences.edit().clear();
            editorClear.putString("data", strEncodeToString);
            editorClear.apply();
        } catch (Exception e) {
            Log.e("UnityNotifications", "Failed to serialize notification", e);
        }
    }

    static boolean serializeNotificationParcel(Intent intent, DataOutputStream dataOutputStream) throws IOException {
        try {
            byte[] bArrSerializeParcelable = serializeParcelable(intent);
            if (bArrSerializeParcelable != null && bArrSerializeParcelable.length != 0) {
                dataOutputStream.write(UNITY_MAGIC_NUMBER_PARCELLED);
                dataOutputStream.writeInt(0);
                dataOutputStream.writeInt(bArrSerializeParcelable.length);
                dataOutputStream.write(bArrSerializeParcelable);
                return true;
            }
            return false;
        } catch (Exception e) {
            Log.e("UnityNotifications", "Failed to serialize notification as Parcel", e);
            return false;
        } catch (OutOfMemoryError e2) {
            Log.e("UnityNotifications", "Failed to serialize notification as Parcel", e2);
            return false;
        }
    }

    private static boolean serializeNotificationCustom(Notification notification, DataOutputStream dataOutputStream) throws IOException {
        try {
            dataOutputStream.write(UNITY_MAGIC_NUMBER);
            dataOutputStream.writeInt(3);
            boolean z = notification.extras.getBoolean(NotificationCompat.EXTRA_SHOW_WHEN, false);
            dataOutputStream.writeInt(notification.extras.getInt("id"));
            serializeString(dataOutputStream, notification.extras.getString(NotificationCompat.EXTRA_TITLE));
            serializeString(dataOutputStream, notification.extras.getString(NotificationCompat.EXTRA_TEXT));
            serializeString(dataOutputStream, notification.extras.getString(UnityNotificationManager.KEY_SMALL_ICON));
            serializeString(dataOutputStream, notification.extras.getString(UnityNotificationManager.KEY_LARGE_ICON));
            dataOutputStream.writeLong(notification.extras.getLong(UnityNotificationManager.KEY_FIRE_TIME, -1L));
            dataOutputStream.writeLong(notification.extras.getLong(UnityNotificationManager.KEY_REPEAT_INTERVAL, -1L));
            serializeString(dataOutputStream, notification.extras.getString(NotificationCompat.EXTRA_BIG_TEXT));
            dataOutputStream.writeBoolean(notification.extras.getBoolean(NotificationCompat.EXTRA_SHOW_CHRONOMETER, false));
            dataOutputStream.writeBoolean(z);
            serializeString(dataOutputStream, notification.extras.getString("data"));
            dataOutputStream.writeBoolean(notification.extras.getBoolean(UnityNotificationManager.KEY_SHOW_IN_FOREGROUND, true));
            String string = notification.extras.getString(UnityNotificationManager.KEY_BIG_PICTURE);
            serializeString(dataOutputStream, string);
            if (string != null && string.length() > 0) {
                serializeString(dataOutputStream, notification.extras.getString(UnityNotificationManager.KEY_BIG_LARGE_ICON));
                serializeString(dataOutputStream, notification.extras.getString(UnityNotificationManager.KEY_BIG_CONTENT_TITLE));
                serializeString(dataOutputStream, notification.extras.getString(UnityNotificationManager.KEY_BIG_CONTENT_DESCRIPTION));
                serializeString(dataOutputStream, notification.extras.getString(UnityNotificationManager.KEY_BIG_SUMMARY_TEXT));
                dataOutputStream.writeBoolean(notification.extras.getBoolean(UnityNotificationManager.KEY_BIG_SHOW_WHEN_COLLAPSED, false));
            }
            serializeString(dataOutputStream, Build.VERSION.SDK_INT < 26 ? null : notification.getChannelId());
            Integer notificationColor = UnityNotificationManager.getNotificationColor(notification);
            dataOutputStream.writeBoolean(notificationColor != null);
            if (notificationColor != null) {
                dataOutputStream.writeInt(notificationColor.intValue());
            }
            dataOutputStream.writeInt(notification.number);
            dataOutputStream.writeBoolean((notification.flags & 16) != 0);
            serializeString(dataOutputStream, notification.getGroup());
            dataOutputStream.writeBoolean((notification.flags & 512) != 0);
            dataOutputStream.writeInt(UnityNotificationManager.getNotificationGroupAlertBehavior(notification));
            serializeString(dataOutputStream, notification.getSortKey());
            if (z) {
                dataOutputStream.writeLong(notification.when);
            }
            return true;
        } catch (Exception e) {
            Log.e("UnityNotifications", "Failed to serialize notification", e);
            return false;
        }
    }

    static void serializeString(DataOutputStream dataOutputStream, String str) throws IOException {
        if (str == null || str.length() == 0) {
            dataOutputStream.writeInt(0);
            return;
        }
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        dataOutputStream.writeInt(bytes.length);
        dataOutputStream.write(bytes);
    }

    static byte[] serializeParcelable(Parcelable parcelable) {
        try {
            Parcel parcelObtain = Parcel.obtain();
            Bundle bundle = new Bundle();
            bundle.putParcelable("obj", parcelable);
            parcelObtain.writeParcelable(bundle, 0);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            return bArrMarshall;
        } catch (Exception e) {
            Log.e("UnityNotifications", "Failed to serialize Parcelable", e);
            return null;
        } catch (OutOfMemoryError e2) {
            Log.e("UnityNotifications", "Failed to serialize Parcelable", e2);
            return null;
        }
    }

    protected static Object deserializeNotification(Context context, SharedPreferences sharedPreferences) {
        String string = sharedPreferences.getString("data", "");
        if (string != null && string.length() > 0) {
            Object objDeserializeNotification = deserializeNotification(context, Base64.decode(string, 0));
            if (objDeserializeNotification != null) {
                return objDeserializeNotification;
            }
            String string2 = sharedPreferences.getString(SAVED_NOTIFICATION_FALLBACK_KEY, "");
            if (string2 != null && string2.length() > 0) {
                return deserializeNotification(context, Base64.decode(string2, 0));
            }
        }
        return null;
    }

    private static Object deserializeNotification(Context context, byte[] bArr) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
        Notification notificationDeserializeNotificationParcelable = deserializeNotificationParcelable(dataInputStream);
        if (notificationDeserializeNotificationParcelable != null) {
            return notificationDeserializeNotificationParcelable;
        }
        byteArrayInputStream.reset();
        Notification.Builder builderDeserializeNotificationCustom = deserializeNotificationCustom(context, dataInputStream);
        return builderDeserializeNotificationCustom == null ? deserializedFromOldIntent(context, bArr) : builderDeserializeNotificationCustom;
    }

    private static boolean readAndCheckMagicNumber(DataInputStream dataInputStream, byte[] bArr) {
        for (byte b : bArr) {
            try {
                if (dataInputStream.readByte() != b) {
                    return false;
                }
            } catch (Exception unused) {
                return false;
            }
        }
        return true;
    }

    private static Notification deserializeNotificationParcelable(DataInputStream dataInputStream) {
        int i;
        try {
            if (readAndCheckMagicNumber(dataInputStream, UNITY_MAGIC_NUMBER_PARCELLED) && (i = dataInputStream.readInt()) >= 0 && i <= 0) {
                return (Notification) ((Intent) deserializeParcelable(dataInputStream)).getParcelableExtra(UnityNotificationManager.KEY_NOTIFICATION);
            }
            return null;
        } catch (Exception e) {
            Log.e("UnityNotifications", "Failed to deserialize notification intent", e);
            return null;
        } catch (OutOfMemoryError e2) {
            Log.e("UnityNotifications", "Failed to deserialize notification intent", e2);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0132 A[Catch: OutOfMemoryError -> 0x022d, Exception -> 0x0233, TryCatch #3 {Exception -> 0x0233, OutOfMemoryError -> 0x022d, blocks: (B:35:0x0128, B:37:0x0132, B:39:0x013f, B:41:0x0163, B:43:0x016a, B:45:0x0178, B:56:0x01bf, B:58:0x01c6, B:60:0x01cd, B:64:0x01e7, B:66:0x01ee, B:67:0x01f3, B:69:0x01ff, B:71:0x0205, B:72:0x020a, B:74:0x0216, B:76:0x021c, B:78:0x0223, B:62:0x01de, B:46:0x017e, B:48:0x0195, B:51:0x01a2, B:53:0x01ab, B:54:0x01b2), top: B:95:0x0128 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0163 A[Catch: OutOfMemoryError -> 0x022d, Exception -> 0x0233, TryCatch #3 {Exception -> 0x0233, OutOfMemoryError -> 0x022d, blocks: (B:35:0x0128, B:37:0x0132, B:39:0x013f, B:41:0x0163, B:43:0x016a, B:45:0x0178, B:56:0x01bf, B:58:0x01c6, B:60:0x01cd, B:64:0x01e7, B:66:0x01ee, B:67:0x01f3, B:69:0x01ff, B:71:0x0205, B:72:0x020a, B:74:0x0216, B:76:0x021c, B:78:0x0223, B:62:0x01de, B:46:0x017e, B:48:0x0195, B:51:0x01a2, B:53:0x01ab, B:54:0x01b2), top: B:95:0x0128 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0178 A[Catch: OutOfMemoryError -> 0x022d, Exception -> 0x0233, TryCatch #3 {Exception -> 0x0233, OutOfMemoryError -> 0x022d, blocks: (B:35:0x0128, B:37:0x0132, B:39:0x013f, B:41:0x0163, B:43:0x016a, B:45:0x0178, B:56:0x01bf, B:58:0x01c6, B:60:0x01cd, B:64:0x01e7, B:66:0x01ee, B:67:0x01f3, B:69:0x01ff, B:71:0x0205, B:72:0x020a, B:74:0x0216, B:76:0x021c, B:78:0x0223, B:62:0x01de, B:46:0x017e, B:48:0x0195, B:51:0x01a2, B:53:0x01ab, B:54:0x01b2), top: B:95:0x0128 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x017e A[Catch: OutOfMemoryError -> 0x022d, Exception -> 0x0233, TryCatch #3 {Exception -> 0x0233, OutOfMemoryError -> 0x022d, blocks: (B:35:0x0128, B:37:0x0132, B:39:0x013f, B:41:0x0163, B:43:0x016a, B:45:0x0178, B:56:0x01bf, B:58:0x01c6, B:60:0x01cd, B:64:0x01e7, B:66:0x01ee, B:67:0x01f3, B:69:0x01ff, B:71:0x0205, B:72:0x020a, B:74:0x0216, B:76:0x021c, B:78:0x0223, B:62:0x01de, B:46:0x017e, B:48:0x0195, B:51:0x01a2, B:53:0x01ab, B:54:0x01b2), top: B:95:0x0128 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01bf A[Catch: OutOfMemoryError -> 0x022d, Exception -> 0x0233, TryCatch #3 {Exception -> 0x0233, OutOfMemoryError -> 0x022d, blocks: (B:35:0x0128, B:37:0x0132, B:39:0x013f, B:41:0x0163, B:43:0x016a, B:45:0x0178, B:56:0x01bf, B:58:0x01c6, B:60:0x01cd, B:64:0x01e7, B:66:0x01ee, B:67:0x01f3, B:69:0x01ff, B:71:0x0205, B:72:0x020a, B:74:0x0216, B:76:0x021c, B:78:0x0223, B:62:0x01de, B:46:0x017e, B:48:0x0195, B:51:0x01a2, B:53:0x01ab, B:54:0x01b2), top: B:95:0x0128 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c6 A[Catch: OutOfMemoryError -> 0x022d, Exception -> 0x0233, TryCatch #3 {Exception -> 0x0233, OutOfMemoryError -> 0x022d, blocks: (B:35:0x0128, B:37:0x0132, B:39:0x013f, B:41:0x0163, B:43:0x016a, B:45:0x0178, B:56:0x01bf, B:58:0x01c6, B:60:0x01cd, B:64:0x01e7, B:66:0x01ee, B:67:0x01f3, B:69:0x01ff, B:71:0x0205, B:72:0x020a, B:74:0x0216, B:76:0x021c, B:78:0x0223, B:62:0x01de, B:46:0x017e, B:48:0x0195, B:51:0x01a2, B:53:0x01ab, B:54:0x01b2), top: B:95:0x0128 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01cd A[Catch: OutOfMemoryError -> 0x022d, Exception -> 0x0233, TryCatch #3 {Exception -> 0x0233, OutOfMemoryError -> 0x022d, blocks: (B:35:0x0128, B:37:0x0132, B:39:0x013f, B:41:0x0163, B:43:0x016a, B:45:0x0178, B:56:0x01bf, B:58:0x01c6, B:60:0x01cd, B:64:0x01e7, B:66:0x01ee, B:67:0x01f3, B:69:0x01ff, B:71:0x0205, B:72:0x020a, B:74:0x0216, B:76:0x021c, B:78:0x0223, B:62:0x01de, B:46:0x017e, B:48:0x0195, B:51:0x01a2, B:53:0x01ab, B:54:0x01b2), top: B:95:0x0128 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01e7 A[Catch: OutOfMemoryError -> 0x022d, Exception -> 0x0233, TryCatch #3 {Exception -> 0x0233, OutOfMemoryError -> 0x022d, blocks: (B:35:0x0128, B:37:0x0132, B:39:0x013f, B:41:0x0163, B:43:0x016a, B:45:0x0178, B:56:0x01bf, B:58:0x01c6, B:60:0x01cd, B:64:0x01e7, B:66:0x01ee, B:67:0x01f3, B:69:0x01ff, B:71:0x0205, B:72:0x020a, B:74:0x0216, B:76:0x021c, B:78:0x0223, B:62:0x01de, B:46:0x017e, B:48:0x0195, B:51:0x01a2, B:53:0x01ab, B:54:0x01b2), top: B:95:0x0128 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ee A[Catch: OutOfMemoryError -> 0x022d, Exception -> 0x0233, TryCatch #3 {Exception -> 0x0233, OutOfMemoryError -> 0x022d, blocks: (B:35:0x0128, B:37:0x0132, B:39:0x013f, B:41:0x0163, B:43:0x016a, B:45:0x0178, B:56:0x01bf, B:58:0x01c6, B:60:0x01cd, B:64:0x01e7, B:66:0x01ee, B:67:0x01f3, B:69:0x01ff, B:71:0x0205, B:72:0x020a, B:74:0x0216, B:76:0x021c, B:78:0x0223, B:62:0x01de, B:46:0x017e, B:48:0x0195, B:51:0x01a2, B:53:0x01ab, B:54:0x01b2), top: B:95:0x0128 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0223 A[Catch: OutOfMemoryError -> 0x022d, Exception -> 0x0233, TRY_LEAVE, TryCatch #3 {Exception -> 0x0233, OutOfMemoryError -> 0x022d, blocks: (B:35:0x0128, B:37:0x0132, B:39:0x013f, B:41:0x0163, B:43:0x016a, B:45:0x0178, B:56:0x01bf, B:58:0x01c6, B:60:0x01cd, B:64:0x01e7, B:66:0x01ee, B:67:0x01f3, B:69:0x01ff, B:71:0x0205, B:72:0x020a, B:74:0x0216, B:76:0x021c, B:78:0x0223, B:62:0x01de, B:46:0x017e, B:48:0x0195, B:51:0x01a2, B:53:0x01ab, B:54:0x01b2), top: B:95:0x0128 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.app.Notification.Builder deserializeNotificationCustom(android.content.Context r47, java.io.DataInputStream r48) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity.androidnotifications.UnityNotificationUtilities.deserializeNotificationCustom(android.content.Context, java.io.DataInputStream):android.app.Notification$Builder");
    }

    private static Notification.Builder deserializedFromOldIntent(Context context, byte[] bArr) {
        String str;
        String str2;
        String str3;
        String str4;
        Bundle bundle;
        int i;
        String string;
        String string2;
        String string3;
        String string4;
        boolean z;
        boolean z2;
        long j;
        long j2;
        String string5;
        try {
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            bundle = new Bundle();
            bundle.readFromParcel(parcelObtain);
            i = bundle.getInt("id", -1);
            string = bundle.getString(UnityNotificationManager.KEY_CHANNEL_ID);
            string2 = bundle.getString("textTitle");
            string3 = bundle.getString("textContent");
            string4 = bundle.getString("smallIconStr");
            z = bundle.getBoolean("autoCancel", false);
            z2 = bundle.getBoolean("usesChronometer", false);
            j = bundle.getLong(UnityNotificationManager.KEY_FIRE_TIME, -1L);
            j2 = bundle.getLong(UnityNotificationManager.KEY_REPEAT_INTERVAL, -1L);
            try {
                string5 = bundle.getString("largeIconStr");
            } catch (Exception e) {
                e = e;
                str4 = "UnityNotifications";
                str3 = "Failed to deserialize old style notification";
            } catch (OutOfMemoryError e2) {
                e = e2;
                str2 = "UnityNotifications";
                str = "Failed to deserialize old style notification";
            }
        } catch (Exception e3) {
            e = e3;
            str3 = "Failed to deserialize old style notification";
            str4 = "UnityNotifications";
        } catch (OutOfMemoryError e4) {
            e = e4;
            str = "Failed to deserialize old style notification";
            str2 = "UnityNotifications";
        }
        try {
            int i2 = bundle.getInt("style", -1);
            int i3 = bundle.getInt("color", 0);
            int i4 = bundle.getInt("number", 0);
            String string6 = bundle.getString("data");
            String string7 = bundle.getString("group");
            boolean z3 = bundle.getBoolean("groupSummary", false);
            String string8 = bundle.getString("sortKey");
            int i5 = bundle.getInt("groupAlertBehaviour", -1);
            boolean z4 = bundle.getBoolean("showTimestamp", false);
            Notification.Builder builderCreateNotificationBuilder = UnityNotificationManager.getNotificationManagerImpl(context).createNotificationBuilder(string);
            builderCreateNotificationBuilder.getExtras().putInt("id", i);
            builderCreateNotificationBuilder.setContentTitle(string2);
            builderCreateNotificationBuilder.setContentText(string3);
            UnityNotificationManager.setNotificationIcon(builderCreateNotificationBuilder, UnityNotificationManager.KEY_SMALL_ICON, string4);
            builderCreateNotificationBuilder.setAutoCancel(z);
            builderCreateNotificationBuilder.setUsesChronometer(z2);
            builderCreateNotificationBuilder.getExtras().putLong(UnityNotificationManager.KEY_FIRE_TIME, j);
            builderCreateNotificationBuilder.getExtras().putLong(UnityNotificationManager.KEY_REPEAT_INTERVAL, j2);
            UnityNotificationManager.setNotificationIcon(builderCreateNotificationBuilder, UnityNotificationManager.KEY_LARGE_ICON, string5);
            if (i2 == 2) {
                builderCreateNotificationBuilder.setStyle(new Notification.BigTextStyle().bigText(string3));
            }
            if (i3 != 0) {
                UnityNotificationManager.setNotificationColor(builderCreateNotificationBuilder, i3);
            }
            if (i4 >= 0) {
                builderCreateNotificationBuilder.setNumber(i4);
            }
            if (string6 != null) {
                builderCreateNotificationBuilder.getExtras().putString("data", string6);
            }
            if (string7 != null && string7.length() > 0) {
                builderCreateNotificationBuilder.setGroup(string7);
            }
            builderCreateNotificationBuilder.setGroupSummary(z3);
            if (string8 != null && string8.length() > 0) {
                builderCreateNotificationBuilder.setSortKey(string8);
            }
            UnityNotificationManager.setNotificationGroupAlertBehavior(builderCreateNotificationBuilder, i5);
            builderCreateNotificationBuilder.setShowWhen(z4);
            return builderCreateNotificationBuilder;
        } catch (Exception e5) {
            e = e5;
            str3 = "Failed to deserialize old style notification";
            str4 = "UnityNotifications";
            Log.e(str4, str3, e);
            return null;
        } catch (OutOfMemoryError e6) {
            e = e6;
            str = "Failed to deserialize old style notification";
            str2 = "UnityNotifications";
            Log.e(str2, str, e);
            return null;
        }
    }

    private static String deserializeString(DataInputStream dataInputStream) throws IOException {
        int i = dataInputStream.readInt();
        if (i <= 0) {
            return null;
        }
        byte[] bArr = new byte[i];
        if (dataInputStream.read(bArr) != i) {
            throw new IOException("Insufficient amount of bytes read");
        }
        return new String(bArr, StandardCharsets.UTF_8);
    }

    private static <T extends Parcelable> T deserializeParcelable(DataInputStream dataInputStream) throws IOException {
        int i = dataInputStream.readInt();
        if (i <= 0) {
            return null;
        }
        byte[] bArr = new byte[i];
        if (dataInputStream.read(bArr) != i) {
            throw new IOException("Insufficient amount of bytes read");
        }
        try {
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.unmarshall(bArr, 0, i);
            parcelObtain.setDataPosition(0);
            Bundle bundle = (Bundle) parcelObtain.readParcelable(UnityNotificationUtilities.class.getClassLoader());
            parcelObtain.recycle();
            if (bundle != null) {
                return (T) bundle.getParcelable("obj");
            }
        } catch (Exception e) {
            Log.e("UnityNotifications", "Failed to deserialize parcelable", e);
        } catch (OutOfMemoryError e2) {
            Log.e("UnityNotifications", "Failed to deserialize parcelable", e2);
        }
        return null;
    }

    protected static Class<?> getOpenAppActivity(Context context) {
        try {
            try {
                PackageManager packageManager = context.getPackageManager();
                Bundle bundle = packageManager.getApplicationInfo(context.getPackageName(), 128).metaData;
                if (bundle.containsKey("custom_notification_android_activity")) {
                    try {
                        return Class.forName(bundle.getString("custom_notification_android_activity"));
                    } catch (ClassNotFoundException e) {
                        Log.e("UnityNotifications", "Specified activity class for notifications not found: " + e.getMessage());
                    }
                }
                Log.w("UnityNotifications", "No custom_notification_android_activity found, attempting to find app activity class");
                boolean z = true;
                ActivityInfo[] activityInfoArr = packageManager.getPackageInfo(context.getPackageName(), 1).activities;
                if (activityInfoArr == null) {
                    Log.e("UnityNotifications", "Could not get package activities");
                    return null;
                }
                int length = activityInfoArr.length;
                String str = null;
                int i = 0;
                boolean z2 = false;
                boolean z3 = false;
                while (true) {
                    if (i >= length) {
                        z = z3;
                        break;
                    }
                    ActivityInfo activityInfo = activityInfoArr[i];
                    if (activityInfo.enabled && activityInfo.targetActivity == null) {
                        boolean zIsUnityActivity = isUnityActivity(activityInfo.name);
                        if (str == null) {
                            str = activityInfo.name;
                        } else if (z2 == zIsUnityActivity) {
                            if (z2 && zIsUnityActivity) {
                                break;
                            }
                            z3 = true;
                        } else if (zIsUnityActivity) {
                            str = activityInfo.name;
                            z3 = false;
                        }
                        z2 = zIsUnityActivity;
                    }
                    i++;
                }
                if (z) {
                    Log.e("UnityNotifications", "Multiple choices for activity for notifications, set activity explicitly in Notification Settings");
                    return null;
                }
                if (str == null) {
                    Log.e("UnityNotifications", "Activity class for notifications not found");
                    return null;
                }
                return Class.forName(str);
            } catch (PackageManager.NameNotFoundException e2) {
                e2.printStackTrace();
                return null;
            }
        } catch (ClassNotFoundException e3) {
            Log.e("UnityNotifications", "Failed to find activity class: " + e3.getMessage());
            return null;
        }
    }

    private static boolean isUnityActivity(String str) {
        return str.endsWith(".UnityPlayerActivity") || str.endsWith(".UnityPlayerGameActivity");
    }

    protected static Notification.Builder recoverBuilder(Context context, Notification notification) {
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                Notification.Builder builderRecoverBuilder = Notification.Builder.recoverBuilder(context, notification);
                builderRecoverBuilder.setExtras(notification.extras);
                return builderRecoverBuilder;
            }
        } catch (Exception e) {
            Log.e("UnityNotifications", "Failed to recover builder for notification!", e);
        } catch (OutOfMemoryError e2) {
            Log.e("UnityNotifications", "Failed to recover builder for notification!", e2);
        }
        return recoverBuilderCustom(context, notification);
    }

    private static Notification.Builder recoverBuilderCustom(Context context, Notification notification) {
        Notification.Builder builderCreateNotificationBuilder = UnityNotificationManager.getNotificationManagerImpl(context).createNotificationBuilder(notification.extras.getString(UnityNotificationManager.KEY_CHANNEL_ID));
        UnityNotificationManager.setNotificationIcon(builderCreateNotificationBuilder, UnityNotificationManager.KEY_SMALL_ICON, notification.extras.getString(UnityNotificationManager.KEY_SMALL_ICON));
        String string = notification.extras.getString(UnityNotificationManager.KEY_LARGE_ICON);
        if (string != null && !string.isEmpty()) {
            UnityNotificationManager.setNotificationIcon(builderCreateNotificationBuilder, UnityNotificationManager.KEY_LARGE_ICON, string);
        }
        builderCreateNotificationBuilder.setContentTitle(notification.extras.getString(NotificationCompat.EXTRA_TITLE));
        builderCreateNotificationBuilder.setContentText(notification.extras.getString(NotificationCompat.EXTRA_TEXT));
        builderCreateNotificationBuilder.setAutoCancel((notification.flags & 16) != 0);
        if (notification.number >= 0) {
            builderCreateNotificationBuilder.setNumber(notification.number);
        }
        String string2 = notification.extras.getString(NotificationCompat.EXTRA_BIG_TEXT);
        if (string2 != null) {
            builderCreateNotificationBuilder.setStyle(new Notification.BigTextStyle().bigText(string2));
        }
        builderCreateNotificationBuilder.setWhen(notification.when);
        String group = notification.getGroup();
        if (group != null && !group.isEmpty()) {
            builderCreateNotificationBuilder.setGroup(group);
        }
        builderCreateNotificationBuilder.setGroupSummary((notification.flags & 512) != 0);
        String sortKey = notification.getSortKey();
        if (sortKey != null && !sortKey.isEmpty()) {
            builderCreateNotificationBuilder.setSortKey(sortKey);
        }
        builderCreateNotificationBuilder.setShowWhen(notification.extras.getBoolean(NotificationCompat.EXTRA_SHOW_WHEN, false));
        Integer notificationColor = UnityNotificationManager.getNotificationColor(notification);
        if (notificationColor != null) {
            UnityNotificationManager.setNotificationColor(builderCreateNotificationBuilder, notificationColor.intValue());
        }
        UnityNotificationManager.setNotificationUsesChronometer(builderCreateNotificationBuilder, notification.extras.getBoolean(NotificationCompat.EXTRA_SHOW_CHRONOMETER, false));
        UnityNotificationManager.setNotificationGroupAlertBehavior(builderCreateNotificationBuilder, UnityNotificationManager.getNotificationGroupAlertBehavior(notification));
        builderCreateNotificationBuilder.getExtras().putInt("id", notification.extras.getInt("id", 0));
        builderCreateNotificationBuilder.getExtras().putLong(UnityNotificationManager.KEY_REPEAT_INTERVAL, notification.extras.getLong(UnityNotificationManager.KEY_REPEAT_INTERVAL, 0L));
        builderCreateNotificationBuilder.getExtras().putLong(UnityNotificationManager.KEY_FIRE_TIME, notification.extras.getLong(UnityNotificationManager.KEY_FIRE_TIME, 0L));
        String string3 = notification.extras.getString("data");
        if (string3 != null && !string3.isEmpty()) {
            builderCreateNotificationBuilder.getExtras().putString("data", string3);
        }
        return builderCreateNotificationBuilder;
    }
}
