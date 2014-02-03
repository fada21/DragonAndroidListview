package com.fada21.edslv.sample;

import java.util.List;

import com.fada21.edslv.data.ListDataProvider;
import com.fada21.edslv.dragable.Dragable;

public class SampleDataProvider extends ListDataProvider<SampleListItem> implements Dragable {

    public SampleDataProvider(List<SampleListItem> data) {
        super(data);
    }

    @Override
    public void swap(int indexOne, int indexTwo) {
        SampleListItem temp = data.get(indexOne);
        data.set(indexOne, data.get(indexTwo));
        data.set(indexTwo, temp);
    }

}
