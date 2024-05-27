package yukams.app.background_locator_2

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class BootBroadcastReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action == "android.intent.action.BOOT_COMPLETED") {
            Log.d("BootCompletedReceiver", "Device has been activated.");
            BackgroundLocatorPlugin.registerAfterBoot(context)
        } else {
            Log.d("BootCompletedReceiver", "Device has not been activated.");
        }
    }
}
