package com.demo.model;

import com.demo.interfaces.LeftChildMVP;

public class ImpLeftChildModel implements LeftChildMVP.IModel {
    private LeftChildMVP.IPresenter leftChildPresenter;

    ImpLeftChildModel(LeftChildMVP.IPresenter leftChildPresenter) {
        this.leftChildPresenter = leftChildPresenter;
    }

    @Override
    public void p2mLeftChildGetData() {
        //获取数据
        leftChildPresenter.m2pLeftChildNotifyGetDataResult();
    }
}
