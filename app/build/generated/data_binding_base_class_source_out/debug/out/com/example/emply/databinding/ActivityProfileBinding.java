// Generated by view binder compiler. Do not edit!
package com.example.emply.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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
  public final TextView about;

  @NonNull
  public final RelativeLayout aboutUs;

  @NonNull
  public final TextView account;

  @NonNull
  public final BottomNavigationView bottomNav;

  @NonNull
  public final AppCompatImageButton btnApp;

  @NonNull
  public final AppCompatButton btnLogout;

  @NonNull
  public final AppCompatImageButton btnUser;

  @NonNull
  public final ImageView iconAbout;

  @NonNull
  public final ImageView iconPersonal;

  @NonNull
  public final ImageView iconPrivacy;

  @NonNull
  public final ImageView iconTos;

  @NonNull
  public final View lineBold;

  @NonNull
  public final View lineNormal;

  @NonNull
  public final View lineNormal2;

  @NonNull
  public final RelativeLayout personalInformation;

  @NonNull
  public final RelativeLayout privacyPolicy;

  @NonNull
  public final RelativeLayout termService;

  @NonNull
  public final RelativeLayout titleBar;

  @NonNull
  public final TextView txtUsername;

  @NonNull
  public final RelativeLayout userBar;

  private ActivityProfileBinding(@NonNull RelativeLayout rootView, @NonNull TextView about,
      @NonNull RelativeLayout aboutUs, @NonNull TextView account,
      @NonNull BottomNavigationView bottomNav, @NonNull AppCompatImageButton btnApp,
      @NonNull AppCompatButton btnLogout, @NonNull AppCompatImageButton btnUser,
      @NonNull ImageView iconAbout, @NonNull ImageView iconPersonal, @NonNull ImageView iconPrivacy,
      @NonNull ImageView iconTos, @NonNull View lineBold, @NonNull View lineNormal,
      @NonNull View lineNormal2, @NonNull RelativeLayout personalInformation,
      @NonNull RelativeLayout privacyPolicy, @NonNull RelativeLayout termService,
      @NonNull RelativeLayout titleBar, @NonNull TextView txtUsername,
      @NonNull RelativeLayout userBar) {
    this.rootView = rootView;
    this.about = about;
    this.aboutUs = aboutUs;
    this.account = account;
    this.bottomNav = bottomNav;
    this.btnApp = btnApp;
    this.btnLogout = btnLogout;
    this.btnUser = btnUser;
    this.iconAbout = iconAbout;
    this.iconPersonal = iconPersonal;
    this.iconPrivacy = iconPrivacy;
    this.iconTos = iconTos;
    this.lineBold = lineBold;
    this.lineNormal = lineNormal;
    this.lineNormal2 = lineNormal2;
    this.personalInformation = personalInformation;
    this.privacyPolicy = privacyPolicy;
    this.termService = termService;
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
      id = R.id.about;
      TextView about = ViewBindings.findChildViewById(rootView, id);
      if (about == null) {
        break missingId;
      }

      id = R.id.about_us;
      RelativeLayout aboutUs = ViewBindings.findChildViewById(rootView, id);
      if (aboutUs == null) {
        break missingId;
      }

      id = R.id.account;
      TextView account = ViewBindings.findChildViewById(rootView, id);
      if (account == null) {
        break missingId;
      }

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

      id = R.id.icon_about;
      ImageView iconAbout = ViewBindings.findChildViewById(rootView, id);
      if (iconAbout == null) {
        break missingId;
      }

      id = R.id.icon_personal;
      ImageView iconPersonal = ViewBindings.findChildViewById(rootView, id);
      if (iconPersonal == null) {
        break missingId;
      }

      id = R.id.icon_privacy;
      ImageView iconPrivacy = ViewBindings.findChildViewById(rootView, id);
      if (iconPrivacy == null) {
        break missingId;
      }

      id = R.id.icon_tos;
      ImageView iconTos = ViewBindings.findChildViewById(rootView, id);
      if (iconTos == null) {
        break missingId;
      }

      id = R.id.lineBold;
      View lineBold = ViewBindings.findChildViewById(rootView, id);
      if (lineBold == null) {
        break missingId;
      }

      id = R.id.lineNormal;
      View lineNormal = ViewBindings.findChildViewById(rootView, id);
      if (lineNormal == null) {
        break missingId;
      }

      id = R.id.lineNormal2;
      View lineNormal2 = ViewBindings.findChildViewById(rootView, id);
      if (lineNormal2 == null) {
        break missingId;
      }

      id = R.id.personal_information;
      RelativeLayout personalInformation = ViewBindings.findChildViewById(rootView, id);
      if (personalInformation == null) {
        break missingId;
      }

      id = R.id.privacy_policy;
      RelativeLayout privacyPolicy = ViewBindings.findChildViewById(rootView, id);
      if (privacyPolicy == null) {
        break missingId;
      }

      id = R.id.term_service;
      RelativeLayout termService = ViewBindings.findChildViewById(rootView, id);
      if (termService == null) {
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

      return new ActivityProfileBinding((RelativeLayout) rootView, about, aboutUs, account,
          bottomNav, btnApp, btnLogout, btnUser, iconAbout, iconPersonal, iconPrivacy, iconTos,
          lineBold, lineNormal, lineNormal2, personalInformation, privacyPolicy, termService,
          titleBar, txtUsername, userBar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
