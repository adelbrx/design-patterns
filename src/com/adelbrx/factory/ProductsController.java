package com.adelbrx.factory;

import com.adelbrx.factory.matcha.Controller;
import com.adelbrx.factory.matcha.MatchaViewEngine;
import com.adelbrx.factory.matcha.ViewEngine;

import java.util.HashMap;
import java.util.Map;

public class ProductsController extends SharpController {
    public void listProducts() {
        // Get products from a DB
        Map<String, Object> context = new HashMap<>();
        // context.put(products)
        render("products.html", context);
    }

    @Override
    protected ViewEngine createViewEngine() {
        return new MatchaViewEngine();
    }
}
