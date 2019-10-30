package com.example.week2
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //ซ่อนไตเติ้ลบาร์
        supportActionBar?.hide()
        btn_krabi.setOnClickListener(View.OnClickListener {
            getDrawable(R.drawable.krabi_img)?.let { it1 -> setProvice(it1, getString(R.string.btn_krabi),getString(R.string.history_krabi)) }
        })
        btn_phathom.setOnClickListener(View.OnClickListener {
            getDrawable(R.drawable.pathom_img)?.let { it1 -> setProvice(it1, getString(R.string.btn_phathom),getString(R.string.history_phathom)) }
        })
        btn_mukda.setOnClickListener(View.OnClickListener {
            getDrawable(R.drawable.mukda_img)?.let { it1 -> setProvice(it1, getString(R.string.btn_mukda),getString(R.string.history_mukda)) }
        })
        btn_angthong.setOnClickListener(View.OnClickListener {
            getDrawable(R.drawable.angthong_img)?.let { it1 -> setProvice(it1, getString(R.string.btn_angthong),getString(R.string.history_angthong)) }
        })
    }

    fun setProvice (drawable : Drawable, header:String, content:String ){

        img_provice.setImageDrawable(drawable) //เปลี่ยนรูปภาพ
        tv_header.setText("ข้อมูลจังหวัด "+header) // ส่วนหัวของเนื้อหา
        tv_history.setText(content) // เปลี่ยนประวัติ

        Toast.makeText(this,
            "นี่คือ ข้อมูลจังหวัด "+header,Toast.LENGTH_LONG).show()
    }
}



