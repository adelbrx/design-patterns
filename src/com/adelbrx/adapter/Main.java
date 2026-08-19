package com.adelbrx.adapter;

import com.adelbrx.adapter.avaFilters.Caramel;
import com.adelbrx.adapter.avaFilters.CaramelFilter;

public class Main {
    static void main(String[] args) {
        var imageView = new ImageView(new Image());
        imageView.apply(new VividFilter());
        imageView.apply(new CaramelFilter(new Caramel()));
    }
}
