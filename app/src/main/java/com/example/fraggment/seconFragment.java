package com.example.fraggment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fraggment.databinding.FragmentFisrBinding;
import com.example.fraggment.databinding.FragmentSeconBinding;

public class seconFragment extends Fragment {
    private FragmentSeconBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSeconBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.text2.setText(getArguments().getString("key1"));
        btnclik();
    }
    private void btnclik() {
        binding.bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                threeFragment threeFragment = new threeFragment();
                Bundle bundle = new Bundle();
                bundle.putString("key2",binding.text2.getText().toString());
                threeFragment.setArguments(bundle);
                FragmentTransaction fragmentTransaction = getParentFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.main_box,threeFragment);
                fragmentTransaction.commit();
            }
        });
    }
}