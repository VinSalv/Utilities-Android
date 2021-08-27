package com.app.utilities.fragment;

import android.annotation.SuppressLint;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import com.app.utilities.R;
import com.app.utilities.utility.Preferences;
import com.app.utilities.utility.Utils;

import java.util.Random;

public class Fragment_Dado extends Fragment {
    final int[] diceArray = {
            R.drawable.dice_1,
            R.drawable.dice_2,
            R.drawable.dice_3,
            R.drawable.dice_4,
            R.drawable.dice_5,
            R.drawable.dice_6
    };
    final TypedValue typedValue = new TypedValue();
    private final Utils utils = new Utils();
    Button oneDice;
    Button twoDices;
    Button rollButton;
    LinearLayout diceLayout;
    TextView leftDiceNumber;
    TextView rightDiceNumber;
    TextView diceNumber;
    int height;
    int width;
    @SuppressWarnings("unused")
    int colorAccent;
    Preferences pref;

    @SuppressLint("NewApi")
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment__dado_fragment, container, false);
        Resources.Theme theme = requireActivity().getTheme();
        theme.resolveAttribute(android.R.attr.colorAccent, typedValue, true);
        @SuppressLint("Recycle") TypedArray arr =
                requireActivity().obtainStyledAttributes(typedValue.data, new int[]{
                        android.R.attr.colorAccent});
        colorAccent = arr.getColor(0, -1);
        rollButton = (Button) view.findViewById(R.id.roll);
        oneDice = view.findViewById(R.id.oneDice);
        oneDice.setOnClickListener(this::OneDiceButton);
        twoDices = view.findViewById(R.id.twoDices);
        twoDices.setOnClickListener(this::TwoDicesButton);
        diceLayout = view.findViewById(R.id.diceLayout);
        ViewTreeObserver observer = diceLayout.getViewTreeObserver();
        observer.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                // TODO Auto-generated method stub
                init();
                diceLayout.getViewTreeObserver().removeGlobalOnLayoutListener(
                        this);
            }
        });
        diceNumber = view.findViewById(R.id.diceNumber);
        leftDiceNumber = view.findViewById(R.id.leftDiceNumber);
        rightDiceNumber = view.findViewById(R.id.rightDiceNumber);
        pref = utils.loadData(requireActivity(), new Preferences());
        requireActivity().getTheme().resolveAttribute(R.attr.colorSecondaryVariant, typedValue, true);
        int colorSecondaryVariant = typedValue.resourceId;
        if (!pref.getPredBool()) {
            switch (pref.getThemeText()) {
                case "LightThemeSelected":
                case "LightTheme":
                    view.setBackgroundColor(requireActivity().getColor(colorSecondaryVariant));
                    break;
                case "DarkThemeSelected":
                case "DarkTheme":
                    view.setBackgroundColor(requireActivity().getColor(R.color.dark_gray));
                    break;
            }
        } else {
            switch (getResources().getConfiguration().uiMode & Configuration.UI_MODE_NIGHT_MASK) {
                case Configuration.UI_MODE_NIGHT_UNDEFINED:
                case Configuration.UI_MODE_NIGHT_NO:
                    view.setBackgroundColor(requireActivity().getColor(colorSecondaryVariant));
                    break;
                case Configuration.UI_MODE_NIGHT_YES:
                    view.setBackgroundColor(requireActivity().getColor(R.color.dark_gray));
                    break;
            }
        }
        return view;
    }

    protected void init() {
        height = diceLayout.getHeight();
        width = diceLayout.getWidth();
    }

    @SuppressLint("SetTextI18n")
    public void OneDiceButton(View view) {
        diceLayout.removeAllViews();
        diceNumber.setText("0");
        leftDiceNumber.setVisibility(View.INVISIBLE);
        rightDiceNumber.setVisibility(View.INVISIBLE);
        ImageView dice_empty = new ImageView(requireActivity());
        dice_empty.setImageResource(R.drawable.dice_empty);
        diceLayout.addView(dice_empty);
        dice_empty.getLayoutParams().width = width;
        dice_empty.getLayoutParams().height = height;
        final ImageView dice = new ImageView(requireActivity());
        rollButton.setOnClickListener(v -> {
            diceLayout.removeAllViews();
            Random RandomGenerator = new Random();
            int nbre = RandomGenerator.nextInt(6);
            diceNumber.setText(Integer.toString(nbre + 1));
            dice.setImageResource(diceArray[nbre]);
            diceLayout.addView(dice);
            dice.getLayoutParams().width = width;
            dice.getLayoutParams().height = height;
        });
    }

    @SuppressLint("SetTextI18n")
    public void TwoDicesButton(View view) {
        diceLayout.removeAllViews();
        diceNumber.setText("0");
        leftDiceNumber.setText("0");
        rightDiceNumber.setText("0");
        leftDiceNumber.setVisibility(View.VISIBLE);
        rightDiceNumber.setVisibility(View.VISIBLE);
        ImageView dice_empty = new ImageView(requireActivity());
        dice_empty.setImageResource(R.drawable.dice_empty);
        diceLayout.addView(dice_empty);
        dice_empty.getLayoutParams().width = width / 2;
        dice_empty.getLayoutParams().height = height;
        ImageView dice_empty2 = new ImageView(requireActivity());
        dice_empty2.setImageResource(R.drawable.dice_empty);
        diceLayout.addView(dice_empty2);
        dice_empty2.getLayoutParams().width = width / 2;
        dice_empty2.getLayoutParams().height = height;
        final ImageView leftDice = new ImageView(requireActivity());
        final ImageView rightDice = new ImageView(requireActivity());
        rollButton.setOnClickListener(v -> {
            diceLayout.removeAllViews();
            Random RandomGenerator = new Random();
            int nbre = RandomGenerator.nextInt(6);
            int first = nbre;
            leftDiceNumber.setText(Integer.toString(first + 1));
            leftDice.setImageResource(diceArray[nbre]);
            diceLayout.addView(leftDice);
            leftDice.getLayoutParams().width = width / 2;
            leftDice.getLayoutParams().height = height;
            nbre = RandomGenerator.nextInt(6);
            rightDiceNumber.setText(Integer.toString(nbre + 1));
            rightDice.setImageResource(diceArray[nbre]);
            diceLayout.addView(rightDice);
            rightDice.getLayoutParams().width = width / 2;
            rightDice.getLayoutParams().height = height;
            diceNumber.setText((first + 1) + " + " + (nbre + 1) + " = " + (first + 1 + nbre + 1));
        });
    }

}