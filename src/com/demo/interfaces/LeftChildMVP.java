package com.demo.interfaces;

public class LeftChildMVP {
    public interface IView{
        void p2vLeftChildNotifyView();
    }

    public interface IModel{
        void p2mLeftChildGetData();
    }

    public interface IPresenter {
        void v2pLeftChildGetData();
        void m2pLeftChildNotifyGetDataResult();
    }
}
