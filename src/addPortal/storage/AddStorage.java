package addPortal.storage;

import addPortal.model.AD;

import java.util.ArrayList;

import java.util.List;

public class AddStorage {

    List<AD> ads = new ArrayList<>();

    public void newAd(AD ad) {
        for (int i = 0; i < ads.size(); i++) {
            ads.add(i, ad);
        }

    }

}
