package com.demo.presenter;

import com.demo.interfaces.DemoMVP;
import com.demo.interfaces.LeftChildMVP;
import com.demo.interfaces.RightChildMVP;
import com.demo.model.ImpModel;

public class ImpPresenter implements DemoMVP.IPresenter {
    private DemoMVP.IView iView;
    private DemoMVP.IModel iModel = new ImpModel(this);

    private LeftChildMVP.IPresenter leftChildPresenter;
    private RightChildMVP.IPresenter rightChildPresenter;

    public ImpPresenter(DemoMVP.IView iView) {
        this.iView = iView;
        this.leftChildPresenter = new ImpLeftChildPresenter(iView, iModel);
        this.rightChildPresenter = new ImpRightChildPresenter(iView, iModel);
    }

    @Override
    public void v2pLeftChildGetData() {
        leftChildPresenter.v2pLeftChildGetData();
    }

    @Override
    public void m2pLeftChildNotifyGetDataResult() {
        leftChildPresenter.m2pLeftChildNotifyGetDataResult();
    }

    @Override
    public void v2pRightChildGetData() {
        rightChildPresenter.v2pRightChildGetData();
    }

    @Override
    public void m2pRightChildNotifyGetDataResult() {
        rightChildPresenter.m2pRightChildNotifyGetDataResult();
    }
}
