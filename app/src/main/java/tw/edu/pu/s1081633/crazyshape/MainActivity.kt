package tw.edu.pu.s1081633.crazyshape

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.annotation.GlideModule
import com.bumptech.glide.module.AppGlideModule
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var PictureNo:Int = 0  //目前顯示第幾張圖
        var TotalPictures:Int = 4 //總共幾張圖片(假設僅顯示pu0-pu3)


        fun ShowPicture(){

            when (PictureNo){
                0 -> img.setImageResource(R.drawable.circle)
                1 -> img.setImageResource(R.drawable.square)
                2 -> img.setImageResource(R.drawable.star)
                3 -> img.setImageResource(R.drawable.triangle)
            }
        }

        Toast.makeText(baseContext, "作者：巫宜庭", Toast.LENGTH_LONG).show()

        imgNext.setOnLongClickListener(object : View.OnLongClickListener {
            override fun onLongClick(p0: View?): Boolean {
                intent = Intent(this@MainActivity, GameActivity::class.java)
                startActivity(intent)
                return true
            }
            override fun onSingleTapUp(p0: MotionEvent?): Boolean {
                gDetector.onTouchEvent(event)
                return true
            }
        })

    }

}