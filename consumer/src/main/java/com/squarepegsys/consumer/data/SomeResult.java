package com.squarepegsys.consumer.data;

public class SomeResult {
    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public SomeError getError() {
        return error;
    }

    public void setError(SomeError error) {
        this.error = error;
    }

    private Integer result;

    private SomeError error;
}
