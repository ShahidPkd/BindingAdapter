package com.demo.bindingadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.demo.bindingadapter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val str = "<b>Hello Dear</b> <br><center>You are here because you want to implement html clickable alertdialog <br> goto for more: <a href=https://itsshahid.com> <b>ItsShahid.Com</b></a><br><br></center>"

        val post = Post("Introduction to Kotlin", str, "https://itsshahid.com/wp-content/uploads/2022/02/Screenshot_2022-02-15-15-16-34-86_5994ee569dd4eb01c4e6a91cede20d7f-e1644923465124.jpg")
        binding.post = post

        //I have created all the Adapter file and that adapter file is called adapter binding, where we can create our custom attribute to do what we want


    }
}