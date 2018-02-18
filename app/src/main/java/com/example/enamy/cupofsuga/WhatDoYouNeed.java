package com.example.enamy.cupofsuga;

        import android.content.Intent;
        import android.os.CountDownTimer;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.EditText;


public class WhatDoYouNeed extends AppCompatActivity {

    EditText mEditTextIngredientAmount;
    long millisInFuture;
    long countDownInterval;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_what_do_you_need);
        mEditTextIngredientAmount = ((EditText) findViewById(R.id.ingredient_amount));

    }

    public void increment(View view) {
        int ingredientAmount = Integer.parseInt(mEditTextIngredientAmount.getText().toString());
        ingredientAmount++;
        mEditTextIngredientAmount.setText(String.valueOf(ingredientAmount));
    }


    public void decrement(View view) {
        int ingredientAmount = Integer.parseInt(mEditTextIngredientAmount.getText().toString());
        if (ingredientAmount > 0) {
            ingredientAmount--;
            mEditTextIngredientAmount.setText(String.valueOf(ingredientAmount));
        }
    }


    public void locate(View view) {
        Intent intent = new Intent(this, Locating.class);
        startActivity(intent);
    }


        }


