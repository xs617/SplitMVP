package com.demo.view;

import com.demo.interfaces.DemoMVP;
import com.demo.interfaces.LeftChildMVP;
import com.demo.interfaces.RightChildMVP;
import com.demo.presenter.ImpPresenter;

public class ImpView implements DemoMVP.IView {
    private DemoMVP.IPresenter iPresenter = new ImpPresenter(this);
    private LeftChildMVP.IView iv1 = new ImpLeftChildView(iPresenter);
    private RightChildMVP.IView iv2 = new ImpRightChildView(iPresenter);

    public void onCreate() {
        iPresenter.v2pLeftChildGetData();
        iPresenter.v2pRightChildGetData();
    }

    @Override
    public void p2vLeftChildNotifyView() {
        iv1.p2vLeftChildNotifyView();
    }

    @Override
    public void p2vRightChildNotifyView() {
        iv2.p2vRightChildNotifyView();
    }
}
