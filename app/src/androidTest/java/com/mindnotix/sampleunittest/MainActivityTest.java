package com.mindnotix.sampleunittest;

import android.support.test.rule.ActivityTestRule;
import android.view.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Admin on 3/20/2018.
 */
public class MainActivityTest {
    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    MainActivity mainActivity = null;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void TestLaunch() {
        mainActivity = mainActivityActivityTestRule.getActivity();

        View view = mainActivity.findViewById(R.id.tvSample);

        //Unit test for textview
        assertNotNull(view);
    }

    @After
    public void tearDown() throws Exception {

        mainActivity = null;
    }

}