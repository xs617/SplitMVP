package com.demo.view;

import com.demo.interfaces.LeftChildMVP;

public class ImpLeftChildView implements LeftChildMVP.IView {
    private LeftChildMVP.IPresenter leftChildPresenter;

    public ImpLeftChildView(LeftChildMVP.IPresenter ip1) {
        this.leftChildPresenter = leftChildPresenter;
    }

    @Override
    public void p2vLeftChildNotifyView() {

    }
}
