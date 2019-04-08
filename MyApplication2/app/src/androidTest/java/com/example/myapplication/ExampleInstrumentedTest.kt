package com.example.myapplication

import android.support.test.InstrumentationRegistry
import android.support.test.espresso.Espresso
import android.support.test.espresso.action.ViewActions
import android.support.test.espresso.assertion.ViewAssertions.doesNotExist
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.*
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import android.util.Log
import android.view.View

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Rule
    @JvmField
    public val rule  = ActivityTestRule(MainActivity::class.java)

    @Test
    fun login_success(){
        Log.e("@Test","Performing login success test")

        Espresso.onView((withId(R.id.shouldGoToRandom))).perform(ViewActions.click())

        Thread.sleep(3000)

        Espresso.onView((withId(R.id.theRandomFragment))).check(matches(isDisplayed()))

//        Espresso.onView(withId(R.id.randomFrag)).check(View.doesNotExist())

//        Espresso.onView((withId(R.id.user_name)))
//            .perform(ViewActions.typeText(username_tobe_typed))
//
//        Espresso.onView(withId(R.id.password))
//            .perform(ViewActions.typeText(correct_password))
//
//        Espresso.onView(withId(R.id.login_button))
//            .perform(ViewActions.click())
//
//        Espresso.onView(withId(R.id.login_result))
//            .check(matches(withText(R.string.login_success)))
    }


}
