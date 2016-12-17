package me.jcala.xmarket.mvp.school;

import java.util.List;

import me.jcala.xmarket.data.dto.Result;
import me.jcala.xmarket.data.pojo.Trade;

public interface SchoolModel {

    interface onGainListener{
        void onReqComplete(Result<List<Trade>> result);
    }
    void executeGetTradesReq(onGainListener listener,String schoolName,int page);
}
