package com.example.navdrawer.ui.areaofcircle;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.navdrawer.R;
import com.example.navdrawer.ui.gallery.GalleryViewModel;

public class AreaCircle extends Fragment {

    private AreaCircleViewModel areaCircleViewModel;
    private EditText etradius;
    private Button btnarea;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        areaCircleViewModel =
                ViewModelProviders.of(this).get(AreaCircleViewModel.class);
        View root = inflater.inflate(R.layout.area_circle_fragment, container, false);
        final TextView textView = root.findViewById(R.id.text_areaofcircle);
        etradius=root.R.id.etradius;

        areaCircleViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
