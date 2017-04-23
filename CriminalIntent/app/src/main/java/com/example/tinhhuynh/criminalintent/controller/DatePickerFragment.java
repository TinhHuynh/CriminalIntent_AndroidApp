package com.example.tinhhuynh.criminalintent.controller;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;

import com.example.tinhhuynh.criminalintent.R;

/**
 * Created by TINH HUYNH on 4/23/2017.
 */

public class DatePickerFragment extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return new AlertDialog.Builder(getActivity())
                .setTitle(R.string.date_picker_label)
                .setPositiveButton(android.R.string.ok, null)
                .create();
    }
}
