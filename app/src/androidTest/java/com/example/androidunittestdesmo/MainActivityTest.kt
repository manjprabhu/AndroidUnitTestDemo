package com.example.androidunittestdesmo

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @Rule
    var activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun performMainActivityTest() {
        onView(withId(R.id.one)).perform(click())
        onView(withId(R.id.tv)).check(matches(withText("one")))

        onView(withId(R.id.two)).perform(click())
        onView(withId(R.id.tv)).check(matches(withText("two")))

        onView(withId(R.id.three)).perform(click())
        onView(withId(R.id.tv)).check(matches(withText("three")))
    }

}