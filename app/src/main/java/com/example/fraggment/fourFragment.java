package com.example.fraggment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fraggment.databinding.FragmentFourBinding;
import com.example.fraggment.databinding.FragmentSeconBinding;
import com.example.fraggment.databinding.FragmentThreeBinding;


public class fourFragment extends Fragment {
    private FragmentFourBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFourBinding.inflate(inflater,container,false);
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.text4.setText(getArguments().getString("key3"));
        btnclik();

    }
    private void btnclik() {
        binding.bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fifeFragment fifeFragment = new fifeFragment();
                Bundle bundle = new Bundle();
                bundle.putString("key4",binding.text4.getText().toString());
                fifeFragment.setArguments(bundle);
                FragmentTransaction fragmentTransaction = getParentFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.main_box,fifeFragment);
                fragmentTransaction.commit();
            }
        });
    }
}