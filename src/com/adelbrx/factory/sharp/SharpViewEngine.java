package com.adelbrx.factory.sharp;

import com.adelbrx.factory.matcha.ViewEngine;

import java.util.Map;

public class SharpViewEngine implements ViewEngine {
    @Override
    public String render(String filename, Map<String, Object> context) {
        return "View rendered by Sharp";
    }
}
