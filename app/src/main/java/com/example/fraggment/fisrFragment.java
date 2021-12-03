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


public class fisrFragment extends Fragment {

   private FragmentFisrBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentFisrBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        btnclik();
    }

    private void btnclik() {
        binding.bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                seconFragment seconFragment = new seconFragment();
                Bundle bundle = new Bundle();
                bundle.putString("key1",binding.text1.getText().toString());
                seconFragment.setArguments(bundle);
                FragmentTransaction fragmentTransaction = getParentFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.main_box,seconFragment);
                fragmentTransaction.commit();
            }
        });
    }
}