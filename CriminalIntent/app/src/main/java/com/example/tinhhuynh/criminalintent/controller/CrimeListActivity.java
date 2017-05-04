package com.example.tinhhuynh.criminalintent.controller;

import android.content.Intent;
import android.support.v4.app.Fragment;

import com.example.tinhhuynh.criminalintent.R;
import com.example.tinhhuynh.criminalintent.model.Crime;

/**
 * Created by TINH HUYNH on 4/20/2017.
 */

public class CrimeListActivity extends SingleFragmentActivity implements CrimeListFragment.Callbacks, CrimeFragment.Callbacks {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_masterdetail;
    }

    @Override
    public void onCrimeSelected(Crime crime) {
        if (findViewById(R.id.detail_fragment_container) == null) {
            Intent intent = CrimePagerActivity.newIntent(this, crime.getId());
            startActivity(intent);
        } else {
            Fragment newDetail = CrimeFragment.newInstance(crime.getId());
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.detail_fragment_container, newDetail)
                    .commit();
        }
    }


    @Override
    public void onCrimeUpdated(Crime crime) {
        CrimeListFragment crimeListFragment
                = (CrimeListFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_container);
        crimeListFragment.updateUI();
    }
}
