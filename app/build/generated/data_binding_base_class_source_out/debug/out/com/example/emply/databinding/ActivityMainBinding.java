// Generated by view binder compiler. Do not edit!
package com.example.emply.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.emply.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final LinearLayout PasswordLayout;

  @NonNull
  public final LinearLayout UsernameLayout;

  @NonNull
  public final AppCompatButton btnLogin;

  @NonNull
  public final CheckBox cbRememberMe;

  @NonNull
  public final AppCompatEditText edtPassword;

  @NonNull
  public final AppCompatEditText edtUsername;

  @NonNull
  public final ImageView imgBack;

  @NonNull
  public final ImageView imgIcon;

  @NonNull
  public final LinearLayout layoutRememberme;

  @NonNull
  public final ImageView passwordIcon;

  @NonNull
  public final TextView txtSelectRole;

  @NonNull
  public final TextView txtSignUp;

  @NonNull
  public final ImageView userIcon;

  private ActivityMainBinding(@NonNull RelativeLayout rootView,
      @NonNull LinearLayout PasswordLayout, @NonNull LinearLayout UsernameLayout,
      @NonNull AppCompatButton btnLogin, @NonNull CheckBox cbRememberMe,
      @NonNull AppCompatEditText edtPassword, @NonNull AppCompatEditText edtUsername,
      @NonNull ImageView imgBack, @NonNull ImageView imgIcon,
      @NonNull LinearLayout layoutRememberme, @NonNull ImageView passwordIcon,
      @NonNull TextView txtSelectRole, @NonNull TextView txtSignUp, @NonNull ImageView userIcon) {
    this.rootView = rootView;
    this.PasswordLayout = PasswordLayout;
    this.UsernameLayout = UsernameLayout;
    this.btnLogin = btnLogin;
    this.cbRememberMe = cbRememberMe;
    this.edtPassword = edtPassword;
    this.edtUsername = edtUsername;
    this.imgBack = imgBack;
    this.imgIcon = imgIcon;
    this.layoutRememberme = layoutRememberme;
    this.passwordIcon = passwordIcon;
    this.txtSelectRole = txtSelectRole;
    this.txtSignUp = txtSignUp;
    this.userIcon = userIcon;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.PasswordLayout;
      LinearLayout PasswordLayout = ViewBindings.findChildViewById(rootView, id);
      if (PasswordLayout == null) {
        break missingId;
      }

      id = R.id.UsernameLayout;
      LinearLayout UsernameLayout = ViewBindings.findChildViewById(rootView, id);
      if (UsernameLayout == null) {
        break missingId;
      }

      id = R.id.btnLogin;
      AppCompatButton btnLogin = ViewBindings.findChildViewById(rootView, id);
      if (btnLogin == null) {
        break missingId;
      }

      id = R.id.cbRememberMe;
      CheckBox cbRememberMe = ViewBindings.findChildViewById(rootView, id);
      if (cbRememberMe == null) {
        break missingId;
      }

      id = R.id.edtPassword;
      AppCompatEditText edtPassword = ViewBindings.findChildViewById(rootView, id);
      if (edtPassword == null) {
        break missingId;
      }

      id = R.id.edtUsername;
      AppCompatEditText edtUsername = ViewBindings.findChildViewById(rootView, id);
      if (edtUsername == null) {
        break missingId;
      }

      id = R.id.imgBack;
      ImageView imgBack = ViewBindings.findChildViewById(rootView, id);
      if (imgBack == null) {
        break missingId;
      }

      id = R.id.imgIcon;
      ImageView imgIcon = ViewBindings.findChildViewById(rootView, id);
      if (imgIcon == null) {
        break missingId;
      }

      id = R.id.layoutRememberme;
      LinearLayout layoutRememberme = ViewBindings.findChildViewById(rootView, id);
      if (layoutRememberme == null) {
        break missingId;
      }

      id = R.id.password_icon;
      ImageView passwordIcon = ViewBindings.findChildViewById(rootView, id);
      if (passwordIcon == null) {
        break missingId;
      }

      id = R.id.txtSelectRole;
      TextView txtSelectRole = ViewBindings.findChildViewById(rootView, id);
      if (txtSelectRole == null) {
        break missingId;
      }

      id = R.id.txtSignUp;
      TextView txtSignUp = ViewBindings.findChildViewById(rootView, id);
      if (txtSignUp == null) {
        break missingId;
      }

      id = R.id.user_icon;
      ImageView userIcon = ViewBindings.findChildViewById(rootView, id);
      if (userIcon == null) {
        break missingId;
      }

      return new ActivityMainBinding((RelativeLayout) rootView, PasswordLayout, UsernameLayout,
          btnLogin, cbRememberMe, edtPassword, edtUsername, imgBack, imgIcon, layoutRememberme,
          passwordIcon, txtSelectRole, txtSignUp, userIcon);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
