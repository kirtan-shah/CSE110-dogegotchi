package edu.ucsd.cse110.dogegotchi.doge;

import android.util.Log;
import android.view.View;

public class FoodMenuView implements IDogeObserver {

    private View foodMenuView;

    public FoodMenuView(View foodMenuView) {
        this.foodMenuView = foodMenuView;
    }
    @Override
    public void onStateChange(Doge.State newState) {
        Log.i("FoodMenuView state changed to", newState.toString());
        if(newState == Doge.State.SAD) {
            foodMenuView.setVisibility(View.VISIBLE);
        }
        else {
            foodMenuView.setVisibility(View.GONE);
        }
    }
}
