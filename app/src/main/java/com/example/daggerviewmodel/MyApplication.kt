package com.example.daggerviewmodel

import android.app.Application

class MyApplication:Application(){

    val applicationComponent = DaggerApplicationComponent.create()

}