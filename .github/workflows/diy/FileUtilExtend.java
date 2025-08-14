package com.fongmi.android.tv.utils;

import com.fongmi.android.tv.App;
import com.github.catvod.utils.Path;

public class FileUtilExtend {

    public static void clearApiCache() {
        App.post(() -> {
            Notify.show("自动清理接口缓存中。。。");
            Path.clear(Path.files());
            Path.clear(Path.cache());
            try {
                Path.clear(App.get().getExternalCacheDir());
            }catch (Exception ignored){}
        });
    }
}
