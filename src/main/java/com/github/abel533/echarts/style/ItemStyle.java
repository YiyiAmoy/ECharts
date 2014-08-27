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

package com.github.abel533.echarts.style;

import com.github.abel533.echarts.Label;
import com.github.abel533.echarts.LabelLine;

/**
 * Description: ItemStyle
 * Author: liuzh
 * Update: liuzh(2014-08-26 09:30)
 */
public class ItemStyle {

    public abstract class Style {
        public Label label;
        public LabelLine labelLine;

        public String color;
        public String color0;
        public LineStyle lineStyle;
        public AreaStyle areaStyle;
        public ChordStyle chordStyle;
        public NodeStyle nodeStyle;
        public LinkStyle linkStyle;
        public String borderColor;
        public Integer borderRadius;
        public Integer borderWidth;
    }

    public class Normal extends Style {
    }

    public class Emphasis extends Style {
    }

    public Normal normal;
    public Emphasis emphasis;

    public ItemStyle() {
        this.normal = new Normal();
        this.emphasis = new Emphasis();
    }
}
