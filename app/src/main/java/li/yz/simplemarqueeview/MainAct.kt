package li.yz.simplemarqueeview

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import li.yz.simplemarqueeviewlib.SimpleMarqueeView

/**
 * createed by liyuzheng on 2019/7/26 11:26
 */
class MainAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_act)

        val text = findViewById<SimpleMarqueeView>(R.id.text)
        val text1 = findViewById<SimpleMarqueeView>(R.id.text1)
        val text2 = findViewById<TextView>(R.id.text2)

        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)
        val btn3 = findViewById<Button>(R.id.btn3)
        val btn4 = findViewById<Button>(R.id.btn4)
        text.setText("1998")
        text.visibility = View.VISIBLE
        text2.text =
            "Hello World! This is textview marquee.  You can use SimpleMarqueeView instead of this"
        text2.isSelected = true
        Log.v("text1", "1 ")

        text1.visibility = View.GONE
        Log.v("text1", "2 ")
        text1.visibility = View.VISIBLE

        Log.v("text1", "3 ")
        text1.setText("1231231")
        text1.setText("Hello World! This is textview marquee.  You can use SimpleMarqueeView instead of this")
        text.setText("Hello World! This is textview marquee.  You can use SimpleMarqueeView instead of this1")
        text1.visibility = View.GONE
        text1.visibility = View.VISIBLE
        text1.setText("129")
        text1.setText("Hello World! This is textview marquee.  You can use SimpleMarqueeView instead of this")
//        text1.postDelayed({
//            text1.setText("Hello World! This is textview marquee.  You can use SimpleMarqueeView instead of this")
//        },10000)
        btn1.setOnClickListener {
            text1.setText("Hello World! This is textview marquee.  You can use SimpleMarqueeView instead of this")
        }
        btn2.setOnClickListener {
            text1.setText("129")
        }
        btn3.setOnClickListener {
            text1.visibility = View.VISIBLE
        }
        btn4.setOnClickListener {
            text1.visibility = View.GONE
        }
    }

    override fun onPause() {
        super.onPause()
//        text1.pause()
    }

    override fun onResume() {
        super.onResume()
//        text1.resume()
    }
}