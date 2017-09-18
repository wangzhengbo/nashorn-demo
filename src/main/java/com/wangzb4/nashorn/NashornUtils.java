package com.wangzb4.nashorn;

import java.io.IOException;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public final class NashornUtils {
	private static final ScriptEngine nashornScriptEngine;

	private NashornUtils() {
	}

	static {
		nashornScriptEngine = new ScriptEngineManager().getEngineByName("nashorn");
		try {
			eval("jvm-npm.js");
			eval("polyfill.js");
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public static Object eval(String resourceFileName) throws ScriptException, IOException {
		return nashornScriptEngine.eval(FileUtil.getResourceFileContent(resourceFileName));
	}
}
