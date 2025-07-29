package com.github.catvod.utils;

import android.net.Uri;
import android.os.Environment;

import com.github.catvod.Init;

import java.io.File;

public class PathExtend {

    private static File mkdir(File file) {
        if (!file.exists()) file.mkdirs();
        return file;
    }

    public static File files() {
        return Init.context().getFilesDir();
    }

    public static File download() {
        return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
    }

    public static File so() {
        return mkdir(new File(files() + File.separator + "so"));
    }

    public static File so(String name) {
        if (name.startsWith("http")) return new File(so(), Uri.parse(name).getLastPathSegment());
        return new File(so(), "lib".concat(name).concat(".so"));
    }

    public static void clearDownloadedCache() {
        Path.clear(new File(Path.cache("jpa") + File.separator + "jpali" + File.separator + "Downloads"));
        Path.clear(Path.thunder());
        Path.clear(Path.js());
    }
}
