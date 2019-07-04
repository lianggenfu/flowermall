package com.example.ssmdemo.model.condition;

import java.util.Objects;

public class BaseCondition {

    private Integer start = 0;

    private Integer limit = 10;

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseCondition that = (BaseCondition) o;
        return Objects.equals(start, that.start) &&
                Objects.equals(limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, limit);
    }
}
