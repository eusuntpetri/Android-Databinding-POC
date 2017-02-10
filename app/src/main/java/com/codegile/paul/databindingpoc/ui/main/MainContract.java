package com.codegile.paul.databindingpoc.ui.main;

import com.codegile.paul.databindingpoc.ui.main.views.first.MainActivityFirstView;
import com.codegile.paul.databindingpoc.ui.main.views.second.MainActivitySecondView;
import com.codegile.paul.databindingpoc.ui.main.views.third.MainActivityThirdView;

/**
 * Created by Paul on 10-Feb-17.
 */

public interface MainContract {

    interface Presenter extends
            MainActivityFirstView.ActionHandler,
            MainActivitySecondView.ActionHandler,
            MainActivityThirdView.ActionHandler {

    }

    interface View {

        void setText(String string);

        void switchFlag();

        void switchThirdViewVisibility();

        void hideThirdView();
    }
}
