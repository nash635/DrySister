package com.tianwei.hakka.data.result;

import com.tianwei.hakka.data.dto.GankMeizi;

import java.util.ArrayList;

/**
 * 描述：Gank.io返回的结果集
 *
 */

public class GankResult {
    private Boolean error;
    private ArrayList<GankMeizi> results;

    public GankResult() { }

    public GankResult(Boolean error, ArrayList<GankMeizi> results) {
        this.error = error;
        this.results = results;
    }

    public Boolean getError() {
        return error;
    }

    public void setError(Boolean error) {
        this.error = error;
    }

    public ArrayList<GankMeizi> getResults() {
        return results;
    }

    public void setResults(ArrayList<GankMeizi> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "GankResult{" +
                "error=" + error +
                ", results=" + results.toString() +
                '}';
    }
}
