package com.daniloprado.weather.view.main;

import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;

class GenericTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);
}
