package com.virtualstudios.tvshows.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.virtualstudios.tvshows.R;
import com.virtualstudios.tvshows.databinding.ActivityTVShowDetailsBinding;
import com.virtualstudios.tvshows.responses.TVShowDetailsResponse;
import com.virtualstudios.tvshows.viewmodels.TVShowDetailsViewModel;

public class TVShowDetailsActivity extends AppCompatActivity {

    private ActivityTVShowDetailsBinding activityTVShowDetailsBinding;
    private TVShowDetailsViewModel tvShowDetailsViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityTVShowDetailsBinding = DataBindingUtil.setContentView(this, R.layout.activity_t_v_show_details);
        doInitialization();
    }

    private void doInitialization(){
        tvShowDetailsViewModel = new ViewModelProvider(this).get(TVShowDetailsViewModel.class);
        getTVShowDetails();
    }

    private void getTVShowDetails(){
        activityTVShowDetailsBinding.setIsLoading(true);
        String tvShowId = String.valueOf(getIntent().getIntExtra("id", -1));
        Log.d("TAG", "getTVShowDetails: "+tvShowId);
        tvShowDetailsViewModel.getTVShowDetails(tvShowId).observe(this,
                new Observer<TVShowDetailsResponse>() {
                    @Override
                    public void onChanged(TVShowDetailsResponse tvShowDetailsResponse) {
                        activityTVShowDetailsBinding.setIsLoading(false);
                        Toast.makeText(TVShowDetailsActivity.this, tvShowDetailsResponse.getTvShowDetails().getUrl(), Toast.LENGTH_SHORT).show();
                    }
                });
    }
}