/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 abel533@gmail.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.github.abel533.echarts.axis;

import com.github.abel533.echarts.code.LineType;
import com.github.abel533.echarts.style.LineStyle;

/**
 * 坐标轴线
 * Created by liuzh on 14-8-26.
 */
public class AxisLine {
    /**
     * 默认显示，属性show控制显示与否
     */
    public Boolean show;

    /**
     * 定位到垂直方向的0值坐标上
     */
    public Boolean onZero;

    /**
     * {color: '#48b', width: 2, type: 'solid'}
     *
     * @see com.github.abel533.echarts.style.LineStyle
     */
    public LineStyle lineStyle;

    public AxisLine() {
        this.show = true;
        this.onZero = true;
        this.lineStyle = new LineStyle();
        this.lineStyle.color = "#48b";
        this.lineStyle.width = 2;
        this.lineStyle.type = LineType.solid;
    }
}
