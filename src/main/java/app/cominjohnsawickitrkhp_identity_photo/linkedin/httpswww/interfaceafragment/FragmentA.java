package app.cominjohnsawickitrkhp_identity_photo.linkedin.httpswww.interfaceafragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by John on 12/10/2016.
 */

public class FragmentA extends Fragment {
    int count = 0;
    String StringName;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_a, container, false);
/*
        EditText name = (EditText)v.findViewById(R.id.editText);
        StringName = name.getText().toString(); //converts EditText to String

        Button b = (Button) v.findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
*/
        return v;
    }


}
