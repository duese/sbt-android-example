package cc.duese.example

import android.app.Activity
import android.os.Bundle

class MainActivity extends Activity {
  override def onCreate(savedInstanceState: Bundle): Unit = {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.main_activity)
  }
}