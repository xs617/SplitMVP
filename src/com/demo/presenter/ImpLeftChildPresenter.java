package com.demo.presenter;

import com.demo.interfaces.LeftChildMVP;

public class ImpLeftChildPresenter implements LeftChildMVP.IPresenter {
    private LeftChildMVP.IView leftChildView;
    private LeftChildMVP.IModel leftChildModel;

    public ImpLeftChildPresenter(LeftChildMVP.IView leftChildView, LeftChildMVP.IModel leftChildModel) {
        this.leftChildView = leftChildView;
        this.leftChildModel = leftChildModel;
    }

    @Override
    public void v2pLeftChildGetData() {
        leftChildModel.p2mLeftChildGetData();
    }

    @Override
    public void m2pLeftChildNotifyGetDataResult() {
        leftChildView.p2vLeftChildNotifyView();
    }
}
