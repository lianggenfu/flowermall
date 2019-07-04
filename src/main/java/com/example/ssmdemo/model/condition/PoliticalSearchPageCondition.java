package com.example.ssmdemo.model.condition;

import java.util.Objects;

public class PoliticalSearchPageCondition extends BaseCondition{

    private String searchText;

    public String getSearchText() {
        return searchText;
    }

    public void setSearchText(String searchText) {
        this.searchText = searchText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PoliticalSearchPageCondition that = (PoliticalSearchPageCondition) o;
        return Objects.equals(searchText, that.searchText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), searchText);
    }
}
