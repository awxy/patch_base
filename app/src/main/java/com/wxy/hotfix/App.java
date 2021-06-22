package com.wxy.hotfix;

import android.app.Application;
import androidx.annotation.NonNull;

import com.wxy.hotfix.base.ChangeQuickRedirect;


/**
 * <pre>
 *     author : wxy
 *     e-mail : awxy115@163.com
 *     time   : 2021/05/19
 *     desc   :
 *     version: 1.0
 * </pre>
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(@NonNull Thread t, @NonNull Throwable e) {
//                Intent intent = new Intent();
//                intent.setClass(App.this, MainActivity.class);
//                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                startActivity(intent);
//                PendingIntent pendingIntent =
//                        PendingIntent.getActivity(App.this, 0, intent, PendingIntent.FLAG_ONE_SHOT);
//                ((AlarmManager) App.this.getSystemService(Context.ALARM_SERVICE)).set(AlarmManager.RTC, System.currentTimeMillis() + 100, pendingIntent);
//                Process.killProcess(Process.myPid());
//                System.exit(0);
            }
        });
    }


}