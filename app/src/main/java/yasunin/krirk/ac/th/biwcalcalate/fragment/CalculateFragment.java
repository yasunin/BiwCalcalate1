package yasunin.krirk.ac.th.biwcalcalate.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import yasunin.krirk.ac.th.biwcalcalate.MainActivity;
import yasunin.krirk.ac.th.biwcalcalate.R;

/**
 * Created by Tipa on 1/9/2018.
 */

public class CalculateFragment extends Fragment{

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        Creat toolbar
        creatToolbar();

    }

    private void creatToolbar() {
        Toolbar toolbar = getView().findViewById(R.id.toolbarcalculate);
        ((MainActivity)getActivity()).setSupportActionBar(toolbar);
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
        View view = inflater.inflate(R.layout.fragment_calculate,container,false);
        return view;
    }
}   //Main Class
