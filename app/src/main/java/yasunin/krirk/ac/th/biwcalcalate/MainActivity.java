package yasunin.krirk.ac.th.biwcalcalate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import yasunin.krirk.ac.th.biwcalcalate.fragment.MainFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Add Fragment to Atity
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentMainFragment, new MainFragment())
                    .commit();

        }

    }   //Main Method

    @Override
    public void onClick(View view) {

    }
}   //Main Class
