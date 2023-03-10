// Generated by view binder compiler. Do not edit!
package com.example.emply.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.emply.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityProfileBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final BottomNavigationView bottomNav;

  @NonNull
  public final AppCompatImageButton btnApp;

  @NonNull
  public final AppCompatButton btnLogout;

  @NonNull
  public final AppCompatImageButton btnUser;

  @NonNull
  public final RelativeLayout titleBar;

  @NonNull
  public final TextView txtUsername;

  @NonNull
  public final RelativeLayout userBar;

  private ActivityProfileBinding(@NonNull RelativeLayout rootView,
      @NonNull BottomNavigationView bottomNav, @NonNull AppCompatImageButton btnApp,
      @NonNull AppCompatButton btnLogout, @NonNull AppCompatImageButton btnUser,
      @NonNull RelativeLayout titleBar, @NonNull TextView txtUsername,
      @NonNull RelativeLayout userBar) {
    this.rootView = rootView;
    this.bottomNav = bottomNav;
    this.btnApp = btnApp;
    this.btnLogout = btnLogout;
    this.btnUser = btnUser;
    this.titleBar = titleBar;
    this.txtUsername = txtUsername;
    this.userBar = userBar;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_profile, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityProfileBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bottom_nav;
      BottomNavigationView bottomNav = ViewBindings.findChildViewById(rootView, id);
      if (bottomNav == null) {
        break missingId;
      }

      id = R.id.btnApp;
      AppCompatImageButton btnApp = ViewBindings.findChildViewById(rootView, id);
      if (btnApp == null) {
        break missingId;
      }

      id = R.id.btnLogout;
      AppCompatButton btnLogout = ViewBindings.findChildViewById(rootView, id);
      if (btnLogout == null) {
        break missingId;
      }

      id = R.id.btnUser;
      AppCompatImageButton btnUser = ViewBindings.findChildViewById(rootView, id);
      if (btnUser == null) {
        break missingId;
      }

      id = R.id.titleBar;
      RelativeLayout titleBar = ViewBindings.findChildViewById(rootView, id);
      if (titleBar == null) {
        break missingId;
      }

      id = R.id.txtUsername;
      TextView txtUsername = ViewBindings.findChildViewById(rootView, id);
      if (txtUsername == null) {
        break missingId;
      }

      id = R.id.userBar;
      RelativeLayout userBar = ViewBindings.findChildViewById(rootView, id);
      if (userBar == null) {
        break missingId;
      }

      return new ActivityProfileBinding((RelativeLayout) rootView, bottomNav, btnApp, btnLogout,
          btnUser, titleBar, txtUsername, userBar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
