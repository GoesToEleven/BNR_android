package com.example.toddmcleod.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by toddmcleod on 12/2/14.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
