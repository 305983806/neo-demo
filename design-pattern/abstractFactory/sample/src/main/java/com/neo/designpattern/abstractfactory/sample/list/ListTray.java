package com.neo.designpattern.abstractfactory.sample.list;

import com.neo.designpattern.abstractfactory.sample.factory.Item;
import com.neo.designpattern.abstractfactory.sample.factory.Tray;

import java.util.Iterator;

public class ListTray extends Tray {

    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHtml() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<li>\n");
        buffer.append(caption + "\n");
        buffer.append("<ul>\n");

        Iterator it = tray.iterator();
        while (it.hasNext()) {
            Item item = (Item) it.next();
            buffer.append(item.makeHtml());
        }

        buffer.append("</ul>\n");
        buffer.append("</li>\n");
        return buffer.toString();
    }
}