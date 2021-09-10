// Generated by view binder compiler. Do not edit!
package com.app.utilities.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.app.utilities.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMonetaBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageButton back;

  @NonNull
  public final EditText crocePlayerEditText;

  @NonNull
  public final Button goMoneta;

  @NonNull
  public final LinearLayout monetaLayout;

  @NonNull
  public final TextView monetaWinner;

  @NonNull
  public final EditText testaPlayerEditText;

  @NonNull
  public final Toolbar toolbarMoneta;

  private ActivityMonetaBinding(@NonNull LinearLayout rootView, @NonNull ImageButton back,
      @NonNull EditText crocePlayerEditText, @NonNull Button goMoneta,
      @NonNull LinearLayout monetaLayout, @NonNull TextView monetaWinner,
      @NonNull EditText testaPlayerEditText, @NonNull Toolbar toolbarMoneta) {
    this.rootView = rootView;
    this.back = back;
    this.crocePlayerEditText = crocePlayerEditText;
    this.goMoneta = goMoneta;
    this.monetaLayout = monetaLayout;
    this.monetaWinner = monetaWinner;
    this.testaPlayerEditText = testaPlayerEditText;
    this.toolbarMoneta = toolbarMoneta;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMonetaBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMonetaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_moneta, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMonetaBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.back;
      ImageButton back = ViewBindings.findChildViewById(rootView, id);
      if (back == null) {
        break missingId;
      }

      id = R.id.crocePlayerEditText;
      EditText crocePlayerEditText = ViewBindings.findChildViewById(rootView, id);
      if (crocePlayerEditText == null) {
        break missingId;
      }

      id = R.id.goMoneta;
      Button goMoneta = ViewBindings.findChildViewById(rootView, id);
      if (goMoneta == null) {
        break missingId;
      }

      id = R.id.monetaLayout;
      LinearLayout monetaLayout = ViewBindings.findChildViewById(rootView, id);
      if (monetaLayout == null) {
        break missingId;
      }

      id = R.id.monetaWinner;
      TextView monetaWinner = ViewBindings.findChildViewById(rootView, id);
      if (monetaWinner == null) {
        break missingId;
      }

      id = R.id.testaPlayerEditText;
      EditText testaPlayerEditText = ViewBindings.findChildViewById(rootView, id);
      if (testaPlayerEditText == null) {
        break missingId;
      }

      id = R.id.toolbarMoneta;
      Toolbar toolbarMoneta = ViewBindings.findChildViewById(rootView, id);
      if (toolbarMoneta == null) {
        break missingId;
      }

      return new ActivityMonetaBinding((LinearLayout) rootView, back, crocePlayerEditText, goMoneta,
          monetaLayout, monetaWinner, testaPlayerEditText, toolbarMoneta);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
