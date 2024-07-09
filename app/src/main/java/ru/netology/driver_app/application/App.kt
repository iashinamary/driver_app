package ru.netology.driver_app.application

import android.app.Application
import com.yandex.mapkit.MapKitFactory
import ru.netology.driver_app.BuildConfig

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        MapKitFactory.setApiKey(BuildConfig.MAPS_API_KEY)
    }
}