package com.demo.view;

import com.demo.interfaces.RightChildMVP;

public class ImpRightChildView implements RightChildMVP.IView {
    private RightChildMVP.IPresenter rightChildPresenter;

    public ImpRightChildView(RightChildMVP.IPresenter rightChildPresenter) {
        this.rightChildPresenter = rightChildPresenter;
    }

    @Override
    public void p2vRightChildNotifyView() {

    }
}
