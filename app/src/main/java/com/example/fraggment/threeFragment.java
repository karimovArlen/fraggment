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
import com.example.fraggment.databinding.FragmentThreeBinding;


public class threeFragment extends Fragment {
    private FragmentThreeBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentThreeBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.text3.setText(getArguments().getString("key2"));
        btnclik();

    }
    private void btnclik() {
        binding.bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fourFragment fourFragment = new fourFragment();
                Bundle bundle = new Bundle();
                bundle.putString("key3",binding.text3.getText().toString());
                fourFragment.setArguments(bundle);
                FragmentTransaction fragmentTransaction = getParentFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.main_box,fourFragment);
                fragmentTransaction.commit();
            }
        });
    }
}