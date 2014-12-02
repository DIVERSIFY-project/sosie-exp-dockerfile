package com.github.mobile.test;

import com.robotium.solo.*;

import android.content.Context;
import android.preference.PreferenceManager;
import android.test.ActivityInstrumentationTestCase2;


@SuppressWarnings("rawtypes")
public class Test2 extends ActivityInstrumentationTestCase2 {
  	private Solo solo;
  	
  	private static final String LAUNCHER_ACTIVITY_FULL_CLASSNAME = "com.github.mobile.ui.user.HomeActivity";

    private static Class<?> launcherActivityClass;
    static{
        try {
            launcherActivityClass = Class.forName(LAUNCHER_ACTIVITY_FULL_CLASSNAME);
        } catch (ClassNotFoundException e) {
           throw new RuntimeException(e);
        }
    }
  	
  	@SuppressWarnings("unchecked")
    public Test2() throws ClassNotFoundException {
        super(launcherActivityClass);
    }

  	public void setUp() throws Exception {
        super.setUp();
		solo = new Solo(getInstrumentation());
        Context context = getInstrumentation().getTargetContext();
        PreferenceManager.getDefaultSharedPreferences(context).edit().clear().commit();
		getActivity();
  	}
  
   	@Override
   	public void tearDown() throws Exception {
        solo.finishOpenedActivities();

        super.tearDown();
  	}

    protected void login() {
        //Wait for activity: 'com.github.mobile.ui.user.HomeActivity'
        solo.waitForActivity("HomeActivity", 2000);
        //Set default small timeout to 22611 milliseconds
        Timeout.setSmallTimeout(22611);
        //Enter the text: 'diversify-exp-user'
        solo.clearEditText((android.widget.EditText) solo.getView("et_login"));
        solo.enterText((android.widget.EditText) solo.getView("et_login"), "diversify-exp-user");
        //Click on Empty Text View
        solo.clickOnView(solo.getView("et_password"));
        //Set default small timeout to 25818 milliseconds
        Timeout.setSmallTimeout(25818);
        //Enter the text: 'diversify-exp-password'
        solo.clearEditText((android.widget.EditText) solo.getView("et_password"));
        solo.enterText((android.widget.EditText) solo.getView("et_password"), "diversify-exp-password");
        //Click on Log in
        solo.clickOnView(solo.getView("m_login"));
    }

    protected void repositoriesShowCode() {

    }

	public void testRun() {
        //login
        //Wait for activity: 'com.github.mobile.ui.user.HomeActivity'
		solo.waitForActivity("HomeActivity", 2000);
        //Set default small timeout to 22611 milliseconds
		Timeout.setSmallTimeout(22611);
        //Enter the text: 'diversify-exp-user'
		solo.clearEditText((android.widget.EditText) solo.getView("et_login"));
		solo.enterText((android.widget.EditText) solo.getView("et_login"), "diversify-exp-user");
        //Click on Empty Text View
		solo.clickOnView(solo.getView("et_password"));
        //Set default small timeout to 25818 milliseconds
		Timeout.setSmallTimeout(25818);
        //Enter the text: 'diversify-exp-password'
		solo.clearEditText((android.widget.EditText) solo.getView("et_password"));
		solo.enterText((android.widget.EditText) solo.getView("et_password"), "diversify-exp-password");
        //Click on Log in
		solo.clickOnView(solo.getView("m_login"));


        //Click on   repositories
		solo.clickOnView(solo.getView(android.widget.RelativeLayout.class, 2));

        //todo assert 2 repository

        //Click on G   github-app-test    0   0
		solo.clickInList(1, 1);
        //Wait for activity: 'com.github.mobile.ui.repo.RepositoryViewActivity'
		assertTrue("RepositoryViewActivity is not found!", solo.waitForActivity("RepositoryViewActivity"));
        //Click on   code
		solo.clickOnView(solo.getView(android.widget.RelativeLayout.class, 2));
        //Click on   dir   0   1
		solo.clickInList(1, 1);
        //Click on   file 6.00B
		solo.clickInList(2, 1);
        //todo assert frite

        //Wait for activity: 'com.github.mobile.ui.ref.BranchFileViewActivity'
		assertTrue("BranchFileViewActivity is not found!", solo.waitForActivity("BranchFileViewActivity"));

        //return to repo view
        //Press menu back key
		solo.goBack();
        //Click on HomeView
		solo.clickOnView(solo.getView(android.widget.FrameLayout.class, 1));
        //Wait for activity: 'com.github.mobile.ui.user.UserViewActivity'
		assertTrue("UserViewActivity is not found!", solo.waitForActivity("UserViewActivity"));
        //Click on HomeView
		solo.clickOnView(solo.getView(android.widget.FrameLayout.class, 1));

        //repo view
        //Click on G   github-app-test    0   0
		solo.clickInList(1, 1);
        //Wait for activity: 'com.github.mobile.ui.repo.RepositoryViewActivity'
		assertTrue("RepositoryViewActivity is not found!", solo.waitForActivity("RepositoryViewActivity"));
        //Click on   commits
		solo.clickOnView(solo.getView(android.widget.RelativeLayout.class, 4));
        //todo assert 3 commit
        //Click on c7547d2728 second commit simonAllier 1 hour ago   0
		solo.clickInList(2, 1);
        //todo assert commit info

        //Wait for activity: 'com.github.mobile.ui.commit.CommitViewActivity'
		assertTrue("CommitViewActivity is not found!", solo.waitForActivity("CommitViewActivity"));


        //return to home menu
        //Click on HomeView
		solo.clickOnView(solo.getView(android.widget.FrameLayout.class, 1));
        //Click on HomeView
		solo.clickOnView(solo.getView(android.widget.FrameLayout.class, 1));
        //Wait for activity: 'com.github.mobile.ui.user.UserViewActivity'
		assertTrue("UserViewActivity is not found!", solo.waitForActivity("UserViewActivity"));


        //Click on   repositories
		solo.clickOnView(solo.getView(android.widget.RelativeLayout.class, 2));
        //Click on   github-app-test    0   0
		solo.clickInList(1, 1);
        //Wait for activity: 'com.github.mobile.ui.repo.RepositoryViewActivity'
		assertTrue("RepositoryViewActivity is not found!", solo.waitForActivity("RepositoryViewActivity"));
        //Click on   commits
		solo.clickOnView(solo.getView(android.widget.RelativeLayout.class, 4));
        //Click on b96ae643d9 third commit simonAllier 1 hour ago   0
		solo.clickInList(1, 1);
        //Wait for activity: 'com.github.mobile.ui.commit.CommitViewActivity'
		assertTrue("CommitViewActivity is not found!", solo.waitForActivity("CommitViewActivity"));
        //Click on -patate
		solo.clickOnView(solo.getView("tv_diff", 1));
        //Wait for dialog
		solo.waitForDialogToOpen(5000);
        //Click on Cancel
		solo.clickOnView(solo.getView(android.R.id.button2));
        //Click on +frite
		solo.clickOnView(solo.getView("tv_diff", 2));
        //Wait for dialog
		solo.waitForDialogToOpen(5000);
        //Click on Cancel
		solo.clickOnView(solo.getView(android.R.id.button2));

        //return to home menu
        //Click on HomeView
		solo.clickOnView(solo.getView(android.widget.FrameLayout.class, 1));
        //Click on HomeView
		solo.clickOnView(solo.getView(android.widget.FrameLayout.class, 1));
        //Click on HomeView
		solo.clickOnView(solo.getView(android.widget.FrameLayout.class, 1));


        //search junit
        //Click on Empty Text View
		solo.clickOnView(solo.getView("m_search"));
        //Wait for dialog
		solo.waitForDialogToOpen(5000);
        //Click on Empty Text View
		solo.clickOnView(solo.getView("search_src_text"));
        //Enter the text: 'junit'
		solo.clearEditText((android.widget.EditText) solo.getView("search_src_text"));
		solo.enterText((android.widget.EditText) solo.getView("search_src_text"), "junit");
        //Press next button
		solo.pressSoftKeyboardNextButton();
        //Wait for activity: 'com.github.mobile.ui.search.SearchActivity'
		assertTrue("SearchActivity is not found!", solo.waitForActivity("SearchActivity"));
        //Click on   junit-team/junit A programmer-oriented testing framework for Java. Java
		solo.clickInList(1, 0);
        //todo assert junit repo
        //Wait for activity: 'com.github.mobile.ui.repo.RepositoryViewActivity'
		assertTrue("RepositoryViewActivity is not found!", solo.waitForActivity("RepositoryViewActivity"));
        //Click on   code
		solo.clickOnView(solo.getView(android.widget.RelativeLayout.class, 2));
        //todo assert text
	}
}
