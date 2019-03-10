package com.demo.presenter;

import com.demo.interfaces.RightChildMVP;

public class ImpRightChildPresenter implements RightChildMVP.IPresenter {
    private RightChildMVP.IView rightChildView;
    private RightChildMVP.IModel rightChildModel;

    public ImpRightChildPresenter(RightChildMVP.IView rightChildView, RightChildMVP.IModel rightChildModel) {
        this.rightChildView = rightChildView;
        this.rightChildModel = rightChildModel;
    }

    @Override
    public void v2pRightChildGetData() {
        rightChildModel.p2mRightChildGetData();
    }

    @Override
    public void m2pRightChildNotifyGetDataResult() {
        rightChildView.p2vRightChildNotifyView();
    }
}
