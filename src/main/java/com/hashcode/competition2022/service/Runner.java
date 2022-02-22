package com.hashcode.competition2022.service;

import com.hashcode.competition2022.model.DomainModel;
import com.hashcode.competition2022.model.Result;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public Result run(List<DomainModel> models) {
        Result result = new Result(processInput_1(models));

        // verification step might be skipped
        checkResult(models, result);
        return result;
    }


    private void checkResult(List<DomainModel> models, Result result) {
        //todo Implement algorithm to check result
    }

    // todo Implement 1st algorithm for processing INPUT!
    private List<String> processInput_1(List<DomainModel> models) {

        return new ArrayList<>();
    }

}