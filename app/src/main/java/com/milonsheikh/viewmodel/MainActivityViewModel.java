package com.milonsheikh.viewmodel;

import androidx.lifecycle.ViewModel;

import java.util.Random;

public class MainActivityViewModel extends ViewModel{
    private String myRandomNumber;

    public String getRandom() {
        System.out.println( "=== Get Random ===");
        if (myRandomNumber == null) {
            createRandom();
        }
        return myRandomNumber;
    }

    private void createRandom() {
        System.out.println( "=== Create Random ===");
        Random random = new Random();
        int result = new Random().nextInt(20000-10000) + 10000;
        myRandomNumber = String.valueOf(result);
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        System.out.println( "=== ViewModel Destroyed ===");
    }

}
