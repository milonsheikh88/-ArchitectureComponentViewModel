package com.milonsheikh.viewmodel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvNumber = findViewById(R.id.tv_number);
        String myRandomNumber;

        /**
         * Without viewModel
         * */

//        Calculation myData = new Calculation();
//        myRandomNumber = myData.getRandom();

        /**
         * With viewModel
         * */

        MainActivityViewModel viewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);
        myRandomNumber = viewModel.getRandom();
        tvNumber.setText(myRandomNumber);

    }
}