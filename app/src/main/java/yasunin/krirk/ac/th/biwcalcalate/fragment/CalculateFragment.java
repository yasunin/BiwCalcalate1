package yasunin.krirk.ac.th.biwcalcalate.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import yasunin.krirk.ac.th.biwcalcalate.MainActivity;
import yasunin.krirk.ac.th.biwcalcalate.R;

/**
 * Created by Tipa on 1/9/2018.
 */

public class CalculateFragment extends Fragment implements View.OnClickListener {

    //    Explesic
    private TextView textView;
    private Button buttonc, button1, button2, button3,
            button4, button5, button6, button7, button8, button9, button0, buttonDivide,
            buttonMultiply, buttonAdd, buttonMinus, buttonEqual;
    private String DisplayString = " ";
    private double num1ADouble = 0, displayADouble;
    private String tag = "23JanV1";
    private boolean addABoolean = false, minusBoolean = false, divideBoolean = false, mutiplatBoolean = false;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        Creat toolbar
        creatToolbar();


//        Intial View
        intialView();

//      One Controller
        costroller();
//      two  Controller
        twoController();
//      three Controller
        threeController();
//      four Controller
        fourController();

//        Number Controller
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button0.setOnClickListener(this);
        buttonDivide.setOnClickListener(this);
        buttonMultiply.setOnClickListener(this);
        buttonMinus.setOnClickListener(this);
        buttonAdd.setOnClickListener(this);
        buttonEqual.setOnClickListener(this);
        buttonc.setOnClickListener(this);


    }     //Main method

    private void fourController() {
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDisplay("4");
            }
        });
    }

    private void threeController() {
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDisplay("3");
            }
        });
    }

    private void twoController() {
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDisplay("2");
            }
        });
    }

    private void costroller() {
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                Show Display
                showDisplay("1");

            }
        });
    }

    private void showDisplay(String StrDisplay) {
        StringBuilder stringBuilder = new StringBuilder();
        DisplayString = DisplayString = stringBuilder.append(" ").toString();
        textView.setText(DisplayString);
    }

    private void intialView() {
        textView = getView().findViewById(R.id.txtDisplay);
        buttonc = getView().findViewById(R.id.btnC);
        button0 = getView().findViewById(R.id.btn0);
        button1 = getView().findViewById(R.id.btn1);
        button2 = getView().findViewById(R.id.btn2);
        button3 = getView().findViewById(R.id.btn3);
        button4 = getView().findViewById(R.id.btn4);
        button5 = getView().findViewById(R.id.btn5);
        button6 = getView().findViewById(R.id.btn6);
        button7 = getView().findViewById(R.id.btn7);
        button8 = getView().findViewById(R.id.btn8);
        button9 = getView().findViewById(R.id.btn9);
        buttonDivide = getView().findViewById(R.id.btnDivide);
        buttonMinus = getView().findViewById(R.id.btnMinus);
        buttonMultiply = getView().findViewById(R.id.btnMultiply);
        buttonAdd = getView().findViewById(R.id.btnAdd);
        buttonEqual = getView().findViewById(R.id.btnEqual);


    }

    private void creatToolbar() {
        Toolbar toolbar = getView().findViewById(R.id.toolbarcalculate);
        ((MainActivity) getActivity()).setSupportActionBar(toolbar);
        ((MainActivity) getActivity()).getActionBar().setTitle("Calculate");

        ((MainActivity) getActivity()).getSupportActionBar().setHomeButtonEnabled(true);
        ((MainActivity) getActivity()).getSupportActionBar().setDisplayShowHomeEnabled(true);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().popBackStack();
            }
        });
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_calculate, container, false);
        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.btn5:
                showDisplay("5");
                break;

            case R.id.btn6:
                showDisplay("6");
                break;

            case R.id.btn7:
                showDisplay("7");
                break;

            case R.id.btn8:
                showDisplay("8");
                break;

            case R.id.btn9:
                showDisplay("9");
                break;

            case R.id.btn0:
                showDisplay("0");
                break;

            case R.id.btnC:
//                Clear Display
                clearDisplay();
                break;

            case R.id.btnAdd:

                addABoolean = true;

                displayADouble = Double.parseDouble(DisplayString);

                if (num1ADouble == 0) {
                    num1ADouble = displayADouble;
                } else {
                    if (minusBoolean) {
                        num1ADouble = num1ADouble - displayADouble;
                        minusBoolean = false;


                    } else {

                        num1ADouble = num1ADouble + displayADouble;
                    }
                }
                Log.d(tag, "num1 ==> " + num1ADouble);

                clearDisplay();

                break;

            case R.id.btnEqual:
                displayADouble = Double.parseDouble(DisplayString);

                Log.d(tag, "num1ADouble ==> " + num1ADouble);
                Log.d(tag, "displayADouble ==> " + displayADouble);
                Log.d(tag, "addABoolean ==> " + addABoolean);


                if (addABoolean) {
                    num1ADouble = num1ADouble + displayADouble;
                    addABoolean = false;

                }else  if (minusBoolean){
                    num1ADouble = num1ADouble - displayADouble;
                    minusBoolean = false;
                }else  if (divideBoolean){
                    num1ADouble = num1ADouble / displayADouble;
                    divideBoolean = false;
                }else  if (mutiplatBoolean){
                    num1ADouble = num1ADouble * displayADouble;
                }
                Log.d(tag, "num1ADouble after if ==> " + num1ADouble);


                textView.setText(Double.toString(num1ADouble));
                DisplayString = "0";

                break;

            case R.id.btnMinus:
                minusBoolean = true;

                if (num1ADouble == 0) {
                    num1ADouble = Double.parseDouble(DisplayString);
                } else {

                    if (addABoolean) {
                        num1ADouble = num1ADouble + Double.parseDouble(DisplayString);
                        addABoolean = false;
                    } else {
                        num1ADouble = num1ADouble - Double.parseDouble(DisplayString);
                    }
                }
                Log.d(tag, "num1 at btnMinus ==> " + num1ADouble);
                clearDisplay();
                break;

            case R.id.btnDivide:
                divideBoolean = true;

                if (num1ADouble == 0) {
                    displayADouble = Double.parseDouble(DisplayString);
                } else {
                    num1ADouble = num1ADouble / Double.parseDouble(DisplayString);
                }
                Log.d(tag, "num1 at btnDivide ==> " + num1ADouble);
                clearDisplay();
                break;

            case R.id.btnMultiply:
                mutiplatBoolean = true;
                if (num1ADouble == 0){
                    displayADouble = Double.parseDouble(DisplayString);
                }else {
                    num1ADouble = num1ADouble * Double.parseDouble(DisplayString);
                }
                Log.d(tag, "num1 at btnMultipiy ==> " + num1ADouble);
                clearDisplay();
                break;

        }  //switch


    }   // OnClick

    private void clearDisplay() {

        if (addABoolean){

            textView.setText("");
            DisplayString = "";
            displayADouble = 0;

        }else if (minusBoolean){

            textView.setText("");
            DisplayString = "";
            displayADouble = 0;

        }else {
            textView.setText("");
            DisplayString = "";
            displayADouble = 0;
            num1ADouble = 0;
        }

    }
}   //Main Class
