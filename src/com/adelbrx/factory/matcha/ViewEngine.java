package com.adelbrx.factory.matcha;

import java.util.Map;

public interface ViewEngine {
    String render(String filename, Map<String, Object> context);
}
