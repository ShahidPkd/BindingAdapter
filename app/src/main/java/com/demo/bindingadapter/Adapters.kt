package com.demo.bindingadapter

import android.text.Html
import android.text.method.LinkMovementMethod
import android.text.method.MovementMethod
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("imageFromUrl")
fun ImageView.imageFromUrl(url : String){
    Glide.with(this.context).load(url).into(this)
}



@BindingAdapter("htmlSet")
fun TextView.setHtml(url: String){

    this.text = Html.fromHtml(url)
    this.movementMethod = LinkMovementMethod.getInstance();

}

