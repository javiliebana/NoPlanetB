package com.example.noplanetb;

import android.test.ActivityInstrumentationTestCase2;
//import static android.support.test.espresso.Espresso.onView;
//import static android.support.test.espresso.action.ViewActions.typeText;
//import static android.support.test.espresso.matcher.ViewMatchers.withId;
import android.test.TouchUtils;
import android.widget.Button;
import android.widget.EditText;


/**
 * @author ernesto
 */

public class ExampleInstrumentedTest extends ActivityInstrumentationTestCase2<BLogin> {

    private Button mloginbutton;
    private EditText etext1;
    private EditText etext2;

    public ExampleInstrumentedTest() {
        super(BLogin.class);
    }

    protected void setUp() throws Exception {
        super.setUp();
        BLogin actividad = getActivity();
        etext1 = actividad.findViewById(R.id.et_nombre);
        etext2 = actividad.findViewById(R.id.et_passw);
        mloginbutton = actividad.findViewById(R.id.btn_login);

    }

//    protected void tearDown() throws Exception {
//        super.tearDown();
//    }

    private static final String USERNAME = "javier";
    private static final String PASSWORD = "123456";

    public void testLoginSignup() {
//        onView(withId(R.id.email)).perform(typeText(USERNAME));
//        onView(withId(R.id.password)).perform(typeText(PASSWORD));

        // first tap on value1 entry
        TouchUtils.tapView(this, etext1);
        getInstrumentation().sendStringSync(USERNAME);
        // now on value2 entry
        TouchUtils.tapView(this, etext2);
        getInstrumentation().sendStringSync(PASSWORD);
        // now on login button
        TouchUtils.tapView(this, mloginbutton);

    }
}

