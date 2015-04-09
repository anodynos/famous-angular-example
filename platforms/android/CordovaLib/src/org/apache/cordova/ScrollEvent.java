/*
       Licensed to the Apache Software Foundation (ASF) under one
       or more contributor license agreements.  See the NOTICE file
       distributed with this work for additional information
       regarding copyright ownership.  The ASF licenses this file
       to you under the Apache License, Version 2.0 (the
       "License"); you may not use this file except in compliance
       with the License.  You may obtain a copy of the License at

         http://www.apache.org/licenses/LICENSE-2.0

       Unless required by applicable law or agreed to in writing,
       software distributed under the License is distributed on an
       "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
       KIND, either express or implied.  See the License for the
       specific language governing permissions and limitations
       under the License.
*/

package org.apache.cordova;

import android.view.View;

/*
 * @deprecated As of release 4.0. Use view.getViewTreeObserver().addOnScrollChangedListener(...) instead.
 */
@Deprecated
public class ScrollEvent {
    
    public int l, t, nl, nt;
    private View targetView;
    
    /*
     * ScrollEvent constructor
     * No idea why it uses l and t instead of x and y
     * 
     * @param x
     * @param y
     * @param nx
     * @param ny
     * @param view
     */
    
    public ScrollEvent(int nx, int ny, int x, int y, View view)
    {
        l = x; y = t; nl = nx; nt = ny;
        targetView = view;
    }
    
    public int dl()
    {
        return nl - l;
    }
    
    public int dt()
    {
        return nt - t;
    }
    
    public View getTargetView()
    {
        return targetView;
    }

}