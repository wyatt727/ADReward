package com.unity.androidnotifications;

import android.app.Notification;
import android.util.Log;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedTransferQueue;

/* loaded from: classes4.dex */
public class UnityNotificationBackgroundThread extends Thread {
    private static final int TASKS_FOR_HOUSEKEEPING = 50;
    private UnityNotificationManager mManager;
    private ConcurrentHashMap<Integer, Notification.Builder> mScheduledNotifications;
    private LinkedTransferQueue<Task> mTasks = new LinkedTransferQueue<>();
    private int mTasksSinceHousekeeping = 50;

    private static abstract class Task {
        public abstract boolean run(UnityNotificationManager unityNotificationManager, ConcurrentHashMap<Integer, Notification.Builder> concurrentHashMap);

        private Task() {
        }
    }

    private static class ScheduleNotificationTask extends Task {
        private boolean isCustomized;
        private boolean isNew;
        private Notification.Builder notificationBuilder;
        private int notificationId;

        public ScheduleNotificationTask(int i, Notification.Builder builder, boolean z, boolean z2) {
            super();
            this.notificationId = i;
            this.notificationBuilder = builder;
            this.isCustomized = z;
            this.isNew = z2;
        }

        @Override // com.unity.androidnotifications.UnityNotificationBackgroundThread.Task
        public boolean run(UnityNotificationManager unityNotificationManager, ConcurrentHashMap<Integer, Notification.Builder> concurrentHashMap) {
            String strValueOf = String.valueOf(this.notificationId);
            Integer.valueOf(this.notificationId);
            try {
                UnityNotificationManager.mUnityNotificationManager.performNotificationScheduling(this.notificationId, this.notificationBuilder, this.isCustomized);
                return this.isNew;
            } catch (Throwable th) {
                concurrentHashMap.remove(Integer.valueOf(this.notificationId));
                unityNotificationManager.cancelPendingNotificationIntent(this.notificationId);
                unityNotificationManager.deleteExpiredNotificationIntent(strValueOf);
                throw th;
            }
        }
    }

    private static class CancelNotificationTask extends Task {
        private int notificationId;

        public CancelNotificationTask(int i) {
            super();
            this.notificationId = i;
        }

        @Override // com.unity.androidnotifications.UnityNotificationBackgroundThread.Task
        public boolean run(UnityNotificationManager unityNotificationManager, ConcurrentHashMap<Integer, Notification.Builder> concurrentHashMap) {
            unityNotificationManager.cancelPendingNotificationIntent(this.notificationId);
            if (concurrentHashMap.remove(Integer.valueOf(this.notificationId)) == null) {
                return false;
            }
            unityNotificationManager.deleteExpiredNotificationIntent(String.valueOf(this.notificationId));
            return true;
        }
    }

    private static class CancelAllNotificationsTask extends Task {
        private CancelAllNotificationsTask() {
            super();
        }

        @Override // com.unity.androidnotifications.UnityNotificationBackgroundThread.Task
        public boolean run(UnityNotificationManager unityNotificationManager, ConcurrentHashMap<Integer, Notification.Builder> concurrentHashMap) {
            if (concurrentHashMap.isEmpty()) {
                return false;
            }
            Enumeration<Integer> enumerationKeys = concurrentHashMap.keys();
            while (enumerationKeys.hasMoreElements()) {
                Integer numNextElement = enumerationKeys.nextElement();
                unityNotificationManager.cancelPendingNotificationIntent(numNextElement.intValue());
                unityNotificationManager.deleteExpiredNotificationIntent(String.valueOf(numNextElement));
            }
            concurrentHashMap.clear();
            return true;
        }
    }

    private static class HousekeepingTask extends Task {
        UnityNotificationBackgroundThread thread;

        public HousekeepingTask(UnityNotificationBackgroundThread unityNotificationBackgroundThread) {
            super();
            this.thread = unityNotificationBackgroundThread;
        }

        @Override // com.unity.androidnotifications.UnityNotificationBackgroundThread.Task
        public boolean run(UnityNotificationManager unityNotificationManager, ConcurrentHashMap<Integer, Notification.Builder> concurrentHashMap) {
            HashSet hashSet = new HashSet();
            Enumeration<Integer> enumerationKeys = concurrentHashMap.keys();
            while (enumerationKeys.hasMoreElements()) {
                hashSet.add(String.valueOf(enumerationKeys.nextElement()));
            }
            this.thread.performHousekeeping(hashSet);
            return false;
        }
    }

    public UnityNotificationBackgroundThread(UnityNotificationManager unityNotificationManager, ConcurrentHashMap<Integer, Notification.Builder> concurrentHashMap) {
        this.mManager = unityNotificationManager;
        this.mScheduledNotifications = concurrentHashMap;
        if (concurrentHashMap.size() == 0) {
            loadNotifications();
        }
    }

    public void enqueueNotification(int i, Notification.Builder builder, boolean z, boolean z2) {
        this.mTasks.add(new ScheduleNotificationTask(i, builder, z, z2));
    }

    public void enqueueCancelNotification(int i) {
        this.mTasks.add(new CancelNotificationTask(i));
    }

    public void enqueueCancelAllNotifications() {
        this.mTasks.add(new CancelAllNotificationsTask());
    }

    private void enqueueHousekeeping() {
        this.mTasks.add(new HousekeepingTask(this));
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws InterruptedException {
        while (true) {
            boolean zExecuteTask = false;
            while (true) {
                try {
                    Task taskTake = this.mTasks.take();
                    zExecuteTask |= executeTask(this.mManager, taskTake, this.mScheduledNotifications);
                    if (!(taskTake instanceof HousekeepingTask)) {
                        this.mTasksSinceHousekeeping++;
                    }
                } catch (InterruptedException unused) {
                }
                if (this.mTasks.size() == 0 && zExecuteTask) {
                    try {
                        enqueueHousekeeping();
                        break;
                    } catch (InterruptedException unused2) {
                        zExecuteTask = false;
                        if (this.mTasks.isEmpty()) {
                            return;
                        }
                    }
                }
            }
        }
    }

    private boolean executeTask(UnityNotificationManager unityNotificationManager, Task task, ConcurrentHashMap<Integer, Notification.Builder> concurrentHashMap) {
        try {
            return task.run(unityNotificationManager, concurrentHashMap);
        } catch (Exception e) {
            Log.e("UnityNotifications", "Exception executing notification task", e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void performHousekeeping(Set<String> set) {
        boolean z = this.mTasksSinceHousekeeping >= 50;
        this.mTasksSinceHousekeeping = 0;
        if (z) {
            this.mManager.performNotificationHousekeeping(set);
        }
        this.mManager.saveScheduledNotificationIDs(set);
    }

    private void loadNotifications() {
        for (Notification.Builder builder : this.mManager.loadSavedNotifications()) {
            this.mScheduledNotifications.put(Integer.valueOf(builder.getExtras().getInt("id", -1)), builder);
        }
    }
}
