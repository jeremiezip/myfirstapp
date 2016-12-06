package com.jeremiezipfel.calculette;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    String calculview;
    Float valueresult;

    private TextView textViewCalcul;
    private Button btnClear;
    private Button btnMultiplicator;
    private Button btnDivider;
    private Button btnMinus;
    private Button btnPlus;
    private Button btnNine;
    private Button btnHeight;
    private Button btnSeven;
    private Button btnSix;
    private Button btnFive;
    private Button btnFour;
    private Button btnThree;
    private Button btnTwo;
    private Button btnOne;
    private Button btnResult;
    private Button btnComma;
    private Button btnZero;

    Operator calcul = new Operator();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Capture our button from layout
        btnClear = (Button) findViewById(R.id.btn_clear);
        btnMultiplicator = (Button) findViewById(R.id.btn_multiplicator);
        btnDivider = (Button) findViewById(R.id.btn_divider);
        btnMinus = (Button) findViewById(R.id.btn_minus);
        btnPlus = (Button) findViewById(R.id.btn_plus);
        btnNine = (Button) findViewById(R.id.btn_nine);
        btnHeight = (Button) findViewById(R.id.btn_height);
        btnSeven = (Button) findViewById(R.id.btn_seven);
        btnSix = (Button) findViewById(R.id.btn_six);
        btnFive = (Button) findViewById(R.id.btn_five);
        btnFour = (Button) findViewById(R.id.btn_four);
        btnThree = (Button) findViewById(R.id.btn_three);
        btnTwo = (Button) findViewById(R.id.btn_two);
        btnOne = (Button) findViewById(R.id.btn_one);
        btnResult = (Button) findViewById(R.id.btn_result);
        btnComma = (Button) findViewById(R.id.btn_comma);
        btnZero = (Button) findViewById(R.id.btn_zero);
        textViewCalcul = (TextView) findViewById(R.id.textview_calcul);

        //on click launch the anonymous function
        btnClear.setOnClickListener(mButtonListener);
        btnMultiplicator.setOnClickListener(mButtonListener);
        btnDivider.setOnClickListener(mButtonListener);
        btnMinus.setOnClickListener(mButtonListener);
        btnPlus.setOnClickListener(mButtonListener);
        btnNine.setOnClickListener(mButtonListener);
        btnHeight.setOnClickListener(mButtonListener);
        btnSeven.setOnClickListener(mButtonListener);
        btnSix.setOnClickListener(mButtonListener);
        btnFive.setOnClickListener(mButtonListener);
        btnFour.setOnClickListener(mButtonListener);
        btnThree.setOnClickListener(mButtonListener);
        btnTwo.setOnClickListener(mButtonListener);
        btnOne.setOnClickListener(mButtonListener);
        btnResult.setOnClickListener(mButtonListener);
        btnComma.setOnClickListener(mButtonListener);
        btnZero.setOnClickListener(mButtonListener);

    }

    // Create an anonymous implementation of OnClickListener
    public View.OnClickListener mButtonListener = new View.OnClickListener() {
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_nine:
                    calculview = calcul.chiffre("9");
                    textViewCalcul.setText(calculview);
                    break;
                case R.id.btn_height:
                    calculview = calcul.chiffre("8");
                    textViewCalcul.setText(calculview);
                    break;
                case R.id.btn_seven:
                    calculview = calcul.chiffre("7");
                    textViewCalcul.setText(calculview);
                    break;
                case R.id.btn_six:
                    calculview = calcul.chiffre("6");
                    textViewCalcul.setText(calculview);
                    break;
                case R.id.btn_five:
                    calculview = calcul.chiffre("5");
                    textViewCalcul.setText(calculview);
                    break;
                case R.id.btn_four:
                    calculview = calcul.chiffre("4");
                    textViewCalcul.setText(calculview);
                    break;
                case R.id.btn_three:
                    calculview = calcul.chiffre("3");
                    textViewCalcul.setText(calculview);
                    break;
                case R.id.btn_two:
                    calculview = calcul.chiffre("2");
                    textViewCalcul.setText(calculview);
                    break;
                case R.id.btn_one:
                    calculview = calcul.chiffre("1");
                    textViewCalcul.setText(calculview);
                    break;
                case R.id.btn_comma:
                    calculview = calcul.chiffre(".");
                    textViewCalcul.setText(calculview);
                case R.id.btn_minus:
                    calculview = calcul.chiffre(".");
                    textViewCalcul.setText(calculview);
                    break;
                case R.id.btn_plus:
                    calculview = calcul.chiffre("+");
                    textViewCalcul.setText(calculview);
                    break;
                case R.id.btn_divider:
                    calculview = calcul.operation("/");
                    textViewCalcul.setText(calculview);
                    break;
                case R.id.btn_multiplicator:
                    calculview = calcul.operation("x");
                    textViewCalcul.setText(calculview);
                    break;
                case R.id.btn_clear:
                    calcul.clear();
                    textViewCalcul.setText("0");
                    break;
                case R.id.btn_zero:
                    calculview = calcul.chiffre("0");
                    textViewCalcul.setText(calculview);
                    break;
                case R.id.btn_result:
                    valueresult = calcul.result();
                    textViewCalcul.setText(String.valueOf(valueresult));
                    break;
                default:
                    break;
            }
        }
    };

}
