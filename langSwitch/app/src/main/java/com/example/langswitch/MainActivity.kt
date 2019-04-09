package com.example.langswitch

import android.content.Context
import android.content.res.Configuration
import android.content.res.Resources
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.util.*
import android.util.DisplayMetrics



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setTitle(resources.getString(R.string.app_name))

        val englishButton = findViewById<Button>(R.id.toEn)

        val spanishButton = findViewById<Button>(R.id.toEs)

        englishButton.setOnClickListener {
            println("to english")
//            setLocale("en")
            println(resources.configuration.locales)
            val locale = Locale("es")
            println(locale.displayLanguage)
            Locale.setDefault(locale)

            val config = resources.configuration
            config.setLocale(locale)
            createConfigurationContext(config)

            getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
//            resources.createConfigurationContext(config, resources.displayMetrics)
//            actionBar.setTitle("test")

            finish();
//            recreate()
            overridePendingTransition(0, 0);
            startActivity(getIntent());
            overridePendingTransition(0, 0);
        }

        spanishButton.setOnClickListener {
            println("to spanish")
            println(Resources.getSystem().configuration)
            setLocale("es")

        }
    }

    fun setLocale(lang: String) {

        val res = Resources.getSystem()
// Change locale settings in the app.
        val dm = res.displayMetrics
        val conf = res.configuration
        conf.setLocale(Locale("en".toLowerCase())) // API 17+ only.
// Use conf.locale = new Locale(...) if targeting lower versions
//        res.updateConfiguration(conf, dm)



//        val locale = Locale(lang)
//        val selectedLanguage = Resources.getSystem().getConfiguration().locale.getLanguage();
//        val selLang = Resources.getSystem().configuration
//
//        Locale.setDefault(locale)
//        val config = Configuration()
//        config.locale = locale
//        baseContext.resources.updateConfiguration(config, baseContext.resources.displayMetrics)
//        val editor = getSharedPreferences("settings", Context.MODE_PRIVATE).edit()
//        editor.putString("My_Lang", lang)
//        editor.apply()
    }
}
