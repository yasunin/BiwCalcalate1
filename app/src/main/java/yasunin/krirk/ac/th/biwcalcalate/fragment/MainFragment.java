package yasunin.krirk.ac.th.biwcalcalate.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
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

public class MainFragment extends Fragment{

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


//        Create Toolbar
        createToolbar();
//        Showname calculate
        shownameCalculate();
//        calcuiate controller
        calcuiateController();


    }   //main method

    private void calcuiateController() {
        Button button = getView().findViewById(R.id.btnShowname);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getActivity().getSupportFragmentManager()
                        .beginTransaction().replace(R.id.contentMainFragment,new CalculateFragment())
                        .addToBackStack(null)
                        .commit();

            }
        });
    }

    private void shownameCalculate() {
        Button button = getView().findViewById(R.id.btnShowname);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = getView().findViewById(R.id.btnShowname);
                  textView.setText("Yasunin");


            }
        });

    }

    private void createToolbar() {
        Toolbar toolbar = getView().findViewById(R.id.ToolbarMain);
        ((MainActivity)getActivity()).setSupportActionBar(toolbar);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View View = inflater.inflate(R.layout.activity_main,container,false);
        return View;
    }
}  //Main Class
