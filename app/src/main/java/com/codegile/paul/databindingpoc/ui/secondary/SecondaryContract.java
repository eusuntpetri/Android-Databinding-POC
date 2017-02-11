package com.codegile.paul.databindingpoc.ui.secondary;

/**
 * Created by Paul on 10-Feb-17.
 */

public interface SecondaryContract {

    interface Presenter {

        void onClearClick();

        void onStartTertiaryActivityClick();
    }

    interface View {

        void toastAndClearText();

        void startTertiaryActivity();
    }
}
