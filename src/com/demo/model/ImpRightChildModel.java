package com.demo.model;

import com.demo.interfaces.RightChildMVP;

public class ImpRightChildModel implements RightChildMVP.IModel {
    private RightChildMVP.IPresenter rightChildPresenter;

    ImpRightChildModel(RightChildMVP.IPresenter rightChildPresenter) {
        this.rightChildPresenter = rightChildPresenter;
    }

    @Override
    public void p2mRightChildGetData() {
        rightChildPresenter.m2pRightChildNotifyGetDataResult();
    }
}
