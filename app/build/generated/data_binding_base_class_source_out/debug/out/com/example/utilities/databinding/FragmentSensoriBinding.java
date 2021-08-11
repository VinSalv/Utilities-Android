// Generated by view binder compiler. Do not edit!
package com.example.utilities.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.utilities.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentSensoriBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final LinearLayout accelLayout;

  @NonNull
  public final LinearLayout gyroLayout;

  @NonNull
  public final TextView humidity;

  @NonNull
  public final TextView light;

  @NonNull
  public final LinearLayout magnoLayout;

  @NonNull
  public final LinearLayout otherLayout;

  @NonNull
  public final TextView pressure;

  @NonNull
  public final TextView temperature;

  @NonNull
  public final TextView xGyroValue;

  @NonNull
  public final TextView xMagnoValue;

  @NonNull
  public final TextView xValue;

  @NonNull
  public final TextView yGyroValue;

  @NonNull
  public final TextView yMagnoValue;

  @NonNull
  public final TextView yValue;

  @NonNull
  public final TextView zGyroValue;

  @NonNull
  public final TextView zMagnoValue;

  @NonNull
  public final TextView zValue;

  private FragmentSensoriBinding(@NonNull FrameLayout rootView, @NonNull LinearLayout accelLayout,
      @NonNull LinearLayout gyroLayout, @NonNull TextView humidity, @NonNull TextView light,
      @NonNull LinearLayout magnoLayout, @NonNull LinearLayout otherLayout,
      @NonNull TextView pressure, @NonNull TextView temperature, @NonNull TextView xGyroValue,
      @NonNull TextView xMagnoValue, @NonNull TextView xValue, @NonNull TextView yGyroValue,
      @NonNull TextView yMagnoValue, @NonNull TextView yValue, @NonNull TextView zGyroValue,
      @NonNull TextView zMagnoValue, @NonNull TextView zValue) {
    this.rootView = rootView;
    this.accelLayout = accelLayout;
    this.gyroLayout = gyroLayout;
    this.humidity = humidity;
    this.light = light;
    this.magnoLayout = magnoLayout;
    this.otherLayout = otherLayout;
    this.pressure = pressure;
    this.temperature = temperature;
    this.xGyroValue = xGyroValue;
    this.xMagnoValue = xMagnoValue;
    this.xValue = xValue;
    this.yGyroValue = yGyroValue;
    this.yMagnoValue = yMagnoValue;
    this.yValue = yValue;
    this.zGyroValue = zGyroValue;
    this.zMagnoValue = zMagnoValue;
    this.zValue = zValue;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSensoriBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSensoriBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment__sensori, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSensoriBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.accel_layout;
      LinearLayout accelLayout = ViewBindings.findChildViewById(rootView, id);
      if (accelLayout == null) {
        break missingId;
      }

      id = R.id.gyro_layout;
      LinearLayout gyroLayout = ViewBindings.findChildViewById(rootView, id);
      if (gyroLayout == null) {
        break missingId;
      }

      id = R.id.humidity;
      TextView humidity = ViewBindings.findChildViewById(rootView, id);
      if (humidity == null) {
        break missingId;
      }

      id = R.id.light;
      TextView light = ViewBindings.findChildViewById(rootView, id);
      if (light == null) {
        break missingId;
      }

      id = R.id.magno_layout;
      LinearLayout magnoLayout = ViewBindings.findChildViewById(rootView, id);
      if (magnoLayout == null) {
        break missingId;
      }

      id = R.id.other_layout;
      LinearLayout otherLayout = ViewBindings.findChildViewById(rootView, id);
      if (otherLayout == null) {
        break missingId;
      }

      id = R.id.pressure;
      TextView pressure = ViewBindings.findChildViewById(rootView, id);
      if (pressure == null) {
        break missingId;
      }

      id = R.id.temperature;
      TextView temperature = ViewBindings.findChildViewById(rootView, id);
      if (temperature == null) {
        break missingId;
      }

      id = R.id.xGyroValue;
      TextView xGyroValue = ViewBindings.findChildViewById(rootView, id);
      if (xGyroValue == null) {
        break missingId;
      }

      id = R.id.xMagnoValue;
      TextView xMagnoValue = ViewBindings.findChildViewById(rootView, id);
      if (xMagnoValue == null) {
        break missingId;
      }

      id = R.id.xValue;
      TextView xValue = ViewBindings.findChildViewById(rootView, id);
      if (xValue == null) {
        break missingId;
      }

      id = R.id.yGyroValue;
      TextView yGyroValue = ViewBindings.findChildViewById(rootView, id);
      if (yGyroValue == null) {
        break missingId;
      }

      id = R.id.yMagnoValue;
      TextView yMagnoValue = ViewBindings.findChildViewById(rootView, id);
      if (yMagnoValue == null) {
        break missingId;
      }

      id = R.id.yValue;
      TextView yValue = ViewBindings.findChildViewById(rootView, id);
      if (yValue == null) {
        break missingId;
      }

      id = R.id.zGyroValue;
      TextView zGyroValue = ViewBindings.findChildViewById(rootView, id);
      if (zGyroValue == null) {
        break missingId;
      }

      id = R.id.zMagnoValue;
      TextView zMagnoValue = ViewBindings.findChildViewById(rootView, id);
      if (zMagnoValue == null) {
        break missingId;
      }

      id = R.id.zValue;
      TextView zValue = ViewBindings.findChildViewById(rootView, id);
      if (zValue == null) {
        break missingId;
      }

      return new FragmentSensoriBinding((FrameLayout) rootView, accelLayout, gyroLayout, humidity,
          light, magnoLayout, otherLayout, pressure, temperature, xGyroValue, xMagnoValue, xValue,
          yGyroValue, yMagnoValue, yValue, zGyroValue, zMagnoValue, zValue);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
