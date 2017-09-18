package com.wangzb4.nashorn;

import java.io.IOException;

import javax.script.ScriptException;

public class NashornDemo {
    public static void main(String[] args) throws IOException, ScriptException {
        NashornUtils.eval("simple/app.js");
        NashornUtils.eval("underscore/app.js");
    }
}
