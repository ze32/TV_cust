package com.github.catvod.utils;

import android.os.Environment;

import java.io.File;

public class PathExtend {
    public static File download() {
        return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
    }

    public static void clearDownloadedCache() {
        Path.clear(new File(Path.cache("jpa") + File.separator + "jpali" + File.separator + "Downloads"));
        Path.clear(Path.thunder());
        Path.clear(Path.js());
    }
}
