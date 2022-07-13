package com.developer.wang.utils.floatwindow;

import android.view.View;


/**

 */

abstract class FloatView {

    abstract void setSize(int width, int height);

    abstract void setView(View view);

    abstract void setGravity(int gravity, int xOffset, int yOffset);

    abstract void init();

    abstract void dismiss();

    void updateXY(int x, int y) {
    }

    void updateX(int x) {
    }

    void updateY(int y) {
    }
    abstract void updateWidth(int width);
    abstract void updateHeight(int height);

    int getX() {
        return 0;
    }

    int getY() {
        return 0;
    }
}
