package yasunin.krirk.ac.th.biwcalcalate.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import yasunin.krirk.ac.th.biwcalcalate.R;

/**
 * Created by Tipa on 1/9/2018.
 */

public class CalculateFragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_calculate,container,false);
        return view;
    }
}   //Main Class
