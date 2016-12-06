package com.jeremiezipfel.calculette;

import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by cdsm08 on 21/11/2016.
 */

public class Operator extends AppCompatActivity {
    private String mResultat = "";
    private int positionOperateur = 0;
    private int lengthCalcul = 0;

    public String chiffre(String nb) {
        mResultat = mResultat + nb;
        lengthCalcul = lengthCalcul + 1;
        return mResultat;
    }

    public String operation(String operation) {
        mResultat = mResultat + operation;
        positionOperateur = lengthCalcul;
        return mResultat;
    }

    public String clear() {
        // ici on remet tous les compteurs à zéro
        mResultat = "";
        positionOperateur = 0;
        lengthCalcul = 0;
        return mResultat;
    }

    public float result() {
        //Float.parseFloat()
        String chiffreun = mResultat.substring(0, positionOperateur);
        int finPositionOperateur = positionOperateur + 1;
        String operateur = mResultat.substring(positionOperateur, finPositionOperateur);
        String chiffredeux = mResultat.substring(finPositionOperateur, lengthCalcul + 1);
        float value1 = Float.parseFloat(chiffreun);
        float value2 = Float.parseFloat(chiffredeux);

        switch (operateur) {
            case "+":
                value1 = value1 + value2;
                break;
            case "-":
                value1 = value1 - value2;
                break;
            case "x":
                value1 = value1 * value2;
                break;
            case "/":
                value1 = value1 / value2;
                break;
        }

        return value1;
    }

}
