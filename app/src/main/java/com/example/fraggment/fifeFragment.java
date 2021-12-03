package com.example.fraggment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fraggment.databinding.FragmentFifeBinding;
import com.example.fraggment.databinding.FragmentSeconBinding;
import com.example.fraggment.databinding.FragmentThreeBinding;


public class fifeFragment extends Fragment {
    private FragmentFifeBinding binding;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFifeBinding.inflate(inflater,container,false);
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.text5.setText(getArguments().getString("key4"));


    }
}