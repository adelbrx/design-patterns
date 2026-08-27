package com.adelbrx.factory;

import com.adelbrx.factory.matcha.Controller;
import com.adelbrx.factory.matcha.ViewEngine;
import com.adelbrx.factory.sharp.SharpViewEngine;

public class SharpController extends Controller {
    @Override
    protected ViewEngine createViewEngine() {
        return new SharpViewEngine();
    }
}
