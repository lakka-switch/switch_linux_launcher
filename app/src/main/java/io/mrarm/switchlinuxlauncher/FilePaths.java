package io.mrarm.switchlinuxlauncher;

import android.content.Context;

import java.io.File;

public class FilePaths {

    public static File getShofEL2Dir(Context ctx) {
        return ctx.getExternalFilesDir("shofel2");
    }

}
