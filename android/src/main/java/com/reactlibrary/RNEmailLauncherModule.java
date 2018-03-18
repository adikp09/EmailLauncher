
package com.reactlibrary;

import android.content.Intent;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNEmailLauncherModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNEmailLauncherModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNEmailLauncher";
  }

  @ReactMethod
    public void launchEmail() {
        Intent mailClient = new Intent(Intent.ACTION_VIEW);
        mailClient.setClassName("com.google.android.gm", "com.google.android.gm.ConversationListActivityGmail");
        getCurrentActivity().startActivity(mailClient);
    }
}