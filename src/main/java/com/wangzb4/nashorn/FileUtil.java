package com.wangzb4.nashorn;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

public final class FileUtil {
    private FileUtil() {
    }

    public static File getResourceFile(String resourceFileName) {
        return new File(FileUtil.class.getClassLoader().getResource(resourceFileName).getPath());
    }

    public static String getResourceFileContent(String resourceFileName) throws IOException {
        return IOUtils.toString(FileUtil.class.getClassLoader().getResourceAsStream(resourceFileName), "UTF-8");
    }

    public static String getFileContent(File file) throws IOException {
        return FileUtils.readFileToString(file, "UTF-8");
    }

    public static File createTempFile(String content) throws IOException {
        File file = File.createTempFile("nashorn-demo", "");
        FileUtils.write(file, content, "UTF-8");

        return file;
    }
}
