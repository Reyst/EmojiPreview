package gsihome.reyst.emoji_preview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.emoji.text.EmojiCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        EmojiCompat.init(androidx.emoji.bundled.BundledEmojiCompatConfig(this))

        setContentView(R.layout.activity_main)
    }
}