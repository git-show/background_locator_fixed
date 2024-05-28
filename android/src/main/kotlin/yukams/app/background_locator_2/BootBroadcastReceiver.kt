package yukams.app.background_locator_2

import android.content.BroadcastReceiver
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.util.Log


class RebootBroadcastReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        Log.d(
            "RebootBroadcastReceiver", 
            "Received broadcast: ${intent?.action ?: "null action"}"
        )
        when (intent.action) {
            Intent.ACTION_REBOOT, Intent.ACTION_BOOT_COMPLETED -> {
                Log.i("NotificationListener", "Registering notification listener, after reboot!")
                BackgroundLocatorPlugin.registerAfterBoot(context)
            }
            else -> {
                Log.i("NotificationListener", intent.action.toString())
            }
        }
    }
}
