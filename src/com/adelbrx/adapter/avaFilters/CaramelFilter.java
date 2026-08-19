package com.adelbrx.adapter.avaFilters;

import com.adelbrx.adapter.Filter;
import com.adelbrx.adapter.Image;

public class CaramelFilter implements Filter {
    private Caramel caramel;

    public CaramelFilter(Caramel caramel) {
        this.caramel = caramel;
    }

    @Override
    public void apply(Image image) {
        caramel.init();
        caramel.render(image);
    }
}
