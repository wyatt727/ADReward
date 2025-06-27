package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.webkit.ProxyConfig;
import com.google.android.exoplayer2.C;
import com.google.android.gms.ads.AdService;
import com.google.android.gms.ads.NotificationHandlerActivity;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.json.t2;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzefo extends zzbuh {
    final Map zza = new HashMap();
    private final Context zzb;
    private final zzduh zzc;
    private final com.google.android.gms.ads.internal.util.client.zzr zzd;
    private final zzefd zze;
    private String zzf;
    private String zzg;

    public zzefo(Context context, zzefd zzefdVar, com.google.android.gms.ads.internal.util.client.zzr zzrVar, zzduh zzduhVar) {
        this.zzb = context;
        this.zzc = zzduhVar;
        this.zzd = zzrVar;
        this.zze = zzefdVar;
    }

    public static void zzc(Context context, zzduh zzduhVar, zzefd zzefdVar, String str, String str2, Map map) {
        String strZze;
        String str3 = true != com.google.android.gms.ads.internal.zzu.zzo().zzz(context) ? "offline" : CustomTabsCallback.ONLINE_EXTRAS_KEY;
        if (zzduhVar != null) {
            zzdug zzdugVarZza = zzduhVar.zza();
            zzdugVarZza.zzb("gqi", str);
            zzdugVarZza.zzb(t2.h.h, str2);
            zzdugVarZza.zzb("device_connectivity", str3);
            zzdugVarZza.zzb("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis()));
            for (Map.Entry entry : map.entrySet()) {
                zzdugVarZza.zzb((String) entry.getKey(), (String) entry.getValue());
            }
            strZze = zzdugVarZza.zze();
        } else {
            strZze = "";
        }
        zzefdVar.zzd(new zzeff(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis(), str, strZze, 2));
    }

    public static final PendingIntent zzq(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        if (Build.VERSION.SDK_INT < 29 || !str.equals("offline_notification_clicked")) {
            intent.setClassName(context, AdService.CLASS_NAME);
            return zzftw.zzb(context, 0, intent, zzftw.zza | 1073741824, 0);
        }
        intent.setClassName(context, NotificationHandlerActivity.CLASS_NAME);
        return zzftw.zza(context, 0, intent, 201326592);
    }

    private final String zzr() {
        zzeev zzeevVar = (zzeev) this.zza.get(this.zzf);
        return zzeevVar == null ? "" : zzeevVar.zzb();
    }

    private static String zzs(int i, String str) {
        Resources resourcesZze = com.google.android.gms.ads.internal.zzu.zzo().zze();
        return resourcesZze == null ? str : resourcesZze.getString(i);
    }

    private final void zzt(String str, String str2, Map map) {
        zzc(this.zzb, this.zzc, this.zze, str, str2, map);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzu() throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r6 = this;
            com.google.android.gms.ads.internal.zzu.zzp()     // Catch: android.os.RemoteException -> L40
            android.content.Context r0 = r6.zzb     // Catch: android.os.RemoteException -> L40
            com.google.android.gms.ads.internal.util.zzbt r0 = com.google.android.gms.ads.internal.util.zzt.zzz(r0)     // Catch: android.os.RemoteException -> L40
            android.content.Context r1 = r6.zzb     // Catch: android.os.RemoteException -> L40
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r1)     // Catch: android.os.RemoteException -> L40
            com.google.android.gms.ads.internal.offline.buffering.zza r2 = new com.google.android.gms.ads.internal.offline.buffering.zza     // Catch: android.os.RemoteException -> L40
            java.lang.String r3 = r6.zzg     // Catch: android.os.RemoteException -> L40
            java.lang.String r4 = r6.zzf     // Catch: android.os.RemoteException -> L40
            java.util.Map r5 = r6.zza     // Catch: android.os.RemoteException -> L40
            java.lang.Object r5 = r5.get(r4)     // Catch: android.os.RemoteException -> L40
            com.google.android.gms.internal.ads.zzeev r5 = (com.google.android.gms.internal.ads.zzeev) r5     // Catch: android.os.RemoteException -> L40
            if (r5 != 0) goto L22
            java.lang.String r5 = ""
            goto L26
        L22:
            java.lang.String r5 = r5.zzc()     // Catch: android.os.RemoteException -> L40
        L26:
            r2.<init>(r3, r4, r5)     // Catch: android.os.RemoteException -> L40
            boolean r1 = r0.zzg(r1, r2)     // Catch: android.os.RemoteException -> L40
            if (r1 != 0) goto L47
            android.content.Context r2 = r6.zzb     // Catch: android.os.RemoteException -> L3e
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r2)     // Catch: android.os.RemoteException -> L3e
            java.lang.String r3 = r6.zzg     // Catch: android.os.RemoteException -> L3e
            java.lang.String r4 = r6.zzf     // Catch: android.os.RemoteException -> L3e
            boolean r1 = r0.zzf(r2, r3, r4)     // Catch: android.os.RemoteException -> L3e
            goto L47
        L3e:
            r0 = move-exception
            goto L42
        L40:
            r0 = move-exception
            r1 = 0
        L42:
            java.lang.String r2 = "Failed to schedule offline notification poster."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r2, r0)
        L47:
            if (r1 != 0) goto L5b
            com.google.android.gms.internal.ads.zzefd r0 = r6.zze
            java.lang.String r1 = r6.zzf
            r0.zzc(r1)
            java.lang.String r0 = r6.zzf
            com.google.android.gms.internal.ads.zzfzq r1 = com.google.android.gms.internal.ads.zzfzq.zzd()
            java.lang.String r2 = "offline_notification_worker_not_scheduled"
            r6.zzt(r0, r2, r1)
        L5b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzefo.zzu():void");
    }

    private final void zzv(final Activity activity, final com.google.android.gms.ads.internal.overlay.zzm zzmVar) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        com.google.android.gms.ads.internal.zzu.zzp();
        if (NotificationManagerCompat.from(activity).areNotificationsEnabled()) {
            zzu();
            zzw(activity, zzmVar);
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
                zzt(this.zzf, "asnpdi", zzfzq.zzd());
                return;
            }
            com.google.android.gms.ads.internal.zzu.zzp();
            AlertDialog.Builder builderZzK = com.google.android.gms.ads.internal.util.zzt.zzK(activity);
            builderZzK.setTitle(zzs(R.string.notifications_permission_title, "Allow app to send you notifications?")).setPositiveButton(zzs(R.string.notifications_permission_confirm, "Allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzefh
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
                    this.zza.zzd(activity, zzmVar, dialogInterface, i);
                }
            }).setNegativeButton(zzs(R.string.notifications_permission_decline, "Don't allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzefi
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.zza.zzk(zzmVar, dialogInterface, i);
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzefj
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    this.zza.zzl(zzmVar, dialogInterface);
                }
            });
            builderZzK.create().show();
            zzt(this.zzf, "rtsdi", zzfzq.zzd());
        }
    }

    private final void zzw(Activity activity, final com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        AlertDialog alertDialogCreate;
        com.google.android.gms.ads.internal.zzu.zzp();
        AlertDialog.Builder onCancelListener = com.google.android.gms.ads.internal.util.zzt.zzK(activity).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzefg
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                com.google.android.gms.ads.internal.overlay.zzm zzmVar2 = zzmVar;
                if (zzmVar2 != null) {
                    zzmVar2.zzb();
                }
            }
        });
        int i = R.layout.offline_ads_dialog;
        Resources resourcesZze = com.google.android.gms.ads.internal.zzu.zzo().zze();
        XmlResourceParser layout = resourcesZze == null ? null : resourcesZze.getLayout(i);
        if (layout == null) {
            onCancelListener.setMessage(zzs(R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
            alertDialogCreate = onCancelListener.create();
        } else {
            View viewInflate = activity.getLayoutInflater().inflate(layout, (ViewGroup) null);
            onCancelListener.setView(viewInflate);
            String strZzr = zzr();
            if (!strZzr.isEmpty()) {
                TextView textView = (TextView) viewInflate.findViewById(R.id.offline_dialog_advertiser_name);
                textView.setVisibility(0);
                textView.setText(strZzr);
            }
            zzeev zzeevVar = (zzeev) this.zza.get(this.zzf);
            Drawable drawableZza = zzeevVar != null ? zzeevVar.zza() : null;
            if (drawableZza != null) {
                ((ImageView) viewInflate.findViewById(R.id.offline_dialog_image)).setImageDrawable(drawableZza);
            }
            alertDialogCreate = onCancelListener.create();
            alertDialogCreate.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        alertDialogCreate.show();
        Timer timer = new Timer();
        timer.schedule(new zzefn(this, alertDialogCreate, timer, zzmVar), C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
    }

    final /* synthetic */ void zzd(Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        HashMap map = new HashMap();
        map.put("dialog_action", "confirm");
        zzt(this.zzf, "rtsdc", map);
        activity.startActivity(com.google.android.gms.ads.internal.zzu.zzq().zzf(activity));
        zzu();
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final void zze(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
            String stringExtra2 = intent.getStringExtra("gws_query_id");
            String stringExtra3 = intent.getStringExtra("uri");
            boolean zZzz = com.google.android.gms.ads.internal.zzu.zzo().zzz(this.zzb);
            HashMap map = new HashMap();
            if (stringExtra.equals("offline_notification_clicked")) {
                map.put("offline_notification_action", "offline_notification_clicked");
                c = true == zZzz ? (char) 1 : (char) 2;
                map.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                map.put("olaih", String.valueOf(stringExtra3.startsWith(ProxyConfig.MATCH_HTTP)));
                try {
                    Intent launchIntentForPackage = this.zzb.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                    if (launchIntentForPackage == null) {
                        launchIntentForPackage = new Intent("android.intent.action.VIEW");
                        launchIntentForPackage.setData(Uri.parse(stringExtra3));
                    }
                    launchIntentForPackage.addFlags(268435456);
                    this.zzb.startActivity(launchIntentForPackage);
                    map.put("olaa", "olas");
                } catch (ActivityNotFoundException unused) {
                    map.put("olaa", "olaf");
                }
            } else {
                map.put("offline_notification_action", "offline_notification_dismissed");
            }
            zzt(stringExtra2, "offline_notification_action", map);
            try {
                SQLiteDatabase writableDatabase = this.zze.getWritableDatabase();
                if (c == 1) {
                    this.zze.zzg(writableDatabase, this.zzd, stringExtra2);
                } else {
                    zzefd.zzi(writableDatabase, stringExtra2);
                }
            } catch (SQLiteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzg("Failed to get writable offline buffering database: ".concat(e.toString()));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final void zzf(String[] strArr, int[] iArr, IObjectWrapper iObjectWrapper) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals("android.permission.POST_NOTIFICATIONS")) {
                zzefq zzefqVar = (zzefq) ObjectWrapper.unwrap(iObjectWrapper);
                Activity activityZza = zzefqVar.zza();
                com.google.android.gms.ads.internal.overlay.zzm zzmVarZzb = zzefqVar.zzb();
                HashMap map = new HashMap();
                if (iArr[i] == 0) {
                    map.put("dialog_action", "confirm");
                    zzu();
                    zzw(activityZza, zzmVarZzb);
                } else {
                    map.put("dialog_action", "dismiss");
                    if (zzmVarZzb != null) {
                        zzmVarZzb.zzb();
                    }
                }
                zzt(this.zzf, "asnpdc", map);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final void zzg(IObjectWrapper iObjectWrapper) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        zzefq zzefqVar = (zzefq) ObjectWrapper.unwrap(iObjectWrapper);
        final Activity activityZza = zzefqVar.zza();
        final com.google.android.gms.ads.internal.overlay.zzm zzmVarZzb = zzefqVar.zzb();
        this.zzf = zzefqVar.zzc();
        this.zzg = zzefqVar.zzd();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zziu)).booleanValue()) {
            zzv(activityZza, zzmVarZzb);
            return;
        }
        zzt(this.zzf, "dialog_impression", zzfzq.zzd());
        com.google.android.gms.ads.internal.zzu.zzp();
        AlertDialog.Builder builderZzK = com.google.android.gms.ads.internal.util.zzt.zzK(activityZza);
        builderZzK.setTitle(zzs(R.string.offline_opt_in_title, "Open ad when you're back online.")).setMessage(zzs(R.string.offline_opt_in_message, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(zzs(R.string.offline_opt_in_confirm, "OK"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzefk
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
                this.zza.zzm(activityZza, zzmVarZzb, dialogInterface, i);
            }
        }).setNegativeButton(zzs(R.string.offline_opt_in_decline, "No thanks"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzefl
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.zza.zzn(zzmVarZzb, dialogInterface, i);
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzefm
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.zza.zzo(zzmVarZzb, dialogInterface);
            }
        });
        builderZzK.create().show();
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final void zzh() {
        final com.google.android.gms.ads.internal.util.client.zzr zzrVar = this.zzd;
        this.zze.zze(new zzfjq() { // from class: com.google.android.gms.internal.ads.zzeew
            @Override // com.google.android.gms.internal.ads.zzfjq
            public final Object zza(Object obj) throws Exception {
                zzefd.zzb(zzrVar, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final void zzi(IObjectWrapper iObjectWrapper, String str, String str2) {
        zzj(iObjectWrapper, new com.google.android.gms.ads.internal.offline.buffering.zza(str, str2, ""));
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final void zzj(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.offline.buffering.zza zzaVar) {
        Bitmap bitmapDecodeStream;
        String str;
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        String str2 = zzaVar.zza;
        String str3 = zzaVar.zzb;
        String str4 = zzaVar.zzc;
        String strZzr = zzr();
        com.google.android.gms.ads.internal.zzu.zzq().zzh(context, "offline_notification_channel", "AdMob Offline Notifications");
        PendingIntent pendingIntentZzq = zzq(context, "offline_notification_clicked", str3, str2);
        PendingIntent pendingIntentZzq2 = zzq(context, "offline_notification_dismissed", str3, str2);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "offline_notification_channel");
        if (strZzr.isEmpty()) {
            builder.setContentTitle(zzs(R.string.offline_notification_title, "You are back online! Let's pick up where we left off"));
        } else {
            builder.setContentTitle(String.format(zzs(R.string.offline_notification_title_with_advertiser, "You are back online! Continue learning about %s"), strZzr));
        }
        builder.setAutoCancel(true).setDeleteIntent(pendingIntentZzq2).setContentIntent(pendingIntentZzq).setSmallIcon(context.getApplicationInfo().icon).setPriority(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zziv)).intValue());
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzix)).booleanValue() || str4.isEmpty()) {
            bitmapDecodeStream = null;
        } else {
            try {
                bitmapDecodeStream = BitmapFactory.decodeStream(new URL(str4).openConnection().getInputStream());
            } catch (IOException unused) {
            }
        }
        if (bitmapDecodeStream != null) {
            try {
                builder.setLargeIcon(bitmapDecodeStream).setStyle(new NotificationCompat.BigPictureStyle().bigPicture(bitmapDecodeStream).bigLargeIcon(null));
            } catch (Resources.NotFoundException unused2) {
            }
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        HashMap map = new HashMap();
        try {
            notificationManager.notify(str3, 54321, builder.build());
            str = "offline_notification_impression";
        } catch (IllegalArgumentException e) {
            map.put("notification_not_shown_reason", e.getMessage());
            str = "offline_notification_failed";
        }
        zzt(str3, str, map);
    }

    final /* synthetic */ void zzk(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i) {
        this.zze.zzc(this.zzf);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        zzt(this.zzf, "rtsdc", map);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    final /* synthetic */ void zzl(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface) {
        this.zze.zzc(this.zzf);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        zzt(this.zzf, "rtsdc", map);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    final /* synthetic */ void zzm(Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        HashMap map = new HashMap();
        map.put("dialog_action", "confirm");
        zzt(this.zzf, "dialog_click", map);
        zzv(activity, zzmVar);
    }

    final /* synthetic */ void zzn(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i) {
        this.zze.zzc(this.zzf);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        zzt(this.zzf, "dialog_click", map);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    final /* synthetic */ void zzo(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface) {
        this.zze.zzc(this.zzf);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        zzt(this.zzf, "dialog_click", map);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    public final void zzp(String str, zzdky zzdkyVar) {
        String string = "";
        String strZzx = !TextUtils.isEmpty(zzdkyVar.zzx()) ? zzdkyVar.zzx() : zzdkyVar.zzB() != null ? zzdkyVar.zzB() : "";
        zzbhe zzbheVarZzm = zzdkyVar.zzm();
        if (zzbheVarZzm != null) {
            try {
                string = zzbheVarZzm.zze().toString();
            } catch (RemoteException unused) {
            }
        }
        zzbhe zzbheVarZzn = zzdkyVar.zzn();
        Drawable drawable = null;
        if (zzbheVarZzn != null) {
            try {
                IObjectWrapper iObjectWrapperZzf = zzbheVarZzn.zzf();
                if (iObjectWrapperZzf != null) {
                    drawable = (Drawable) ObjectWrapper.unwrap(iObjectWrapperZzf);
                }
            } catch (RemoteException unused2) {
            }
        }
        this.zza.put(str, new zzeer(strZzx, string, drawable));
    }
}
