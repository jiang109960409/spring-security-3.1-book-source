// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package com.packtpub.springsecurity.events.client.managed.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.i18n.client.NumberFormat;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import com.packtpub.springsecurity.events.client.proxy.EventProxy;
import com.packtpub.springsecurity.events.client.scaffold.place.ProxyDetailsView;
import com.packtpub.springsecurity.events.client.scaffold.place.ProxyListView;

public abstract class EventDetailsView_Roo_Gwt extends Composite implements ProxyDetailsView<EventProxy> {

    @UiField
    SpanElement id;

    @UiField
    SpanElement description;

    @UiField
    SpanElement version;

    EventProxy proxy;

    @UiField
    SpanElement displayRenderer;

    public void setValue(EventProxy proxy) {
        this.proxy = proxy;
        id.setInnerText(proxy.getId() == null ? "" : String.valueOf(proxy.getId()));
        description.setInnerText(proxy.getDescription() == null ? "" : String.valueOf(proxy.getDescription()));
        version.setInnerText(proxy.getVersion() == null ? "" : String.valueOf(proxy.getVersion()));
        displayRenderer.setInnerText(EventProxyRenderer.instance().render(proxy));
    }
}
