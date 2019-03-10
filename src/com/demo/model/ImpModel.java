package com.demo.model;

import com.demo.interfaces.DemoMVP;
import com.demo.interfaces.LeftChildMVP;
import com.demo.interfaces.RightChildMVP;

public class ImpModel implements DemoMVP.IModel {
    private DemoMVP.IPresenter iPresenter;
    private LeftChildMVP.IModel leftChildModel;
    private RightChildMVP.IModel rightChildModel;

    public ImpModel(DemoMVP.IPresenter iPresenter) {
        this.iPresenter = iPresenter;
        leftChildModel = new ImpLeftChildModel(iPresenter);
        rightChildModel = new ImpRightChildModel(iPresenter);
    }

    @Override
    public void p2mLeftChildGetData() {
        leftChildModel.p2mLeftChildGetData();
    }

    @Override
    public void p2mRightChildGetData() {
        rightChildModel.p2mRightChildGetData();
    }
}
