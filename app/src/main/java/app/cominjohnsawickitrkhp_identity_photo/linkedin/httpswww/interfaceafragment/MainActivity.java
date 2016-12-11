

package app.cominjohnsawickitrkhp_identity_photo.linkedin.httpswww.interfaceafragment;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*
        Fragment fragmentA= new Fragment();
        Fragment fragmentB= new Fragment();
        //getFragmentManager().beginTransaction().add(R.id.activity_main, fragmentA, "Fragment A").commit();
        //getFragmentManager().beginTransaction().add(R.id.activity_main, fragmentB, "Fragment B").commit();
        FragmentManager fragmentManager  = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.activity_main, fragmentA, "Fragment A");
        //  fragmentTransaction.add(R.id.activity_main, fragmentB, "Fragment B");
        fragmentTransaction.commit();
*/
    }
}
