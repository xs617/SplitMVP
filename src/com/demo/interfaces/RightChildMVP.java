package com.demo.interfaces;

public class RightChildMVP {
    public interface IView{
        void p2vRightChildNotifyView();
    }

    public interface IModel{
        void p2mRightChildGetData();
    }

    public interface IPresenter {
        void v2pRightChildGetData();
        void m2pRightChildNotifyGetDataResult();
    }
}
