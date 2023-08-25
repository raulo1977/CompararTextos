package com.curso.android.app.practica.counter.view

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.espresso.Espresso
import androidx.test.espresso.ViewAssertion
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.curso.android.app.practica.counter.R
import org.junit.Assert.*

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*

import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get: Rule
    var rule: ActivityScenarioRule<*> = ActivityScenarioRule(MainActivity::class.java)

    @Before
    fun setUp() {
    }

    @After
    fun tearDown() {
    }

    @Test
    fun testUI_compareButton_differentStrings() {
        onView(withId(R.id.editText1)).perform(typeText("hello"), closeSoftKeyboard())
        onView(withId(R.id.editText2)).perform(typeText("world"), closeSoftKeyboard())
        onView(withId(R.id.compareButton)).perform(click())

        onView(withId(R.id.resultTextView)).check(matches(withText("Resultado: Las cadenas son diferentes")))
    }


}