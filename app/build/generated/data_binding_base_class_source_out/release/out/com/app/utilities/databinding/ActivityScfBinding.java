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
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.app.utilities.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityScfBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageButton back;

  @NonNull
  public final EditText bluePlayerEditText;

  @NonNull
  public final Button go;

  @NonNull
  public final EditText redPlayerEditText;

  @NonNull
  public final LinearLayout scfLayout;

  @NonNull
  public final TextView scfWinner;

  private ActivityScfBinding(@NonNull LinearLayout rootView, @NonNull ImageButton back,
      @NonNull EditText bluePlayerEditText, @NonNull Button go, @NonNull EditText redPlayerEditText,
      @NonNull LinearLayout scfLayout, @NonNull TextView scfWinner) {
    this.rootView = rootView;
    this.back = back;
    this.bluePlayerEditText = bluePlayerEditText;
    this.go = go;
    this.redPlayerEditText = redPlayerEditText;
    this.scfLayout = scfLayout;
    this.scfWinner = scfWinner;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityScfBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityScfBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_scf, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityScfBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.back;
      ImageButton back = ViewBindings.findChildViewById(rootView, id);
      if (back == null) {
        break missingId;
      }

      id = R.id.bluePlayerEditText;
      EditText bluePlayerEditText = ViewBindings.findChildViewById(rootView, id);
      if (bluePlayerEditText == null) {
        break missingId;
      }

      id = R.id.go;
      Button go = ViewBindings.findChildViewById(rootView, id);
      if (go == null) {
        break missingId;
      }

      id = R.id.redPlayerEditText;
      EditText redPlayerEditText = ViewBindings.findChildViewById(rootView, id);
      if (redPlayerEditText == null) {
        break missingId;
      }

      id = R.id.scfLayout;
      LinearLayout scfLayout = ViewBindings.findChildViewById(rootView, id);
      if (scfLayout == null) {
        break missingId;
      }

      id = R.id.scfWinner;
      TextView scfWinner = ViewBindings.findChildViewById(rootView, id);
      if (scfWinner == null) {
        break missingId;
      }

      return new ActivityScfBinding((LinearLayout) rootView, back, bluePlayerEditText, go,
          redPlayerEditText, scfLayout, scfWinner);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
