package com.licorice.marzipan.applications;

import com.licorice.marzipan.R;

import androidx.annotation.NonNull;

// TODO: Remove `//` below to enable OneSignal
//import com.onesignal.OneSignal;

import candybar.lib.applications.CandyBarApplication;

public class CandyBar extends CandyBarApplication {

    // TODO: Remove `/*` and `*/` below to enable OneSignal

    @NonNull
    @Override
    public Class<?> getDrawableClass() {
        return R.drawable.class;
    }

    @NonNull
    @Override
    public Configuration onInit() {
        // Sample configuration
        Configuration configuration = new Configuration();

        configuration.setGenerateAppFilter(true);
        configuration.setGenerateAppMap(true);
        configuration.setGenerateThemeResources(true);

        DonationLink[] donationLinks = new DonationLink[]{
                new DonationLink(
                        "kofi",
                        "Ko-Fi",
                        "Support me !",
                        "https://ko-fi.com/licorice45")
        };
        configuration.setDonationLinks(donationLinks);


        return configuration;
    }
}
