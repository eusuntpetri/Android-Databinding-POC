package com.codegile.paul.databindingpoc.ui.main;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.codegile.paul.databindingpoc.BR;

import java.util.Random;

/**
 * Created by Paul on 11-Feb-17.
 */

public class MainActivityShapesViewModel extends BaseObservable {

    private boolean circlesVisible = true, squaresVisible = false;

    private float
            firstCircleTop, firstCircleLeft,
            secondCircleTop, secondCircleLeft,
            thirdCircleTop, thirdCircleLeft,
            firstSquareTop, firstSquareLeft,
            secondSquareTop, secondSquareLeft,
            thirdSquareTop, thirdSquareLeft;

    public void randomizeVisibleShapePositions(int maxWidth, int maxHeight) {
        Random r = new Random();

        if (circlesVisible) {
            setFirstCircleTop(r.nextInt(maxHeight));
            setFirstCircleLeft(r.nextInt(maxWidth));
            setSecondCircleTop(r.nextInt(maxHeight));
            setSecondCircleLeft(r.nextInt(maxWidth));
            setThirdCircleTop(r.nextInt(maxHeight));
            setThirdCircleLeft(r.nextInt(maxWidth));
        }
        if (squaresVisible) {
            setFirstSquareTop(r.nextInt(maxHeight));
            setFirstSquareLeft(r.nextInt(maxWidth));
            setSecondSquareTop(r.nextInt(maxHeight));
            setSecondSquareLeft(r.nextInt(maxWidth));
            setThirdSquareTop(r.nextInt(maxHeight));
            setThirdSquareLeft(r.nextInt(maxWidth));
        }
    }

    public void swapShapeVisibility() {
        setCirclesVisible(isSquaresVisible());
        setSquaresVisible(!isCirclesVisible());
    }

    @Bindable
    public boolean isCirclesVisible() {
        return circlesVisible;
    }

    public void setCirclesVisible(boolean circlesVisible) {
        this.circlesVisible = circlesVisible;
        notifyPropertyChanged(BR.circlesVisible);
    }

    @Bindable
    public boolean isSquaresVisible() {
        return squaresVisible;
    }

    public void setSquaresVisible(boolean squaresVisible) {
        this.squaresVisible = squaresVisible;
        notifyPropertyChanged(BR.squaresVisible);
    }

    @Bindable
    public float getFirstCircleTop() {
        return firstCircleTop;
    }

    public void setFirstCircleTop(float firstCircleTop) {
        this.firstCircleTop = firstCircleTop;
        notifyPropertyChanged(BR.firstCircleTop);
    }

    @Bindable
    public float getFirstCircleLeft() {
        return firstCircleLeft;
    }

    public void setFirstCircleLeft(float firstCircleLeft) {
        this.firstCircleLeft = firstCircleLeft;
        notifyPropertyChanged(BR.firstCircleLeft);
    }

    @Bindable
    public float getSecondCircleTop() {
        return secondCircleTop;
    }

    public void setSecondCircleTop(float secondCircleTop) {
        this.secondCircleTop = secondCircleTop;
        notifyPropertyChanged(BR.secondCircleTop);
    }

    @Bindable
    public float getSecondCircleLeft() {
        return secondCircleLeft;
    }

    public void setSecondCircleLeft(float secondCircleLeft) {
        this.secondCircleLeft = secondCircleLeft;
        notifyPropertyChanged(BR.secondCircleLeft);
    }

    @Bindable
    public float getThirdCircleTop() {
        return thirdCircleTop;
    }

    public void setThirdCircleTop(float thirdCircleTop) {
        this.thirdCircleTop = thirdCircleTop;
        notifyPropertyChanged(BR.thirdCircleTop);
    }

    @Bindable
    public float getThirdCircleLeft() {
        return thirdCircleLeft;
    }

    public void setThirdCircleLeft(float thirdCircleLeft) {
        this.thirdCircleLeft = thirdCircleLeft;
        notifyPropertyChanged(BR.thirdCircleLeft);
    }

    @Bindable
    public float getFirstSquareTop() {
        return firstSquareTop;
    }

    public void setFirstSquareTop(float firstSquareTop) {
        this.firstSquareTop = firstSquareTop;
        notifyPropertyChanged(BR.firstSquareTop);
    }

    @Bindable
    public float getFirstSquareLeft() {
        return firstSquareLeft;
    }

    public void setFirstSquareLeft(float firstSquareLeft) {
        this.firstSquareLeft = firstSquareLeft;
        notifyPropertyChanged(BR.firstSquareLeft);
    }

    @Bindable
    public float getSecondSquareTop() {
        return secondSquareTop;
    }

    public void setSecondSquareTop(float secondSquareTop) {
        this.secondSquareTop = secondSquareTop;
        notifyPropertyChanged(BR.secondSquareTop);
    }

    @Bindable
    public float getSecondSquareLeft() {
        return secondSquareLeft;
    }

    public void setSecondSquareLeft(float secondSquareLeft) {
        this.secondSquareLeft = secondSquareLeft;
        notifyPropertyChanged(BR.secondSquareLeft);
    }

    @Bindable
    public float getThirdSquareTop() {
        return thirdSquareTop;
    }

    public void setThirdSquareTop(float thirdSquareTop) {
        this.thirdSquareTop = thirdSquareTop;
        notifyPropertyChanged(BR.thirdSquareTop);
    }

    @Bindable
    public float getThirdSquareLeft() {
        return thirdSquareLeft;
    }

    public void setThirdSquareLeft(float thirdSquareLeft) {
        this.thirdSquareLeft = thirdSquareLeft;
        notifyPropertyChanged(BR.thirdSquareLeft);
    }
}
