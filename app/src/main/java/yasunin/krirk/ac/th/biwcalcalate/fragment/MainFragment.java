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

public class MainFragment extends Fragment{

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


//        Create Toolbar
        createToolbar();


    }   //main method

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
