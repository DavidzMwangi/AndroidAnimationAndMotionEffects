package ke.co.neverest.animations

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity(),Animation.AnimationListener {


    lateinit var txtMessage:TextView
    lateinit var btn: Button
    lateinit var animFadein: Animation



    private lateinit var animateImg: AnimationDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        txtMessage=findViewById<TextView>(R.id.text)
        btn=findViewById(R.id.btn)


        //loading animation
        animFadein=AnimationUtils.loadAnimation(applicationContext,R.anim.fade_in)
        animFadein.setAnimationListener(this)

        //handling animation on button click
        btn.setOnClickListener{
            txtMessage.visibility= View.VISIBLE

            //starting the animation
            txtMessage.startAnimation(animFadein)
        }

        val rocketImage = findViewById<ImageView>(R.id.first_image).apply {
            setBackgroundResource(R.drawable.image_display)
            animateImg = background as AnimationDrawable
        }

        rocketImage.setOnClickListener({ animFadein.start() })
    }

    override fun onAnimationRepeat(p0: Animation?) {
         //To change body of created functions use File | Settings | File Templates.
    }

    override fun onAnimationEnd(p0: Animation?) {
         //To change body of created functions use File | Settings | File Templates.
    }

    override fun onAnimationStart(p0: Animation?) {

         //To change body of created functions use File | Settings | File Templates.
    }

}
