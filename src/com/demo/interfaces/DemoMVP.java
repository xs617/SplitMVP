package com.demo.interfaces;

public class DemoMVP {
    public interface IView extends LeftChildMVP.IView, RightChildMVP.IView {
        @Override
        void p2vLeftChildNotifyView();

        @Override
        void p2vRightChildNotifyView();
    }

    public interface IModel extends LeftChildMVP.IModel, RightChildMVP.IModel {
        @Override
        void p2mLeftChildGetData();

        @Override
        void p2mRightChildGetData();
    }

    public interface IPresenter extends LeftChildMVP.IPresenter, RightChildMVP.IPresenter {
        @Override
        void v2pLeftChildGetData();

        @Override
        void m2pLeftChildNotifyGetDataResult();

        @Override
        void v2pRightChildGetData();

        @Override
        void m2pRightChildNotifyGetDataResult();
    }
}
